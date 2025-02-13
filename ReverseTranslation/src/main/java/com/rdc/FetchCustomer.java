package com.rdc;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;

import com.rdc.entity.AddlCtryData;
import com.rdc.entity.BOCodesMap;
import com.rdc.entity.Cust_cmr_xref;
import com.rdc.entity.Custmain;
import com.rdc.entity.Custmain_ext;
import com.rdc.entity.External_CUST_IDS;
import com.rdc.entity.External_id;
import com.rdc.entity.Firmographics;
import com.rdc.entity.Internal_id;
import com.rdc.entity.KDUNS_NEW;
import com.rdc.entity.KNA1;
import com.rdc.entity.KNB1;
import com.rdc.entity.KNVK;
import com.rdc.entity.KNVL;
import com.rdc.entity.KNVL_EXT;
import com.rdc.entity.KNVP;
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
import com.rdc.entity.SADR;
import com.rdc.entity.STXH;
import com.rdc.entity.STXL;
import com.rdc.entity.SiteLegacy;
import com.rdc.entity.US_COMPANY;
import com.rdc.entity.US_ENTERPRISE;
import com.rdc.entity.US_GEM_TRANS;

public interface FetchCustomer {

	////void getT_CUSTADDR(String instance, String siteId);

	//void getT_CUSTNAME(String instance, String siteId);

	//void getT_EINVOICE_DATA(String instance, String siteId);

	External_id getT_EXTERNAL_ID(String instance, String siteId,Connection connection_Client360) throws ParseException;

	Firmographics getT_FIRMOGRAPHICS(String instance, String siteId,Connection connection_Client360) throws ParseException;

	Internal_id getT_INTERNAL_ID(String instance, String siteId,Connection connection_Client360) throws ParseException;

	Custmain getT_CUSTMAIN(String instance, String siteId,Connection connection_Client360) throws ParseException;
	
	

	public void UpdateRevTransPending(String instance,String siteId,Connection connection_Client360);
	
	void insertKNA1(KNA1 kna1, Connection con_rdc);

	void insertKNVK(KNVK knvk,Connection con_rdc);

	void insertKNVL_EXT(KNVL_EXT knvl_ext,Connection con_rdc) throws SQLException;

	void insertKNVL(KNVL knvl, Connection con_rdc) throws SQLException;

	void insertKNVP(KNVP knvp) throws SQLException;

	void insertKNVV(KNVV knvv,Connection con_rdc);
	
	void insertAdlctrydata(AddlCtryData addlCtryData, Connection con_rdc) throws SQLException;
	
	void insertKna1AddlBilling(Kna1AddlBilling kna1AddlBilling, Connection con_rdc) throws SQLException;
	
	void insertKNB1(KNB1 knb1, Connection con_rdc) throws SQLException;
	
	void insertKNVV_EXT(KNVV_EXT knvv_ext,Connection con_rdc) throws SQLException;
	
	void insertUS_COMPANY(US_COMPANY us_company, Connection con_rdc) throws SQLException;
	
	void insertUS_ENTERPRISE(US_ENTERPRISE us_enterprise, Connection con_rdc) throws SQLException;
	
	void insertUS_GEM_TRANS(US_GEM_TRANS us_gem_trans, Connection con_rdc) throws SQLException;

	//void insertKUNNR_EXT(KUNNR_EXT kunnr_ext);
	
	void updateAdlctrydata(AddlCtryData addlCtryData, Connection con_rdc) throws SQLException;

	void insertSADR(SADR sadr,Connection con_rdc);

	void insertSTXL(STXL stxl,Connection con_rdc);

	void updateKNA1(KNA1 kna1, Connection con_rdc);

	void updateKNVK(KNVK knvk, Connection con_rdc) throws SQLException;

	void updateKNVL_EXT(KNVL_EXT knvl_ext, Connection con_rdc) throws SQLException;

	void updateKNVL(KNVL knvl, Connection con_rdc) throws SQLException;

	void updateKNVP(KNVP knvp) throws SQLException;

	void updateKNVV(KNVV knvv,Connection con_rdc);

	void updateKUNNR_EXT(KUNNR_EXT kunnr_ext, Connection con_rdc);

	void updateSADR(SADR sadr, Connection con_rdc);

	void updateSTXL(STXL stxl, Connection con_rdc);

	LOCN_IDS getT_LOCN_IDS(String instance, String locnIdsRowId,Connection connection_Client360) throws ParseException;

	LOCNNAME getT_LOCNNAME(String instance, String locnNameCd,Connection connection_Client360) throws ParseException;

	LOCNMAIN getT_LOCNMAIN(String instance, String siteId,Connection connection_Client360) throws ParseException;

	LOCNADDR getT_LOCNADDR(String instance, String locnAddrId,Connection connection_Client360) throws ParseException;

	LOCAL_LANG_NAME getT_LOCAL_LANG_NAME(String instance, String locnNameId,Connection connection_Client360);

	LOCAL_LANG_ADDR getT_LOCAL_LANG_ADDR(String instance, String locnAddrId,Connection connection_Client360);

	//Custmain_ext getT_CUSTMAIN_EXT(String instance, String siteId) throws ParseException;

	void insertKDUNS_NEW(KDUNS_NEW kduns_new, Connection con_rdc);

	void updateKDUNS_NEW(KDUNS_NEW kduns_new, Connection con_rdc);

	void insertCust_cmr_xref(Cust_cmr_xref cust_cmr_xref, Connection con_client360);

	Cust_cmr_xref getCust_cmr_xref(String instance, String siteId, String address_type, String issuing_country,
			String cmr_no,Connection con_client360) throws ParseException;

	void DeleteFromRevTransPending(Revtranspending revtranspending,Connection con_client360);

	String getADRNR_KNA1(String instance, String kunnr,Connection con_rdc);

	void insertExternal_CUST_IDS(External_CUST_IDS external_CUST_IDS,Connection con_rdc);

	void UpdateExternal_CUST_IDS(External_CUST_IDS external_CUST_IDS, Connection con_rdc);

	void insertSTXH(STXH stxh,Connection con_rdc);

	void updateSTXH(STXH stxh);

	void updateKna1AddlBilling(Kna1AddlBilling kna1AddlBilling, Connection con) throws SQLException;

	void updateKNB1(KNB1 knb1, Connection con) throws SQLException;

	void updateKNVV_EXT(KNVV_EXT knvv_ext, Connection con) throws SQLException;

	void updateUS_COMPANY(US_COMPANY us_company, Connection con) throws SQLException;

	void updateUS_ENTERPRISE(US_ENTERPRISE us_enterprise, Connection con) throws SQLException;

	void updateUS_GEM_TRANS(US_GEM_TRANS us_gem_trans, Connection con) throws SQLException;

	SiteLegacy getSiteLegacy(String instance, String siteId, String issuing_country, String cmr_no, String address_type,
			String address_seq,Connection con) throws ParseException;

	Custmain_ext getT_CUSTMAIN_EXT(String instance, String siteId, Connection con) throws ParseException;

	void insertBOCodesMap(BOCodesMap bCodesMap, Connection con_rdc);

	//Custmain getT_CUSTMAIN(String instance, String siteId, Connection connection_Client360) throws ParseException;
}