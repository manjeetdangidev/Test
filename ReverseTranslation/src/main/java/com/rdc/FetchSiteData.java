package com.rdc;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;

import com.rdc.entity.Custmain;
import com.rdc.entity.Custmain_ext;

public class FetchSiteData {
	
	
	FetchCustomer fetchCustomer = null; 
	Sitemain sitemain = new Sitemain();
	Custmain_ext custmain_ext = new Custmain_ext();
	Custmain custmain = new Custmain();
	String mdg_url = null;
	String mdg_username = null;
	String mdg_password = null;
	String rdc_url = null;
	String rdc_username = null;
	String rdc_password =  null;
	
	public void initializeSiteData() throws ParseException, SQLException {
	
		// Connect to the database
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		db.readConfigParams("config.properties");
		mdg_url = db.getProperty("mdg_url");
        mdg_username = db.getProperty("mdg_username");
        mdg_password = db.getProperty("mdg_password");
        rdc_url = db.getProperty("rdc_url");
        rdc_username = db.getProperty("rdc_username");
        rdc_password = db.getProperty("rdc_password");
		
        Connection connection_Client360 = DriverManager.getConnection(mdg_url,mdg_username,mdg_password);
		
        
        ArrayList<String> siteIDList =  new ArrayList<String>();

		String query = "SELECT SITE_ID FROM CUSTOMER.REV_TRANS_PENDING WHERE STATUS = 'NEW' AND INSTANCE = '230'";
		PreparedStatement preparedStatement = connection_Client360.prepareStatement(query);
		ResultSet resultSet = preparedStatement.executeQuery();
		while(resultSet.next()) {
			siteIDList.add(resultSet.getString("SITE_ID"));
		}
		
		/*
		 * for (String site_id: siteIDList) { fetchCustomer = new FetchCustomerImpl();
		 * custmain = fetchCustomer.getT_CUSTMAIN("230",site_id ); }
		 */
		
		
	
		/*
		 * Instant now = Instant.now(); String dateString = "9999-12-31";
		 * SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Parse the
		 * date string to java.util.Date java.util.Date utilDate =
		 * formatter.parse(dateString);
		 * 
		 * // Convert java.util.Date to java.sql.Date Date sqlDate = new
		 * Date(utilDate.getTime()); sitemain.setSite_id("S009057823");
		 * sitemain.setCapIndicator("Y"); sitemain.setCoverageEligibleIndicator("Y");
		 * sitemain.setCreated_by("Java-Job"); sitemain.setCreated_on(now.toString());
		 * sitemain.setDelivery_block(""); sitemain.setBilling_block("");
		 * sitemain.setDplStatus(""); sitemain.setGoeExpDate(sqlDate);
		 * sitemain.setGoe_indicator("U"); sitemain.setInstance("230");
		 * sitemain.setLogicaldelete_indicator(""); sitemain.setOrder_block("93");
		 * sitemain.setOwning_entity(""); sitemain.setStcFlag("N");
		 * sitemain_ext.setAddress_type("ZS01");
		 * sitemain_ext.setAuthorizationGroup("US");
		 * sitemain_ext.setCreated_by("Rev-trans");
		 * sitemain_ext.setCreated_on(now.toString());
		 * sitemain_ext.setCustomer_class("11"); sitemain_ext.setIssuing_country("897");
		 * sitemain_ext.setLogicalDeleteIndicator("");
		 * sitemain_ext.setOwning_Entity(""); sitemain_ext.setSales_off("");
		 * sitemain_ext.setSalesOrg(""); sitemain_ext.setSite_Id("S009057823");
		 * sitemain_ext.setSiteExt_Id("S009057823");
		 */
	
}

	public Custmain getCustmain() {
		return custmain;
	}

	public void setCustmain(Custmain custmain) {
		this.custmain = custmain;
	}

	public Sitemain getSitemain() {
		return sitemain;
	}

	public void setSitemain(Sitemain sitemain) {
		this.sitemain = sitemain;
	}

	public Custmain_ext getCustmain_ext() {
		return custmain_ext;
	}

	public void setCustmain_ext(Custmain_ext custmain_ext) {
		this.custmain_ext = custmain_ext;
	}
	
}



