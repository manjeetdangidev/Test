package com.rdc;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.rdc.entity.Cust_cmr_xref;
import com.rdc.entity.Custmain;
import com.rdc.entity.Custmain_ext;
import com.rdc.entity.External_id;
import com.rdc.entity.Firmographics;
import com.rdc.entity.Internal_id;
import com.rdc.entity.LOCAL_LANG_ADDR;
import com.rdc.entity.LOCAL_LANG_NAME;
import com.rdc.entity.LOCNADDR;
import com.rdc.entity.LOCNMAIN;
import com.rdc.entity.LOCNNAME;
import com.rdc.entity.LOCN_IDS;
import com.rdc.entity.Revtranspending;
import com.rdc.entity.SiteLegacy;
import com.rdc.entity.T_CUSTADDR;
import com.rdc.entity.T_EINVOICE_DATA;

public class DB2ConnectionMDGP2 {

	Connection con;
	String mdg_url = null;
	String mdg_username = null;
	String mdg_password = null;
	String rdc_url = null;
	String rdc_username = null;
	String rdc_password =  null;
	Properties properties = new Properties();

	 public void readConfigParams(String PropFile) {
	    	
	        // Load the properties file
	        try (InputStream input = new FileInputStream(PropFile)) {
	            // Load properties from the file
	            properties.load(input);

	            
	        } catch (IOException ex) {
	            ex.printStackTrace();
	            System.out.println("Error reading the properties file.");
	        }
	            
	    }
	 
	    public String getProperty(String key) {
	        return properties.getProperty(key);
	    }


