package com.rdc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.ibm.db2.jcc.am.CallableStatement;
import com.rdc.entity.AddlCtryData;
import com.rdc.entity.Cust_cmr_xref;
import com.rdc.entity.Custmain;
import com.rdc.entity.Custmain_ext;
import com.rdc.entity.External_CUST_IDS;
import com.rdc.entity.External_id;
import com.rdc.entity.FetchLocationName;
import com.rdc.entity.Firmographics;
import com.rdc.entity.Internal_id;
import com.rdc.entity.KDUNS_NEW;
import com.rdc.entity.KNA1;
import com.rdc.entity.KNA1PK;
import com.rdc.entity.KNB1;
import com.rdc.entity.KNVK;
import com.rdc.entity.KNVL;
import com.rdc.entity.KNVL_EXT;
import com.rdc.entity.KNVV;
import com.rdc.entity.KNVV_EXT;
import com.rdc.entity.KUNNR_EXT;
import com.rdc.entity.Kna1AddlBilling;
import com.rdc.entity.LOCAL_LANG_ADDR;
import com.rdc.entity.LOCAL_LANG_NAME;
import com.rdc.entity.LOCNADDR;
import com.rdc.entity.LOCNMAIN;
import com.rdc.entity.LOCNNAME;
import com.rdc.entity.LOCN_IDS;
import com.rdc.entity.Revtranspending;
import com.rdc.entity.RevtranspendingPK;
import com.rdc.entity.SADR;
import com.rdc.entity.STXH;
import com.rdc.entity.STXL;
import com.rdc.entity.SiteLegacy;
import com.rdc.entity.US_COMPANY;
import com.rdc.entity.US_ENTERPRISE;
import com.rdc.entity.US_GEM_TRANS;

public class CreateCustomerMap {

	Map<String, String> propertiesMap = new HashMap<String, String>();
	FetchCustomer fetchCustomer = null;
	String mdg_url = null;
	String mdg_username = null;
	String mdg_password = null;
	String rdc_url = null;
	String rdc_username = null;
	String rdc_password = null;
	String instance = null;
	Custmain custmain = new Custmain();
	Custmain_ext custmain_ext = new Custmain_ext();
	Internal_id internal_id = new Internal_id();
	External_id external_id = new External_id();
	Firmographics firmographics = new Firmographics();
	LOCNMAIN locnmain = new LOCNMAIN();
	LOCNNAME locnname = new LOCNNAME();
	LOCNADDR locnaddr = new LOCNADDR();
	LOCN_IDS locnids = new LOCN_IDS();
	LOCAL_LANG_ADDR locallangaddr = new LOCAL_LANG_ADDR();
	LOCAL_LANG_NAME locallangname = new LOCAL_LANG_NAME();
	Revtranspending revtranspending = new Revtranspending();
	Cust_cmr_xref cust_cmr_xref = new Cust_cmr_xref();
	SiteLegacy siteLegacy = new SiteLegacy();

	public void getCustomerMap(String config_path) throws ParseException, SQLException, IOException {

		ArrayList<String> country_list_knvv = new ArrayList<String>();
		ArrayList<String> country_list_knvk = new ArrayList<String>();

		ReadFiles readFiles = new ReadFiles();
		propertiesMap = readFiles.readPropertiesFiles(config_path);
		country_list_knvv.add("852");
		country_list_knvv.add("724");
		country_list_knvk.add("897");

		Connection connection_Client360 = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		db.readConfigParams(config_path + "/config.properties");
		mdg_url = db.getProperty("mdg_url");
		mdg_username = db.getProperty("mdg_username");
		mdg_password = db.getProperty("mdg_password");
		rdc_url = db.getProperty("rdc_url");
		rdc_username = db.getProperty("rdc_username");
		rdc_password = db.getProperty("rdc_password");
		instance = db.getProperty("instance");
		if (connection_Client360 == null) {

			connection_Client360 = db.getConnection(mdg_url, mdg_username, mdg_password);
		}

		Connection connection_rdc = null; // DB2ConnectionMDGP2 db = new
		// DB2ConnectionMDGP2();

		// DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2(); if (con_rdc == null) {
		connection_rdc = db.getConnection(rdc_url, rdc_username, rdc_password);
		// SQL query to retrieve two columns
		String sql = "SELECT LAISO, SPRAS FROM SAPR3.T002"; // Replace with your query

		// HashMap to store the data as key-value pairs
		HashMap<String, String> LanguageCodesMap = new HashMap<>();

		// Establishing connection and executing query
		try {
			Statement stmt = connection_rdc.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			// Loop through the result set and store data in the HashMap
			while (rs.next()) {
				String key = rs.getString("LAISO");
				String value = rs.getString("SPRAS");
				LanguageCodesMap.put(key, value);
			}

			// Output the HashMap contents
			System.out.println("Data from DB stored in HashMap:");
			for (String key : LanguageCodesMap.keySet()) {
				System.out.println(key + " -> " + LanguageCodesMap.get(key));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Revtranspending revtranspending = new Revtranspending();
		RevtranspendingPK revtranspendingPK = new RevtranspendingPK();
		revtranspending.setId(revtranspendingPK);
		ArrayList<Revtranspending> siteIDList = new ArrayList<Revtranspending>();
		String query = "SELECT * FROM EDM_REVT.REV_TRAN_PENDING WHERE STATUS = 'NEW' AND INSTANCE = " + "'" + instance
				+ "' AND REQ_STATUS = 'C' AND SITE_ID = 'S026088017'";// 'S026088017'" S0000005DD;
		PreparedStatement preparedStatement = connection_Client360.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
			// siteIDList.add(resultSet.getString("SITE_ID"));
			revtranspending.getId().setSite_id(resultSet.getString(2));
			revtranspending.getId().setInstance(resultSet.getString(1));
			revtranspending.getId().setIssuing_cntry(resultSet.getString(3));
			revtranspending.getId().setCmr_no(resultSet.getString(4));
			revtranspending.getId().setAccount_group(resultSet.getString(5));
			revtranspending.setReq_status(resultSet.getString(6));
			revtranspending.setStatus(resultSet.getString(7));
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
			Date parsedDate = (Date) dateFormat.parse(resultSet.getString(10));
			Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
			revtranspending.setCreate_ts(timestamp);
			revtranspending.setCreate_user(resultSet.getString(9));
			Date parsedDate1 = (Date) dateFormat.parse(resultSet.getString(12));
			Timestamp timestamp1 = new java.sql.Timestamp(parsedDate1.getTime());
			revtranspending.setUpdate_ts(timestamp1);
			revtranspending.setUpdate_user(resultSet.getString(11));
			revtranspending.setSeq_no(resultSet.getString(13));
			siteIDList.add(revtranspending);
		}

		Map<String, String> Legacyproperties = readFiles
				.readPropertiesFile(config_path + "/LegacyParameters.properties");
		Map<String, String> kart6_acctgrp = readFiles
				.readPropertiesFile(config_path + "/Issuing_country_account_group_mapping.properties");
		ArrayList<String> katr6_accountgrpList = new ArrayList<String>();
		for (Revtranspending revtrans : siteIDList) {
			// String requestStatus = revtrans.getReq_status();
			String zzkv_seqno = null;
			String site_id = revtrans.getId().getSite_id();
			String zzkv_cusno = revtrans.getId().getCmr_no();
			String katr6 = revtrans.getId().getIssuing_cntry();
			String accountGroup = revtrans.getId().getAccount_group();
			if (revtrans.getSeq_no() != null && !revtrans.getSeq_no().equals("")) {
				zzkv_seqno = revtrans.getSeq_no();
			} else if (Legacyproperties.containsKey(katr6 + "_" + accountGroup)) {
				zzkv_seqno = Legacyproperties.get(katr6 + "_" + accountGroup);
			}

			// String Language_cd = "EN";
			fetchCustomer = new FetchCustomerImpl();
			custmain = fetchCustomer.getT_CUSTMAIN(instance, site_id, connection_Client360);
			if (custmain == null) {

				fetchCustomer.UpdateRevTransPending(instance, site_id, connection_Client360);

			} else {
				custmain_ext = fetchCustomer.getT_CUSTMAIN_EXT(instance, site_id, connection_Client360);
				internal_id = fetchCustomer.getT_INTERNAL_ID(instance, site_id, connection_Client360);
				external_id = fetchCustomer.getT_EXTERNAL_ID(instance, site_id, connection_Client360);
				firmographics = fetchCustomer.getT_FIRMOGRAPHICS(instance, site_id, connection_Client360);
				locnmain = fetchCustomer.getT_LOCNMAIN(instance, site_id, connection_Client360);
				FetchLocationName fetchLocationName = new FetchLocationName();
				// String Locn_name_id =
				// fetchLocationName.FetchLocation_Name(connection_Client360,site_id);
				if (locnmain != null) {
					locnname = fetchCustomer.getT_LOCNNAME(instance, locnmain.getLocn_name_id(), connection_Client360);
				}
				// String Locn_addr_id =
				// fetchLocationName.FetchLocation_Addr(connection_Client360,site_id);
				if (locnmain != null) {
					locnaddr = fetchCustomer.getT_LOCNADDR(instance, locnmain.getLocn_addr_id(), connection_Client360);
				}
				// String Locn_ids_rowid =
				// fetchLocationName.FetchLocation_Ids(connection_Client360,site_id);
				if (locnmain != null) {
					locnids = fetchCustomer.getT_LOCN_IDS(instance, locnmain.getLocn_ids_rowid(), connection_Client360);
				}
				if (locnmain != null) {
					locallangname = fetchCustomer.getT_LOCAL_LANG_NAME(instance, locnmain.getLocn_name_id(),
							connection_Client360);
				}
				if (locnmain != null) {
					locallangaddr = fetchCustomer.getT_LOCAL_LANG_ADDR(instance, locnmain.getLocn_addr_id(),
							connection_Client360);
				}

				String valueForInact = "";
				String valueForInac = "";
				Map<String, String> customerMap = new HashMap<String, String>();
				for (Map.Entry<String, String> entry : propertiesMap.entrySet()) {

					String keyForCustomerMap = entry.getValue();
					String valueForCustomerMap = null;

					String[] parts = keyForCustomerMap.split("\\.");
					switch (parts[0]) {
					case "EDM_CUST":

						switch (parts[1]) {
						case "CUSTMAIN":
							if (!(custmain == null)) {
								valueForCustomerMap = (PojoInvoker.invokeGetter("CUSTMAIN", parts[2], custmain) != null)
										? PojoInvoker.invokeGetter("CUSTMAIN", parts[2], custmain).toString()
										: null; // Output: Result from getter method
							}
							break;
						case "CUSTMAIN_EXT":

							if (!(custmain_ext == null)) {
								valueForCustomerMap = (PojoInvoker.invokeGetter("CUSTMAIN_EXT", parts[2],
										custmain_ext) != null)
												? PojoInvoker.invokeGetter("CUSTMAIN_EXT", parts[2], custmain_ext)
														.toString()
												: null; // Output: Result from getter method

							}
							break;
						case "INTERNAL_ID":

							if (!(internal_id == null)) {
								if (parts[2].equalsIgnoreCase("INAC")) {
									if (internal_id.getInac() != "" && internal_id.getInac() != null) {

										System.out.println(internal_id.getInac() + "-->value for INAC");
										valueForInac = internal_id.getInac();
										valueForInact = "I";
									} else if (internal_id.getNac() != "" && internal_id.getNac() != null) {
										System.out.println(internal_id.getNac() + "-->value for NAC");
										valueForInac = internal_id.getNac();
										valueForInact = "N";
									}
								}

								valueForCustomerMap = (PojoInvoker.invokeGetter("INTERNAL_ID", parts[2],
										internal_id) != null)
												? PojoInvoker.invokeGetter("INTERNAL_ID", parts[2], internal_id)
														.toString()
												: null; // Output: Result from getter method
							}
							break;
						case "EXTERNAL_ID":
							if (!(external_id == null)) {
								valueForCustomerMap = (PojoInvoker.invokeGetter("EXTERNAL_ID", parts[2],
										external_id) != null)
												? PojoInvoker.invokeGetter("EXTERNAL_ID", parts[2], external_id)
														.toString()
												: null; // Output: Result from getter method
							}
							break;
						case "FIRMOGRAPHICS":

							if (!(firmographics == null)) {
								valueForCustomerMap = (PojoInvoker.invokeGetter("FIRMOGRAPHICS", parts[2],
										firmographics) != null)
												? PojoInvoker.invokeGetter("FIRMOGRAPHICS", parts[2], firmographics)
														.toString()
												: null; // Output: Result from getter method
							}
							break;

						default:

							valueForCustomerMap = "";
							break;
						}
						break;

					case "EDM_LOCN":
						switch (parts[1]) {

						case "LOCNMAIN":

							if (!(locnmain == null)) {
								valueForCustomerMap = (PojoInvoker.invokeGetter("LOCNMAIN", parts[2], locnmain) != null)
										? PojoInvoker.invokeGetter("LOCNMAIN", parts[2], locnmain).toString()
										: null; // Output: Result from getter method
							}
							break;
						case "LOCNNAME":

							if (!(locnname == null)) {
								valueForCustomerMap = (PojoInvoker.invokeGetter("LOCNNAME", parts[2], locnname) != null)
										? PojoInvoker.invokeGetter("LOCNNAME", parts[2], locnname).toString()
										: null; // Output: Result from getter method
							}
							break;

						case "LOCNADDR":
							if (!(locnaddr == null)) {
								if (entry.getKey().equals("KNA1.NAME4")) {
									String Address_line2 = (PojoInvoker.invokeGetter("LOCNADDR", "ADDRESS_LINE2",
											locnaddr) != null)
													? PojoInvoker.invokeGetter("LOCNADDR", "ADDRESS_LINE2", locnaddr)
															.toString()
													: null;
									String Address_line3 = (PojoInvoker.invokeGetter("LOCNADDR", "ADDRESS_LINE3",
											locnaddr) != null)
													? PojoInvoker.invokeGetter("LOCNADDR", "ADDRESS_LINE3", locnaddr)
															.toString()
													: null;
									String Address_line4 = (PojoInvoker.invokeGetter("LOCNADDR", "ADDRESS_LINE4",
											locnaddr) != null)
													? PojoInvoker.invokeGetter("LOCNADDR", "ADDRESS_LINE4", locnaddr)
															.toString()
													: null;
									String Address_line5 = (PojoInvoker.invokeGetter("LOCNADDR", "ADDRESS_LINE5",
											locnaddr) != null)
													? PojoInvoker.invokeGetter("LOCNADDR", "ADDRESS_LINE5", locnaddr)
															.toString()
													: null;
									valueForCustomerMap = Address_line2.concat(Address_line3).concat(Address_line4)
											.concat(Address_line5);
								} else
									valueForCustomerMap = (PojoInvoker.invokeGetter("LOCNADDR", parts[2],
											locnaddr) != null)
													? PojoInvoker.invokeGetter("LOCNADDR", parts[2], locnaddr)
															.toString()
													: null; // Output: Result from getter method
							}
							break;

						case "LOCN_IDS":

							if (!(locnids == null)) {
								valueForCustomerMap = (PojoInvoker.invokeGetter("LOCN_IDS", parts[2], locnids) != null)
										? PojoInvoker.invokeGetter("LOCN_IDS", parts[2], locnids).toString()
										: null; // Output: Result from getter method
							}
							break;

						case "LOCAL_LANG_NAME":

							if (!(locallangname == null)) {
								valueForCustomerMap = (PojoInvoker.invokeGetter("LOCAL_LANG_NAME", parts[2],
										locallangname) != null)
												? PojoInvoker.invokeGetter("LOCAL_LANG_NAME", parts[2], locallangname)
														.toString()
												: null; // Output: Result from getter method
							}
							break;

						case "LOCAL_LANG_ADDR":

							if (!(locallangaddr == null)) {
								if (entry.getKey().equals("SADR.NAME4")) {
									String Address_line2 = (PojoInvoker.invokeGetter("LOCAL_LANG_ADDR",
											"LOCAL_ADDRESS_LINE2", locallangaddr) != null)
													? PojoInvoker.invokeGetter("LOCAL_LANG_ADDR", "LOCAL_ADDRESS_LINE2",
															locallangaddr).toString()
													: null; // Output: Result from getter method
									String Address_line3 = (PojoInvoker.invokeGetter("LOCAL_LANG_ADDR",
											"LOCAL_ADDRESS_LINE3", locallangaddr) != null)
													? PojoInvoker.invokeGetter("LOCAL_LANG_ADDR", "LOCAL_ADDRESS_LINE3",
															locallangaddr).toString()
													: null;
									String Address_line4 = (PojoInvoker.invokeGetter("LOCAL_LANG_ADDR",
											"LOCAL_ADDRESS_LINE4", locallangaddr) != null)
													? PojoInvoker.invokeGetter("LOCAL_LANG_ADDR", "LOCAL_ADDRESS_LINE4",
															locallangaddr).toString()
													: null;
									String Address_line5 = (PojoInvoker.invokeGetter("LOCAL_LANG_ADDR",
											"LOCAL_ADDRESS_LINE5", locallangaddr) != null)
													? PojoInvoker.invokeGetter("LOCAL_LANG_ADDR", "LOCAL_ADDRESS_LINE5",
															locallangaddr).toString()
													: null;
									valueForCustomerMap = Address_line2.concat(Address_line3).concat(Address_line4)
											.concat(Address_line5);
								} else
									valueForCustomerMap = (PojoInvoker.invokeGetter("LOCAL_LANG_ADDR", parts[2],
											locallangaddr) != null) ? PojoInvoker
													.invokeGetter("LOCAL_LANG_ADDR", parts[2], locallangaddr).toString()
													: null; // Output: Result from getter method
							}
							break;

						default:

							valueForCustomerMap = "";
							break;

						}
						break;

					}
					customerMap.put(keyForCustomerMap, valueForCustomerMap);
				}

				// Print the customerMap
				for (Map.Entry<String, String> entry : customerMap.entrySet()) {
					System.out.println(entry.getKey() + " = " + entry.getValue());
				}
				// return customerMap;
				Map<String, Object> map3 = new HashMap<>();

				// Compare map1 and map2, and populate map3
				for (Map.Entry<String, String> entry1 : propertiesMap.entrySet()) {
					String key1 = entry1.getKey();
					String value1 = entry1.getValue();

					// Check if the value of map1 exists as a key in map2
					if (customerMap.containsKey(value1)) {
						map3.put(key1, customerMap.get(value1));
					}
				}
				map3.put("SAPR3.KNA1.ZZKV_INACT", valueForInact);
				map3.put("SAPR3.KNA1.ZZKV_INAC", valueForInac);

				for (Map.Entry<String, Object> entry2 : map3.entrySet()) {
					System.out.println(entry2.getKey() + " = " + entry2.getValue());
				}
				KNA1 kna1 = new KNA1();
				KNA1PK kna1pk = new KNA1PK();

				kna1.setId(kna1pk);
				kna1.setZzkv_cusno(zzkv_cusno);
				kna1.setZzkv_seqno(zzkv_seqno);
				kna1.setKatr6(katr6);
				kna1.setKtokd(accountGroup);
				KUNNR_EXT kunnr_ext = new KUNNR_EXT();
				KNVV knvv = new KNVV();
				KNVL knvl = new KNVL();
				KDUNS_NEW kduns_new = new KDUNS_NEW();
				SADR sadr = new SADR();
				STXL stxl = new STXL();
				STXH stxh = new STXH();
				External_CUST_IDS external_CUST_IDS = new External_CUST_IDS();
				KNVK knvk = new KNVK();
				Kna1AddlBilling kna1AddlBilling = new Kna1AddlBilling();
				KNB1 knb1 = new KNB1();
				KNVL_EXT knvl_ext = new KNVL_EXT();
				AddlCtryData addlCtryData = new AddlCtryData();
				KNVV_EXT knvv_ext = new KNVV_EXT();
				US_COMPANY us_company = new US_COMPANY();
				US_ENTERPRISE us_enterprise = new US_ENTERPRISE();
				US_GEM_TRANS us_gem_trans = new US_GEM_TRANS();

				HashMap<String, Object> TacticalData = new HashMap<String, Object>();
				ArrayList<String> columns = new ArrayList<>();
				ArrayList<String> Addlctrydatacolumns = new ArrayList<>();
				Properties properties = new Properties();

				try (FileInputStream input = new FileInputStream(config_path + "/Tactical_columns.properties")) {
					// Load properties from the file
					properties.load(input);

					// Get the value of 'columns' key, which is a comma-separated string
					String columnsStr = properties.getProperty("COLUMNS");
					String addlctrydatacolumnsStr = properties.getProperty("COLUMNS_ADDLCTRYDATA");

					// Split the string into individual column names and add them to the ArrayList
					String[] columnArray = columnsStr.split(",");
					for (String column : columnArray) {
						columns.add(column.trim()); // Remove extra spaces if any
					}
					String[] AddlctrydatacolumnArray = addlctrydatacolumnsStr.split(",");
					for (String column : AddlctrydatacolumnArray) {
						Addlctrydatacolumns.add(column.trim()); // Remove extra spaces if any
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

				// Step 3: Iterate over the arraylist and fetch data for each column from
				// SITE_LEGACY table.

				siteLegacy = fetchCustomer.getSiteLegacy(instance, site_id, katr6, zzkv_cusno, accountGroup, zzkv_seqno,
						connection_Client360);
				if (siteLegacy != null) {
					// Call the method to map the entity data to a HashMap

					TacticalData = mapEntityToHashMap(siteLegacy, columns);
				}

//    }
//}
				Map<String, String> Defaultproperties = readFiles.readDefaultPropertiesFiles(config_path);
				mergeMaps(TacticalData, Defaultproperties);
				for (String key : Defaultproperties.keySet()) {
					String[] parts = key.split("\\.");
					if (Defaultproperties.get(key).equals("")) {
						continue;
					}
					switch (parts[0]) {
					case "SAPR3":

						switch (parts[1]) {

						case "KNA1":

							kna1 = (KNA1) PojoInvoker.invokeSetter("KNA1", parts[2], Defaultproperties.get(key), kna1);
							break;

						case "KNA1_ADDL_BILLING":

							if (parts[2].equals("CODEFFDATE")) {
								if (Defaultproperties.get(key) != null && !(Defaultproperties.get(key).equals(""))) {
									SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

									try {
										// Parse the string into a Date object
										java.util.Date parsedDate = dateFormat.parse(Defaultproperties.get(key));

										// Convert Date to Timestamp
										Timestamp timestamp = new Timestamp(parsedDate.getTime());

										// Output the timestamp
										System.out.println("CODEFFDATE: " + timestamp);
										kna1AddlBilling.setCodeffdate(timestamp);
									} catch (ParseException e) {
										e.printStackTrace();
									}

								} else
									kna1AddlBilling.setCodeffdate(null);

							} else
								kna1AddlBilling = (Kna1AddlBilling) PojoInvoker.invokeSetter("KNA1_ADDL_BILLING",
										parts[2], Defaultproperties.get(key), kna1AddlBilling);
							break;

						case "KNB1":
							knb1 = (KNB1) PojoInvoker.invokeSetter("KNB1", parts[2], Defaultproperties.get(key), knb1);
							break;

						case "KNVK":
							knvk = (KNVK) PojoInvoker.invokeSetter("KNVK", parts[2], Defaultproperties.get(key), knvk);
							break;

						case "KNVL":
							knvl = (KNVL) PojoInvoker.invokeSetter("KNVL", parts[2], Defaultproperties.get(key), knvl);
							break;

						case "KNVL_EXT":
							knvl_ext = (KNVL_EXT) PojoInvoker.invokeSetter("KNVL_EXT", parts[2],
									Defaultproperties.get(key), knvl_ext);
							break;

						case "KNVV":
							knvv = (KNVV) PojoInvoker.invokeSetter("KNVV", parts[2], Defaultproperties.get(key), knvv);
							break;

						case "KNVV_EXT":
							knvv_ext = (KNVV_EXT) PojoInvoker.invokeSetter("KNVV_EXT", parts[2],
									Defaultproperties.get(key), knvv_ext);
							break;

						case "KUNNR_EXT":
							kunnr_ext = (KUNNR_EXT) PojoInvoker.invokeSetter("KUNNR_EXT", parts[2],
									Defaultproperties.get(key), kunnr_ext);
							break;

						case "US_COMPANY":
							us_company = (US_COMPANY) PojoInvoker.invokeSetter("US_COMPANY", parts[2],
									Defaultproperties.get(key), us_company);
							break;

						case "US_ENTERPRISE":
							us_enterprise = (US_ENTERPRISE) PojoInvoker.invokeSetter("US_ENTERPRISE", parts[2],
									Defaultproperties.get(key), us_enterprise);
							break;

						case "US_GEM_TRANS":
							us_gem_trans = (US_GEM_TRANS) PojoInvoker.invokeSetter("US_GEM_TRANS", parts[2],
									Defaultproperties.get(key), us_gem_trans);
							break;

						}
					}
				}

				for (Map.Entry<String, Object> entry : map3.entrySet()) {
					String key3 = entry.getKey();
					Object value3 = entry.getValue();
					String[] parts = key3.split("\\.");
					if (value3 != null && value3.equals(""))
						continue;
					switch (parts[0]) {
					case "SAPR3":

						switch (parts[1]) {
						case "KNA1":
							if (parts[2].equals("SHAD_UPDATE_TS")) {
								value3 = value3.toString();
								if (!value3.equals("")) {
									// Define the date format that matches the string pattern
									SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

									try {
										// Parse the string into a Date object
										java.util.Date parsedDate = dateFormat.parse(value3.toString());

										// Convert Date to Timestamp
										Timestamp timestamp = new Timestamp(parsedDate.getTime());

										// Output the timestamp
										System.out.println("Converted Timestamp: " + timestamp);
										// value3 = timestamp;
										kna1.setShad_update_ts(timestamp);
									} catch (ParseException e) {
										e.printStackTrace();
									}
								} else {
									value3 = null;
									kna1.setShad_update_ts(null);
								}

							} else if (parts[2].equals("ERDAT")) {
								if (value3 != null && !value3.toString().trim().isEmpty()) {
									SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
									Date date_crdat = inputFormat.parse(value3.toString());
									// Date date_chdat = inputFormat.parse(sadr.getCHDAT());
									SimpleDateFormat outputFormat = new SimpleDateFormat("yyyyMMdd");
									String formattedDate_crdat = outputFormat.format(date_crdat);
									// value3 = formattedDate_crdat;
									kna1.setErdat(formattedDate_crdat);
								}
							}

							else if (parts[2].equals("SPRAS")) {
								if (LanguageCodesMap.containsKey(value3)) {
									String value = LanguageCodesMap.get(value3);
									value3 = value;
									kna1.setSpras(value);

								} else {
									System.out.println("No RDC valid spras value found");
									value3 = null;
									kna1.setSpras(null);
								}
							} else if (parts[2].equals("AUFSD")) {
								if (locnmain.getDpl_status().equalsIgnoreCase("Y")) {
									if (locnmain.getStc_flag().equalsIgnoreCase("N")) {
										kna1.setAufsd("88");
									}
								} else if (locnmain.getDpl_status().equalsIgnoreCase("N")) {
									if (locnmain.getStc_flag().equalsIgnoreCase("Y")) {
										kna1.setAufsd("ST");
									}

								} else {
									kna1.setAufsd(custmain.getOrder_block());
								}
							}

							else
								kna1 = (KNA1) PojoInvoker.invokeSetter("KNA1", parts[2], value3, kna1);
							break;

						case "KNVV":
							if (parts[2].equals("SHAD_UPDATE_TS")) {
								value3 = value3.toString();
								if (!value3.equals("")) {
									// Define the date format that matches the string pattern
									SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

									try {
										// Parse the string into a Date object
										java.util.Date parsedDate = dateFormat.parse(value3.toString());

										// Convert Date to Timestamp
										Timestamp timestamp = new Timestamp(parsedDate.getTime());

										// Output the timestamp
										System.out.println("Converted Timestamp: " + timestamp);
										// value3 = timestamp;
										knvv.setShad_update_ts(timestamp);
									} catch (ParseException e) {
										e.printStackTrace();
									}
								} else {
									value3 = null;
									knvv.setShad_update_ts(null);
								}
								break;

							} else if (parts[2].equals("ERDAT")) {
								if (value3 != null && !value3.toString().trim().isEmpty()) {
									SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
									Date date_crdat = inputFormat.parse(value3.toString());
									// Date date_chdat = inputFormat.parse(sadr.getCHDAT());
									SimpleDateFormat outputFormat = new SimpleDateFormat("yyyyMMdd");
									String formattedDate_crdat = outputFormat.format(date_crdat);
									value3 = formattedDate_crdat;
									knvv.setErdat(formattedDate_crdat);
								}
								break;
							}

							else
								knvv = (KNVV) PojoInvoker.invokeSetter("KNVV", parts[2], value3, knvv);
							break;

						case "KUNNR_EXT":
							if (parts[2].equals("GOE_EXP_DATE")) {
								if (value3 != null) {

									java.sql.Date sqlDate = new java.sql.Date(kunnr_ext.getGoe_exp_date().getTime());
									kunnr_ext.setGoe_exp_date(sqlDate);
								}

							} else {

								kunnr_ext = (KUNNR_EXT) PojoInvoker.invokeSetter("KUNNR_EXT", parts[2], value3,
										kunnr_ext);
							}
							break;

						case "KDUNS_NEW":
							kduns_new = (KDUNS_NEW) PojoInvoker.invokeSetter("KDUNS_NEW", parts[2], value3, kduns_new);
							break;

						case "SADR":
							if ((locallangname == null) || (locallangaddr == null)) {
								break;
							}
							if (parts[2].equals("SHAD_UPDATE_TS")) {
								value3 = value3.toString();
								if (!value3.equals("")) {
									// Define the date format that matches the string pattern
									SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

									try {
										// Parse the string into a Date object
										java.util.Date parsedDate = dateFormat.parse(value3.toString());

										// Convert Date to Timestamp
										Timestamp timestamp = new Timestamp(parsedDate.getTime());

										// Output the timestamp
										System.out.println("Converted Timestamp: " + timestamp);
										// value3 = timestamp;
										sadr.setSHAD_UPDATE_TS(timestamp);
									} catch (ParseException e) {
										e.printStackTrace();
									}
								} else {
									value3 = null;
									sadr.setSHAD_UPDATE_TS(null);
								}
								break;
							} else
								sadr = (SADR) PojoInvoker.invokeSetter("SADR", parts[2], value3, sadr);
							break;

						case "STXL":
							if (!(locnaddr.getEMAIL() == null) && !locnaddr.getEMAIL().equals("")) {

								stxl = (STXL) PojoInvoker.invokeSetter("STXL", parts[2], value3, stxl);
							}
							break;

						case "EXTERNAL_CUST_IDS":
							external_CUST_IDS = (External_CUST_IDS) PojoInvoker.invokeSetter("EXTERNAL_CUST_IDS",
									parts[2], value3, external_CUST_IDS);

						case "KNVK":
							if (parts[2].equals("SHAD_UPDATE_TS")) {
								value3 = value3.toString();
								if (!value3.equals("")) {
									// Define the date format that matches the string pattern
									SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

									try {
										// Parse the string into a Date object
										java.util.Date parsedDate = dateFormat.parse(value3.toString());

										// Convert Date to Timestamp
										Timestamp timestamp = new Timestamp(parsedDate.getTime());

										// Output the timestamp
										System.out.println("Converted Timestamp: " + timestamp);
										// value3 = timestamp;
										knvk.setSHAD_UPDATE_TS(timestamp);
									} catch (ParseException e) {
										e.printStackTrace();
									}
								} else {
									value3 = null;
									knvk.setSHAD_UPDATE_TS(null);
								}
								break;
							} else if (parts[2].equals("ERDAT")) {
								if (value3 != null && !value3.toString().trim().isEmpty()) {
									SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
									Date date_crdat = inputFormat.parse(value3.toString());
									// Date date_chdat = inputFormat.parse(sadr.getCHDAT());
									SimpleDateFormat outputFormat = new SimpleDateFormat("yyyyMMdd");
									String formattedDate_crdat = outputFormat.format(date_crdat);
									value3 = formattedDate_crdat;
									knvk.setERDAT(formattedDate_crdat);
								}
							} else
								knvk = (KNVK) PojoInvoker.invokeSetter("KNVK", parts[2], value3, knvk);
							break;

						case "STXH":
							if (!(locnaddr.getEMAIL() == null) && !locnaddr.getEMAIL().equals("")) {
								stxh = (STXH) PojoInvoker.invokeSetter("STXH", parts[2], value3, stxh);
							}
							break;
						}

					}
				}

				fetchCustomer = new FetchCustomerImpl();
				cust_cmr_xref = fetchCustomer.getCust_cmr_xref(instance, site_id, accountGroup, katr6, zzkv_cusno,
						connection_Client360);
				String kunnr;
				String adrnr = "";
				String parnr;
				Connection con_client360 = null;
				Connection con_rdc = null;
				// DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();

				if (con_client360 == null) {
					con_client360 = db.getConnection(mdg_url, mdg_username, mdg_password);
				}

				// DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
				if (con_rdc == null) {
					con_rdc = db.getConnection(rdc_url, rdc_username, rdc_password);
				}
				if (cust_cmr_xref == null) {

					if (kna1.getKatr6().equals("760")) {
						kna1.setCreate_opt_num("0");
						kna1.setExabl("X");
					}
					if ((knvv_ext.getMisc_billing().startsWith("f")) || (knvv_ext.getMisc_billing().startsWith("G"))) {
						kna1.setKatr1("Y");
					}
					kna1.setMcod1(kna1.getName1());
					kna1.setMcod2(kna1.getName2());
					kna1.setMcod3(kna1.getOrt01());
					kna1.setZzkvUcStrtAddr(kna1.getStras().toUpperCase());
					kunnr = generateSequentialId(instance, "KUNNR");
					kna1.getId().setKnb1kunnr(kunnr);
					kna1.getId().setMandt(instance);

					if (!(locallangname == null) || (!(locallangaddr == null))) {
						adrnr = generateSequentialId_parnr(instance, "ADRNR");
					}
					parnr = generateSequentialId_parnr(instance, "PARNR");
					kna1.setAdrnr(adrnr);

					kunnr_ext.setKunnr(kunnr);
					knvv.setKunnr(kunnr);
					kna1AddlBilling.setKunnr(kunnr);
					kna1AddlBilling.setMandt(instance);
					kduns_new.setKUNNR(kunnr);
					sadr.setADRNR(adrnr);
					knvk.setKUNNR(kunnr);
					knvk.setPARNR(parnr);
					knb1.setMANDT(instance);
					knb1.setKUNNR(kunnr);
					knb1.setBEGRU(kna1.getBegru());

					knvl.setKunnr(kunnr);
					knvl.setMandt(instance);
					knvl_ext.setKunnr(kunnr);
					knvl_ext.setMandt(instance);
					knvv_ext.setKunnr(kunnr);
					knvv_ext.setMandt(instance);
					knvk.setKUNNR(kunnr);
					knvk.setMANDT(instance);
					knvv_ext.setKunnr(kunnr);
					knvv_ext.setMandt(instance);
					us_company.setMANDT(instance);
					us_enterprise.setMANDT(instance);
					us_gem_trans.setMANDT(instance);
					us_company.setKATR10(kna1.getKatr10());
					us_enterprise.setKATR10(kna1.getKatr10());
					us_enterprise.setENT_NO(us_company.getENT_NO());
					us_gem_trans.setKUKLA(kna1.getKukla());
					us_gem_trans.setZZKV_IND(String.valueOf(Character.toUpperCase(kna1.getBran1().charAt(0))));

					if (sadr.getCRDAT() != null) {
						SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
						Date date_crdat = inputFormat.parse(sadr.getCRDAT());
						// Date date_chdat = inputFormat.parse(sadr.getCHDAT());
						SimpleDateFormat outputFormat = new SimpleDateFormat("yyyyMMdd");
						String formattedDate_crdat = outputFormat.format(date_crdat);
						// String formattedDate_chdat = outputFormat.format(date_chdat);
						sadr.setCRDAT(formattedDate_crdat);
					}
					// sadr.setCHDAT(formattedDate_chdat);
					if (kunnr_ext.getGoe_exp_date() != null) {

						// Optionally, convert to java.sql.Date if needed for your database
						java.sql.Date sqlDate = new java.sql.Date(kunnr_ext.getGoe_exp_date().getTime());
						kunnr_ext.setGoe_exp_date(sqlDate);
					}
					external_CUST_IDS.setKUNNR(kunnr);
					if (country_list_knvv.contains(katr6)) {
						stxl.setTDOBJECT("KNVV");
						stxl.setTDID("Z0A1");
						stxl.setTDNAME(kunnr.concat(knvv.getVkorg().concat(knvv.getSpart())));
						stxh.setTDNAME(kunnr);
						stxh.setTDOBJECT("KNVV");

					} else if (country_list_knvk.contains(katr6)) {
						stxl.setTDOBJECT("KNVK");
						stxl.setTDID("ZEA1");
						stxl.setTDNAME(parnr);
						stxh.setTDNAME(kunnr);
						stxh.setTDOBJECT("KNVK");
					}

					// Set the values to be inserted in Cust_cmr_xref table
					cust_cmr_xref = new Cust_cmr_xref();
					cust_cmr_xref.setInstance(instance);
					cust_cmr_xref.setSite_id(site_id);
					cust_cmr_xref.setKunnr(kunnr);
					cust_cmr_xref.setIerp_site_id("S" + kunnr.substring(1));
					cust_cmr_xref.setPrimary_flag("Y");
					cust_cmr_xref.setAddress_type(accountGroup);
					cust_cmr_xref.setIssuing_country(katr6);
					cust_cmr_xref.setCmr_no(zzkv_cusno);
					cust_cmr_xref.setSequence_no(zzkv_seqno);
					cust_cmr_xref.setLogical_delete_indicator("N");
//Insert into CUST_CMR_XREF            
					fetchCustomer.insertCust_cmr_xref(cust_cmr_xref, con_client360);

					fetchCustomer.insertKNA1(kna1, con_rdc);
					InsertIntoAddlCtrydata(siteLegacy, Addlctrydatacolumns, addlCtryData, con_rdc, kunnr,
							kna1.getLoevm());
					// fetchCustomer.insertAdlctrydata(addlCtryData, con_rdc);
					// fetchCustomer.insertKUNNR_EXT(kunnr_ext);
					fetchCustomer.updateKUNNR_EXT(kunnr_ext, con_rdc);
					fetchCustomer.insertKDUNS_NEW(kduns_new, con_rdc);
					fetchCustomer.insertKNVV(knvv, con_rdc);
					fetchCustomer.insertKNVK(knvk, con_rdc);
					if (!(locnaddr.getEMAIL() == null) && !locnaddr.getEMAIL().equals("")) {
						fetchCustomer.insertSTXL(stxl, con_rdc);
						fetchCustomer.insertSTXH(stxh, con_rdc);
					}
					if (!(locallangname == null) || !(locallangaddr == null)) {
						fetchCustomer.insertSADR(sadr, con_rdc);
					}
					fetchCustomer.insertExternal_CUST_IDS(external_CUST_IDS, con_rdc);
					fetchCustomer.insertKna1AddlBilling(kna1AddlBilling, con_rdc);
					fetchCustomer.insertKNB1(knb1, con_rdc);
					// fetchCustomer.insertKNVL(knvl,con_rdc);
					fetchCustomer.insertKNVL_EXT(knvl_ext, con_rdc);
					fetchCustomer.insertKNVV_EXT(knvv_ext, con_rdc);
					if (us_company.getCOMP_NO() != null && !us_company.getCOMP_NO().equals("")) {
						fetchCustomer.insertUS_COMPANY(us_company, con_rdc);
					}
					if (us_enterprise.getENT_NO() != null && !us_enterprise.getENT_NO().equals("")) {
						fetchCustomer.insertUS_ENTERPRISE(us_enterprise, con_rdc);
					}
					if (us_gem_trans.getKUKLA() != null && !(us_gem_trans.getKUKLA().equals("")))
						// fetchCustomer.insertUS_GEM_TRANSY(us_gem_trans, con_rdc);
						if (accountGroup.equals("ZS01")) {
							List<String> valuesList = getValuesAsList(kart6_acctgrp, katr6);

							InsertIntoRDCTables(instance, site_id, katr6, valuesList, zzkv_cusno, Legacyproperties,
									kna1, kunnr_ext, kduns_new, knvv, knvk, stxl, stxh, sadr, external_CUST_IDS,
									kna1AddlBilling, knb1, knvl_ext, knvv_ext, us_company, us_enterprise, us_gem_trans,
									country_list_knvv, country_list_knvk, con_rdc, con_client360, addlCtryData,
									Addlctrydatacolumns);

						}
					con_rdc.commit();
					con_client360.commit();

				} else {
					kunnr = cust_cmr_xref.getKunnr();
					kna1.getId().setKnb1kunnr(kunnr);
					addlCtryData.setMandt(instance);
					addlCtryData.setKunnr(kunnr);

					kunnr_ext.setKunnr(kunnr);
					knvv.setKunnr(kunnr);
					knvk.setKUNNR(kunnr);
					kduns_new.setKUNNR(kunnr);
					kna1AddlBilling.setKunnr(kunnr);
					kna1AddlBilling.setMandt(instance);
					knb1.setMANDT(instance);
					knb1.setKUNNR(kunnr);
					addlCtryData.setKunnr(kunnr);
					addlCtryData.setMandt(instance);
					knvl.setKunnr(kunnr);
					knvl.setMandt(instance);
					knvl_ext.setKunnr(kunnr);
					knvl_ext.setMandt(instance);
					knvv_ext.setKunnr(kunnr);
					knvv_ext.setMandt(instance);
					knvk.setKUNNR(kunnr);
					knvk.setMANDT(instance);
					knvv_ext.setKunnr(kunnr);
					knvv_ext.setMandt(instance);
					us_company.setMANDT(instance);
					us_enterprise.setMANDT(instance);
					us_gem_trans.setMANDT(instance);
					/*
					 * kduns_new.setKUNNR(kunnr); if(country_list_knvv.contains(katr6)) {
					 * stxl.setTDOBJECT("KNVV"); stxl.setTDID("Z0A1");
					 * stxl.setTDNAME(knvv.getKUNNR()); stxh.setTDNAME("KNVV"); } else
					 * if(country_list_knvk.contains(katr6)) { stxl.setTDOBJECT("KNVK");
					 * stxl.setTDID("ZEA1"); //stxl.setTDNAME(PARNR); stxh.setTDNAME("KNVK"); }
					 */
					// to get ADRNR we need to call KNA1 to fetch ADRNR value to be used to Update
					// SADR.
					if (!(locallangname == null) && !(locallangaddr == null)) {
						String KNA1ADRNR = fetchCustomer.getADRNR_KNA1(instance, kunnr, con_rdc);
						sadr.setADRNR(KNA1ADRNR);
					}
					kna1.setBran5(cust_cmr_xref.getIerp_site_id());
					if (sadr.getCRDAT() != null) {
						SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
						Date date_crdat = inputFormat.parse(sadr.getCRDAT());
						// Date date_chdat = inputFormat.parse(sadr.getCHDAT());
						SimpleDateFormat outputFormat = new SimpleDateFormat("yyyyMMdd");
						String formattedDate_crdat = outputFormat.format(date_crdat);
						// String formattedDate_chdat = outputFormat.format(date_chdat);
						sadr.setCRDAT(formattedDate_crdat);
					}
					if (kunnr_ext.getGoe_exp_date() != null) {

						// Optionally, convert to java.sql.Date if needed for your database
						java.sql.Date sqlDate = new java.sql.Date(kunnr_ext.getGoe_exp_date().getTime());
						kunnr_ext.setGoe_exp_date(sqlDate);
					}
					external_CUST_IDS.setKUNNR(kunnr);
					fetchCustomer.updateKNA1(kna1, con_rdc);
					UpdateAddlCtrydata(siteLegacy, Addlctrydatacolumns, addlCtryData, con_rdc, kunnr, kna1.getLoevm());
					// fetchCustomer.insertKUNNR_EXT(kunnr_ext);
					fetchCustomer.updateKUNNR_EXT(kunnr_ext, con_rdc);
					fetchCustomer.updateKDUNS_NEW(kduns_new, con_rdc);
					fetchCustomer.updateKNVV(knvv, con_rdc);
					fetchCustomer.updateKNVK(knvk, con_rdc);
					fetchCustomer.updateSTXL(stxl, con_rdc);
					// fetchCustomer.updateSTXH(stxh);
					if (!(locallangname == null) || !(locallangaddr == null)) {
						fetchCustomer.updateSADR(sadr, con_rdc);
					}
					fetchCustomer.UpdateExternal_CUST_IDS(external_CUST_IDS, con_rdc);
					// fetchCustomer.updateKna1AddlBilling(kna1AddlBilling, con_rdc);
					fetchCustomer.updateKNB1(knb1, con_rdc);
					// fetchCustomer.updateKNVL(knvl,con_rdc);
					fetchCustomer.updateKNVL_EXT(knvl_ext, con_rdc);
					fetchCustomer.updateKNVV_EXT(knvv_ext, con_rdc);
					fetchCustomer.updateUS_COMPANY(us_company, con_rdc);
					fetchCustomer.updateUS_ENTERPRISE(us_enterprise, con_rdc);
					fetchCustomer.updateUS_GEM_TRANS(us_gem_trans, con_rdc);
				}
				// fetchCustomer.DeleteFromRevTransPending(revtranspending);

			}

		}
	}

	// Method to get comma-separated values from a HashMap and return them as an
	// ArrayList
	public static List<String> getValuesAsList(Map<String, String> map, String key) {
		List<String> valuesList = new ArrayList<>();

		// Retrieve the value from the map
		String value = map.get(key);

		// Check if the value is not null and split by comma
		if (value != null) {
			String[] valuesArray = value.split(",");
			for (String v : valuesArray) {
				valuesList.add(v.trim()); // Add trimmed values to the list
			}
		}

		return valuesList;
	}

	private void InsertIntoRDCTables(String instance2, String site_id, String katr6, List<String> katr6_accountgrpList,
			String zzkv_cusno, Map<String, String> legacyproperties, KNA1 kna1, KUNNR_EXT kunnr_ext,
			KDUNS_NEW kduns_new, KNVV knvv, KNVK knvk, STXL stxl, STXH stxh, SADR sadr,
			External_CUST_IDS external_CUST_IDS, Kna1AddlBilling kna1AddlBilling, KNB1 knb1, KNVL_EXT knvl_ext,
			KNVV_EXT knvv_ext, US_COMPANY us_company, US_ENTERPRISE us_enterprise, US_GEM_TRANS us_gem_trans,
			ArrayList<String> country_list_knvv, ArrayList<String> country_list_knvk, Connection con_rdc,
			Connection con_client360, AddlCtryData addlCtryData, ArrayList<String> Addlctrydatacolumns)
			throws SQLException, ParseException {
		for (String accountgrp : katr6_accountgrpList) {
			if (accountgrp.equals("ZS01")) {
				continue;
			}
			String zzkv_seqno = null;
			cust_cmr_xref = new Cust_cmr_xref();
			cust_cmr_xref.setInstance(instance);
			cust_cmr_xref.setSite_id(site_id);
			String kunnr = generateSequentialId(instance, "KUNNR");
			if (!(locallangname == null) || (!(locallangaddr == null))) {
				String adrnr = generateSequentialId_parnr(instance, "ADRNR");
				sadr.setADRNR(adrnr);
				kna1.setAdrnr(adrnr);
			}
			String parnr = generateSequentialId_parnr(instance, "PARNR");
			cust_cmr_xref.setKunnr(kunnr);
			cust_cmr_xref.setIerp_site_id("S" + kunnr.substring(1));
			cust_cmr_xref.setPrimary_flag("N");
			cust_cmr_xref.setAddress_type(accountgrp);
			cust_cmr_xref.setIssuing_country(katr6);
			cust_cmr_xref.setCmr_no(zzkv_cusno);
			if (legacyproperties.containsKey(katr6 + "_" + accountgrp)) {
				zzkv_seqno = legacyproperties.get(katr6 + "_" + accountgrp);
			}
			cust_cmr_xref.setSequence_no(zzkv_seqno);
			cust_cmr_xref.setLogical_delete_indicator("N");
			fetchCustomer.insertCust_cmr_xref(cust_cmr_xref, con_client360);
			kna1.getId().setKnb1kunnr(kunnr);
			kna1.setKatr6(katr6);
			kna1.setZzkv_cusno(zzkv_cusno);
			kna1.setZzkv_seqno(zzkv_seqno);
			kna1.setBran5("S" + kunnr.substring(1));

			kna1.setKtokd(accountgrp);
			addlCtryData.setMandt(instance);
			addlCtryData.setKunnr(kunnr);
			addlCtryData.setLoevm(kna1.getLoevm());
			kunnr_ext.setKunnr(kunnr);
			knvv.setMandt(instance);
			kduns_new.setKUNNR(kunnr);
			// sadr.setADRNR(adrnr);
			knvk.setKUNNR(kunnr);
			knvk.setPARNR(parnr);
			kna1AddlBilling.setKunnr(kunnr);
			kna1AddlBilling.setMandt(instance);
			kduns_new.setKUNNR(kunnr);
			// sadr.setADRNR(adrnr);
			knvk.setKUNNR(kunnr);
			knvk.setPARNR(parnr);
			knb1.setMANDT(instance);
			knb1.setKUNNR(kunnr);
			knb1.setBEGRU(kna1.getBegru());
			/*
			 * addlCtryData.setKunnr(kunnr); addlCtryData.setMandt(instance);
			 */

			knvl_ext.setKunnr(kunnr);
			knvv_ext.setKunnr(kunnr);
			knvv_ext.setMandt(instance);

			knvk.setMANDT(instance);
			knvv_ext.setKunnr(kunnr);
			knvv_ext.setMandt(instance);
			us_company.setMANDT(instance);
			us_enterprise.setMANDT(instance);
			us_gem_trans.setMANDT(instance);
			/*
			 * if(sadr.getCRDAT() !=null) { SimpleDateFormat inputFormat = new
			 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S"); Date date_crdat =
			 * inputFormat.parse(sadr.getCRDAT()); //Date date_chdat =
			 * inputFormat.parse(sadr.getCHDAT()); SimpleDateFormat outputFormat = new
			 * SimpleDateFormat("yyyyMMdd"); String formattedDate_crdat =
			 * outputFormat.format(date_crdat); //String formattedDate_chdat =
			 * outputFormat.format(date_chdat); sadr.setCRDAT(formattedDate_crdat); }
			 */
			// sadr.setCHDAT(formattedDate_chdat);
			if (kunnr_ext.getGoe_exp_date() != null) {

				// Optionally, convert to java.sql.Date if needed for your database
				java.sql.Date sqlDate = new java.sql.Date(kunnr_ext.getGoe_exp_date().getTime());
				kunnr_ext.setGoe_exp_date(sqlDate);
			}
			external_CUST_IDS.setKUNNR(kunnr);
			if (country_list_knvv.contains(katr6)) {
				stxl.setTDOBJECT("KNVV");
				stxl.setTDID("Z0A1");
				stxl.setTDNAME(kunnr.concat(knvv.getVkorg().concat(knvv.getSpart())));
				stxh.setTDNAME(kunnr);
				stxh.setTDOBJECT("KNVV");

			} else if (country_list_knvk.contains(katr6)) {
				stxl.setTDOBJECT("KNVK");
				stxl.setTDID("ZEA1");
				// parnr = generateSequentialId(instance,"PARNR");
				stxl.setTDNAME(parnr);
				stxh.setTDNAME(kunnr);
				stxh.setTDOBJECT("KNVK");
			}

			knvv.setKunnr(kunnr);
			kduns_new.setKUNNR(kunnr);

			fetchCustomer.insertKNA1(kna1, con_rdc);
			InsertIntoAddlCtrydata(siteLegacy, Addlctrydatacolumns, addlCtryData, con_rdc, kunnr, kna1.getLoevm());
			// fetchCustomer.insertKUNNR_EXT(kunnr_ext);
			fetchCustomer.updateKUNNR_EXT(kunnr_ext, con_rdc);
			fetchCustomer.insertKDUNS_NEW(kduns_new, con_rdc);
			fetchCustomer.insertKNVV(knvv, con_rdc);
			fetchCustomer.insertKNVK(knvk, con_rdc);
			if (!(locnaddr.getEMAIL() == null) && !locnaddr.getEMAIL().equals("")) {
				fetchCustomer.insertSTXL(stxl, con_rdc);
				fetchCustomer.insertSTXH(stxh, con_rdc);
			}
			if (!(locallangname == null) || !(locallangaddr == null)) {
				fetchCustomer.insertSADR(sadr, con_rdc);
			}
			fetchCustomer.insertExternal_CUST_IDS(external_CUST_IDS, con_rdc);
			fetchCustomer.insertKna1AddlBilling(kna1AddlBilling, con_rdc);
			fetchCustomer.insertKNB1(knb1, con_rdc);
			// fetchCustomer.insertKNVL(knvl,con_rdc);
			fetchCustomer.insertKNVL_EXT(knvl_ext, con_rdc);
			fetchCustomer.insertKNVV_EXT(knvv_ext, con_rdc);
			// fetchCustomer.insertUS_COMPANY(us_company, con_rdc);
			// fetchCustomer.insertUS_ENTERPRISE(us_enterprise, con_rdc);
			// fetchCustomer.insertUS_GEM_TRANSY(us_gem_trans, con_rdc);
		}
	}

	public String generateSequentialId(String mandt, String idType) throws SQLException {
		Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		String outputId;

		String storedProcedure = "{call NULLID.RDID_REVTRANS(?, ?, ?)}"; // Stored procedure call format

		try (CallableStatement callableStatement = (CallableStatement) con.prepareCall(storedProcedure)) {
			// Set input parameters
			callableStatement.setString(1, mandt);
			callableStatement.setString(2, idType);

			// Register output parameter
			callableStatement.registerOutParameter(3, java.sql.Types.VARCHAR);

			// Execute the stored procedure
			callableStatement.execute();

			// Retrieve the output parameter
			outputId = callableStatement.getString(3);
		}

		return outputId;
		// return (String) storedProcedure.getOutputParameterValue("pID");
	}

	public String generateSequentialId_parnr(String mandt, String idType) throws SQLException {
		Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		String outputId;

		String storedProcedure = "{call NULLID.RDID(?, ?, ?)}"; // Stored procedure call format

		try (CallableStatement callableStatement = (CallableStatement) con.prepareCall(storedProcedure)) {
			// Set input parameters
			callableStatement.setString(1, mandt);
			callableStatement.setString(2, idType);

			// Register output parameter
			callableStatement.registerOutParameter(3, java.sql.Types.VARCHAR);

			// Execute the stored procedure
			callableStatement.execute();

			// Retrieve the output parameter
			outputId = callableStatement.getString(3);
		}

		return outputId;
		// return (String) storedProcedure.getOutputParameterValue("pID");
	}

	public static void main(String[] args) throws IOException {
		
		if (args.length == 0) {
            System.out.println("No arguments provided. Please specify a properties folder path.");
            return;
        }

        String propertiesFolderPath = args[0];  // Get the folder path
        System.out.println("Properties Folder Path: " + propertiesFolderPath);

        File folder = new File(propertiesFolderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Invalid folder path. Please provide a valid directory.");
            return;
        }

        // List all properties files
        File[] propertyFiles = folder.listFiles((dir, name) -> name.endsWith(".properties"));

        if (propertyFiles == null || propertyFiles.length == 0) {
            System.out.println("No properties files found in the directory.");
            return;
        }

        // Read and print content of each properties file
        for (File file : propertyFiles) {
            System.out.println("\nReading File: " + file.getName());
            try {
                Properties properties = loadProperties(file);
                properties.forEach((key, value) -> System.out.println(key + " = " + value));
            } catch (IOException e) {
                System.out.println("Error reading file " + file.getName() + ": " + e.getMessage());
            }
        }

     // Now call CreateCustomerMap
		
		CreateCustomerMap createCustomerMap = new CreateCustomerMap();
		String config = args[0];

		try {
			createCustomerMap.getCustomerMap(config);
		} catch (ParseException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private static Properties loadProperties(File file) throws IOException {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream(file)) {
            properties.load(fis);
        }
        return properties;
    }
	
	/**
	 * This method dynamically maps values from an entity object to a HashMap. The
	 * keys in the HashMap are the column names (field names) passed in the
	 * columnNames list, and the values are the corresponding values retrieved from
	 * the entity's getter methods.
	 *
	 * @param entity      The entity object from which values will be fetched.
	 * @param columnNames List of column names for which values are to be fetched.
	 * @return A HashMap where the keys are the column names and values are the
	 *         respective field values.
	 */
	public HashMap<String, Object> mapEntityToHashMap(Object entity, ArrayList<String> columnNames) {
		HashMap<String, Object> dataMap = new HashMap<>();

		try {
			// Get the class of the entity
			Class<?> entityClass = entity.getClass();

			// Iterate over the column names
			for (String columnName : columnNames) {
				try {
					String columnNameWithUnderscore = columnName.replace('.', '_');
					// Construct the getter method name based on the column name (e.g.,
					// getColumnName for "columnName")
					String getterMethodName = "get" + columnNameWithUnderscore.substring(0, 1).toUpperCase()
							+ columnNameWithUnderscore.substring(1).toLowerCase();

					// Get the getter method using reflection
					Method getterMethod = entityClass.getMethod(getterMethodName);

					// Invoke the getter method to get the value
					Object value = getterMethod.invoke(entity);

					// Put the value into the map
					dataMap.put(columnName, value);
				} catch (NoSuchMethodException e) {
					// Handle the case where the getter method doesn't exist
					dataMap.put(columnName, "Getter method not found");
				} catch (Exception e) {
					// Handle other possible reflection-related exceptions
					dataMap.put(columnName, "Error accessing method: " + e.getMessage());
				}
			}
			// ITERATE THROUGH DATA MAP
			for (Map.Entry<String, Object> entry : dataMap.entrySet()) {
				System.out.println(entry.getKey() + " = " + entry.getValue());
			}

		} catch (Exception e) {
			// Handle any generic errors in processing
			e.printStackTrace();
		}

		return dataMap;
	}

	public static void mergeMaps(HashMap<String, Object> map1, Map<String, String> defaultproperties) {
		for (String key : map1.keySet()) {
			Object value = map1.get(key);
			// Convert the Object value to String and put it in the second map
			defaultproperties.put(key, value != null ? value.toString() : "");
		}
	}

	public void InsertIntoAddlCtrydata(SiteLegacy siteLegacy, ArrayList<String> Addlctrydatacolumns,
			AddlCtryData addlCtryData, Connection con, String kunnr, String Loevm) throws SQLException {
		if (siteLegacy != null) {
			for (String columnName : Addlctrydatacolumns) {
				try {

					String getterMethodName = "get" + columnName.substring(0, 1).toUpperCase()
							+ columnName.substring(1).toLowerCase();
					// Method getterMethod = siteLegacy.getClass().getMethod(getterMethodName);
					Method method = siteLegacy.getClass().getMethod(getterMethodName);

					// Invoke the method on the provided object and return the result
					Object value = method.invoke(siteLegacy);
					if (value != null && !value.equals("")) {
						addlCtryData.setField_Name(columnName);
						addlCtryData.setField_Value(value.toString());
						addlCtryData.setMandt(instance);
						addlCtryData.setKunnr(kunnr);
						addlCtryData.setLoevm(Loevm);
						fetchCustomer.insertAdlctrydata(addlCtryData, con);
					}

				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

	public void UpdateAddlCtrydata(SiteLegacy siteLegacy, ArrayList<String> Addlctrydatacolumns,
			AddlCtryData addlCtryData, Connection con, String kunnr, String Loevm) throws SQLException {
		if (siteLegacy != null) {
			for (String columnName : Addlctrydatacolumns) {
				try {

					String getterMethodName = "get" + columnName.substring(0, 1).toUpperCase()
							+ columnName.substring(1).toLowerCase();
					// Method getterMethod = siteLegacy.getClass().getMethod(getterMethodName);
					Method method = siteLegacy.getClass().getMethod(getterMethodName);

					// Invoke the method on the provided object and return the result
					Object value = method.invoke(siteLegacy);
					if (value != null && !value.equals("")) {
						addlCtryData.setField_Name(columnName);
						addlCtryData.setField_Value(value.toString());
						addlCtryData.setMandt(instance);
						addlCtryData.setKunnr(kunnr);
						addlCtryData.setLoevm(Loevm);
						fetchCustomer.updateAdlctrydata(addlCtryData, con);
					}

				} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

}