	@SuppressWarnings("deprecation")
	public java.sql.Connection getConnection(java.lang.String url, java.lang.String userid, java.lang.String pass) {
		Connection con = null;
		try {
			Class.forName("com.ibm.db2.jcc.DB2Driver").newInstance();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(url, userid, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public List<T_CUSTADDR> executeQueryGetT_CUSTADDR(java.lang.String query, java.sql.Connection con) {
		Statement stmt = null;
		ResultSet rs = null;
		List<T_CUSTADDR> t_custaddr_list = new ArrayList<T_CUSTADDR>();
		T_CUSTADDR t_custaddr = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			if(rs == null) {
				
			}
			while (rs.next()) {
				t_custaddr = new T_CUSTADDR();
				t_custaddr.setINSTANCE(rs.getString(1));
				t_custaddr.setSITE_ID(rs.getString(2));
				t_custaddr.setADDR_ID(rs.getString(3));
				t_custaddr.setOWNING_ENTITY(rs.getString(4));
				t_custaddr.setLANGUAGE_CD(rs.getString(5));
				t_custaddr.setADDRESS_LINE1(rs.getString(6));
				t_custaddr.setADDRESS_LINE2(rs.getString(7));
				t_custaddr.setADDRESS_LINE3(rs.getString(8));
				t_custaddr.setADDRESS_LINE4(rs.getString(9));
				t_custaddr.setCITY(rs.getString(10));
				t_custaddr.setDISTRICT(rs.getString(11));
				t_custaddr.setCOUNTY(rs.getString(12));
				t_custaddr.setSTATE_PROVINCE(rs.getString(13));
				t_custaddr.setPOSTAL_CD(rs.getString(14));
				t_custaddr.setPO_BOX(rs.getString(15));
				t_custaddr.setPO_BOX_CITY(rs.getString(16));
				t_custaddr.setPO_BOX_POSTAL_CD(rs.getString(17));
				t_custaddr.setLANDED_COUNTRY(rs.getString(18));
				t_custaddr.setEMAIL(rs.getString(19));
				t_custaddr.setPHONE(rs.getString(20));
				t_custaddr.setCREATED_BY(rs.getString(21));
				t_custaddr.setCREATED_ON(rs.getString(22));
				t_custaddr.setLAST_UPDATE_ACTION(rs.getString(23));
				t_custaddr.setLAST_UPDATED_BY(rs.getString(24));
				t_custaddr.setLAST_UPDATED_ON(rs.getString(25));
				t_custaddr_list.add(t_custaddr);
				t_custaddr = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return t_custaddr_list;
	}

	/*
	 * public List<T_CUSTNAME> executeQueryGetT_CUSTNAME(java.lang.String query,
	 * java.sql.Connection con) { Statement stmt = null; ResultSet rs = null;
	 * List<T_CUSTNAME> t_custname_list = new ArrayList<T_CUSTNAME>(); T_CUSTNAME
	 * t_custname = null; try { stmt = con.createStatement(); rs =
	 * stmt.executeQuery(query); while (rs.next()) { t_custname = new T_CUSTNAME();
	 * t_custname.setINSTANCE(rs.getString(1));
	 * t_custname.setSITE_ID(rs.getString(2));
	 * t_custname.setNAME_ID(rs.getString(3));
	 * t_custname.setOWNING_ENTITY(rs.getString(4));
	 * t_custname.setLANGUAGE_CD(rs.getString(5));
	 * t_custname.setCUSTOMER_NAME(rs.getString(6));
	 * t_custname.setCUSTOMER_NAME_1(rs.getString(7));
	 * t_custname.setCUSTOMER_NAME_2(rs.getString(8));
	 * t_custname.setCUSTOMER_DIV_OR_DEPT(rs.getString(9));
	 * t_custname.setCUSTOMER_BUSINESS_NAME(rs.getString(10));
	 * t_custname.setCONSUMER_PREFERRED_NAME(rs.getString(11));
	 * t_custname.setABBREVIATED_NAME(rs.getString(12));
	 * t_custname.setCREATED_BY(rs.getString(13));
	 * t_custname.setCREATED_ON(rs.getString(14));
	 * t_custname.setLAST_UPDATE_ACTION(rs.getString(15));
	 * t_custname.setLAST_UPDATED_BY(rs.getString(16));
	 * t_custname.setLAST_UPDATED_ON(rs.getString(17));
	 * t_custname_list.add(t_custname); t_custname = null; } } catch (SQLException
	 * e) { e.printStackTrace(); } finally { try { stmt.close(); rs.close(); } catch
	 * (SQLException e) { e.printStackTrace(); } } return t_custname_list; }
	 */

	public List<T_EINVOICE_DATA> executeQueryGetT_EINVOICE_DATA(java.lang.String query, java.sql.Connection con) {
		Statement stmt = null;
		ResultSet rs = null;
		List<T_EINVOICE_DATA> t_einvoice_data_list = new ArrayList<T_EINVOICE_DATA>();
		T_EINVOICE_DATA t_einvoice_data = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				t_einvoice_data = new T_EINVOICE_DATA();
				t_einvoice_data.setINSTANCE(rs.getString(1));
				t_einvoice_data.setSITE_ID(rs.getString(2));
				t_einvoice_data.setOWNING_ENTITY(rs.getString(3));
				t_einvoice_data.setEINVOICE_TYPE(rs.getString(4));
				t_einvoice_data.setEINVOICE_VALUE(rs.getString(5));
				t_einvoice_data.setCREATED_BY(rs.getString(6));
				t_einvoice_data.setCREATED_ON(rs.getString(7));
				t_einvoice_data.setLAST_UPDATE_ACTION(rs.getString(8));
				t_einvoice_data.setLAST_UPDATED_BY(rs.getString(9));
				t_einvoice_data.setLAST_UPDATED_ON(rs.getString(10));
				t_einvoice_data_list.add(t_einvoice_data);
				t_einvoice_data = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return t_einvoice_data_list;
	}

	public External_id executeQueryGetT_EXTERNAL_ID(java.lang.String query, java.sql.Connection con) throws ParseException {
		Statement stmt = null;
		ResultSet rs = null;
		External_id t_external_id = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				Instant now = Instant.now();
				t_external_id = new External_id();
				t_external_id.setInstance(rs.getString(1));
				t_external_id.setSite_id(rs.getString(2));
				t_external_id.setOwning_entity(rs.getString(3));
				//t_external_id.setDuns_establishment_number(rs.getString(4));
				t_external_id.setNational_business_id(rs.getString(4));
				t_external_id.setTax_id_indicator(rs.getString(5));
				t_external_id.setTax_type_0(rs.getString(6));
				//t_external_id.setVat_id(rs.getString(7));
				t_external_id.setTax_type_1(rs.getString(7));
				t_external_id.setTax_id1(rs.getString(8));
				t_external_id.setTax_type_2(rs.getString(9));
				t_external_id.setTax_id2(rs.getString(10));
				t_external_id.setTax_type_3(rs.getString(11));
				t_external_id.setTax_id3(rs.getString(12));
				t_external_id.setTax_type_4(rs.getString(13));
				t_external_id.setTax_id4(rs.getString(14));
				t_external_id.setTax_type_5(rs.getString(15));
				t_external_id.setTax_id5(rs.getString(16));
				t_external_id.setTax_type_6(rs.getString(17));
				t_external_id.setTax_id6(rs.getString(18));
				t_external_id.setCreated_by(rs.getString(19));
				t_external_id.setCreated_on(rs.getString(20));
				t_external_id.setLast_update_action(rs.getString(21));
				t_external_id.setLast_updated_by(rs.getString(22));
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
 			    Date parsedDate = (Date) dateFormat.parse(rs.getString(24));
			    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
				t_external_id.setLast_updated_on(timestamp);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return t_external_id;
	}

	public Firmographics executeQueryGetT_FIRMOGRAPHICS(java.lang.String query, java.sql.Connection con) throws ParseException {
		Statement stmt = null;
		ResultSet rs = null;
		Firmographics t_firmographics = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				t_firmographics = new Firmographics();
				t_firmographics.setInstance(rs.getString(1));
				t_firmographics.setSite_id(rs.getString(2));
				t_firmographics.setOwning_entity(rs.getString(3));
				t_firmographics.setIndustry(rs.getString(4));
				t_firmographics.setIndustry_category(rs.getString(5));
				t_firmographics.setGeo_ind(rs.getString(6));
				t_firmographics.setSic(rs.getString(7));
				t_firmographics.setCreated_on(rs.getString(8));
				t_firmographics.setLast_update_action(rs.getString(9));
				t_firmographics.setLast_updated_by(rs.getString(10));
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
			    Date parsedDate = (Date) dateFormat.parse(rs.getString(11));
			    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
				t_firmographics.setLast_updated_on(timestamp);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return t_firmographics;
	}

	public Internal_id executeQueryGetT_INTERNAL_ID(java.lang.String query, java.sql.Connection con) throws ParseException {
		Statement stmt = null;
		ResultSet rs = null;
		Internal_id t_internal_id = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				t_internal_id = new Internal_id();
				t_internal_id.setInstance(rs.getString(1));
				t_internal_id.setSite_id(rs.getString(2));
				t_internal_id.setOwning_entity(rs.getString(3));
				t_internal_id.setInac(rs.getString(4));
				t_internal_id.setNac(rs.getString(5));
				t_internal_id.setWallet_id(rs.getString(6));
				t_internal_id.setCeid(rs.getString(7));
				//t_internal_id.setCompany_id(rs.getString(8));
				t_internal_id.setCreated_by(rs.getString(8));
				t_internal_id.setCreated_on(rs.getString(9));
				t_internal_id.setLast_update_action(rs.getString(10));
				t_internal_id.setLast_updated_by(rs.getString(11));
				//t_internal_id.setLast_update_action(rs.getString(1));
				//t_internal_id.setCreated_by(rs.getString(13));
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
			    Date parsedDate = (Date) dateFormat.parse(rs.getString(12));
			    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
				t_internal_id.setLast_updated_on(timestamp);
							}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return t_internal_id;
	}

	
	  public Custmain executeQueryGetT_CUSTMAIN(java.lang.String query,
	  java.sql.Connection con) throws ParseException
	  { 
	  Statement stmt = null; 
	  ResultSet rs = null;
	  //List<Custmain> t_sitemain_list = new ArrayList<Custmain>(); 
	  Custmain  t_sitemain = null; 
	  try { stmt = con.createStatement(); 
	  rs = stmt.executeQuery(query);
	  
	  while (rs.next()) { 
	  t_sitemain = new Custmain();
	  t_sitemain.setInstance(rs.getString(1));
	  t_sitemain.setSite_id(rs.getString(2));
	  t_sitemain.setOwning_entity(rs.getString(3));
	  t_sitemain.setLogical_delete_indicator(rs.getString(4));
	  t_sitemain.setOrder_block(rs.getString(5));
	  t_sitemain.setBilling_block(rs.getString(6));
	  t_sitemain.setDelivery_block(rs.getString(7));
	 // t_sitemain.setDplStatus(rs.getString(8));
	  //t_sitemain.setSTC_FLAG(rs.getString(9));
	  //t_sitemain.setGOE_INDICATOR(rs.getString(10));
	  //t_sitemain.setGOE_REASON(rs.getString(11));
	  //t_sitemain.setGOE_EXP_DATE(rs.getString(12));
	  t_sitemain.setCap_indicator(rs.getString(8));
	  t_sitemain.setCoverage_eligible_indicator(rs.getString(9));
	  t_sitemain.setCreated_by(rs.getString(10));
	  t_sitemain.setCreated_on(rs.getString(11));
	  t_sitemain.setLast_update_action(rs.getString(12));
	  t_sitemain.setLast_updated_by(rs.getString(13));
	  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
	    Date parsedDate = (Date) dateFormat.parse(rs.getString(14));
	    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
	  t_sitemain.setLast_updated_on(timestamp);
	  //t_sitemain_list.add(t_sitemain);
	  //t_sitemain = null;
	  } } catch (SQLException
	  e) { e.printStackTrace(); } finally { try { stmt.close(); rs.close(); } catch
	  (SQLException e) { e.printStackTrace(); } } return t_sitemain; }
	  

  public Custmain_ext executeQueryGetT_CUSTMAIN_EXT(java.lang.String
  query, java.sql.Connection con) throws ParseException {
	  Statement stmt = null; 
	  ResultSet rs = null;
	  Custmain_ext t_sitemain_ext = null; 
	  try { 
	  stmt = con.createStatement(); 
	  rs = stmt.executeQuery(query); 
	  while (rs.next())
  { 
	  t_sitemain_ext = new Custmain_ext();
	  t_sitemain_ext.setInstance(rs.getString(1));
	  t_sitemain_ext.setSite_id(rs.getString(2));
	  t_sitemain_ext.setSite_id_ext(rs.getString(3));
	  t_sitemain_ext.setOwning_entity(rs.getString(4));
	  t_sitemain_ext.setLogical_delete_indicator(rs.getString(5));
	  t_sitemain_ext.setCustomer_class(rs.getString(6));
	  t_sitemain_ext.setAddress_type(rs.getString(7));
	  t_sitemain_ext.setAuthorization_group(rs.getString(8));
	  t_sitemain_ext.setSales_org(rs.getString(9));
	  t_sitemain_ext.setSales_off(rs.getString(10));
	  t_sitemain_ext.setIssuing_country(rs.getString(11));
	  t_sitemain_ext.setCreated_by(rs.getString(12));
	  t_sitemain_ext.setCreated_on(rs.getString(13));
	  t_sitemain_ext.setLast_update_action(rs.getString(14));
	  t_sitemain_ext.setLast_updated_by(rs.getString(15));
	  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
	    Date parsedDate = (Date) dateFormat.parse(rs.getString(16));
	    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
	  t_sitemain_ext.setLast_updated_on(timestamp);
	   } } 
	  catch
	  (SQLException e) { e.printStackTrace(); } finally { try { stmt.close();
  rs.close(); } catch (SQLException e) { e.printStackTrace(); } } 
	  return  t_sitemain_ext; }
 
	 
	/*
	 * public List<T_SITE_LEGACY> executeQueryGetT_SITE_LEGACY(java.lang.String
	 * query, java.sql.Connection con) { Statement stmt = null; ResultSet rs = null;
	 * List<T_SITE_LEGACY> t_site_legacy_list = new ArrayList<T_SITE_LEGACY>();
	 * T_SITE_LEGACY t_site_legacy = null; try { stmt = con.createStatement(); rs =
	 * stmt.executeQuery(query); while (rs.next()) { t_site_legacy = new
	 * T_SITE_LEGACY(); t_site_legacy.setINSTANCE(rs.getString(0 + 1));
	 * t_site_legacy.setOWNING_ENTITY(rs.getString(1 + 1));
	 * t_site_legacy.setSITE_ID(rs.getString(2 + 1));
	 * t_site_legacy.setISSUING_COUNTRY(rs.getString(3 + 1));
	 * t_site_legacy.setCMR_NO(rs.getString(4 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTADDR_ADDRLU(rs.getString(5 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCEXT_CODDES(rs.getString(6 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCEXT_IDCLI(rs.getString(7 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCEXT_INDEMAIL(rs.getString(8 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCEXT_IVA(rs.getString(9 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCEXT_TIPOCL(rs.getString(10 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCUST_CCLXA(rs.getString(11 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCUST_CEBO(rs.getString(12 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCUST_CLGXC(rs.getString(13 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCUST_CPMXA(rs.getString(14 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCUST_CRGAC(rs.getString(15 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCUST_CTXXA(rs.getString(16 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCUST_REMXA(rs.getString(17 + 1));
	 * t_site_legacy.setCMRDB2D_CMRTCUST_REMXD(rs.getString(18 + 1));
	 * t_site_legacy.setJPINTERIM_BO_CODES_MAP_BO_CD(rs.getString(19 + 1));
	 * t_site_legacy.setJPINTERIM_BO_CODES_MAP_FIELD_SALES_CD(rs.getString(20 + 1));
	 * t_site_legacy.setJPINTERIM_BO_CODES_MAP_LAST_UPDT_TS(rs.getString(21 + 1));
	 * t_site_legacy.setJPINTERIM_BO_CODES_MAP_MRC_CD(rs.getString(22 + 1));
	 * t_site_legacy.setJPINTERIM_BO_CODES_MAP_OFFICE_CD(rs.getString(23 + 1));
	 * t_site_legacy.setJPINTERIM_BO_CODES_MAP_SALES_OFFICE_CD(rs.getString(24 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_CLOSE_DAY_1(rs.getString(25 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_CLOSE_DAY_2(rs.getString(26 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_CLOSE_DAY_3(rs.getString(27 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_CLOSE_DAY_4(rs.getString(28 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_CLOSE_DAY_5(rs.getString(29 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_CLOSE_DAY_6(rs.getString(30 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_CLOSE_DAY_7(rs.getString(31 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_CLOSE_DAY_8(rs.getString(32 +
	 * 1));
	 * t_site_legacy.setJPINTERIM_SALES_PAYMENT_CONTRACT_SIGN_DT(rs.getString(33 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAY_CYCLE_CD_1(rs.getString(34
	 * + 1));
	 * t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAY_CYCLE_CD_2(rs.getString(35 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAY_CYCLE_CD_3(rs.getString(36
	 * + 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAY_DAY_1(rs.getString(37 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAY_DAY_2(rs.getString(38 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAY_DAY_3(rs.getString(39 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAY_DAY_4(rs.getString(40 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAY_DAY_5(rs.getString(41 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAY_DAY_6(rs.getString(42 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAY_DAY_7(rs.getString(43 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAY_DAY_8(rs.getString(44 +
	 * 1));
	 * t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAYMENT_CYCLE_CD_4(rs.getString(45 +
	 * 1));
	 * t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAYMENT_CYCLE_CD_5(rs.getString(46 +
	 * 1));
	 * t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAYMENT_CYCLE_CD_6(rs.getString(47 +
	 * 1));
	 * t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAYMENT_CYCLE_CD_7(rs.getString(48 +
	 * 1));
	 * t_site_legacy.setJPINTERIM_SALES_PAYMENT_PAYMENT_CYCLE_CD_8(rs.getString(49 +
	 * 1)); t_site_legacy.setJPINTERIM_SALES_PAYMENT_SALES_TEAM_NO(rs.getString(50 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD1(rs.getString(51 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD10(rs.getString(52 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD11(rs.getString(53 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD12(rs.getString(54 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD13(rs.getString(55 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD15(rs.getString(56 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD16(rs.getString(57 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD17(rs.getString(58 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD2(rs.getString(59 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD3(rs.getString(60 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD4(rs.getString(61 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD5(rs.getString(62 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD6(rs.getString(63 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD7(rs.getString(64 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD8(rs.getString(65 +
	 * 1)); t_site_legacy.setLAINTERIM_TAX_DATA_CNTRY_USE_TAXCD9(rs.getString(66 +
	 * 1));
	 * t_site_legacy.setLAINTERIM_TAX_DATA_TAX_SEPARATION_INDC_TAXCD1(rs.getString(
	 * 67 + 1));
	 * t_site_legacy.setSAPR3_ADDLCTRYDATA_FR_NO_OF_INVOICES(rs.getString(68 + 1));
	 * t_site_legacy.setSAPR3_ADDLCTRYDATA_IT_CODE_IVA(rs.getString(69 + 1));
	 * t_site_legacy.setSAPR3_ADDLCTRYDATA_IT_CODE_SSV(rs.getString(70 + 1));
	 * t_site_legacy.setSAPR3_ADDLCTRYDATA_SK_BANK_ACCOUNT_NO(rs.getString(71 + 1));
	 * t_site_legacy.setSAPR3_ADDLCTRYDATA_SK_BANK_BRANCH_NO(rs.getString(72 + 1));
	 * t_site_legacy.setSAPR3_ADDLCTRYDATA_TAX_JURIS_CD(rs.getString(73 + 1));
	 * t_site_legacy.setSAPR3_ADDLCTRYDATA_TR_ECONOMIC_CD(rs.getString(74 + 1));
	 * t_site_legacy.setSAPR3_ADDLCTRYDATA_TR_VAT_CD(rs.getString(75 + 1));
	 * t_site_legacy.setSAPR3_ADDLCTRYDATA_TR_VAT_CD_TYPE(rs.getString(76 + 1));
	 * t_site_legacy.setSAPR3_ADDLCTRYDATA_TR_VAT_PERCENTAGE(rs.getString(77 + 1));
	 * t_site_legacy.setSAPR3_KNA1_ADDL_BILLING_CODCOND(rs.getString(78 + 1));
	 * t_site_legacy.setSAPR3_KNA1_ADDL_BILLING_CODEFFDATE(rs.getString(79 + 1));
	 * t_site_legacy.setSAPR3_KNA1_ADDL_BILLING_CODREAS(rs.getString(80 + 1));
	 * t_site_legacy.setSAPR3_KNA1_ADDL_BILLING_ESTAB_FUNC_CD(rs.getString(81 + 1));
	 * t_site_legacy.setSAPR3_KNA1_ADDL_BILLING_LEASING_INDC(rs.getString(82 + 1));
	 * t_site_legacy.setSAPR3_KNA1_ADDL_BILLING_NO_OF_INVOICES(rs.getString(83 +
	 * 1)); t_site_legacy.setSAPR3_KNA1_KONZS(rs.getString(84 + 1));
	 * t_site_legacy.setSAPR3_KNA1_TXJCD(rs.getString(85 + 1));
	 * t_site_legacy.setSAPR3_KNA1_ZZKV_ESTAB(rs.getString(86 + 1));
	 * t_site_legacy.setSAPR3_KNA1_ZZKV_NODE1(rs.getString(87 + 1));
	 * t_site_legacy.setSAPR3_KNA1_ZZKV_NODE2(rs.getString(88 + 1));
	 * t_site_legacy.setSAPR3_KNB1_KNRZB(rs.getString(89 + 1));
	 * t_site_legacy.setSAPR3_KNB1_VZSKZ(rs.getString(90 + 1));
	 * t_site_legacy.setSAPR3_KNB1_ZAMIO(rs.getString(91 + 1));
	 * t_site_legacy.setSAPR3_KNVK_NAME1(rs.getString(92 + 1));
	 * t_site_legacy.setSAPR3_KNVK_NAMEV(rs.getString(93 + 1));
	 * t_site_legacy.setSAPR3_KNVK_TELF1(rs.getString(94 + 1));
	 * t_site_legacy.setSAPR3_KNVP_PARNR(rs.getString(95 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_ACCT_RECV_BO(rs.getString(96 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_BO_DIVISION(rs.getString(97 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_BO_TRADING_AREA(rs.getString(98 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_CE_GRP(rs.getString(99 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_CHANNEL_CD(rs.getString(100 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_COLLBO(rs.getString(101 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_CSO_SITE(rs.getString(102 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_CUST_CREDIT_CD(rs.getString(103 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_INSTALL_BO_NUM(rs.getString(104 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_JP_TAIGA_CD(rs.getString(105 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_MISC_BILLING(rs.getString(106 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_MKTG_AR_DEPT(rs.getString(107 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_MKTG_DEPT(rs.getString(108 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_MKTG_RESP_CD(rs.getString(109 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_OEM_IND(rs.getString(110 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_PCC_AR_BO(rs.getString(111 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_PCC_MKTG_BO(rs.getString(112 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_PROXI_LOCN(rs.getString(113 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_SELLING_BO_NUM(rs.getString(114 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_SVC_AR_OFC(rs.getString(115 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_SVC_LGSYS_OFC(rs.getString(116 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_SVC_MASTER_BO(rs.getString(117 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_SVC_OTH_OFC(rs.getString(118 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_SVC_SMSYS_OFC(rs.getString(119 + 1));
	 * t_site_legacy.setSAPR3_KNVV_EXT_US_RESTRICT_TO(rs.getString(120 + 1));
	 * t_site_legacy.setSAPR3_KNVV_KDGRP(rs.getString(121 + 1));
	 * t_site_legacy.setSAPR3_KNVV_KVGR1(rs.getString(122 + 1));
	 * t_site_legacy.setSAPR3_KNVV_WAERS(rs.getString(123 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_ACTION_TXT(rs.getString(124 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_BILL_TEXT1(rs.getString(125 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_BILL_TEXT2(rs.getString(126 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_BP_MBR_LVL_TYPE(rs.getString(127 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_CMR_ADDR_REC_NO(rs.getString(128 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_CMR_ADDR_REC_TYPE(rs.getString(129 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_GEO_LOC_CD(rs.getString(130 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_HANGAR(rs.getString(131 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_HW_INSTL_MSTR_FLG(rs.getString(132 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_IBM_AML_CD(rs.getString(133 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_PIER(rs.getString(134 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_PRIVACY_IND(rs.getString(135 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_SALES_FORCE_ID(rs.getString(136 + 1));
	 * t_site_legacy.setSAPR3_KUNNR_EXT_SC_ACCOUNT_ID(rs.getString(137 + 1));
	 * t_site_legacy.setSAPR3_STXL_CLUSTD_TDID9013(rs.getString(138 + 1));
	 * t_site_legacy.setSAPR3_US_BP_INT_CODES_BP_CODE(rs.getString(139 + 1));
	 * t_site_legacy.setSAPR3_US_BP_INT_CODES_BP_FULL_NM(rs.getString(140 + 1));
	 * t_site_legacy.setSAPR3_US_COMPANY_COMP_LEGAL_NAME(rs.getString(141 + 1));
	 * t_site_legacy.setSAPR3_US_COMPANY_COMP_NO(rs.getString(142 + 1));
	 * t_site_legacy.setSAPR3_US_COMPANY_ENT_NO(rs.getString(143 + 1));
	 * t_site_legacy.setSAPR3_US_ENTERPRISE_ENT_LEGAL_NAME(rs.getString(144 + 1));
	 * t_site_legacy.setSAPR3_US_ENTERPRISE_ENT_TYPE_CODE(rs.getString(145 + 1));
	 * t_site_legacy.setSAPR3_US_GEM_TRANS_GEM_CD(rs.getString(146 + 1));
	 * t_site_legacy.setSAPR3_US_RESTRICT_CODES_RESTRICT_TO_CD(rs.getString(147 +
	 * 1)); t_site_legacy.setSAPR3_US_RESTRICT_CODES_RESTRICT_TO_NM(rs.getString(148
	 * + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_C_ICC_TAX_CLASS(rs.getString(149 +
	 * 1)); t_site_legacy.setUSINTERIM_US_TAX_DATA_C_ICC_TE(rs.getString(150 + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_C_SCC(rs.getString(151 + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_C_TE_CERT_ST_1(rs.getString(152 + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_C_TE_CERT_ST_2(rs.getString(153 + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_C_TE_CERT_ST_3(rs.getString(154 + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_EA_STATUS(rs.getString(155 + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_F_OCL(rs.getString(156 + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_I_TAX_CLASS_1(rs.getString(157 + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_I_TAX_CLASS_2(rs.getString(158 + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_I_TAX_CLASS_3(rs.getString(159 + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_I_TYPE_CUST_1(rs.getString(160 + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_I_TYPE_CUST_2(rs.getString(161 + 1));
	 * t_site_legacy.setUSINTERIM_US_TAX_DATA_I_TYPE_CUST_3(rs.getString(162 + 1));
	 * t_site_legacy.setSAPR3_KNA1_STCD1(rs.getString(163 + 1));
	 * t_site_legacy.setSAPR3_KNA1_LZONE(rs.getString(164 + 1));
	 * t_site_legacy.setCREATED_BY(rs.getString(165 + 1));
	 * t_site_legacy.setCREATED_ON(rs.getString(166 + 1));
	 * t_site_legacy.setLAST_UPDATE_ACTION(rs.getString(167 + 1));
	 * t_site_legacy.setLAST_UPDATED_BY(rs.getString(168 + 1));
	 * t_site_legacy.setLAST_UPDATED_ON(rs.getString(169 + 1));
	 * t_site_legacy_list.add(t_site_legacy); t_site_legacy = null; } } catch
	 * (SQLException e) { e.printStackTrace(); } finally { try { stmt.close();
	 * rs.close(); } catch (SQLException e) { e.printStackTrace(); } } return
	 * t_site_legacy_list; }
	 */

	public void executeQuery(java.lang.String query, java.sql.Connection con) throws SQLException {
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		} finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public LOCN_IDS executeQueryGetT_LOCN_IDS(java.lang.String query, java.sql.Connection con) throws ParseException {
		Statement stmt = null;
		ResultSet rs = null;
		//List<T_LOCN_IDS> t_locn_ids_list = new ArrayList<T_LOCN_IDS>();
		LOCN_IDS t_locn_ids = new LOCN_IDS();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				//t_locn_ids = new T_LOCN_IDS();
				t_locn_ids.setINSTANCE(rs.getString(1));
				t_locn_ids.setLOCN_IDS_ROWID(rs.getString(2));
				t_locn_ids.setCOMPANY_ID(rs.getString(3));
				t_locn_ids.setDUNS_ESTABLISHMENT_NUMBER(rs.getString(4));
				t_locn_ids.setVAT_ID(rs.getString(5));
				t_locn_ids.setROW_ACCESS_ID(rs.getString(6));
				t_locn_ids.setCREATED_BY(rs.getString(7));
				SimpleDateFormat dateFormat = new  SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS"); Date parsedDate = (Date)
				dateFormat.parse(rs.getString(8)); 
				Timestamp timestamp_createdOn = new  java.sql.Timestamp(parsedDate.getTime());
				t_locn_ids.setCREATED_ON(timestamp_createdOn);
				SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
				Date parsedDate1 = (Date)dateFormat1.parse(rs.getString(11)); 
				Timestamp timestamp_upadtedOn = new	  java.sql.Timestamp(parsedDate1.getTime());
				t_locn_ids.setLAST_UPDATED_ON(timestamp_upadtedOn);
				t_locn_ids.setLAST_UPDATE_ACTION(rs.getString(9));
				t_locn_ids.setLAST_UPDATED_BY(rs.getString(10));
				
				}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return t_locn_ids;
	}

	
	  public LOCNNAME executeQueryGetT_LOCNNAME(java.lang.String query,
	  java.sql.Connection con) throws ParseException { Statement stmt = null;
	  ResultSet rs = null;
	  
	  LOCNNAME t_locnname = null; try { stmt = con.createStatement(); rs =
	  stmt.executeQuery(query); while (rs.next()) { t_locnname = new LOCNNAME();
	  t_locnname.setINSTANCE(rs.getString(1));
	  t_locnname.setLOCN_NAME_ID(rs.getString(2));
	  t_locnname.setOWNING_ENTITY(rs.getString(3));
	  t_locnname.setLANGUAGE_CD(rs.getString(4));
	  t_locnname.setALT_LANGUAGE_FLAG(rs.getString(5));
	  t_locnname.setLOCATION_NAME(rs.getString(6));
	  t_locnname.setLOCATION_NAME_1(rs.getString(7));
	  t_locnname.setLOCATION_NAME_2(rs.getString(8));
	  t_locnname.setLOCATION_DIV_OR_DEPT(rs.getString(9));
	  t_locnname.setLOCATION_BUSINESS_NAME(rs.getString(10));
	  t_locnname.setCONSUMER_PREFERRED_NAME(rs.getString(11));
	  t_locnname.setABBREVIATED_NAME(rs.getString(12));
	  t_locnname.setROW_ACCESS_ID(rs.getString(13));
	  t_locnname.setCREATED_BY(rs.getString(14)); SimpleDateFormat dateFormat = new
	  SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS"); Date parsedDate = (Date)
	  dateFormat.parse(rs.getString(15)); Timestamp timestamp_createdOn = new
	  java.sql.Timestamp(parsedDate.getTime());
	  t_locnname.setCREATED_ON(timestamp_createdOn);
	  t_locnname.setLAST_UPDATE_ACTION(rs.getString(16));
	  t_locnname.setLAST_UPDATED_BY(rs.getString(17)); SimpleDateFormat dateFormat1
	  = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS"); Date parsedDate1 = (Date)
	  dateFormat1.parse(rs.getString(18)); Timestamp timestamp_upadtedOn = new
	  java.sql.Timestamp(parsedDate1.getTime());
	  t_locnname.setLAST_UPDATED_ON(timestamp_upadtedOn);
	  
	  } } catch (SQLException e) { e.printStackTrace(); } finally { try {
	  stmt.close(); rs.close(); } catch (SQLException e) { e.printStackTrace(); } }
	  return t_locnname; }
	 

	
	  public LOCNMAIN executeQueryGetT_LOCNMAIN(java.lang.String query,
	  java.sql.Connection con) throws ParseException { Statement stmt = null; ResultSet rs = null;
	  //List<T_LOCNMAIN> t_locnmain_list = new ArrayList<T_LOCNMAIN>();
	  LOCNMAIN t_locnmain = new LOCNMAIN();
	  try { stmt = con.createStatement(); 
	  rs =  stmt.executeQuery(query); while (rs.next()) { 
	  t_locnmain.setInstance(rs.getString(1));
	  t_locnmain.setSite_id(rs.getString(2));
	  t_locnmain.setCustomer_role_flg(rs.getString(3));
	  t_locnmain.setEcosyst_role_flg(rs.getString(4));
	  t_locnmain.setVendor_role_flg(rs.getString(5));
	  t_locnmain.setLocn_name_id(rs.getString(6));
	  t_locnmain.setLocn_addr_id(rs.getString(7));
	  t_locnmain.setLocn_ids_rowid(rs.getString(8));
	  t_locnmain.setOwning_entity(rs.getString(9));
	  t_locnmain.setLogical_delete_indicator(rs.getString(10));
	  t_locnmain.setDpl_status(rs.getString(11));
	  t_locnmain.setStc_flag(rs.getString(12));
	  t_locnmain.setGoe_indicator(rs.getString(13));
	  t_locnmain.setGoe_reason(rs.getString(14));
	  DateFormat dateFormat = new  SimpleDateFormat("yyyy-MM-dd"); 
	  Date parsedDate =	dateFormat.parse(rs.getString(15)); 
	  
	  t_locnmain.setGoe_exp_date(parsedDate);
	  t_locnmain.setRow_access_id(rs.getString(16));
	  t_locnmain.setCreated_by(rs.getString(17));
	  SimpleDateFormat dateFormat1 = new  SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS"); 
	  Date parsedDate1 = (Date)dateFormat1.parse(rs.getString(18)); 
	  Timestamp timestamp_createdOn = new  java.sql.Timestamp(parsedDate1.getTime());
	  t_locnmain.setCreated_on(timestamp_createdOn);
	  t_locnmain.setLast_update_action(rs.getString(19));
	  t_locnmain.setLast_updated_by(rs.getString(20));
	  SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
	  Date parsedDate2 = (Date)dateFormat2.parse(rs.getString(21)); 
	  Timestamp timestamp_upadtedOn = new	  java.sql.Timestamp(parsedDate2.getTime());
	  t_locnmain.setLast_updated_on(timestamp_upadtedOn);
	   } } catch (SQLException
	  e) { e.printStackTrace(); } finally { try { stmt.close(); rs.close(); } catch
	  (SQLException e) { e.printStackTrace(); } } return t_locnmain; }
	 

	public LOCNADDR executeQueryGetT_LOCNADDR(java.lang.String query, java.sql.Connection con) throws ParseException {
		Statement stmt = null;
		ResultSet rs = null;
		List<LOCNADDR> t_locnaddr_list = new ArrayList<LOCNADDR>();
		LOCNADDR t_locnaddr = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				t_locnaddr = new LOCNADDR();
				t_locnaddr.setINSTANCE(rs.getString(1));
				t_locnaddr.setLOCN_ADDR_ID(rs.getString(2));
				t_locnaddr.setOWNING_ENTITY(rs.getString(3));
				t_locnaddr.setLANGUAGE_CD(rs.getString(4));
				t_locnaddr.setALT_LANGUAGE_FLAG(rs.getString(5));
				t_locnaddr.setADDRESS_LINE1(rs.getString(6));
				t_locnaddr.setADDRESS_LINE2(rs.getString(7));
				t_locnaddr.setADDRESS_LINE3(rs.getString(8));
				t_locnaddr.setADDRESS_LINE4(rs.getString(9));
				t_locnaddr.setADDRESS_LINE5(rs.getString(10));
				t_locnaddr.setCITY(rs.getString(11));
				t_locnaddr.setDISTRICT(rs.getString(12));
				t_locnaddr.setCOUNTY(rs.getString(13));
				t_locnaddr.setSTATE_PROVINCE(rs.getString(14));
				t_locnaddr.setPOSTAL_CD(rs.getString(15));
				t_locnaddr.setPO_BOX(rs.getString(16));
				t_locnaddr.setPO_BOX_CITY(rs.getString(17));
				t_locnaddr.setPO_BOX_POSTAL_CD(rs.getString(18));
				t_locnaddr.setLANDED_COUNTRY(rs.getString(19));
				t_locnaddr.setEMAIL(rs.getString(20));
				t_locnaddr.setPHONE(rs.getString(21));
				t_locnaddr.setROW_ACCESS_ID(rs.getString(22));
				t_locnaddr.setCREATED_BY(rs.getString(23));
				//t_locnaddr.setCREATED_ON(rs.getString(24));
				t_locnaddr.setLAST_UPDATE_ACTION(rs.getString(25));
				t_locnaddr.setLAST_UPDATED_BY(rs.getString(26));
				//t_locnaddr.setLAST_UPDATED_ON(rs.getString(27));
				SimpleDateFormat dateFormat = new  SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS"); Date parsedDate = (Date)
				dateFormat.parse(rs.getString(24)); 
				Timestamp timestamp_createdOn = new  java.sql.Timestamp(parsedDate.getTime());
				t_locnaddr.setCREATED_ON(timestamp_createdOn);						SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
				Date parsedDate1 = (Date)dateFormat1.parse(rs.getString(27)); 
				Timestamp timestamp_upadtedOn = new	  java.sql.Timestamp(parsedDate1.getTime());
				t_locnaddr.setLAST_UPDATED_ON(timestamp_upadtedOn);
				
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return t_locnaddr;
	}

	public LOCAL_LANG_NAME executeQueryGetT_LOCAL_LANG_NAME(java.lang.String query, java.sql.Connection con) {
		Statement stmt = null;
		ResultSet rs = null;
		
		LOCAL_LANG_NAME t_local_lang_name = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				t_local_lang_name = new LOCAL_LANG_NAME();
				t_local_lang_name.setINSTANCE(rs.getString(1));
				t_local_lang_name.setLOCAL_NAME_ID(rs.getString(2));
				t_local_lang_name.setLOCN_NAME_ID(rs.getString(3));
				t_local_lang_name.setOWNING_ENTITY(rs.getString(4));
				t_local_lang_name.setLOCAL_LANGUAGE_CD(rs.getString(5));
				t_local_lang_name.setLOCAL_LOCN_NAME(rs.getString(6));
				t_local_lang_name.setLOCAL_NAME_1(rs.getString(7));
				t_local_lang_name.setLOCAL_NAME_2(rs.getString(8));
				t_local_lang_name.setLOCATION_DIV_OR_DEPT(rs.getString(9));
				t_local_lang_name.setLOCAL_BUSINESS_NAME(rs.getString(10));
				t_local_lang_name.setLOCAL_CONSUMER_PREFERRED_NAME(rs.getString(11));
				t_local_lang_name.setROW_ACCESS_ID(rs.getString(12));
				t_local_lang_name.setCREATED_BY(rs.getString(13));
				t_local_lang_name.setCREATED_ON(rs.getString(14));
				t_local_lang_name.setLAST_UPDATE_ACTION(rs.getString(15));
				t_local_lang_name.setLAST_UPDATED_BY(rs.getString(16));
				t_local_lang_name.setLAST_UPDATED_ON(rs.getString(17));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return t_local_lang_name;
	}

	public LOCAL_LANG_ADDR executeQueryGetT_LOCAL_LANG_ADDR(java.lang.String query, java.sql.Connection con) {
		Statement stmt = null;
		ResultSet rs = null;
		
		LOCAL_LANG_ADDR t_local_lang_addr = null;
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				t_local_lang_addr = new LOCAL_LANG_ADDR();
				t_local_lang_addr.setINSTANCE(rs.getString(1));
				t_local_lang_addr.setLOCAL_ADDR_ID(rs.getString(2));
				t_local_lang_addr.setLOCN_ADDR_ID(rs.getString(3));
				t_local_lang_addr.setOWNING_ENTITY(rs.getString(4));
				t_local_lang_addr.setLOCAL_LANGUAGE_CD(rs.getString(5));
				t_local_lang_addr.setLOCAL_ADDRESS_LINE1(rs.getString(6));
				t_local_lang_addr.setLOCAL_ADDRESS_LINE2(rs.getString(7));
				t_local_lang_addr.setLOCAL_ADDRESS_LINE3(rs.getString(8));
				t_local_lang_addr.setLOCAL_ADDRESS_LINE4(rs.getString(9));
				t_local_lang_addr.setLOCAL_ADDRESS_LINE5(rs.getString(10));
				t_local_lang_addr.setLOCAL_CITY(rs.getString(11));
				t_local_lang_addr.setLOCAL_DISTRICT(rs.getString(12));
				t_local_lang_addr.setLOCAL_STATE_PROVINCE(rs.getString(13));
				t_local_lang_addr.setLOCAL_POSTAL_CD(rs.getString(14));
				t_local_lang_addr.setLOCAL_PO_BOX(rs.getString(15));
				t_local_lang_addr.setLOCAL_PO_BOX_CITY(rs.getString(16));
				t_local_lang_addr.setLOCAL_PO_BOX_POSTAL_CD(rs.getString(17));
				t_local_lang_addr.setLANDED_COUNTRY(rs.getString(18));
				t_local_lang_addr.setROW_ACCESS_ID(rs.getString(19));
				t_local_lang_addr.setCREATED_BY(rs.getString(20));
				t_local_lang_addr.setCREATED_ON(rs.getString(21));
				t_local_lang_addr.setLAST_UPDATE_ACTION(rs.getString(22));
				t_local_lang_addr.setLAST_UPDATED_BY(rs.getString(23));
				t_local_lang_addr.setLAST_UPDATED_ON(rs.getString(24));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return t_local_lang_addr;
	}
	
	public Cust_cmr_xref executeQueryGetCust_cmr_xref(java.lang.String
			  query, java.sql.Connection con) throws ParseException {
				  Statement stmt = null; 
				  ResultSet rs = null;
				  Cust_cmr_xref cust_cmr_xref = null; 
				  try { 
				  stmt = con.createStatement(); 
				  rs = stmt.executeQuery(query); 
				  while (rs.next())
			  { 
					  cust_cmr_xref = new Cust_cmr_xref();
					  cust_cmr_xref.setInstance(rs.getString(1));
					  cust_cmr_xref.setSite_id(rs.getString(2));
					  cust_cmr_xref.setIerp_site_id(rs.getString(3));
					  cust_cmr_xref.setKunnr(rs.getString(4));
					  cust_cmr_xref.setPrimary_flag(rs.getString(5));
					  cust_cmr_xref.setAddress_type(rs.getString(6));
					  cust_cmr_xref.setIssuing_country(rs.getString(7));
					  cust_cmr_xref.setCmr_no(rs.getString(8));
					  cust_cmr_xref.setSequence_no(rs.getString(9));
				  	  cust_cmr_xref.setLogical_delete_indicator(rs.getString(10));
				  	cust_cmr_xref.setCreated_by(rs.getString(11));
				  	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
				  	Date parsedDate1 = (Date) dateFormat.parse(rs.getString(12));
				  	Timestamp timestamp_created_on = new java.sql.Timestamp(parsedDate1.getTime());
				  	cust_cmr_xref.setCreated_on(timestamp_created_on);
				  	cust_cmr_xref.setLast_update_action(rs.getString(13));
				  	cust_cmr_xref.setLast_updated_by(rs.getString(14));
				  
				    Date parsedDate = (Date) dateFormat.parse(rs.getString(15));
				    Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
				    cust_cmr_xref.setLast_updated_on(timestamp);
				   } } 
				  catch
				  (SQLException e) { e.printStackTrace(); } finally { try { stmt.close();
			  rs.close(); } catch (SQLException e) { e.printStackTrace(); } } 
				  return  cust_cmr_xref; }

	public String executeQueryGetAdrnrFromKNA1(java.lang.String
			  query, java.sql.Connection con) {
		Statement stmt = null; 
		  ResultSet rs = null;
		  String adrnr = null;
		   
		  try { 
		  stmt = con.createStatement(); 
		  rs = stmt.executeQuery(query); 
		  while (rs.next())  { 
			  adrnr = rs.getString(1);
		  }
		  
		  }
		  catch
		  (SQLException e) { e.printStackTrace(); } finally { try { stmt.close();
	  rs.close(); } catch (SQLException e) { e.printStackTrace(); } }
		  return adrnr;}

	public SiteLegacy executeQueryGetSiteLegacy(java.lang.String
			  query, java.sql.Connection con) throws ParseException {
		    Statement stmt = null;
		    ResultSet rs = null;
		    SiteLegacy siteLegacy = null;

		    try {
		        // Execute the query
		        stmt = con.createStatement();
		        rs = stmt.executeQuery(query);

		        // Iterate through the result set and map values to SiteLegacy
		        while (rs.next()) {
		            siteLegacy = new SiteLegacy();
		            
		            // Assuming the columns in the ResultSet correspond to the fields in SiteLegacy
		            siteLegacy.setSapr3_knvv_ext_misc_billing(rs.getString("sapr3_knvv_ext_misc_billing"));
		            siteLegacy.setSapr3_knvv_ext_mktg_ar_dept(rs.getString("sapr3_knvv_ext_mktg_ar_dept"));
		            siteLegacy.setSapr3_knvv_ext_mktg_dept(rs.getString("sapr3_knvv_ext_mktg_dept"));
		            siteLegacy.setSapr3_knvv_ext_mktg_resp_cd(rs.getString("sapr3_knvv_ext_mktg_resp_cd"));
		            siteLegacy.setSapr3_knvv_ext_oem_ind(rs.getString("sapr3_knvv_ext_oem_ind"));
		            siteLegacy.setSapr3_knvv_ext_pcc_ar_bo(rs.getString("sapr3_knvv_ext_pcc_ar_bo"));
		            siteLegacy.setSapr3_knvv_ext_pcc_mktg_bo(rs.getString("sapr3_knvv_ext_pcc_mktg_bo"));
		            siteLegacy.setSapr3_knvv_ext_proxi_locn(rs.getString("sapr3_knvv_ext_proxi_locn"));
		            siteLegacy.setSapr3_knvv_ext_selling_bo_num(rs.getString("sapr3_knvv_ext_selling_bo_num"));
		            siteLegacy.setSapr3_knvv_ext_svc_ar_ofc(rs.getString("sapr3_knvv_ext_svc_ar_ofc"));
		            siteLegacy.setSapr3_knvv_ext_svc_lgsys_ofc(rs.getString("sapr3_knvv_ext_svc_lgsys_ofc"));
		            siteLegacy.setSapr3_knvv_ext_svc_master_bo(rs.getString("sapr3_knvv_ext_svc_master_bo"));
		            siteLegacy.setSapr3_knvv_ext_svc_oth_ofc(rs.getString("sapr3_knvv_ext_svc_oth_ofc"));
		            siteLegacy.setSapr3_knvv_ext_svc_smsys_ofc(rs.getString("sapr3_knvv_ext_svc_smsys_ofc"));
		            siteLegacy.setSapr3_knvv_ext_us_restrict_to(rs.getString("sapr3_knvv_ext_us_restrict_to"));
		            siteLegacy.setSapr3_knvv_kdgrp(rs.getString("sapr3_knvv_kdgrp"));
		            siteLegacy.setSapr3_knvv_kvgr1(rs.getString("sapr3_knvv_kvgr1"));
		            siteLegacy.setSapr3_knvv_waers(rs.getString("sapr3_knvv_waers"));
		            siteLegacy.setSapr3_kunnr_ext_action_txt(rs.getString("sapr3_kunnr_ext_action_txt"));
		            siteLegacy.setSapr3_kunnr_ext_bill_text1(rs.getString("sapr3_kunnr_ext_bill_text1"));
		            siteLegacy.setSapr3_kunnr_ext_bill_text2(rs.getString("sapr3_kunnr_ext_bill_text2"));
		            siteLegacy.setSapr3_kunnr_ext_bp_mbr_lvl_type(rs.getString("sapr3_kunnr_ext_bp_mbr_lvl_type"));
		            siteLegacy.setSapr3_kunnr_ext_cmr_addr_rec_no(rs.getString("sapr3_kunnr_ext_cmr_addr_rec_no"));
		            siteLegacy.setSapr3_kunnr_ext_cmr_addr_rec_type(rs.getString("sapr3_kunnr_ext_cmr_addr_rec_type"));
		            siteLegacy.setSapr3_kunnr_ext_geo_loc_cd(rs.getString("sapr3_kunnr_ext_geo_loc_cd"));
		            siteLegacy.setSapr3_kunnr_ext_hangar(rs.getString("sapr3_kunnr_ext_hangar"));
		            siteLegacy.setSapr3_kunnr_ext_hw_instl_mstr_flg(rs.getString("sapr3_kunnr_ext_hw_instl_mstr_flg"));
		            siteLegacy.setSapr3_kunnr_ext_ibm_aml_cd(rs.getString("sapr3_kunnr_ext_ibm_aml_cd"));
		            siteLegacy.setSapr3_kunnr_ext_pier(rs.getString("sapr3_kunnr_ext_pier"));
		            siteLegacy.setSapr3_kunnr_ext_privacy_ind(rs.getString("sapr3_kunnr_ext_privacy_ind"));
		            siteLegacy.setSapr3_kunnr_ext_sales_force_id(rs.getString("sapr3_kunnr_ext_sales_force_id"));
		            siteLegacy.setSapr3_kunnr_ext_sc_account_id(rs.getString("sapr3_kunnr_ext_sc_account_id"));
		            siteLegacy.setSapr3_stxl_clustd_tdid9013(rs.getString("sapr3_stxl_clustd_tdid9013"));
		            siteLegacy.setSapr3_us_bp_int_codes_bp_code(rs.getString("sapr3_us_bp_int_codes_bp_code"));
		            siteLegacy.setSapr3_us_bp_int_codes_bp_full_nm(rs.getString("sapr3_us_bp_int_codes_bp_full_nm"));
		            siteLegacy.setSapr3_us_company_comp_legal_name(rs.getString("sapr3_us_company_comp_legal_name"));
		            siteLegacy.setSapr3_us_company_comp_no(rs.getString("sapr3_us_company_comp_no"));
		            siteLegacy.setSapr3_us_company_ent_no(rs.getString("sapr3_us_company_ent_no"));
		            siteLegacy.setSapr3_us_enterprise_ent_legal_name(rs.getString("sapr3_us_enterprise_ent_legal_name"));
		            siteLegacy.setSapr3_us_enterprise_ent_type_code(rs.getString("sapr3_us_enterprise_ent_type_code"));
		            siteLegacy.setSapr3_us_gem_trans_gem_cd(rs.getString("sapr3_us_gem_trans_gem_cd"));
		            siteLegacy.setSapr3_us_restrict_codes_restrict_to_cd(rs.getString("sapr3_us_restrict_codes_restrict_to_cd"));
		            siteLegacy.setSapr3_us_restrict_codes_restrict_to_nm(rs.getString("sapr3_us_restrict_codes_restrict_to_nm"));
		            siteLegacy.setUsinterim_us_tax_data_c_icc_tax_class(rs.getString("usinterim_us_tax_data_c_icc_tax_class"));
		            siteLegacy.setUsinterim_us_tax_data_c_icc_te(rs.getString("usinterim_us_tax_data_c_icc_te"));
		            siteLegacy.setUsinterim_us_tax_data_c_scc(rs.getString("usinterim_us_tax_data_c_scc"));
		            siteLegacy.setUsinterim_us_tax_data_c_te_cert_st_1(rs.getString("usinterim_us_tax_data_c_te_cert_st_1"));
		            siteLegacy.setUsinterim_us_tax_data_c_te_cert_st_2(rs.getString("usinterim_us_tax_data_c_te_cert_st_2"));
		            siteLegacy.setUsinterim_us_tax_data_c_te_cert_st_3(rs.getString("usinterim_us_tax_data_c_te_cert_st_3"));
		            siteLegacy.setUsinterim_us_tax_data_ea_status(rs.getString("usinterim_us_tax_data_ea_status"));
		            siteLegacy.setUsinterim_us_tax_data_f_ocl(rs.getString("usinterim_us_tax_data_f_ocl"));
		            siteLegacy.setUsinterim_us_tax_data_i_tax_class_1(rs.getString("usinterim_us_tax_data_i_tax_class_1"));
		            siteLegacy.setUsinterim_us_tax_data_i_tax_class_2(rs.getString("usinterim_us_tax_data_i_tax_class_2"));
		            siteLegacy.setUsinterim_us_tax_data_i_tax_class_3(rs.getString("usinterim_us_tax_data_i_tax_class_3"));
		            siteLegacy.setUsinterim_us_tax_data_i_type_cust_1(rs.getString("usinterim_us_tax_data_i_type_cust_1"));
		            siteLegacy.setUsinterim_us_tax_data_i_type_cust_2(rs.getString("usinterim_us_tax_data_i_type_cust_2"));
		            siteLegacy.setUsinterim_us_tax_data_i_type_cust_3(rs.getString("usinterim_us_tax_data_i_type_cust_3"));
		            siteLegacy.setSapr3_kna1_stcd1(rs.getString("sapr3_kna1_stcd1"));
		            siteLegacy.setSapr3_kna1_lzone(rs.getString("sapr3_kna1_lzone"));
		            siteLegacy.setSapr3_stxl_clustd_tdid(rs.getString("sapr3_stxl_clustd_tdid"));
		            siteLegacy.setSapr3_knvl_ext_tax_exempt_reason(rs.getString("sapr3_knvl_ext_tax_exempt_reason"));
		            siteLegacy.setRow_access_id(rs.getString("row_access_id"));

		           /* // Handle timestamps
		            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
		            Date parsedDate = (Date) dateFormat.parse(rs.getString("created_on"));
		            siteLegacy.setCreated_on(new Timestamp(parsedDate.getTime()));

		            siteLegacy.setCreated_by(rs.getString("created_by"));
		            siteLegacy.setLast_update_action(rs.getString("last_update_action"));

		            parsedDate = (Date) dateFormat.parse(rs.getString("last_updated_on"));
		            siteLegacy.setLast_updated_on(new Timestamp(parsedDate.getTime()));

		            siteLegacy.setLast_updated_by(rs.getString("last_updated_by"));*/
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        try {
		            if (stmt != null) stmt.close();
		            if (rs != null) rs.close();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }

		    return siteLegacy;
		}

	
	
	
		  
	
	
	
}