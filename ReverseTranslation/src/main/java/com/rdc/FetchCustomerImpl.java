package com.rdc;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

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
import com.rdc.entity.Revtranspending;
import com.rdc.entity.SADR;
import com.rdc.entity.STXH;
import com.rdc.entity.STXL;
import com.rdc.entity.SiteLegacy;
import com.rdc.entity.T_CUSTADDR;
//import com.rdc.entity.T_CUSTNAME;
import com.rdc.entity.T_EINVOICE_DATA;
import com.rdc.entity.US_COMPANY;
import com.rdc.entity.US_ENTERPRISE;
import com.rdc.entity.US_GEM_TRANS;
import com.rdc.entity.LOCAL_LANG_ADDR;
import com.rdc.entity.LOCAL_LANG_NAME;
import com.rdc.entity.LOCNADDR;
import com.rdc.entity.LOCNMAIN;
import com.rdc.entity.LOCNNAME;
//import com.rdc.entity.T_LOCNMAIN;
//import com.rdc.entity.T_LOCNNAME;
import com.rdc.entity.LOCN_IDS;
//import com.rdc.entity.T_SITE_LEGACY;

@Service
public class FetchCustomerImpl implements FetchCustomer {

	static String mdg_url = null;
	static String mdg_username = null;
	static String mdg_password = null;
	static String rdc_url = null;
	static String rdc_username = null;
	static String rdc_password = null;

	final static Logger LOGGER = LoggerFactory.getLogger(FetchCustomerImpl.class);

	/*
	 * @Override public void getT_CUSTADDR(String instance, String siteId) { ;
	 * Connection con = null; DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2(); if
	 * (con == null) { con = db.getConnection(System.getenv(mdg_url),
	 * System.getenv(mdg_username), System.getenv(mdg_password)); } List<T_CUSTADDR>
	 * t_custaddr = db.executeQueryGetT_CUSTADDR(
	 * MDGP2Query.T_CUSTADDR.replace("%instance%", instance).replace("%siteId%",
	 * siteId), con); LOGGER.info("Count : T_CUSTADDR : " + t_custaddr.size());
	 * t_custaddr.forEach(childNode -> { LOGGER.info("T_CUSTADDR : " +
	 * childNode.toString()); }); }
	 */

	/*
	 * @Override public void getT_CUSTNAME(String instance, String siteId) {
	 * Connection con = null; DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2(); if
	 * (con == null) { con = db.getConnection(mdg_url, mdg_username, mdg_password);
	 * } List<T_CUSTNAME> t_custname = db.executeQueryGetT_CUSTNAME(
	 * MDGP2Query.T_CUSTNAME.replace("%instance%", instance).replace("%siteId%",
	 * siteId), con); LOGGER.info("Count : T_CUSTNAME : " + t_custname.size());
	 * t_custname.forEach(childNode -> { LOGGER.info("T_CUSTNAME : " +
	 * childNode.toString()); }); }
	 */

	/*
	 * @Override public void getT_EINVOICE_DATA(String instance, String siteId) {
	 * Connection con = null; DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2(); if
	 * (con == null) { con = db.getConnection(mdg_url, mdg_username, mdg_password);
	 * } List<T_EINVOICE_DATA> t_einvoice_data = db.executeQueryGetT_EINVOICE_DATA(
	 * MDGP2Query.T_EINVOICE_DATA.replace("%instance%",
	 * instance).replace("%siteId%", siteId), con);
	 * LOGGER.info("Count : T_EINVOICE_DATA : " + t_einvoice_data.size());
	 * t_einvoice_data.forEach(childNode -> { LOGGER.info("T_EINVOICE_DATA : " +
	 * childNode.toString()); }); }
	 */

	@Override
	public External_id getT_EXTERNAL_ID(String instance, String siteId, Connection con) throws ParseException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(mdg_url, mdg_username, mdg_password);
		}
		External_id t_external_id = db.executeQueryGetT_EXTERNAL_ID(
				MDGP2Query.T_EXTERNAL_ID.replace("%instance%", instance).replace("%siteId%", siteId), con);

		return t_external_id;
	}

	@Override
	public Firmographics getT_FIRMOGRAPHICS(String instance, String siteId, Connection con) throws ParseException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(mdg_url, mdg_username, mdg_password);
		}
		Firmographics t_firmographics = db.executeQueryGetT_FIRMOGRAPHICS(
				MDGP2Query.T_FIRMOGRAPHICS.replace("%instance%", instance).replace("%siteId%", siteId), con);

		return t_firmographics;
	}

	@Override
	public Internal_id getT_INTERNAL_ID(String instance, String siteId, Connection con) throws ParseException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(mdg_url, mdg_username, mdg_password);
		}
		Internal_id t_internal_id = db.executeQueryGetT_INTERNAL_ID(
				MDGP2Query.T_INTERNAL_ID.replace("%instance%", instance).replace("%siteId%", siteId), con);
		return t_internal_id;
	}

	@Override
	public Custmain getT_CUSTMAIN(String instance, String siteId, Connection con) throws ParseException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		/*
		 * db.readConfigParams("config.properties"); mdg_url =
		 * db.getProperty("mdg_url"); mdg_username = db.getProperty("mdg_username");
		 * mdg_password = db.getProperty("mdg_password"); rdc_url =
		 * db.getProperty("rdc_url"); rdc_username = db.getProperty("rdc_username");
		 * rdc_password = db.getProperty("rdc_password"); if (con == null) {
		 * 
		 * con = db.getConnection(mdg_url, mdg_username, mdg_password); }
		 */ Custmain custmain = db.executeQueryGetT_CUSTMAIN(
				MDGP2Query.T_CUSTMAIN.replace("%instance%", instance).replace("%siteId%", siteId), con);

		return custmain;
	}

	public void UpdateRevTransPending(String instance, String siteId, Connection con) {

		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		db.readConfigParams("config.properties");
		mdg_url = db.getProperty("mdg_url");
		mdg_username = db.getProperty("mdg_username");
		mdg_password = db.getProperty("mdg_password");
		rdc_url = db.getProperty("rdc_url");
		rdc_username = db.getProperty("rdc_username");
		rdc_password = db.getProperty("rdc_password");
		if (con == null) {

			con = db.getConnection(mdg_url, mdg_username, mdg_password);

		}
		// db.executeQuery(MDGP2Query.V_REV_TRANS_PENDING_Update_Failure.replace("%INSTANCE%",
		// instance).replace("%SITE_ID%", siteId), con);
	}

	@Override
	public Custmain_ext getT_CUSTMAIN_EXT(String instance, String siteId, Connection con) throws ParseException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(mdg_url, mdg_username, mdg_password);
		}
		Custmain_ext t_sitemain_ext = db.executeQueryGetT_CUSTMAIN_EXT(
				MDGP2Query.T_CUSTMAIN_EXT.replace("%instance%", instance).replace("%siteId%", siteId), con);
		return t_sitemain_ext;
	}

	/*
	 * @Override public void getT_SITE_LEGACY(String instance, String siteId) {
	 * Connection con = null; DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2(); if
	 * (con == null) { con = db.getConnection(mdg_url, mdg_username, mdg_password);
	 * } List<T_SITE_LEGACY> t_site_legacy = db.executeQueryGetT_SITE_LEGACY(
	 * MDGP2Query.T_SITE_LEGACY.replace("%instance%", instance).replace("%siteId%",
	 * siteId), con); LOGGER.info("Count : T_SITE_LEGACY : " +
	 * t_site_legacy.size()); t_site_legacy.forEach(childNode -> {
	 * LOGGER.info("T_SITE_LEGACY : " + childNode.toString()); }); }
	 */

	@Override
	public void insertKNA1(KNA1 kna1, Connection con) {

		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();

		try {
			if (con == null) {
				con = db.getConnection(rdc_url, rdc_username, rdc_password);
			}
			con.setAutoCommit(false);
			db.executeQuery(
					MDGP2Query.KNA1_INSERT
							.replace("%MANDT%", kna1.getId().getMandt() != null ? kna1.getId().getMandt() : "")
							.replace("%KUNNR%", kna1.getId().getKnb1kunnr() != null ? kna1.getId().getKnb1kunnr() : "")
							.replace("%ADRNR%", kna1.getAdrnr() != null ? kna1.getAdrnr() : "")
							.replace("%ANRED%", kna1.getAnred() != null ? kna1.getAnred() : "")
							.replace("%AUFSD%", kna1.getAufsd() != null ? kna1.getAufsd() : "")
							.replace("%BAHNE%", kna1.getBahne() != null ? kna1.getBahne() : "")
							.replace("%BAHNS%", kna1.getBahns() != null ? kna1.getBahns() : "")
							.replace("%BBBNR%", kna1.getBbbnr() != null ? kna1.getBbbnr() : "")
							.replace("%BBSNR%", kna1.getBbsnr() != null ? kna1.getBbsnr() : "")
							.replace("%BEGRU%", kna1.getBegru() != null ? kna1.getBegru() : "")
							.replace("%BRSCH%", kna1.getBrsch() != null ? kna1.getBrsch() : "")
							.replace("%BUBKZ%", kna1.getBubkz() != null ? kna1.getBubkz() : "")
							.replace("%DATLT%", kna1.getDatlt() != null ? kna1.getDatlt() : "")
							.replace("%ERDAT%", kna1.getErdat() != null ? kna1.getErdat() : "")
							.replace("%ERNAM%", kna1.getErnam() != null ? kna1.getErnam() : "")
							.replace("%EXABL%", kna1.getExabl() != null ? kna1.getExabl() : "")
							.replace("%FAKSD%", kna1.getFaksd() != null ? kna1.getFaksd() : "")
							.replace("%FISKN%", kna1.getFiskn() != null ? kna1.getFiskn() : "")
							.replace("%KNAZK%", kna1.getKnazk() != null ? kna1.getKnazk() : "")
							.replace("%KNRZA%", kna1.getKnrza() != null ? kna1.getKnrza() : "")
							.replace("%KONZS%", kna1.getKonzs() != null ? kna1.getKonzs() : "")
							.replace("%KTOKD%", kna1.getKtokd() != null ? kna1.getKtokd() : "")
							.replace("%KUKLA%", kna1.getKukla() != null ? kna1.getKukla() : "")
							.replace("%LAND1%", kna1.getLand1() != null ? kna1.getLand1() : "")
							.replace("%LIFNR%", kna1.getLifnr() != null ? kna1.getLifnr() : "")
							.replace("%LIFSD%", kna1.getLifsd() != null ? kna1.getLifsd() : "")
							.replace("%LOCCO%", kna1.getLocco() != null ? kna1.getLocco() : "")
							.replace("%LOEVM%", kna1.getLoevm() != null ? kna1.getLoevm() : "")
							.replace("%NAME1%", kna1.getName1() != null ? kna1.getName1() : "")
							.replace("%NAME2%", kna1.getName2() != null ? kna1.getName2() : "")
							.replace("%NAME3%", kna1.getName3() != null ? kna1.getName3() : "")
							.replace("%NAME4%", kna1.getName4() != null ? kna1.getName4() : "")
							.replace("%NIELS%", kna1.getNiels() != null ? kna1.getNiels() : "")
							.replace("%ORT01%", kna1.getOrt01() != null ? kna1.getOrt01() : "")
							.replace("%ORT02%", kna1.getOrt02() != null ? kna1.getOrt02() : "")
							.replace("%PFACH%", kna1.getPfach() != null ? kna1.getPfach() : "")
							.replace("%PSTL2%", kna1.getPstl2() != null ? kna1.getPstl2() : "")
							.replace("%PSTLZ%", kna1.getPstlz() != null ? kna1.getPstlz() : "")
							.replace("%REGIO%", kna1.getRegio() != null ? kna1.getRegio() : "")
							.replace("%COUNC%", kna1.getCounc() != null ? kna1.getCounc() : "")
							.replace("%CITYC%", kna1.getCityc() != null ? kna1.getCityc() : "")
							.replace("%RPMKR%", kna1.getRpmkr() != null ? kna1.getRpmkr() : "")
							.replace("%SORTL%", kna1.getSortl() != null ? kna1.getSortl() : "")
							.replace("%SPERR%", kna1.getSperr() != null ? kna1.getSperr() : "")
							.replace("%SPRAS%", kna1.getSpras() != null ? kna1.getSpras() : "")
							.replace("%STCD1%", kna1.getStcd1() != null ? kna1.getStcd1() : "")
							.replace("%STCD2%", kna1.getStcd2() != null ? kna1.getStcd2() : "")
							.replace("%STKZA%", kna1.getStkza() != null ? kna1.getStkza() : "")
							.replace("%STKZU%", kna1.getStkzu() != null ? kna1.getStkzu() : "")
							.replace("%STRAS%", kna1.getStras() != null ? kna1.getStras() : "")
							.replace("%TELBX%", kna1.getTelbx() != null ? kna1.getTelbx() : "")
							.replace("%TELF1%", kna1.getTelf1() != null ? kna1.getTelf1() : "")
							.replace("%TELF2%", kna1.getTelf2() != null ? kna1.getTelf2() : "")
							.replace("%TELFX%", kna1.getTelfx() != null ? kna1.getTelfx() : "")
							.replace("%TELTX%", kna1.getTeltx() != null ? kna1.getTeltx() : "")
							.replace("%TELX1%", kna1.getTelx1() != null ? kna1.getTelx1() : "")
							.replace("%LZONE%", kna1.getLzone() != null ? kna1.getLzone() : "")
							.replace("%XCPDK%", kna1.getXcpdk() != null ? kna1.getXcpdk() : "")
							.replace("%XZEMP%", kna1.getXzemp() != null ? kna1.getXzemp() : "")
							.replace("%VBUND%", kna1.getVbund() != null ? kna1.getVbund() : "")
							.replace("%STCEG%", kna1.getStceg() != null ? kna1.getStceg() : "")
							.replace("%DEAR1%", kna1.getDear1() != null ? kna1.getDear1() : "")
							.replace("%DEAR2%", kna1.getDear2() != null ? kna1.getDear2() : "")
							.replace("%DEAR3%", kna1.getDear3() != null ? kna1.getDear3() : "")
							.replace("%DEAR4%", kna1.getDear4() != null ? kna1.getDear4() : "")
							.replace("%DEAR5%", kna1.getDear5() != null ? kna1.getDear5() : "")
							.replace("%GFORM%", kna1.getGform() != null ? kna1.getGform() : "")
							.replace("%BRAN1%", kna1.getBran1() != null ? kna1.getBran1() : "")
							.replace("%BRAN2%", kna1.getBran2() != null ? kna1.getBran2() : "")
							.replace("%BRAN3%", kna1.getBran3() != null ? kna1.getBran3() : "")
							.replace("%BRAN4%", kna1.getBran4() != null ? kna1.getBran4() : "")
							.replace("%BRAN5%", kna1.getBran5() != null ? kna1.getBran5() : "")
							.replace("%EKONT%", kna1.getEkont() != null ? kna1.getEkont() : "")
							.replace("%UMSAT%", Integer.toString(kna1.getUmsat()))
							.replace("%UMJAH%", kna1.getUmjah() != null ? kna1.getUmjah() : "")
							.replace("%UWAER%", kna1.getUwaer() != null ? kna1.getUwaer() : "")
							.replace("%JMZAH%", kna1.getJmzah() != null ? kna1.getJmzah() : "")
							.replace("%JMJAH%", kna1.getJmjah() != null ? kna1.getJmjah() : "")
							.replace("%KATR1%", kna1.getKatr1() != null ? kna1.getKatr1() : "")
							.replace("%KATR2%", kna1.getKatr2() != null ? kna1.getKatr2() : "")
							.replace("%KATR3%", kna1.getKatr3() != null ? kna1.getKatr3() : "")
							.replace("%KATR4%", kna1.getKatr4() != null ? kna1.getKatr4() : "")
							.replace("%KATR5%", kna1.getKatr5() != null ? kna1.getKatr5() : "")
							.replace("%KATR6%", kna1.getKatr6() != null ? kna1.getKatr6() : "")
							.replace("%KATR7%", kna1.getKatr7() != null ? kna1.getKatr7() : "")
							.replace("%KATR8%", kna1.getKatr8() != null ? kna1.getKatr8() : "")
							.replace("%KATR9%", kna1.getKatr9() != null ? kna1.getKatr9() : "")
							.replace("%KATR10%", kna1.getKatr10() != null ? kna1.getKatr10() : "")
							.replace("%STKZN%", kna1.getStkzn() != null ? kna1.getStkzn() : "")
							.replace("%UMSA1%", Integer.toString(kna1.getUmsa1()))
							.replace("%TXJCD%", kna1.getTxjcd() != null ? kna1.getTxjcd() : "")
							.replace("%MCOD1%", kna1.getMcod1() != null ? kna1.getMcod1() : "")
							.replace("%MCOD2%", kna1.getMcod2() != null ? kna1.getMcod2() : "")
							.replace("%MCOD3%", kna1.getMcod3() != null ? kna1.getMcod3() : "")
							.replace("%PERIV%", kna1.getPeriv() != null ? kna1.getPeriv() : "")
							.replace("%ABRVW%", kna1.getAbrvw() != null ? kna1.getAbrvw() : "")
							.replace("%INSPBYDEBI%", kna1.getInspbydebi() != null ? kna1.getInspbydebi() : "")
							.replace("%INSPATDEBI%", kna1.getInspatdebi() != null ? kna1.getInspatdebi() : "")
							.replace("%KTOCD%", kna1.getKtocd() != null ? kna1.getKtocd() : "")
							.replace("%PFORT%", kna1.getPfort() != null ? kna1.getPfort() : "")
							.replace("%WERKS%", kna1.getWerks() != null ? kna1.getWerks() : "")
							.replace("%DTAMS%", kna1.getDtams() != null ? kna1.getDtams() : "")
							.replace("%DTAWS%", kna1.getDtaws() != null ? kna1.getDtaws() : "")
							.replace("%DUEFL%", kna1.getDuefl() != null ? kna1.getDuefl() : "")
							.replace("%HZUOR%", kna1.getHzuor() != null ? kna1.getHzuor() : "")
							.replace("%SPERZ%", kna1.getSperz() != null ? kna1.getSperz() : "")
							.replace("%ETIKG%", kna1.getEtikg() != null ? kna1.getEtikg() : "")
							.replace("%CIVVE%", kna1.getCivve() != null ? kna1.getCivve() : "")
							.replace("%MILVE%", kna1.getMilve() != null ? kna1.getMilve() : "")
							.replace("%KDKG1%", kna1.getKdkg1() != null ? kna1.getKdkg1() : "")
							.replace("%KDKG2%", kna1.getKdkg2() != null ? kna1.getKdkg2() : "")
							.replace("%KDKG3%", kna1.getKdkg3() != null ? kna1.getKdkg3() : "")
							.replace("%KDKG4%", kna1.getKdkg4() != null ? kna1.getKdkg4() : "")
							.replace("%KDKG5%", kna1.getKdkg5() != null ? kna1.getKdkg5() : "")
							.replace("%ZZKV_LOTID%", kna1.getZzkv_lotid() != null ? kna1.getZzkv_lotid() : "")
							.replace("%ZZKV_SIC%", kna1.getZzkv_sic() != null ? kna1.getZzkv_sic() : "")
							.replace("%ZZKV_LIC%", kna1.getZzkv_lic() != null ? kna1.getZzkv_lic() : "")
							.replace("%ZZKV_CUSNO%", kna1.getZzkv_cusno() != null ? kna1.getZzkv_cusno() : "")
							.replace("%ZZKV_SEQNO%", kna1.getZzkv_seqno() != null ? kna1.getZzkv_seqno() : "")
							.replace("%ZZKV_DEPT%", kna1.getZzkv_dept() != null ? kna1.getZzkv_dept() : "")
							.replace("%ZZKV_INAC%", kna1.getZzkv_inac() != null ? kna1.getZzkv_inac() : "")
							.replace("%ZZKV_INACT%", kna1.getZzkv_inact() != null ? kna1.getZzkv_inact() : "")
							.replace("%ZZKV_DUNS%", kna1.getZzkv_duns() != null ? kna1.getZzkv_duns() : "")
							.replace("%ZZKV_NODE1%", kna1.getZzkv_node1() != null ? kna1.getZzkv_node1() : "")
							.replace("%ZZKV_NODE2%", kna1.getZzkv_node2() != null ? kna1.getZzkv_node2() : "")
							.replace("%SHAD_UPDATE_TS%",
									kna1.getShad_update_ts().toString() != null ? kna1.getShad_update_ts().toString()
											: "")
							.replace("%SHAD_UPDATE_IND%",
									kna1.getShad_update_ind() != null ? kna1.getShad_update_ind() : "")
							.replace("%SAP_TS%", kna1.getSap_ts().toString())
							.replace("%ZZKV_ESTAB%", kna1.getZzkv_estab() != null ? kna1.getZzkv_estab() : "")
							.replace("%ZZKV_INTLOC%", kna1.getZzkv_intloc() != null ? kna1.getZzkv_intloc() : "")
							.replace("%ZZKV_INTUSER%", kna1.getZzkv_intuser() != null ? kna1.getZzkv_intuser() : "")
							.replace("%ZZKV_INTFUNC%", kna1.getZzkv_intfunc() != null ? kna1.getZzkv_intfunc() : "")
							.replace("%ZZKV_UC_STRT_ADDR%",
									kna1.getZzkv_uc_strt_addr() != null ? kna1.getZzkv_uc_strt_addr() : "")
							.replace("%ZZKV_SNDX_NAME1%",
									kna1.getZzkv_sndx_name1() != null ? kna1.getZzkv_sndx_name1() : "")
							.replace("%ZZKV_ORG_FLG%", kna1.getZzkv_org_flg() != null ? kna1.getZzkv_org_flg() : "")
							.replace("%RESTRICT_CD%", kna1.getRestrict_cd() != null ? kna1.getRestrict_cd() : "")
							.replace("%CREATE_OPT_NUM%",
									kna1.getCreate_opt_num() != null ? kna1.getCreate_opt_num() : "")
							.replace("%ZZKV_PARTYID%", kna1.getZzkv_partyid() != null ? kna1.getZzkv_partyid() : ""),
					con);
			LOGGER.info("Insert : KNA1 : " + MDGP2Query.KNA1_INSERT
					.replace("%MANDT%", kna1.getId().getMandt() != null ? kna1.getId().getMandt() : "")
					.replace("%KUNNR%", kna1.getId().getKnb1kunnr() != null ? kna1.getId().getKnb1kunnr() : "")
					.replace("%ADRNR%", kna1.getAdrnr() != null ? kna1.getAdrnr() : "")
					.replace("%ANRED%", kna1.getAnred() != null ? kna1.getAnred() : "")
					.replace("%AUFSD%", kna1.getAufsd() != null ? kna1.getAufsd() : "")
					.replace("%BAHNE%", kna1.getBahne() != null ? kna1.getBahne() : "")
					.replace("%BAHNS%", kna1.getBahns() != null ? kna1.getBahns() : "")
					.replace("%BBBNR%", kna1.getBbbnr() != null ? kna1.getBbbnr() : "")
					.replace("%BBSNR%", kna1.getBbsnr() != null ? kna1.getBbsnr() : "")
					.replace("%BEGRU%", kna1.getBegru() != null ? kna1.getBegru() : "")
					.replace("%BRSCH%", kna1.getBrsch() != null ? kna1.getBrsch() : "")
					.replace("%BUBKZ%", kna1.getBubkz() != null ? kna1.getBubkz() : "")
					.replace("%DATLT%", kna1.getDatlt() != null ? kna1.getDatlt() : "")
					.replace("%ERDAT%", kna1.getErdat() != null ? kna1.getErdat() : "")
					.replace("%ERNAM%", kna1.getErnam() != null ? kna1.getErnam() : "")
					.replace("%EXABL%", kna1.getExabl() != null ? kna1.getExabl() : "")
					.replace("%FAKSD%", kna1.getFaksd() != null ? kna1.getFaksd() : "")
					.replace("%FISKN%", kna1.getFiskn() != null ? kna1.getFiskn() : "")
					.replace("%KNAZK%", kna1.getKnazk() != null ? kna1.getKnazk() : "")
					.replace("%KNRZA%", kna1.getKnrza() != null ? kna1.getKnrza() : "")
					.replace("%KONZS%", kna1.getKonzs() != null ? kna1.getKonzs() : "")
					.replace("%KTOKD%", kna1.getKtokd() != null ? kna1.getKtokd() : "")
					.replace("%KUKLA%", kna1.getKukla() != null ? kna1.getKukla() : "")
					.replace("%LAND1%", kna1.getLand1() != null ? kna1.getLand1() : "")
					.replace("%LIFNR%", kna1.getLifnr() != null ? kna1.getLifnr() : "")
					.replace("%LIFSD%", kna1.getLifsd() != null ? kna1.getLifsd() : "")
					.replace("%LOCCO%", kna1.getLocco() != null ? kna1.getLocco() : "")
					.replace("%LOEVM%", kna1.getLoevm() != null ? kna1.getLoevm() : "")
					.replace("%NAME1%", kna1.getName1() != null ? kna1.getName1() : "")
					.replace("%NAME2%", kna1.getName2() != null ? kna1.getName2() : "")
					.replace("%NAME3%", kna1.getName3() != null ? kna1.getName3() : "")
					.replace("%NAME4%", kna1.getName4() != null ? kna1.getName4() : "")
					.replace("%NIELS%", kna1.getNiels() != null ? kna1.getNiels() : "")
					.replace("%ORT01%", kna1.getOrt01() != null ? kna1.getOrt01() : "")
					.replace("%ORT02%", kna1.getOrt02() != null ? kna1.getOrt02() : "")
					.replace("%PFACH%", kna1.getPfach() != null ? kna1.getPfach() : "")
					.replace("%PSTL2%", kna1.getPstl2() != null ? kna1.getPstl2() : "")
					.replace("%PSTLZ%", kna1.getPstlz() != null ? kna1.getPstlz() : "")
					.replace("%REGIO%", kna1.getRegio() != null ? kna1.getRegio() : "")
					.replace("%COUNC%", kna1.getCounc() != null ? kna1.getCounc() : "")
					.replace("%CITYC%", kna1.getCityc() != null ? kna1.getCityc() : "")
					.replace("%RPMKR%", kna1.getRpmkr() != null ? kna1.getRpmkr() : "")
					.replace("%SORTL%", kna1.getSortl() != null ? kna1.getSortl() : "")
					.replace("%SPERR%", kna1.getSperr() != null ? kna1.getSperr() : "")
					.replace("%SPRAS%", kna1.getSpras() != null ? kna1.getSpras() : "")
					.replace("%STCD1%", kna1.getStcd1() != null ? kna1.getStcd1() : "")
					.replace("%STCD2%", kna1.getStcd2() != null ? kna1.getStcd2() : "")
					.replace("%STKZA%", kna1.getStkza() != null ? kna1.getStkza() : "")
					.replace("%STKZU%", kna1.getStkzu() != null ? kna1.getStkzu() : "")
					.replace("%STRAS%", kna1.getStras() != null ? kna1.getStras() : "")
					.replace("%TELBX%", kna1.getTelbx() != null ? kna1.getTelbx() : "")
					.replace("%TELF1%", kna1.getTelf1() != null ? kna1.getTelf1() : "")
					.replace("%TELF2%", kna1.getTelf2() != null ? kna1.getTelf2() : "")
					.replace("%TELFX%", kna1.getTelfx() != null ? kna1.getTelfx() : "")
					.replace("%TELTX%", kna1.getTeltx() != null ? kna1.getTeltx() : "")
					.replace("%TELX1%", kna1.getTelx1() != null ? kna1.getTelx1() : "")
					.replace("%LZONE%", kna1.getLzone() != null ? kna1.getLzone() : "")
					.replace("%XCPDK%", kna1.getXcpdk() != null ? kna1.getXcpdk() : "")
					.replace("%XZEMP%", kna1.getXzemp() != null ? kna1.getXzemp() : "")
					.replace("%VBUND%", kna1.getVbund() != null ? kna1.getVbund() : "")
					.replace("%STCEG%", kna1.getStceg() != null ? kna1.getStceg() : "")
					.replace("%DEAR1%", kna1.getDear1() != null ? kna1.getDear1() : "")
					.replace("%DEAR2%", kna1.getDear2() != null ? kna1.getDear2() : "")
					.replace("%DEAR3%", kna1.getDear3() != null ? kna1.getDear3() : "")
					.replace("%DEAR4%", kna1.getDear4() != null ? kna1.getDear4() : "")
					.replace("%DEAR5%", kna1.getDear5() != null ? kna1.getDear5() : "")
					.replace("%GFORM%", kna1.getGform() != null ? kna1.getGform() : "")
					.replace("%BRAN1%", kna1.getBran1() != null ? kna1.getBran1() : "")
					.replace("%BRAN2%", kna1.getBran2() != null ? kna1.getBran2() : "")
					.replace("%BRAN3%", kna1.getBran3() != null ? kna1.getBran3() : "")
					.replace("%BRAN4%", kna1.getBran4() != null ? kna1.getBran4() : "")
					.replace("%BRAN5%", kna1.getBran5() != null ? kna1.getBran5() : "")
					.replace("%EKONT%", kna1.getEkont() != null ? kna1.getEkont() : "")
					.replace("%UMSAT%", Integer.toString(kna1.getUmsat()))
					.replace("%UMJAH%", kna1.getUmjah() != null ? kna1.getUmjah() : "")
					.replace("%UWAER%", kna1.getUwaer() != null ? kna1.getUwaer() : "")
					.replace("%JMZAH%", kna1.getJmzah() != null ? kna1.getJmzah() : "")
					.replace("%JMJAH%", kna1.getJmjah() != null ? kna1.getJmjah() : "")
					.replace("%KATR1%", kna1.getKatr1() != null ? kna1.getKatr1() : "")
					.replace("%KATR2%", kna1.getKatr2() != null ? kna1.getKatr2() : "")
					.replace("%KATR3%", kna1.getKatr3() != null ? kna1.getKatr3() : "")
					.replace("%KATR4%", kna1.getKatr4() != null ? kna1.getKatr4() : "")
					.replace("%KATR5%", kna1.getKatr5() != null ? kna1.getKatr5() : "")
					.replace("%KATR6%", kna1.getKatr6() != null ? kna1.getKatr6() : "")
					.replace("%KATR7%", kna1.getKatr7() != null ? kna1.getKatr7() : "")
					.replace("%KATR8%", kna1.getKatr8() != null ? kna1.getKatr8() : "")
					.replace("%KATR9%", kna1.getKatr9() != null ? kna1.getKatr9() : "")
					.replace("%KATR10%", kna1.getKatr10() != null ? kna1.getKatr10() : "")
					.replace("%STKZN%", kna1.getStkzn() != null ? kna1.getStkzn() : "")
					.replace("%UMSA1%", Integer.toString(kna1.getUmsa1()))
					.replace("%TXJCD%", kna1.getTxjcd() != null ? kna1.getTxjcd() : "")
					.replace("%MCOD1%", kna1.getMcod1() != null ? kna1.getMcod1() : "")
					.replace("%MCOD2%", kna1.getMcod2() != null ? kna1.getMcod2() : "")
					.replace("%MCOD3%", kna1.getMcod3() != null ? kna1.getMcod3() : "")
					.replace("%PERIV%", kna1.getPeriv() != null ? kna1.getPeriv() : "")
					.replace("%ABRVW%", kna1.getAbrvw() != null ? kna1.getAbrvw() : "")
					.replace("%INSPBYDEBI%", kna1.getInspbydebi() != null ? kna1.getInspbydebi() : "")
					.replace("%INSPATDEBI%", kna1.getInspatdebi() != null ? kna1.getInspatdebi() : "")
					.replace("%KTOCD%", kna1.getKtocd() != null ? kna1.getKtocd() : "")
					.replace("%PFORT%", kna1.getPfort() != null ? kna1.getPfort() : "")
					.replace("%WERKS%", kna1.getWerks() != null ? kna1.getWerks() : "")
					.replace("%DTAMS%", kna1.getDtams() != null ? kna1.getDtams() : "")
					.replace("%DTAWS%", kna1.getDtaws() != null ? kna1.getDtaws() : "")
					.replace("%DUEFL%", kna1.getDuefl() != null ? kna1.getDuefl() : "")
					.replace("%HZUOR%", kna1.getHzuor() != null ? kna1.getHzuor() : "")
					.replace("%SPERZ%", kna1.getSperz() != null ? kna1.getSperz() : "")
					.replace("%ETIKG%", kna1.getEtikg() != null ? kna1.getEtikg() : "")
					.replace("%CIVVE%", kna1.getCivve() != null ? kna1.getCivve() : "")
					.replace("%MILVE%", kna1.getMilve() != null ? kna1.getMilve() : "")
					.replace("%KDKG1%", kna1.getKdkg1() != null ? kna1.getKdkg1() : "")
					.replace("%KDKG2%", kna1.getKdkg2() != null ? kna1.getKdkg2() : "")
					.replace("%KDKG3%", kna1.getKdkg3() != null ? kna1.getKdkg3() : "")
					.replace("%KDKG4%", kna1.getKdkg4() != null ? kna1.getKdkg4() : "")
					.replace("%KDKG5%", kna1.getKdkg5() != null ? kna1.getKdkg5() : "")
					.replace("%ZZKV_LOTID%", kna1.getZzkv_lotid() != null ? kna1.getZzkv_lotid() : "")
					.replace("%ZZKV_SIC%", kna1.getZzkv_sic() != null ? kna1.getZzkv_sic() : "")
					.replace("%ZZKV_LIC%", kna1.getZzkv_lic() != null ? kna1.getZzkv_lic() : "")
					.replace("%ZZKV_CUSNO%", kna1.getZzkv_cusno() != null ? kna1.getZzkv_cusno() : "")
					.replace("%ZZKV_SEQNO%", kna1.getZzkv_seqno() != null ? kna1.getZzkv_seqno() : "")
					.replace("%ZZKV_DEPT%", kna1.getZzkv_dept() != null ? kna1.getZzkv_dept() : "")
					.replace("%ZZKV_INAC%", kna1.getZzkv_inac() != null ? kna1.getZzkv_inac() : "")
					.replace("%ZZKV_INACT%", kna1.getZzkv_inact() != null ? kna1.getZzkv_inact() : "")
					.replace("%ZZKV_DUNS%", kna1.getZzkv_duns() != null ? kna1.getZzkv_duns() : "")
					.replace("%ZZKV_NODE1%", kna1.getZzkv_node1() != null ? kna1.getZzkv_node1() : "")
					.replace("%ZZKV_NODE2%", kna1.getZzkv_node2() != null ? kna1.getZzkv_node2() : "")
					.replace("%SHAD_UPDATE_TS%",
							kna1.getShad_update_ts().toString() != null ? kna1.getShad_update_ts().toString() : "")
					.replace("%SHAD_UPDATE_IND%", kna1.getShad_update_ind() != null ? kna1.getShad_update_ind() : "")
					.replace("%SAP_TS%", kna1.getSap_ts().toString())
					.replace("%ZZKV_ESTAB%", kna1.getZzkv_estab() != null ? kna1.getZzkv_estab() : "")
					.replace("%ZZKV_INTLOC%", kna1.getZzkv_intloc() != null ? kna1.getZzkv_intloc() : "")
					.replace("%ZZKV_INTUSER%", kna1.getZzkv_intuser() != null ? kna1.getZzkv_intuser() : "")
					.replace("%ZZKV_INTFUNC%", kna1.getZzkv_intfunc() != null ? kna1.getZzkv_intfunc() : "")
					.replace("%ZZKV_UC_STRT_ADDR%",
							kna1.getZzkv_uc_strt_addr() != null ? kna1.getZzkv_uc_strt_addr() : "")
					.replace("%ZZKV_SNDX_NAME1%", kna1.getZzkv_sndx_name1() != null ? kna1.getZzkv_sndx_name1() : "")
					.replace("%ZZKV_ORG_FLG%", kna1.getZzkv_org_flg() != null ? kna1.getZzkv_org_flg() : "")
					.replace("%RESTRICT_CD%", kna1.getRestrict_cd() != null ? kna1.getRestrict_cd() : "")
					.replace("%CREATE_OPT_NUM%", kna1.getCreate_opt_num() != null ? kna1.getCreate_opt_num() : "")
					.replace("%ZZKV_PARTYID%", kna1.getZzkv_partyid() != null ? kna1.getZzkv_partyid() : ""));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}

	}

	@Override
	public void insertKNVK(KNVK knvk, Connection con) {

		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		try {

			con.setAutoCommit(false);

			db.executeQuery(MDGP2Query.KNVK_INSERT.replace("%MANDT%", knvk.getMANDT() != null ? knvk.getMANDT() : "")
					.replace("%PARNR%", knvk.getPARNR() != null ? knvk.getPARNR() : "")
					.replace("%KUNNR%", knvk.getKUNNR() != null ? knvk.getKUNNR() : "")
					.replace("%NAMEV%", knvk.getNAMEV() != null ? knvk.getNAMEV() : "")
					.replace("%NAME1%", knvk.getNAME1() != null ? knvk.getNAME1() : "")
					.replace("%ORT01%", knvk.getORT01() != null ? knvk.getORT01() : "")
					.replace("%ADRND%", knvk.getADRND() != null ? knvk.getADRND() : "")
					.replace("%ADRNP%", knvk.getADRNP() != null ? knvk.getADRNP() : "")
					.replace("%ABTPA%", knvk.getABTPA() != null ? knvk.getABTPA() : "")
					.replace("%ABTNR%", knvk.getABTNR() != null ? knvk.getABTNR() : "")
					.replace("%UEPAR%", knvk.getUEPAR() != null ? knvk.getUEPAR() : "")
					.replace("%TELF1%", knvk.getTELF1() != null ? knvk.getTELF1() : "")
					.replace("%ANRED%", knvk.getANRED() != null ? knvk.getANRED() : "")
					.replace("%PAFKT%", knvk.getPAFKT() != null ? knvk.getPAFKT() : "")
					.replace("%PARVO%", knvk.getPARVO() != null ? knvk.getPARVO() : "")
					.replace("%PAVIP%", knvk.getPAVIP() != null ? knvk.getPAVIP() : "")
					.replace("%PARGE%", knvk.getPARGE() != null ? knvk.getPARGE() : "")
					.replace("%PARLA%", knvk.getPARLA() != null ? knvk.getPARLA() : "")
					.replace("%GBDAT%", knvk.getGBDAT() != null ? knvk.getGBDAT() : "")
					.replace("%VRTNR%", knvk.getVRTNR() != null ? knvk.getVRTNR() : "")
					.replace("%BRYTH%", knvk.getBRYTH() != null ? knvk.getBRYTH() : "")
					.replace("%AKVER%", knvk.getAKVER() != null ? knvk.getAKVER() : "")
					.replace("%NMAIL%", knvk.getNMAIL() != null ? knvk.getNMAIL() : "")
					.replace("%PARAU%", knvk.getPARAU() != null ? knvk.getPARAU() : "")
					.replace("%PARH1%", knvk.getPARH1() != null ? knvk.getPARH1() : "")
					.replace("%PARH2%", knvk.getPARH2() != null ? knvk.getPARH2() : "")
					.replace("%PARH3%", knvk.getPARH3() != null ? knvk.getPARH3() : "")
					.replace("%PARH4%", knvk.getPARH4() != null ? knvk.getPARH4() : "")
					.replace("%PARH5%", knvk.getPARH5() != null ? knvk.getPARH5() : "")
					.replace("%MOAB1%", knvk.getMOAB1() != null ? knvk.getMOAB1() : "")
					.replace("%MOBI1%", knvk.getMOBI1() != null ? knvk.getMOBI1() : "")
					.replace("%MOAB2%", knvk.getMOAB2() != null ? knvk.getMOAB2() : "")
					.replace("%MOBI2%", knvk.getMOBI2() != null ? knvk.getMOBI2() : "")
					.replace("%DIAB1%", knvk.getDIAB1() != null ? knvk.getDIAB1() : "")
					.replace("%DIBI1%", knvk.getDIBI1() != null ? knvk.getDIBI1() : "")
					.replace("%DIAB2%", knvk.getDIAB2() != null ? knvk.getDIAB2() : "")
					.replace("%DIBI2%", knvk.getDIBI2() != null ? knvk.getDIBI2() : "")
					.replace("%MIAB1%", knvk.getMIAB1() != null ? knvk.getMIAB1() : "")
					.replace("%MIBI1%", knvk.getMIBI1() != null ? knvk.getMIBI1() : "")
					.replace("%MIAB2%", knvk.getMIAB2() != null ? knvk.getMIAB2() : "")
					.replace("%MIBI2%", knvk.getMIBI2() != null ? knvk.getMIBI2() : "")
					.replace("%DOAB1%", knvk.getDOAB1() != null ? knvk.getDOAB1() : "")
					.replace("%DOBI1%", knvk.getDOBI1() != null ? knvk.getDOBI1() : "")
					.replace("%DOAB2%", knvk.getDOAB2() != null ? knvk.getDOAB2() : "")
					.replace("%DOBI2%", knvk.getDOBI2() != null ? knvk.getDOBI2() : "")
					.replace("%FRAB1%", knvk.getFRAB1() != null ? knvk.getFRAB1() : "")
					.replace("%FRBI1%", knvk.getFRBI1() != null ? knvk.getFRBI1() : "")
					.replace("%FRAB2%", knvk.getFRAB2() != null ? knvk.getFRAB2() : "")
					.replace("%FRBI2%", knvk.getFRBI2() != null ? knvk.getFRBI2() : "")
					.replace("%SAAB1%", knvk.getSAAB1() != null ? knvk.getSAAB1() : "")
					.replace("%SABI1%", knvk.getSABI1() != null ? knvk.getSABI1() : "")
					.replace("%SAAB2%", knvk.getSAAB2() != null ? knvk.getSAAB2() : "")
					.replace("%SABI2%", knvk.getSABI2() != null ? knvk.getSABI2() : "")
					.replace("%SOAB1%", knvk.getSOAB1() != null ? knvk.getSOAB1() : "")
					.replace("%SOBI1%", knvk.getSOBI1() != null ? knvk.getSOBI1() : "")
					.replace("%SOAB2%", knvk.getSOAB2() != null ? knvk.getSOAB2() : "")
					.replace("%SOBI2%", knvk.getSOBI2() != null ? knvk.getSOBI2() : "")
					.replace("%PAKN1%", knvk.getPAKN1() != null ? knvk.getPAKN1() : "")
					.replace("%PAKN2%", knvk.getPAKN2() != null ? knvk.getPAKN2() : "")
					.replace("%PAKN3%", knvk.getPAKN3() != null ? knvk.getPAKN3() : "")
					.replace("%PAKN4%", knvk.getPAKN4() != null ? knvk.getPAKN4() : "")
					.replace("%PAKN5%", knvk.getPAKN5() != null ? knvk.getPAKN5() : "")
					.replace("%SORTL%", knvk.getSORTL() != null ? knvk.getSORTL() : "")
					.replace("%FAMST%", knvk.getFAMST() != null ? knvk.getFAMST() : "")
					.replace("%SPNAM%", knvk.getSPNAM() != null ? knvk.getSPNAM() : "")
					.replace("%TITEL_AP%", knvk.getTITEL_AP() != null ? knvk.getTITEL_AP() : "")
					.replace("%ERDAT%", knvk.getERDAT() != null ? knvk.getERDAT() : "")
					.replace("%ERNAM%", knvk.getERNAM() != null ? knvk.getERNAM() : "")
					.replace("%DUEFL%", knvk.getDUEFL() != null ? knvk.getDUEFL() : "")
					.replace("%LIFNR%", knvk.getLIFNR() != null ? knvk.getLIFNR() : "")
					.replace("%TITEL%", knvk.getTITEL() != null ? knvk.getTITEL() : ""), con);
			LOGGER.info("Insert : KNVK : "
					+ MDGP2Query.KNVK_INSERT.replace("%MANDT%", knvk.getMANDT() != null ? knvk.getMANDT() : "")
							.replace("%PARNR%", knvk.getPARNR() != null ? knvk.getPARNR() : "")
							.replace("%KUNNR%", knvk.getKUNNR() != null ? knvk.getKUNNR() : "")
							.replace("%NAMEV%", knvk.getNAMEV() != null ? knvk.getNAMEV() : "")
							.replace("%NAME1%", knvk.getNAME1() != null ? knvk.getNAME1() : "")
							.replace("%ORT01%", knvk.getORT01() != null ? knvk.getORT01() : "")
							.replace("%ADRND%", knvk.getADRND() != null ? knvk.getADRND() : "")
							.replace("%ADRNP%", knvk.getADRNP() != null ? knvk.getADRNP() : "")
							.replace("%ABTPA%", knvk.getABTPA() != null ? knvk.getABTPA() : "")
							.replace("%ABTNR%", knvk.getABTNR() != null ? knvk.getABTNR() : "")
							.replace("%UEPAR%", knvk.getUEPAR() != null ? knvk.getUEPAR() : "")
							.replace("%TELF1%", knvk.getTELF1() != null ? knvk.getTELF1() : "")
							.replace("%ANRED%", knvk.getANRED() != null ? knvk.getANRED() : "")
							.replace("%PAFKT%", knvk.getPAFKT() != null ? knvk.getPAFKT() : "")
							.replace("%PARVO%", knvk.getPARVO() != null ? knvk.getPARVO() : "")
							.replace("%PAVIP%", knvk.getPAVIP() != null ? knvk.getPAVIP() : "")
							.replace("%PARGE%", knvk.getPARGE() != null ? knvk.getPARGE() : "")
							.replace("%PARLA%", knvk.getPARLA() != null ? knvk.getPARLA() : "")
							.replace("%GBDAT%", knvk.getGBDAT() != null ? knvk.getGBDAT() : "")
							.replace("%VRTNR%", knvk.getVRTNR() != null ? knvk.getVRTNR() : "")
							.replace("%BRYTH%", knvk.getBRYTH() != null ? knvk.getBRYTH() : "")
							.replace("%AKVER%", knvk.getAKVER() != null ? knvk.getAKVER() : "")
							.replace("%NMAIL%", knvk.getNMAIL() != null ? knvk.getNMAIL() : "")
							.replace("%PARAU%", knvk.getPARAU() != null ? knvk.getPARAU() : "")
							.replace("%PARH1%", knvk.getPARH1() != null ? knvk.getPARH1() : "")
							.replace("%PARH2%", knvk.getPARH2() != null ? knvk.getPARH2() : "")
							.replace("%PARH3%", knvk.getPARH3() != null ? knvk.getPARH3() : "")
							.replace("%PARH4%", knvk.getPARH4() != null ? knvk.getPARH4() : "")
							.replace("%PARH5%", knvk.getPARH5() != null ? knvk.getPARH5() : "")
							.replace("%MOAB1%", knvk.getMOAB1() != null ? knvk.getMOAB1() : "")
							.replace("%MOBI1%", knvk.getMOBI1() != null ? knvk.getMOBI1() : "")
							.replace("%MOAB2%", knvk.getMOAB2() != null ? knvk.getMOAB2() : "")
							.replace("%MOBI2%", knvk.getMOBI2() != null ? knvk.getMOBI2() : "")
							.replace("%DIAB1%", knvk.getDIAB1() != null ? knvk.getDIAB1() : "")
							.replace("%DIBI1%", knvk.getDIBI1() != null ? knvk.getDIBI1() : "")
							.replace("%DIAB2%", knvk.getDIAB2() != null ? knvk.getDIAB2() : "")
							.replace("%DIBI2%", knvk.getDIBI2() != null ? knvk.getDIBI2() : "")
							.replace("%MIAB1%", knvk.getMIAB1() != null ? knvk.getMIAB1() : "")
							.replace("%MIBI1%", knvk.getMIBI1() != null ? knvk.getMIBI1() : "")
							.replace("%MIAB2%", knvk.getMIAB2() != null ? knvk.getMIAB2() : "")
							.replace("%MIBI2%", knvk.getMIBI2() != null ? knvk.getMIBI2() : "")
							.replace("%DOAB1%", knvk.getDOAB1() != null ? knvk.getDOAB1() : "")
							.replace("%DOBI1%", knvk.getDOBI1() != null ? knvk.getDOBI1() : "")
							.replace("%DOAB2%", knvk.getDOAB2() != null ? knvk.getDOAB2() : "")
							.replace("%DOBI2%", knvk.getDOBI2() != null ? knvk.getDOBI2() : "")
							.replace("%FRAB1%", knvk.getFRAB1() != null ? knvk.getFRAB1() : "")
							.replace("%FRBI1%", knvk.getFRBI1() != null ? knvk.getFRBI1() : "")
							.replace("%FRAB2%", knvk.getFRAB2() != null ? knvk.getFRAB2() : "")
							.replace("%FRBI2%", knvk.getFRBI2() != null ? knvk.getFRBI2() : "")
							.replace("%SAAB1%", knvk.getSAAB1() != null ? knvk.getSAAB1() : "")
							.replace("%SABI1%", knvk.getSABI1() != null ? knvk.getSABI1() : "")
							.replace("%SAAB2%", knvk.getSAAB2() != null ? knvk.getSAAB2() : "")
							.replace("%SABI2%", knvk.getSABI2() != null ? knvk.getSABI2() : "")
							.replace("%SOAB1%", knvk.getSOAB1() != null ? knvk.getSOAB1() : "")
							.replace("%SOBI1%", knvk.getSOBI1() != null ? knvk.getSOBI1() : "")
							.replace("%SOAB2%", knvk.getSOAB2() != null ? knvk.getSOAB2() : "")
							.replace("%SOBI2%", knvk.getSOBI2() != null ? knvk.getSOBI2() : "")
							.replace("%PAKN1%", knvk.getPAKN1() != null ? knvk.getPAKN1() : "")
							.replace("%PAKN2%", knvk.getPAKN2() != null ? knvk.getPAKN2() : "")
							.replace("%PAKN3%", knvk.getPAKN3() != null ? knvk.getPAKN3() : "")
							.replace("%PAKN4%", knvk.getPAKN4() != null ? knvk.getPAKN4() : "")
							.replace("%PAKN5%", knvk.getPAKN5() != null ? knvk.getPAKN5() : "")
							.replace("%SORTL%", knvk.getSORTL() != null ? knvk.getSORTL() : "")
							.replace("%FAMST%", knvk.getFAMST() != null ? knvk.getFAMST() : "")
							.replace("%SPNAM%", knvk.getSPNAM() != null ? knvk.getSPNAM() : "")
							.replace("%TITEL_AP%", knvk.getTITEL_AP() != null ? knvk.getTITEL_AP() : "")
							.replace("%ERDAT%", knvk.getERDAT() != null ? knvk.getERDAT() : "")
							.replace("%ERNAM%", knvk.getERNAM() != null ? knvk.getERNAM() : "")
							.replace("%DUEFL%", knvk.getDUEFL() != null ? knvk.getDUEFL() : "")
							.replace("%LIFNR%", knvk.getLIFNR() != null ? knvk.getLIFNR() : "")
							.replace("%TITEL%", knvk.getTITEL() != null ? knvk.getTITEL() : ""));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void insertKNVL_EXT(KNVL_EXT knvl_ext, Connection con_rdc) throws SQLException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con_rdc == null) {
			con_rdc = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		con_rdc.setAutoCommit(false);
		db.executeQuery(MDGP2Query.KNVL_EXT_INSERT.replace("%MANDT%", knvl_ext.getMandt())
				.replace("%KUNNR%", knvl_ext.getKunnr()).replace("%ALAND%", knvl_ext.getAland())
				.replace("%TATYP%", knvl_ext.getTatyp()).replace("%LICNR%", knvl_ext.getLicnr())
				.replace("%TAX_EXEMPT_REASON%", knvl_ext.getTax_exempt_reason()).replace("%LOEVM%", knvl_ext.getLoevm())
				.replace("%CREATED_BY%", knvl_ext.getCreated_by())
				.replace("%CREATE_DT%", knvl_ext.getCreate_dt().toString())
				.replace("%UPDATED_BY%", knvl_ext.getUpdated_by())
				.replace("%UPDATE_DT%", knvl_ext.getUpdate_dt().toString())
				.replace("%UPDATE_TYPE%", knvl_ext.getUpdate_type()), con_rdc);
		LOGGER.info("Insert : KNVL_EXT : " + MDGP2Query.KNVL_EXT_INSERT.replace("%MANDT%", knvl_ext.getMandt())
				.replace("%KUNNR%", knvl_ext.getKunnr()).replace("%ALAND%", knvl_ext.getAland())
				.replace("%TATYP%", knvl_ext.getTatyp()).replace("%LICNR%", knvl_ext.getLicnr())
				.replace("%TAX_EXEMPT_REASON%", knvl_ext.getTax_exempt_reason()).replace("%LOEVM%", knvl_ext.getLoevm())
				.replace("%CREATED_BY%", knvl_ext.getCreated_by())
				.replace("%CREATE_DT%", knvl_ext.getCreate_dt().toString())
				.replace("%UPDATED_BY%", knvl_ext.getUpdated_by())
				.replace("%UPDATE_DT%", knvl_ext.getUpdate_dt().toString())
				.replace("%UPDATE_TYPE%", knvl_ext.getUpdate_type()));
	}

	@Override
	public void insertKNVL(KNVL knvl, Connection con) throws SQLException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		db.executeQuery(
				MDGP2Query.KNVL_INSERT.replace("%MANDT%", knvl.getMandt()).replace("%KUNNR%", knvl.getKunnr())
						.replace("%ALAND%", knvl.getAland()).replace("%TATYP%", knvl.getTatyp())
						.replace("%LICNR%", knvl.getLicnr()).replace("%DATAB%", knvl.getDatab())
						.replace("%DATBI%", knvl.getDatbi()).replace("%BELIC%", knvl.getBelic())
						.replace("%SHAD_UPDATE_TS%", knvl.getShad_update_ts())
						.replace("%SHAD_UPDATE_IND%", knvl.getShad_update_ind()).replace("%SAP_TS%", knvl.getSap_ts()),
				con);
		LOGGER.info("Insert : KNVL : " + MDGP2Query.KNVL_INSERT.replace("%MANDT%", knvl.getMandt())
				.replace("%KUNNR%", knvl.getKunnr()).replace("%ALAND%", knvl.getAland())
				.replace("%TATYP%", knvl.getTatyp()).replace("%LICNR%", knvl.getLicnr())
				.replace("%DATAB%", knvl.getDatab()).replace("%DATBI%", knvl.getDatbi())
				.replace("%BELIC%", knvl.getBelic()).replace("%SHAD_UPDATE_TS%", knvl.getShad_update_ts())
				.replace("%SHAD_UPDATE_IND%", knvl.getShad_update_ind()).replace("%SAP_TS%", knvl.getSap_ts()));
	}

	@Override
	public void insertKNVP(KNVP knvp) throws SQLException {
		Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		db.executeQuery(
				MDGP2Query.KNVP_INSERT.replace("%MANDT%", knvp.getMANDT()).replace("%KUNNR%", knvp.getKUNNR())
						.replace("%VKORG%", knvp.getVKORG()).replace("%VTWEG%", knvp.getVTWEG())
						.replace("%SPART%", knvp.getSPART()).replace("%PARVW%", knvp.getPARVW())
						.replace("%PARZA%", knvp.getPARZA()).replace("%KUNN2%", knvp.getKUNN2())
						.replace("%LIFNR%", knvp.getLIFNR()).replace("%PERNR%", knvp.getPERNR())
						.replace("%PARNR%", knvp.getPARNR()).replace("%KNREF%", knvp.getKNREF())
						.replace("%DEFPA%", knvp.getDEFPA()).replace("%SHAD_UPDATE_TS%", knvp.getSHAD_UPDATE_TS())
						.replace("%SHAD_UPDATE_IND%", knvp.getSHAD_UPDATE_IND()).replace("%SAP_TS%", knvp.getSAP_TS()),
				con);
		LOGGER.info("Insert : KNVP : "
				+ MDGP2Query.KNVP_INSERT.replace("%MANDT%", knvp.getMANDT()).replace("%KUNNR%", knvp.getKUNNR())
						.replace("%VKORG%", knvp.getVKORG()).replace("%VTWEG%", knvp.getVTWEG())
						.replace("%SPART%", knvp.getSPART()).replace("%PARVW%", knvp.getPARVW())
						.replace("%PARZA%", knvp.getPARZA()).replace("%KUNN2%", knvp.getKUNN2())
						.replace("%LIFNR%", knvp.getLIFNR()).replace("%PERNR%", knvp.getPERNR())
						.replace("%PARNR%", knvp.getPARNR()).replace("%KNREF%", knvp.getKNREF())
						.replace("%DEFPA%", knvp.getDEFPA()).replace("%SHAD_UPDATE_TS%", knvp.getSHAD_UPDATE_TS())
						.replace("%SHAD_UPDATE_IND%", knvp.getSHAD_UPDATE_IND()).replace("%SAP_TS%", knvp.getSAP_TS()));
	}

	@Override
	public void insertKNVV(KNVV knvv, Connection con) {
		try {
			DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
			if (con == null) {
				con = db.getConnection(rdc_url, rdc_username, rdc_password);
			}
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.KNVV_INSERT.replace("%MANDT%", knvv.getMandt() != null ? knvv.getMandt() : "")
					.replace("%KUNNR%", knvv.getKunnr() != null ? knvv.getKunnr() : "")
					.replace("%VKORG%", knvv.getVkorg() != null ? knvv.getVkorg() : "")
					.replace("%VTWEG%", knvv.getVtweg() != null ? knvv.getVtweg() : "")
					.replace("%SPART%", knvv.getSpart() != null ? knvv.getSpart() : "")
					.replace("%ERNAM%", knvv.getErnam() != null ? knvv.getErnam() : "")
					.replace("%ERDAT%", knvv.getErdat() != null ? knvv.getErdat() : "")
					.replace("%BEGRU%", knvv.getBegru() != null ? knvv.getBegru() : "")
					.replace("%LOEVM%", knvv.getLoevm() != null ? knvv.getLoevm() : "")
					.replace("%VERSG%", knvv.getVersg() != null ? knvv.getVersg() : "")
					.replace("%AUFSD%", knvv.getAufsd() != null ? knvv.getAufsd() : "")
					.replace("%KALKS%", knvv.getKalks() != null ? knvv.getKalks() : "")
					.replace("%KDGRP%", knvv.getKdgrp() != null ? knvv.getKdgrp() : "")
					.replace("%BZIRK%", knvv.getBzirk() != null ? knvv.getBzirk() : "")
					.replace("%KONDA%", knvv.getKonda() != null ? knvv.getKonda() : "")
					.replace("%PLTYP%", knvv.getPltyp() != null ? knvv.getPltyp() : "")
					.replace("%AWAHR%", knvv.getAwahr() != null ? knvv.getAwahr() : "")
					.replace("%INCO1%", knvv.getInco1() != null ? knvv.getInco1() : "")
					.replace("%INCO2%", knvv.getInco2() != null ? knvv.getInco2() : "")
					.replace("%LIFSD%", knvv.getLifsd() != null ? knvv.getLifsd() : "")
					.replace("%AUTLF%", knvv.getAutlf() != null ? knvv.getAutlf() : "")
					.replace("%ANTLF%", Double.toString(knvv.getAntlf()))
					.replace("%KZTLF%", knvv.getKztlf() != null ? knvv.getKztlf() : "")
					.replace("%KZAZU%", knvv.getKzazu() != null ? knvv.getKzazu() : "")
					.replace("%CHSPL%", knvv.getChspl() != null ? knvv.getChspl() : "")
					.replace("%LPRIO%", knvv.getLprio() != null ? knvv.getLprio() : "")
					.replace("%EIKTO%", knvv.getEikto() != null ? knvv.getEikto() : "")
					.replace("%VSBED%", knvv.getVsbed() != null ? knvv.getVsbed() : "")
					.replace("%FAKSD%", knvv.getFaksd() != null ? knvv.getFaksd() : "")
					.replace("%MRNKZ%", knvv.getMrnkz() != null ? knvv.getMrnkz() : "")
					.replace("%PERFK%", knvv.getPerfk() != null ? knvv.getPerfk() : "")
					.replace("%PERRL%", knvv.getPerrl() != null ? knvv.getPerrl() : "")
					.replace("%KVAKZ%", knvv.getKvakz() != null ? knvv.getKvakz() : "")
					.replace("%KVAWT%", Double.toString(knvv.getKvawt()))
					.replace("%WAERS%", knvv.getWaers() != null ? knvv.getWaers() : "")
					.replace("%KLABC%", knvv.getKlabc() != null ? knvv.getKlabc() : "")
					.replace("%KTGRD%", knvv.getKtgrd() != null ? knvv.getKtgrd() : "")
					.replace("%ZTERM%", knvv.getZterm() != null ? knvv.getZterm() : "")
					.replace("%VWERK%", knvv.getVwerk() != null ? knvv.getVwerk() : "")
					.replace("%VKGRP%", knvv.getVkgrp() != null ? knvv.getVkgrp() : "")
					.replace("%VKBUR%", knvv.getVkbur() != null ? knvv.getVkbur() : "")
					.replace("%VSORT%", knvv.getVsort() != null ? knvv.getVsort() : "")
					.replace("%KVGR1%", knvv.getKvgr1() != null ? knvv.getKvgr1() : "")
					.replace("%KVGR2%", knvv.getKvgr2() != null ? knvv.getKvgr2() : "")
					.replace("%KVGR3%", knvv.getKvgr3() != null ? knvv.getKvgr3() : "")
					.replace("%KVGR4%", knvv.getKvgr4() != null ? knvv.getKvgr4() : "")
					.replace("%KVGR5%", knvv.getKvgr5() != null ? knvv.getKvgr5() : "")
					.replace("%BOKRE%", knvv.getBokre() != null ? knvv.getBokre() : "")
					.replace("%BOIDT%", knvv.getBoidt() != null ? knvv.getBoidt() : "")
					.replace("%KURST%", knvv.getKurst() != null ? knvv.getKurst() : "")
					.replace("%PRFRE%", knvv.getPrfre() != null ? knvv.getPrfre() : "")
					.replace("%PRAT1%", knvv.getPrat1() != null ? knvv.getPrat1() : "")
					.replace("%PRAT2%", knvv.getPrat2() != null ? knvv.getPrat2() : "")
					.replace("%PRAT3%", knvv.getPrat3() != null ? knvv.getPrat3() : "")
					.replace("%PRAT4%", knvv.getPrat4() != null ? knvv.getPrat4() : "")
					.replace("%PRAT5%", knvv.getPrat5() != null ? knvv.getPrat5() : "")
					.replace("%PRAT6%", knvv.getPrat6() != null ? knvv.getPrat6() : "")
					.replace("%PRAT7%", knvv.getPrat7() != null ? knvv.getPrat7() : "")
					.replace("%PRAT8%", knvv.getPrat8() != null ? knvv.getPrat8() : "")
					.replace("%PRAT9%", knvv.getPrat9() != null ? knvv.getPrat9() : "")
					.replace("%PRATA%", knvv.getPrata() != null ? knvv.getPrata() : "")
					.replace("%FPART%", knvv.getFpart() != null ? knvv.getFpart() : "")
					.replace("%SHAD_UPDATE_TS%", knvv.getShad_update_ts().toString())
					.replace("%SHAD_UPDATE_IND%", knvv.getShad_update_ind() != null ? knvv.getShad_update_ind() : "")
					.replace("%SAP_TS%", knvv.getShad_update_ts().toString()), con);

			LOGGER.info("Insert KNVV :"
					+ MDGP2Query.KNVV_INSERT.replace("%MANDT%", knvv.getMandt() != null ? knvv.getMandt() : "")
							.replace("%KUNNR%", knvv.getKunnr() != null ? knvv.getKunnr() : "")
							.replace("%VKORG%", knvv.getVkorg() != null ? knvv.getVkorg() : "")
							.replace("%VTWEG%", knvv.getVtweg() != null ? knvv.getVtweg() : "")
							.replace("%SPART%", knvv.getSpart() != null ? knvv.getSpart() : "")
							.replace("%ERNAM%", knvv.getErnam() != null ? knvv.getErnam() : "")
							.replace("%ERDAT%", knvv.getErdat() != null ? knvv.getErdat() : "")
							.replace("%BEGRU%", knvv.getBegru() != null ? knvv.getBegru() : "")
							.replace("%LOEVM%", knvv.getLoevm() != null ? knvv.getLoevm() : "")
							.replace("%VERSG%", knvv.getVersg() != null ? knvv.getVersg() : "")
							.replace("%AUFSD%", knvv.getAufsd() != null ? knvv.getAufsd() : "")
							.replace("%KALKS%", knvv.getKalks() != null ? knvv.getKalks() : "")
							.replace("%KDGRP%", knvv.getKdgrp() != null ? knvv.getKdgrp() : "")
							.replace("%BZIRK%", knvv.getBzirk() != null ? knvv.getBzirk() : "")
							.replace("%KONDA%", knvv.getKonda() != null ? knvv.getKonda() : "")
							.replace("%PLTYP%", knvv.getPltyp() != null ? knvv.getPltyp() : "")
							.replace("%AWAHR%", knvv.getAwahr() != null ? knvv.getAwahr() : "")
							.replace("%INCO1%", knvv.getInco1() != null ? knvv.getInco1() : "")
							.replace("%INCO2%", knvv.getInco2() != null ? knvv.getInco2() : "")
							.replace("%LIFSD%", knvv.getLifsd() != null ? knvv.getLifsd() : "")
							.replace("%AUTLF%", knvv.getAutlf() != null ? knvv.getAutlf() : "")
							.replace("%ANTLF%", Double.toString(knvv.getAntlf()))
							.replace("%KZTLF%", knvv.getKztlf() != null ? knvv.getKztlf() : "")
							.replace("%KZAZU%", knvv.getKzazu() != null ? knvv.getKzazu() : "")
							.replace("%CHSPL%", knvv.getChspl() != null ? knvv.getChspl() : "")
							.replace("%LPRIO%", knvv.getLprio() != null ? knvv.getLprio() : "")
							.replace("%EIKTO%", knvv.getEikto() != null ? knvv.getEikto() : "")
							.replace("%VSBED%", knvv.getVsbed() != null ? knvv.getVsbed() : "")
							.replace("%FAKSD%", knvv.getFaksd() != null ? knvv.getFaksd() : "")
							.replace("%MRNKZ%", knvv.getMrnkz() != null ? knvv.getMrnkz() : "")
							.replace("%PERFK%", knvv.getPerfk() != null ? knvv.getPerfk() : "")
							.replace("%PERRL%", knvv.getPerrl() != null ? knvv.getPerrl() : "")
							.replace("%KVAKZ%", knvv.getKvakz() != null ? knvv.getKvakz() : "")
							.replace("%KVAWT%", Double.toString(knvv.getKvawt()))
							.replace("%WAERS%", knvv.getWaers() != null ? knvv.getWaers() : "")
							.replace("%KLABC%", knvv.getKlabc() != null ? knvv.getKlabc() : "")
							.replace("%KTGRD%", knvv.getKtgrd() != null ? knvv.getKtgrd() : "")
							.replace("%ZTERM%", knvv.getZterm() != null ? knvv.getZterm() : "")
							.replace("%VWERK%", knvv.getVwerk() != null ? knvv.getVwerk() : "")
							.replace("%VKGRP%", knvv.getVkgrp() != null ? knvv.getVkgrp() : "")
							.replace("%VKBUR%", knvv.getVkbur() != null ? knvv.getVkbur() : "")
							.replace("%VSORT%", knvv.getVsort() != null ? knvv.getVsort() : "")
							.replace("%KVGR1%", knvv.getKvgr1() != null ? knvv.getKvgr1() : "")
							.replace("%KVGR2%", knvv.getKvgr2() != null ? knvv.getKvgr2() : "")
							.replace("%KVGR3%", knvv.getKvgr3() != null ? knvv.getKvgr3() : "")
							.replace("%KVGR4%", knvv.getKvgr4() != null ? knvv.getKvgr4() : "")
							.replace("%KVGR5%", knvv.getKvgr5() != null ? knvv.getKvgr5() : "")
							.replace("%BOKRE%", knvv.getBokre() != null ? knvv.getBokre() : "")
							.replace("%BOIDT%", knvv.getBoidt() != null ? knvv.getBoidt() : "")
							.replace("%KURST%", knvv.getKurst() != null ? knvv.getKurst() : "")
							.replace("%PRFRE%", knvv.getPrfre() != null ? knvv.getPrfre() : "")
							.replace("%PRAT1%", knvv.getPrat1() != null ? knvv.getPrat1() : "")
							.replace("%PRAT2%", knvv.getPrat2() != null ? knvv.getPrat2() : "")
							.replace("%PRAT3%", knvv.getPrat3() != null ? knvv.getPrat3() : "")
							.replace("%PRAT4%", knvv.getPrat4() != null ? knvv.getPrat4() : "")
							.replace("%PRAT5%", knvv.getPrat5() != null ? knvv.getPrat5() : "")
							.replace("%PRAT6%", knvv.getPrat6() != null ? knvv.getPrat6() : "")
							.replace("%PRAT7%", knvv.getPrat7() != null ? knvv.getPrat7() : "")
							.replace("%PRAT8%", knvv.getPrat8() != null ? knvv.getPrat8() : "")
							.replace("%PRAT9%", knvv.getPrat9() != null ? knvv.getPrat9() : "")
							.replace("%PRATA%", knvv.getPrata() != null ? knvv.getPrata() : "")
							.replace("%FPART%", knvv.getFpart() != null ? knvv.getFpart() : "")
							.replace("%SHAD_UPDATE_TS%", knvv.getShad_update_ts().toString())
							.replace("%SHAD_UPDATE_IND%",
									knvv.getShad_update_ind() != null ? knvv.getShad_update_ind() : "")
							.replace("%SAP_TS%", knvv.getShad_update_ts().toString()));
		}

		catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	/*
	 * @Override public void insertKUNNR_EXT(KUNNR_EXT kunnr_ext) { Connection con =
	 * null; DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2(); if (con == null) {
	 * con = db.getConnection(rdc_url, rdc_username, rdc_password); }
	 * db.executeQuery(MDGP2Query.KUNNR_EXT_INSERT.replace("%KUNNR%",
	 * kunnr_ext.getKUNNR()!=null?kunnr_ext.getKUNNR():"") .replace("%MANDT%",
	 * kunnr_ext.getMANDT()!=null?kunnr_ext.getMANDT():"").replace("%GOE_IND%",
	 * kunnr_ext.getGOE_IND()!=null?kunnr_ext.getGOE_IND():"")
	 * .replace("%GOE_SRC_CD%",
	 * kunnr_ext.getGOE_SRC_CD()!=null?kunnr_ext.getGOE_SRC_CD():"").replace(
	 * "%GOE_RSN_CD%", kunnr_ext.getGOE_RSN_CD()!=null?kunnr_ext.getGOE_RSN_CD():"")
	 * .replace("%PRIVACY_IND%",
	 * kunnr_ext.getPRIVACY_IND()!=null?kunnr_ext.getPRIVACY_IND():"").replace(
	 * "%IBM_AML_CD%", kunnr_ext.getIBM_AML_CD()!=null?kunnr_ext.getIBM_AML_CD():"")
	 * .replace("%CAP_IND%",
	 * kunnr_ext.getCAP_IND()!=null?kunnr_ext.getCAP_IND():"").replace(
	 * "%GEO_LOC_CD%", kunnr_ext.getGEO_LOC_CD()!=null?kunnr_ext.getGEO_LOC_CD():"")
	 * .replace("%BUILDING%",
	 * kunnr_ext.getBUILDING()!=null?kunnr_ext.getBUILDING():"").replace("%FLOOR%",
	 * kunnr_ext.getFLOOR()!=null?kunnr_ext.getFLOOR():"") .replace("%FRONT%",
	 * kunnr_ext.getFRONT()!=null?kunnr_ext.getFRONT():"").replace("%HANGAR%",
	 * kunnr_ext.getHANGAR()!=null?kunnr_ext.getHANGAR():"") .replace("%LOBBY%",
	 * kunnr_ext.getLOBBY()!=null?kunnr_ext.getLOBBY():"").replace("%LOT%",
	 * kunnr_ext.getLOT()!=null?kunnr_ext.getLOT():"") .replace("%LOWER%",
	 * kunnr_ext.getLOWER()!=null?kunnr_ext.getLOWER():"").replace("%OFFICE%",
	 * kunnr_ext.getOFFICE()!=null?kunnr_ext.getOFFICE():"") .replace("%PENTHOUSE%",
	 * kunnr_ext.getPENTHOUSE()!=null?kunnr_ext.getPENTHOUSE():"").replace("%PIER%",
	 * kunnr_ext.getPIER()!=null?kunnr_ext.getPIER():"") .replace("%REAR%",
	 * kunnr_ext.getREAR()!=null?kunnr_ext.getREAR():"").replace("%ROOM%",
	 * kunnr_ext.getROOM()!=null?kunnr_ext.getROOM():"") .replace("%SUITE%",
	 * kunnr_ext.getSUITE()!=null?kunnr_ext.getSUITE():"").replace("%BILL_TEXT1%",
	 * kunnr_ext.getBILL_TEXT1()!=null?kunnr_ext.getBILL_TEXT1():"")
	 * .replace("%BILL_TEXT2%",
	 * kunnr_ext.getBILL_TEXT2()!=null?kunnr_ext.getBILL_TEXT2():"").replace(
	 * "%UPDATE_IND%", kunnr_ext.getUPDATE_IND()!=null?kunnr_ext.getUPDATE_IND():"")
	 * .replace("%CREATE_TS%",
	 * kunnr_ext.getCREATE_TS()!=null?kunnr_ext.getCREATE_TS().toString():"").
	 * replace("%UPDATE_TS%",
	 * kunnr_ext.getUPDATE_TS().toString()!=null?kunnr_ext.getUPDATE_TS().toString()
	 * :"") .replace("%CREATE_USER%",
	 * kunnr_ext.getCREATE_USER()!=null?kunnr_ext.getCREATE_USER():"")
	 * .replace("%UPDATE_USER%",
	 * kunnr_ext.getUPDATE_USER()!=null?kunnr_ext.getUPDATE_USER():"")
	 * .replace("%CMR_ADDR_REC_NO%",
	 * kunnr_ext.getCMR_ADDR_REC_NO()!=null?kunnr_ext.getCMR_ADDR_REC_NO():"")
	 * .replace("%CMR_ADDR_REC_TYPE%",
	 * kunnr_ext.getCMR_ADDR_REC_TYPE()!=null?kunnr_ext.getCMR_ADDR_REC_TYPE():"")
	 * .replace("%DEPARTMENT%",
	 * kunnr_ext.getDEPARTMENT()!=null?kunnr_ext.getDEPARTMENT():"")
	 * .replace("%BP_MBR_LVL_TYPE%",
	 * kunnr_ext.getBP_MBR_LVL_TYPE()!=null?kunnr_ext.getBP_MBR_LVL_TYPE():"")
	 * .replace("%GOE_EXP_DATE%",
	 * kunnr_ext.getGOE_EXP_DATE().toString()!=null?kunnr_ext.getGOE_EXP_DATE().
	 * toString():"") .replace("%ACTION_TXT%",
	 * kunnr_ext.getACTION_TXT()!=null?kunnr_ext.getACTION_TXT():"")
	 * .replace("%SC_ACCOUNT_ID%",
	 * kunnr_ext.getSC_ACCOUNT_ID()!=null?kunnr_ext.getSC_ACCOUNT_ID():"")
	 * .replace("%BUS_CMR_NAME%",
	 * kunnr_ext.getBUS_CMR_NAME()!=null?kunnr_ext.getBUS_CMR_NAME():"")
	 * .replace("%SADR_BUS_CMR_NAME%",
	 * kunnr_ext.getSADR_BUS_CMR_NAME()!=null?kunnr_ext.getSADR_BUS_CMR_NAME():"")
	 * .replace("%LANG_CD%",
	 * kunnr_ext.getLANG_CD()!=null?kunnr_ext.getLANG_CD():"").replace("%COMMENTS%",
	 * kunnr_ext.getCOMMENTS()!=null?kunnr_ext.getCOMMENTS():"")
	 * .replace("%SADR_LANG_CD%",
	 * kunnr_ext.getSADR_LANG_CD()!=null?kunnr_ext.getSADR_LANG_CD():"")
	 * .replace("%COV_ELG_IND%",
	 * kunnr_ext.getCOV_ELG_IND()!=null?kunnr_ext.getCOV_ELG_IND():"")
	 * .replace("%SALES_FORCE_ID%",
	 * kunnr_ext.getSALES_FORCE_ID()!=null?kunnr_ext.getSALES_FORCE_ID():"")
	 * .replace("%HW_INSTL_MSTR_FLG%",
	 * kunnr_ext.getHW_INSTL_MSTR_FLG()!=null?kunnr_ext.getHW_INSTL_MSTR_FLG():"")
	 * .replace("%EXT_WALLET_ID%",
	 * kunnr_ext.getEXT_WALLET_ID()!=null?kunnr_ext.getEXT_WALLET_ID():"").replace(
	 * "%VAT_IND%", kunnr_ext.getVAT_IND()!=null?kunnr_ext.getVAT_IND():""), con);
	 * LOGGER.info("Insert : KUNNR_EXT : " +
	 * MDGP2Query.KUNNR_EXT_INSERT.replace("%KUNNR%", kunnr_ext.getKUNNR())
	 * .replace("%MANDT%", kunnr_ext.getMANDT()).replace("%GOE_IND%",
	 * kunnr_ext.getGOE_IND()) .replace("%GOE_SRC_CD%",
	 * kunnr_ext.getGOE_SRC_CD()).replace("%GOE_RSN_CD%", kunnr_ext.getGOE_RSN_CD())
	 * .replace("%PRIVACY_IND%", kunnr_ext.getPRIVACY_IND()).replace("%IBM_AML_CD%",
	 * kunnr_ext.getIBM_AML_CD()) .replace("%CAP_IND%",
	 * kunnr_ext.getCAP_IND()).replace("%GEO_LOC_CD%", kunnr_ext.getGEO_LOC_CD())
	 * .replace("%BUILDING%", kunnr_ext.getBUILDING()).replace("%FLOOR%",
	 * kunnr_ext.getFLOOR()) .replace("%FRONT%",
	 * kunnr_ext.getFRONT()).replace("%HANGAR%", kunnr_ext.getHANGAR())
	 * .replace("%LOBBY%", kunnr_ext.getLOBBY()).replace("%LOT%",
	 * kunnr_ext.getLOT()) .replace("%LOWER%",
	 * kunnr_ext.getLOWER()).replace("%OFFICE%", kunnr_ext.getOFFICE())
	 * .replace("%PENTHOUSE%", kunnr_ext.getPENTHOUSE()).replace("%PIER%",
	 * kunnr_ext.getPIER()) .replace("%REAR%",
	 * kunnr_ext.getREAR()).replace("%ROOM%", kunnr_ext.getROOM())
	 * .replace("%SUITE%", kunnr_ext.getSUITE()).replace("%BILL_TEXT1%",
	 * kunnr_ext.getBILL_TEXT1()) .replace("%BILL_TEXT2%",
	 * kunnr_ext.getBILL_TEXT2()).replace("%UPDATE_IND%", kunnr_ext.getUPDATE_IND())
	 * .replace("%CREATE_TS%",
	 * kunnr_ext.getCREATE_TS().toString()).replace("%UPDATE_TS%",
	 * kunnr_ext.getUPDATE_TS().toString()) .replace("%CREATE_USER%",
	 * kunnr_ext.getCREATE_USER()) .replace("%UPDATE_USER%",
	 * kunnr_ext.getUPDATE_USER()) .replace("%CMR_ADDR_REC_NO%",
	 * kunnr_ext.getCMR_ADDR_REC_NO()) .replace("%CMR_ADDR_REC_TYPE%",
	 * kunnr_ext.getCMR_ADDR_REC_TYPE()) .replace("%DEPARTMENT%",
	 * kunnr_ext.getDEPARTMENT()) .replace("%BP_MBR_LVL_TYPE%",
	 * kunnr_ext.getBP_MBR_LVL_TYPE()) .replace("%GOE_EXP_DATE%",
	 * kunnr_ext.getGOE_EXP_DATE().toString()) .replace("%ACTION_TXT%",
	 * kunnr_ext.getACTION_TXT()) .replace("%SC_ACCOUNT_ID%",
	 * kunnr_ext.getSC_ACCOUNT_ID()) .replace("%BUS_CMR_NAME%",
	 * kunnr_ext.getBUS_CMR_NAME()) .replace("%SADR_BUS_CMR_NAME%",
	 * kunnr_ext.getSADR_BUS_CMR_NAME()) .replace("%LANG_CD%",
	 * kunnr_ext.getLANG_CD()).replace("%COMMENTS%", kunnr_ext.getCOMMENTS())
	 * .replace("%SADR_LANG_CD%", kunnr_ext.getSADR_LANG_CD())
	 * .replace("%COV_ELG_IND%", kunnr_ext.getCOV_ELG_IND())
	 * .replace("%SALES_FORCE_ID%", kunnr_ext.getSALES_FORCE_ID())
	 * .replace("%HW_INSTL_MSTR_FLG%", kunnr_ext.getHW_INSTL_MSTR_FLG())
	 * .replace("%EXT_WALLET_ID%",
	 * kunnr_ext.getEXT_WALLET_ID()).replace("%VAT_IND%", kunnr_ext.getVAT_IND()));
	 * }
	 */

	@Override
	public void insertSADR(SADR sadr, Connection con) {

		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		try {
			if (con == null) {
				con = db.getConnection(rdc_url, rdc_username, rdc_password);
			}
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.SADR_INSERT.replace("%MANDT%", sadr.getMANDT() != null ? sadr.getMANDT() : "")
					.replace("%ADRNR%", sadr.getADRNR() != null ? sadr.getADRNR() : "")
					.replace("%NATIO%", sadr.getNATIO() != null ? sadr.getNATIO() : "")
					.replace("%ANRED%", sadr.getANRED() != null ? sadr.getANRED() : "")
					.replace("%NAME1%", sadr.getNAME1() != null ? sadr.getNAME1() : "")
					.replace("%NAME2%", sadr.getNAME2() != null ? sadr.getNAME2() : "")
					.replace("%NAME3%", sadr.getNAME3() != null ? sadr.getNAME3() : "")
					.replace("%NAME4%", sadr.getNAME4() != null ? sadr.getNAME4() : "")
					.replace("%PSTLZ%", sadr.getPSTLZ() != null ? sadr.getPSTLZ() : "")
					.replace("%ORT01%", sadr.getORT01() != null ? sadr.getORT01() : "")
					.replace("%ORT02%", sadr.getORT02() != null ? sadr.getORT02() : "")
					.replace("%PSTL2%", sadr.getPSTL2() != null ? sadr.getPSTL2() : "")
					.replace("%PFACH%", sadr.getPFACH() != null ? sadr.getPFACH() : "")
					.replace("%STRAS%", sadr.getSTRAS() != null ? sadr.getSTRAS() : "")
					.replace("%STRS2%", sadr.getSTRS2() != null ? sadr.getSTRS2() : "")
					.replace("%HAUSN%", sadr.getHAUSN() != null ? sadr.getHAUSN() : "")
					.replace("%STOCK%", sadr.getSTOCK() != null ? sadr.getSTOCK() : "")
					.replace("%LAND1%", sadr.getLAND1() != null ? sadr.getLAND1() : "")
					.replace("%SORTL%", sadr.getSORTL() != null ? sadr.getSORTL() : "")
					.replace("%SORT2%", sadr.getSORT2() != null ? sadr.getSORT2() : "")
					.replace("%SPRAS%", sadr.getSPRAS() != null ? sadr.getSPRAS() : "")
					.replace("%LZONE%", sadr.getLZONE() != null ? sadr.getLZONE() : "")
					.replace("%REGIO%", sadr.getREGIO() != null ? sadr.getREGIO() : "")
					.replace("%PSTBZ%", sadr.getPSTBZ() != null ? sadr.getPSTBZ() : "")
					.replace("%TELF1%", sadr.getTELF1() != null ? sadr.getTELF1() : "")
					.replace("%FLAG%", sadr.getFLAG() != null ? sadr.getFLAG() : "")
					.replace("%TELFX%", sadr.getTELFX() != null ? sadr.getTELFX() : "")
					.replace("%FLAG2%", sadr.getFLAG2() != null ? sadr.getFLAG2() : "")
					.replace("%TELTX%", sadr.getTELTX() != null ? sadr.getTELTX() : "")
					.replace("%FLAG3%", sadr.getFLAG3() != null ? sadr.getFLAG3() : "")
					.replace("%TELX1%", sadr.getTELX1() != null ? sadr.getTELX1() : "")
					.replace("%FLAG4%", sadr.getFLAG4() != null ? sadr.getFLAG4() : "")
					.replace("%MAIAD%", sadr.getMAIAD() != null ? sadr.getMAIAD() : "")
					.replace("%MAILN%", sadr.getMAILN() != null ? sadr.getMAILN() : "")
					.replace("%STDKO%", sadr.getSTDKO() != null ? sadr.getSTDKO() : "")
					.replace("%STDCOM%", sadr.getSTDCOM() != null ? sadr.getSTDCOM() : "")
					.replace("%DBNAME%", sadr.getDBNAME() != null ? sadr.getDBNAME() : "")
					.replace("%KLASSE%", sadr.getKLASSE() != null ? sadr.getKLASSE() : "")
					.replace("%ANREK%", sadr.getANREK() != null ? sadr.getANREK() : "")
					.replace("%CRNAM%", sadr.getCRNAM() != null ? sadr.getCRNAM() : "")
					.replace("%CRDAT%", sadr.getCRDAT() != null ? sadr.getCRDAT() : "")
					.replace("%CRTIM%", sadr.getCRTIM() != null ? sadr.getCRTIM() : "")
					.replace("%CHNAM%", sadr.getCHNAM() != null ? sadr.getCHNAM() : "")
					.replace("%CHDAT%", sadr.getCHDAT() != null ? sadr.getCHDAT() : "")
					.replace("%CHTIM%", sadr.getCHTIM() != null ? sadr.getCHTIM() : "")
					.replace("%DUEFL%", sadr.getDUEFL() != null ? sadr.getDUEFL() : "")
					.replace("%TXJCD%", sadr.getTXJCD() != null ? sadr.getTXJCD() : "")
					.replace("%PFORT%", sadr.getPFORT() != null ? sadr.getPFORT() : "")
					.replace("%TZONE%", sadr.getTZONE() != null ? sadr.getTZONE() : "")
					.replace("%BUILDING%", sadr.getBUILDING() != null ? sadr.getBUILDING() : "")
					.replace("%ROOMNUMBER%", sadr.getROOMNUMBER() != null ? sadr.getROOMNUMBER() : "")
					.replace("%SHAD_UPDATE_TS%", sadr.getSHAD_UPDATE_TS().toString())
					.replace("%SHAD_UPDATE_IND%", sadr.getSHAD_UPDATE_IND() != null ? sadr.getSHAD_UPDATE_IND() : "")
					.replace("%SAP_TS%", sadr.getSHAD_UPDATE_TS().toString()), con);

			LOGGER.info("Insert SADR :"
					+ MDGP2Query.SADR_INSERT.replace("%MANDT%", sadr.getMANDT() != null ? sadr.getMANDT() : "")
							.replace("%ADRNR%", sadr.getADRNR() != null ? sadr.getADRNR() : "")
							.replace("%NATIO%", sadr.getNATIO() != null ? sadr.getNATIO() : "")
							.replace("%ANRED%", sadr.getANRED() != null ? sadr.getANRED() : "")
							.replace("%NAME1%", sadr.getNAME1() != null ? sadr.getNAME1() : "")
							.replace("%NAME2%", sadr.getNAME2() != null ? sadr.getNAME2() : "")
							.replace("%NAME3%", sadr.getNAME3() != null ? sadr.getNAME3() : "")
							.replace("%NAME4%", sadr.getNAME4() != null ? sadr.getNAME4() : "")
							.replace("%PSTLZ%", sadr.getPSTLZ() != null ? sadr.getPSTLZ() : "")
							.replace("%ORT01%", sadr.getORT01() != null ? sadr.getORT01() : "")
							.replace("%ORT02%", sadr.getORT02() != null ? sadr.getORT02() : "")
							.replace("%PSTL2%", sadr.getPSTL2() != null ? sadr.getPSTL2() : "")
							.replace("%PFACH%", sadr.getPFACH() != null ? sadr.getPFACH() : "")
							.replace("%STRAS%", sadr.getSTRAS() != null ? sadr.getSTRAS() : "")
							.replace("%STRS2%", sadr.getSTRS2() != null ? sadr.getSTRS2() : "")
							.replace("%HAUSN%", sadr.getHAUSN() != null ? sadr.getHAUSN() : "")
							.replace("%STOCK%", sadr.getSTOCK() != null ? sadr.getSTOCK() : "")
							.replace("%LAND1%", sadr.getLAND1() != null ? sadr.getLAND1() : "")
							.replace("%SORTL%", sadr.getSORTL() != null ? sadr.getSORTL() : "")
							.replace("%SORT2%", sadr.getSORT2() != null ? sadr.getSORT2() : "")
							.replace("%SPRAS%", sadr.getSPRAS() != null ? sadr.getSPRAS() : "")
							.replace("%LZONE%", sadr.getLZONE() != null ? sadr.getLZONE() : "")
							.replace("%REGIO%", sadr.getREGIO() != null ? sadr.getREGIO() : "")
							.replace("%PSTBZ%", sadr.getPSTBZ() != null ? sadr.getPSTBZ() : "")
							.replace("%TELF1%", sadr.getTELF1() != null ? sadr.getTELF1() : "")
							.replace("%FLAG%", sadr.getFLAG() != null ? sadr.getFLAG() : "")
							.replace("%TELFX%", sadr.getTELFX() != null ? sadr.getTELFX() : "")
							.replace("%FLAG2%", sadr.getFLAG2() != null ? sadr.getFLAG2() : "")
							.replace("%TELTX%", sadr.getTELTX() != null ? sadr.getTELTX() : "")
							.replace("%FLAG3%", sadr.getFLAG3() != null ? sadr.getFLAG3() : "")
							.replace("%TELX1%", sadr.getTELX1() != null ? sadr.getTELX1() : "")
							.replace("%FLAG4%", sadr.getFLAG4() != null ? sadr.getFLAG4() : "")
							.replace("%MAIAD%", sadr.getMAIAD() != null ? sadr.getMAIAD() : "")
							.replace("%MAILN%", sadr.getMAILN() != null ? sadr.getMAILN() : "")
							.replace("%STDKO%", sadr.getSTDKO() != null ? sadr.getSTDKO() : "")
							.replace("%STDCOM%", sadr.getSTDCOM() != null ? sadr.getSTDCOM() : "")
							.replace("%DBNAME%", sadr.getDBNAME() != null ? sadr.getDBNAME() : "")
							.replace("%KLASSE%", sadr.getKLASSE() != null ? sadr.getKLASSE() : "")
							.replace("%ANREK%", sadr.getANREK() != null ? sadr.getANREK() : "")
							.replace("%CRNAM%", sadr.getCRNAM() != null ? sadr.getCRNAM() : "")
							.replace("%CRDAT%", sadr.getCRDAT() != null ? sadr.getCRDAT() : "")
							.replace("%CRTIM%", sadr.getCRTIM() != null ? sadr.getCRTIM() : "")
							.replace("%CHNAM%", sadr.getCHNAM() != null ? sadr.getCHNAM() : "")
							.replace("%CHDAT%", sadr.getCHDAT() != null ? sadr.getCHDAT() : "")
							.replace("%CHTIM%", sadr.getCHTIM() != null ? sadr.getCHTIM() : "")
							.replace("%DUEFL%", sadr.getDUEFL() != null ? sadr.getDUEFL() : "")
							.replace("%TXJCD%", sadr.getTXJCD() != null ? sadr.getTXJCD() : "")
							.replace("%PFORT%", sadr.getPFORT() != null ? sadr.getPFORT() : "")
							.replace("%TZONE%", sadr.getTZONE() != null ? sadr.getTZONE() : "")
							.replace("%BUILDING%", sadr.getBUILDING() != null ? sadr.getBUILDING() : "")
							.replace("%ROOMNUMBER%", sadr.getROOMNUMBER() != null ? sadr.getROOMNUMBER() : "")
							.replace("%SHAD_UPDATE_TS%", sadr.getSHAD_UPDATE_TS().toString())
							.replace("%SHAD_UPDATE_IND%",
									sadr.getSHAD_UPDATE_IND() != null ? sadr.getSHAD_UPDATE_IND() : "")
							.replace("%SAP_TS%", sadr.getSHAD_UPDATE_TS().toString()));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}

	}

	@Override
	public void insertSTXL(STXL stxl, Connection con) {

		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		try {
			if (con == null) {
				con = db.getConnection(rdc_url, rdc_username, rdc_password);
			}
			con.setAutoCommit(false);
			;
			db.executeQuery(MDGP2Query.STXL_INSERT.replace("%MANDT%", stxl.getMANDT() != null ? stxl.getMANDT() : "")
					.replace("%RELID%", stxl.getRELID() != null ? stxl.getRELID() : "")
					.replace("%TDOBJECT%", stxl.getTDOBJECT() != null ? stxl.getTDOBJECT() : "")
					.replace("%TDNAME%", stxl.getTDNAME() != null ? stxl.getTDNAME() : "")
					.replace("%TDID%", stxl.getTDID() != null ? stxl.getTDID() : "")
					.replace("%TDSPRAS%", stxl.getTDSPRAS() != null ? stxl.getTDSPRAS() : "")
					.replace("%SRTF2%", Integer.toString(stxl.getSRTF2()))
					.replace("%CLUSTR%", Integer.toString(stxl.getCLUSTR()))
					.replace("%CLUSTD%", stxl.getCLUSTD() != null ? stxl.getCLUSTD() : ""), con);
			LOGGER.info("Insert : STXL : "
					+ MDGP2Query.STXL_INSERT.replace("%MANDT%", stxl.getMANDT() != null ? stxl.getMANDT() : "")
							.replace("%RELID%", stxl.getRELID() != null ? stxl.getRELID() : "")
							.replace("%TDOBJECT%", stxl.getTDOBJECT() != null ? stxl.getTDOBJECT() : "")
							.replace("%TDNAME%", stxl.getTDNAME() != null ? stxl.getTDNAME() : "")
							.replace("%TDID%", stxl.getTDID() != null ? stxl.getTDID() : "")
							.replace("%TDSPRAS%", stxl.getTDSPRAS() != null ? stxl.getTDSPRAS() : "")
							.replace("%SRTF2%", Integer.toString(stxl.getSRTF2()))
							.replace("%CLUSTR%", Integer.toString(stxl.getCLUSTR()))
							.replace("%CLUSTD%", stxl.getCLUSTD() != null ? stxl.getCLUSTD() : ""));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void UpdateExternal_CUST_IDS(External_CUST_IDS external_CUST_IDS, Connection con) {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		try {
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.Update_EXTERNAL_CUST_IDS
					.replace("%MANDT%", external_CUST_IDS.getMANDT() != null ? external_CUST_IDS.getMANDT() : "")
					.replace("%KUNNR%", external_CUST_IDS.getKUNNR() != null ? external_CUST_IDS.getKUNNR() : "")
					.replace("%NATIONAL_ID%",
							external_CUST_IDS.getNATIONAL_ID() != null ? external_CUST_IDS.getNATIONAL_ID() : ""),
					con);
			LOGGER.info("Update : External_Cust_IDS : " + MDGP2Query.Update_EXTERNAL_CUST_IDS
					.replace("%MANDT%", external_CUST_IDS.getMANDT() != null ? external_CUST_IDS.getMANDT() : "")
					.replace("%KUNNR%", external_CUST_IDS.getKUNNR() != null ? external_CUST_IDS.getKUNNR() : "")
					.replace("%NATIONAL_ID%",
							external_CUST_IDS.getNATIONAL_ID() != null ? external_CUST_IDS.getNATIONAL_ID() : ""));
		}

		catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void insertKDUNS_NEW(KDUNS_NEW kduns_new, Connection con) {

		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		try {
			if (con == null) {
				con = db.getConnection(rdc_url, rdc_username, rdc_password);
			}
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.KDUNS_NEW_INSERT
					.replace("%MANDT%", kduns_new.getMANDT() != null ? kduns_new.getMANDT() : "")
					.replace("%KUNNR%", kduns_new.getKUNNR() != null ? kduns_new.getKUNNR() : "")
					.replace("%ENTITY_ID%", kduns_new.getENTITY_ID() != null ? kduns_new.getENTITY_ID() : "")
					.replace("%ENTITY_TYPE%", kduns_new.getENTITY_TYPE() != null ? kduns_new.getENTITY_TYPE() : "")
					.replace("%DNB_PRIMARY_BUSINESS_NAME%",
							kduns_new.getDNB_PRIMARY_BUSINESS_NAME() != null ? kduns_new.getDNB_PRIMARY_BUSINESS_NAME()
									: "")
					.replace("%CNTRY_CD%", kduns_new.getCNTRY_CD() != null ? kduns_new.getCNTRY_CD() : "")
					.replace("%DUNS_NO%", kduns_new.getDUNS_NO() != null ? kduns_new.getDUNS_NO() : "")
					.replace("%DUNS_CONF_CODE%",
							kduns_new.getDUNS_CONF_CODE() != null ? kduns_new.getDUNS_CONF_CODE() : "")
					.replace("%DUNS_NAME_SCORE%",
							kduns_new.getDUNS_NAME_SCORE() != null ? kduns_new.getDUNS_NAME_SCORE() : "")
					.replace("%DUNS_MATCH_GRADE%",
							kduns_new.getDUNS_MATCH_GRADE() != null ? kduns_new.getDUNS_MATCH_GRADE() : "")
					.replace("%NAME_ONLY_FLG%",
							kduns_new.getNAME_ONLY_FLG() != null ? kduns_new.getNAME_ONLY_FLG() : "")
					.replace("%HIER_FLAG%", kduns_new.getHIER_FLAG() != null ? kduns_new.getHIER_FLAG() : "")
					.replace("%DUNS_MATCH_PROFILE%",
							kduns_new.getDUNS_MATCH_PROFILE() != null ? kduns_new.getDUNS_MATCH_PROFILE() : "")
					.replace("%HQ_DUNS_FLG%", kduns_new.getHQ_DUNS_FLG() != null ? kduns_new.getHQ_DUNS_FLG() : "")
					.replace("%LINE_OF_BUSINESS%",
							kduns_new.getLINE_OF_BUSINESS() != null ? kduns_new.getLINE_OF_BUSINESS() : "")
					.replace("%EMPL_QNTY_BASIS%",
							kduns_new.getEMPL_QNTY_BASIS() != null ? kduns_new.getEMPL_QNTY_BASIS() : "")
					.replace("%EMPL_QNTY_REL_CD_ALL%",
							kduns_new.getEMPL_QNTY_REL_CD_ALL() != null ? kduns_new.getEMPL_QNTY_REL_CD_ALL() : "")
					.replace("%EMPL_QNTY_ALL%",
							kduns_new.getEMPL_QNTY_ALL() != null ? kduns_new.getEMPL_QNTY_ALL() : "")
					.replace("%EMPL_QNTY_REL_CD_LOC%",
							kduns_new.getEMPL_QNTY_REL_CD_LOC() != null ? kduns_new.getEMPL_QNTY_REL_CD_LOC() : "")
					.replace("%EMPL_QNTY_LOC%",
							kduns_new.getEMPL_QNTY_LOC() != null ? kduns_new.getEMPL_QNTY_LOC() : "")
					.replace("%DNB_HOOVERS_INDUSTRY_CD%",
							kduns_new.getDNB_HOOVERS_INDUSTRY_CD() != null ? kduns_new.getDNB_HOOVERS_INDUSTRY_CD()
									: "")
					.replace("%DNB_INDUSTRY_CD%",
							kduns_new.getDNB_HOOVERS_INDUSTRY_CD() != null ? kduns_new.getMANDT() : "")
					.replace("%LOCAL_ACT_INDUSTRY_CD%",
							kduns_new.getLOCAL_ACT_INDUSTRY_CD() != null ? kduns_new.getLOCAL_ACT_INDUSTRY_CD() : "")
					.replace("%NAICS_CD%", kduns_new.getNAICS_CD() != null ? kduns_new.getNAICS_CD() : "")
					.replace("%PRIMARY_SIC_CD%",
							kduns_new.getPRIMARY_SIC_CD() != null ? kduns_new.getPRIMARY_SIC_CD() : "")
					.replace("%UK_SIC_CD%", kduns_new.getUK_SIC_CD() != null ? kduns_new.getUK_SIC_CD() : "")
					.replace("%SECONDARY_SIC_CD%",
							kduns_new.getSECONDARY_SIC_CD() != null ? kduns_new.getSECONDARY_SIC_CD() : "")
					.replace("%SECONDARY_SIC_CD_2%",
							kduns_new.getSECONDARY_SIC_CD_2() != null ? kduns_new.getSECONDARY_SIC_CD_2() : "")
					.replace("%SECONDARY_SIC_CD_3%",
							kduns_new.getSECONDARY_SIC_CD_3() != null ? kduns_new.getSECONDARY_SIC_CD_3() : "")
					.replace("%SECONDARY_SIC_CD_4%",
							kduns_new.getSECONDARY_SIC_CD_4() != null ? kduns_new.getSECONDARY_SIC_CD_4() : "")
					.replace("%SECONDARY_SIC_CD_5%",
							kduns_new.getSECONDARY_SIC_CD_5() != null ? kduns_new.getSECONDARY_SIC_CD_5() : "")
					.replace("%FAMILY_TREE_HIER_LEVEL_CD%",
							kduns_new.getFAMILY_TREE_HIER_LEVEL_CD() != null ? kduns_new.getFAMILY_TREE_HIER_LEVEL_CD()
									: "")
					.replace("%NO_OF_FAM_MMBRS_INCL_SUBS%",
							kduns_new.getNO_OF_FAM_MMBRS_INCL_SUBS() != null ? kduns_new.getNO_OF_FAM_MMBRS_INCL_SUBS()
									: "")
					.replace("%REGION_NAME_WORLD%",
							kduns_new.getREGION_NAME_WORLD() != null ? kduns_new.getREGION_NAME_WORLD() : "")
					.replace("%CNTRY_CODE_A2_CD%",
							kduns_new.getCNTRY_CODE_A2_CD() != null ? kduns_new.getCNTRY_CODE_A2_CD() : "")
					.replace("%CNTRY_NAME%", kduns_new.getCNTRY_NAME() != null ? kduns_new.getCNTRY_NAME() : "")
					.replace("%COUNTY_NAME%", kduns_new.getCOUNTY_NAME() != null ? kduns_new.getCOUNTY_NAME() : "")
					.replace("%STREET_ADDR_POSTAL_CD%",
							kduns_new.getSTREET_ADDR_POSTAL_CD() != null ? kduns_new.getSTREET_ADDR_POSTAL_CD() : "")
					.replace("%CITY_NAME%", kduns_new.getCITY_NAME() != null ? kduns_new.getCITY_NAME() : "")
					.replace("%STREET_ADDR_LINE_1%",
							kduns_new.getSTREET_ADDR_LINE_1() != null ? kduns_new.getSTREET_ADDR_LINE_1() : "")
					.replace("%STREET_ADDR_LINE_2%",
							kduns_new.getSTREET_ADDR_LINE_2() != null ? kduns_new.getSTREET_ADDR_LINE_2() : "")
					.replace("%FAMILY_TREE_MEMBER_ROLE%",
							kduns_new.getFAMILY_TREE_MEMBER_ROLE() != null ? kduns_new.getFAMILY_TREE_MEMBER_ROLE()
									: "")
					.replace("%STANDALONE_ORG_IND%",
							kduns_new.getSTANDALONE_ORG_IND() != null ? kduns_new.getSTANDALONE_ORG_IND() : "")
					.replace("%DNB_TRADESTYLE_NAME%",
							kduns_new.getDNB_TRADESTYLE_NAME() != null ? kduns_new.getDNB_TRADESTYLE_NAME() : "")
					.replace("%TRADESTYLE_NAME_2%",
							kduns_new.getTRADESTYLE_NAME_2() != null ? kduns_new.getTRADESTYLE_NAME_2() : "")
					.replace("%TRADESTYLE_NAME_3%",
							kduns_new.getTRADESTYLE_NAME_3() != null ? kduns_new.getTRADESTYLE_NAME_3() : "")
					.replace("%TRADESTYLE_NAME_4%",
							kduns_new.getTRADESTYLE_NAME_4() != null ? kduns_new.getTRADESTYLE_NAME_4() : "")
					.replace("%TRADESTYLE_NAME_5%",
							kduns_new.getTRADESTYLE_NAME_5() != null ? kduns_new.getTRADESTYLE_NAME_5() : "")
					.replace("%ORG_LEG_TYPE_DESC%",
							kduns_new.getORG_LEG_TYPE_DESC() != null ? kduns_new.getORG_LEG_TYPE_DESC() : "")
					.replace("%PRIMARY_TAX_ID_NUMBER%",
							kduns_new.getPRIMARY_TAX_ID_NUMBER() != null ? kduns_new.getPRIMARY_TAX_ID_NUMBER() : "")
					.replace("%FULL_REPORT_DATE%",
							kduns_new.getFULL_REPORT_DATE() != null ? kduns_new.getFULL_REPORT_DATE() : "")
					.replace("%DNB_LAST_UPDATE_DATE%",
							kduns_new.getDNB_LAST_UPDATE_DATE() != null ? kduns_new.getDNB_LAST_UPDATE_DATE() : "")
					.replace("%ANNUAL_SALES%", kduns_new.getANNUAL_SALES() != null ? kduns_new.getANNUAL_SALES() : "")
					.replace("%WOMAN_OWNED_IND%",
							kduns_new.getWOMAN_OWNED_IND() != null ? kduns_new.getWOMAN_OWNED_IND() : "")
					.replace("%MINORITY_OWNED_IND%",
							kduns_new.getMINORITY_OWNED_IND() != null ? kduns_new.getMINORITY_OWNED_IND() : "")
					.replace("%FRANS_OP_TYPE%",
							kduns_new.getFRANS_OP_TYPE() != null ? kduns_new.getFRANS_OP_TYPE() : "")
					.replace("%PRI_ADDR_LAT%", kduns_new.getPRI_ADDR_LAT() != null ? kduns_new.getPRI_ADDR_LAT() : "")
					.replace("%PRI_ADDR_LONG%",
							kduns_new.getPRI_ADDR_LONG() != null ? kduns_new.getPRI_ADDR_LONG() : "")
					.replace("%SMALL_BUSINESS_IND%",
							kduns_new.getSMALL_BUSINESS_IND() != null ? kduns_new.getSMALL_BUSINESS_IND() : "")
					.replace("%STOCK_EXCH_CNTRY%",
							kduns_new.getSTOCK_EXCH_CNTRY() != null ? kduns_new.getSTOCK_EXCH_CNTRY() : "")
					.replace("%STOCK_EXCH_NAME%",
							kduns_new.getSTOCK_EXCH_NAME() != null ? kduns_new.getSTOCK_EXCH_NAME() : "")
					.replace("%WEB_SITE_ADDR%",
							kduns_new.getWEB_SITE_ADDR() != null ? kduns_new.getWEB_SITE_ADDR() : "")
					.replace("%MARKETABILITY_IND%",
							kduns_new.getMARKETABILITY_IND() != null ? kduns_new.getMARKETABILITY_IND() : "")
					.replace("%OPER_STATUS%", kduns_new.getOPER_STATUS() != null ? kduns_new.getOPER_STATUS() : "")
					.replace("%OWNSHP_TYPE_DESC%",
							kduns_new.getOWNSHP_TYPE_DESC() != null ? kduns_new.getOWNSHP_TYPE_DESC() : "")
					.replace("%REGRESSION_TS%",
							kduns_new.getREGRESSION_TS() != null ? kduns_new.getREGRESSION_TS().toString() : "")
					.replace("%MONITOR_CHG_IND%",
							kduns_new.getMONITOR_CHG_IND() != null ? kduns_new.getMONITOR_CHG_IND() : "")
					.replace("%API_ERROR_FLG%",
							kduns_new.getAPI_ERROR_FLG() != null ? kduns_new.getAPI_ERROR_FLG() : "")
					.replace("%API_ERROR_TS%",
							kduns_new.getAPI_ERROR_TS().toString() != null ? kduns_new.getAPI_ERROR_TS().toString()
									: "")
					.replace("%CAP_FLAG%", kduns_new.getCAP_FLAG() != null ? kduns_new.getCAP_FLAG() : "")
					.replace("%GEO_FLAG%", kduns_new.getGEO_FLAG() != null ? kduns_new.getGEO_FLAG() : "")
					.replace("%CLIENT_RULE_DESC%",
							kduns_new.getCLIENT_RULE_DESC() != null ? kduns_new.getCLIENT_RULE_DESC() : "")
					.replace("%SEGMENTATION_TYPE%",
							kduns_new.getSEGMENTATION_TYPE() != null ? kduns_new.getSEGMENTATION_TYPE() : ""),
					con);
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void updateKDUNS_NEW(KDUNS_NEW kduns_new, Connection con) {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		/*
		 * if (con == null) { con = db.getConnection(rdc_url, rdc_username,
		 * rdc_password); }
		 */
		try {
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.KDUNS_NEW_UPDATE
					.replace("MANDT%", kduns_new.getMANDT() != null ? kduns_new.getMANDT() : "")
					.replace("KUNNR%", kduns_new.getKUNNR())
					.replace("DUNS_NO%", kduns_new.getDUNS_NO() != null ? kduns_new.getDUNS_NO() : ""), con);

			LOGGER.info(" Insert : KDUNS_NEW " + MDGP2Query.KDUNS_NEW_UPDATE
					.replace("MANDT%", kduns_new.getMANDT() != null ? kduns_new.getMANDT() : "")
					.replace("KUNNR%", kduns_new.getKUNNR())
					.replace("DUNS_NO%", kduns_new.getDUNS_NO() != null ? kduns_new.getDUNS_NO() : ""));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void updateKNA1(KNA1 kna1, Connection con) {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		/*
		 * if (con == null) { con = db.getConnection(rdc_url, rdc_username,
		 * rdc_password); }
		 */
		try {
			con.setAutoCommit(false);
			db.executeQuery(
					MDGP2Query.KNA1_UPDATE.replace("%AUFSD%", kna1.getAufsd() != null ? kna1.getAufsd() : "")
							.replace("%BEGRU%", kna1.getBegru() != null ? kna1.getBegru() : "")
							.replace("%ERDAT%", kna1.getErdat() != null ? kna1.getErdat() : "")
							.replace("%ERNAM%", kna1.getErnam() != null ? kna1.getErnam() : "")
							.replace("%FAKSD%", kna1.getFaksd() != null ? kna1.getFaksd() : "")
							.replace("%KUKLA%", kna1.getKukla() != null ? kna1.getKukla() : "")
							.replace("%LAND1%", kna1.getLand1() != null ? kna1.getLand1() : "")
							.replace("%LIFSD%", kna1.getLifsd() != null ? kna1.getLifsd() : "")
							.replace("%LOEVM%", kna1.getLoevm() != null ? kna1.getLoevm() : "")
							.replace("%NAME1%", kna1.getName1() != null ? kna1.getName1() : "")
							.replace("%NAME2%", kna1.getName2() != null ? kna1.getName2() : "")
							.replace("%NAME3%", kna1.getName3() != null ? kna1.getName3() : "")
							.replace("%ORT01%", kna1.getOrt01() != null ? kna1.getOrt01() : "")
							.replace("%ORT02%", kna1.getOrt02() != null ? kna1.getOrt02() : "")
							.replace("%PFACH%", kna1.getPfach() != null ? kna1.getPfach() : "")
							.replace("%PSTL2%", kna1.getPstl2() != null ? kna1.getPstl2() : "")
							.replace("%PSTLZ%", kna1.getPstlz() != null ? kna1.getPstlz() : "")
							.replace("%REGIO%", kna1.getRegio() != null ? kna1.getRegio() : "")
							.replace("%COUNC%", kna1.getCounc() != null ? kna1.getCounc() : "")
							.replace("%SPRAS%", kna1.getSpras() != null ? kna1.getSpras() : "")
							.replace("%STCD1%", kna1.getStcd1() != null ? kna1.getStcd1() : "")
							.replace("%STCD2%", kna1.getStcd2() != null ? kna1.getStcd2() : "")
							.replace("%STRAS%", kna1.getStras() != null ? kna1.getStras() : "")
							.replace("%TELF1%", kna1.getTelf1() != null ? kna1.getTelf1() : "")
							.replace("%TXJCD%", kna1.getTxjcd() != null ? kna1.getTxjcd() : "")
							.replace("%TELX1%", kna1.getTelx1() != null ? kna1.getTelx1() : "")
							.replace("%STCEG%", kna1.getStceg() != null ? kna1.getStceg() : "")
							.replace("%BRAN1%", kna1.getBran1() != null ? kna1.getBran1() : "")
							.replace("%BRAN5%", kna1.getBran5() != null ? kna1.getBran5() : "")
							.replace("%KATR6%", kna1.getKatr6() != null ? kna1.getKatr6() : "")
							.replace("%KATR10%", kna1.getKatr10() != null ? kna1.getKatr10() : "")
							.replace("%PFORT%", kna1.getPfort() != null ? kna1.getPfort() : "")
							.replace("%ZZKV_SIC%", kna1.getZzkv_sic() != null ? kna1.getZzkv_sic() : "")
							.replace("%ZZKV_DEPT%", kna1.getZzkv_dept() != null ? kna1.getZzkv_dept() : "")
							.replace("%ZZKV_INAC%", kna1.getZzkv_inac() != null ? kna1.getZzkv_inac() : "")
							.replace("%ZZKV_INACT%", kna1.getZzkv_inact() != null ? kna1.getZzkv_inact() : "")
							.replace("%KONZS%", kna1.getKonzs() != null ? kna1.getKonzs() : "")
							.replace("%LZONE%", kna1.getLzone() != null ? kna1.getLzone() : "")
							.replace("%ZZKV_ESTAB%", kna1.getZzkv_estab() != null ? kna1.getZzkv_estab() : "")
							.replace("%ZZKV_NODE1%", kna1.getZzkv_node1() != null ? kna1.getZzkv_node1() : "")
							.replace("%ZZKV_NODE2%", kna1.getZzkv_node2() != null ? kna1.getZzkv_node2() : "")
							.replace("%SHAD_UPDATE_TS%",
									kna1.getShad_update_ts() != null ? kna1.getShad_update_ts().toString() : "")
							.replace("%MANDT%", kna1.getId().getMandt() != null ? kna1.getId().getMandt() : "")
							.replace("%KUNNR%", kna1.getId().getKnb1kunnr() != null ? kna1.getId().getKnb1kunnr() : ""),
					con);
			LOGGER.info("Update : KNA1 : "
					+ MDGP2Query.KNA1_UPDATE.replace("%AUFSD%", kna1.getAufsd() != null ? kna1.getAufsd() : "")
							.replace("%BEGRU%", kna1.getBegru() != null ? kna1.getBegru() : "")
							.replace("%ERDAT%", kna1.getErdat() != null ? kna1.getErdat() : "")
							.replace("%ERNAM%", kna1.getErnam() != null ? kna1.getErnam() : "")
							.replace("%FAKSD%", kna1.getFaksd() != null ? kna1.getFaksd() : "")
							.replace("%KUKLA%", kna1.getKukla() != null ? kna1.getKukla() : "")
							.replace("%LAND1%", kna1.getLand1() != null ? kna1.getLand1() : "")
							.replace("%LIFSD%", kna1.getLifsd() != null ? kna1.getLifsd() : "")
							.replace("%LOEVM%", kna1.getLoevm() != null ? kna1.getLoevm() : "")
							.replace("%NAME1%", kna1.getName1() != null ? kna1.getName1() : "")
							.replace("%NAME2%", kna1.getName2() != null ? kna1.getName2() : "")
							.replace("%NAME3%", kna1.getName3() != null ? kna1.getName3() : "")
							.replace("%ORT01%", kna1.getOrt01() != null ? kna1.getOrt01() : "")
							.replace("%ORT02%", kna1.getOrt02() != null ? kna1.getOrt02() : "")
							.replace("%PFACH%", kna1.getPfach() != null ? kna1.getPfach() : "")
							.replace("%PSTL2%", kna1.getPstl2() != null ? kna1.getPstl2() : "")
							.replace("%PSTLZ%", kna1.getPstlz() != null ? kna1.getPstlz() : "")
							.replace("%REGIO%", kna1.getRegio() != null ? kna1.getRegio() : "")
							.replace("%COUNC%", kna1.getCounc() != null ? kna1.getCounc() : "")
							.replace("%SPRAS%", kna1.getSpras() != null ? kna1.getSpras() : "")
							.replace("%STCD1%", kna1.getStcd1() != null ? kna1.getStcd1() : "")
							.replace("%STCD2%", kna1.getStcd2() != null ? kna1.getStcd2() : "")
							.replace("%STRAS%", kna1.getStras() != null ? kna1.getStras() : "")
							.replace("%TELF1%", kna1.getTelf1() != null ? kna1.getTelf1() : "")
							.replace("%TXJCD%", kna1.getTxjcd() != null ? kna1.getTxjcd() : "")
							.replace("%TELX1%", kna1.getTelx1() != null ? kna1.getTelx1() : "")
							.replace("%STCEG%", kna1.getStceg() != null ? kna1.getStceg() : "")
							.replace("%BRAN1%", kna1.getBran1() != null ? kna1.getBran1() : "")
							.replace("%BRAN5%", kna1.getBran5() != null ? kna1.getBran5() : "")
							.replace("%KATR6%", kna1.getKatr6() != null ? kna1.getKatr6() : "")
							.replace("%KATR10%", kna1.getKatr10() != null ? kna1.getKatr10() : "")
							.replace("%PFORT%", kna1.getPfort() != null ? kna1.getPfort() : "")
							.replace("%ZZKV_SIC%", kna1.getZzkv_sic() != null ? kna1.getZzkv_sic() : "")
							.replace("%ZZKV_DEPT%", kna1.getZzkv_dept() != null ? kna1.getZzkv_dept() : "")
							.replace("%ZZKV_INAC%", kna1.getZzkv_inac() != null ? kna1.getZzkv_inac() : "")
							.replace("%ZZKV_INACT%", kna1.getZzkv_inact() != null ? kna1.getZzkv_inact() : "")
							.replace("%SHAD_UPDATE_TS%",
									kna1.getShad_update_ts() != null ? kna1.getShad_update_ts().toString() : "")
							.replace("%MANDT%", kna1.getId().getMandt() != null ? kna1.getId().getMandt() : "").replace(
									"%KUNNR%", kna1.getId().getKnb1kunnr() != null ? kna1.getId().getKnb1kunnr() : ""));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void updateKNVK(KNVK knvk, Connection con) throws SQLException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		con.setAutoCommit(false);
		db.executeQuery(MDGP2Query.KNVK_UPDATE.replace("%KUNNR%", knvk.getKUNNR()).replace("%NAMEV%", knvk.getNAMEV())
				.replace("%NAME1%", knvk.getNAME1()).replace("%TELF1%", knvk.getTELF1())
				.replace("%ERDAT%", knvk.getERDAT()).replace("%ERNAM%", knvk.getERNAM())
				.replace("%SHAD_UPDATE_TS%", knvk.getSHAD_UPDATE_TS().toString())
				.replace("%SHAD_UPDATE_IND%", knvk.getSHAD_UPDATE_IND())
				.replace("%SAP_TS%", knvk.getSAP_TS().toString()).replace("%MANDT%", knvk.getMANDT())
				.replace("%PARNR%", knvk.getPARNR()), con);
		LOGGER.info("Update : KNVK : " + MDGP2Query.KNVK_UPDATE.replace("%KUNNR%", knvk.getKUNNR())
				.replace("%NAMEV%", knvk.getNAMEV()).replace("%NAME1%", knvk.getNAME1())
				.replace("%TELF1%", knvk.getTELF1()).replace("%ERDAT%", knvk.getERDAT())
				.replace("%ERNAM%", knvk.getERNAM()).replace("%SHAD_UPDATE_TS%", knvk.getSHAD_UPDATE_TS().toString())
				.replace("%SHAD_UPDATE_IND%", knvk.getSHAD_UPDATE_IND())
				.replace("%SAP_TS%", knvk.getSAP_TS().toString()).replace("%MANDT%", knvk.getMANDT())
				.replace("%PARNR%", knvk.getPARNR()));
	}

	@Override
	public void updateKNVL_EXT(KNVL_EXT knvl_ext, Connection con) throws SQLException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		con.setAutoCommit(false);
		db.executeQuery(MDGP2Query.KNVL_EXT_UPDATE.replace("%TAX_EXEMPT_REASON%", knvl_ext.getTax_exempt_reason())
				.replace("%LOEVM%", knvl_ext.getLoevm()).replace("%UPDATED_BY%", knvl_ext.getUpdated_by())
				.replace("%UPDATE_DT%", knvl_ext.getUpdate_dt().toString())
				.replace("%UPDATE_TYPE%", knvl_ext.getUpdate_type()).replace("%MANDT%", knvl_ext.getMandt())
				.replace("%KUNNR%", knvl_ext.getKunnr()).replace("%ALAND%", knvl_ext.getAland())
				.replace("%TATYP%", knvl_ext.getTatyp()).replace("%LICNR%", knvl_ext.getLicnr()), con);

		LOGGER.info("Update : KNVL_EXT : "
				+ MDGP2Query.KNVL_EXT_UPDATE.replace("%TAX_EXEMPT_REASON%", knvl_ext.getTax_exempt_reason())
						.replace("%LOEVM%", knvl_ext.getLoevm()).replace("%UPDATED_BY%", knvl_ext.getUpdated_by())
						.replace("%UPDATE_DT%", knvl_ext.getUpdate_dt().toString())
						.replace("%UPDATE_TYPE%", knvl_ext.getUpdate_type()).replace("%MANDT%", knvl_ext.getMandt())
						.replace("%KUNNR%", knvl_ext.getKunnr()).replace("%ALAND%", knvl_ext.getAland())
						.replace("%TATYP%", knvl_ext.getTatyp()).replace("%LICNR%", knvl_ext.getLicnr()));
	}

	@Override
	public void updateKNVL(KNVL knvl, Connection con) throws SQLException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		db.executeQuery(MDGP2Query.KNVL_UPDATE.replace("%DATAB%", knvl.getDatab()).replace("%DATBI%", knvl.getDatbi())
				.replace("%BELIC%", knvl.getBelic()).replace("%SHAD_UPDATE_TS%", knvl.getShad_update_ts())
				.replace("%SHAD_UPDATE_IND%", knvl.getShad_update_ind()).replace("%SAP_TS%", knvl.getSap_ts())
				.replace("%MANDT%", knvl.getMandt()).replace("%KUNNR%", knvl.getKunnr())
				.replace("%ALAND%", knvl.getAland()).replace("%TATYP%", knvl.getTatyp())
				.replace("%LICNR%", knvl.getLicnr()), con);

		LOGGER.info("Update : KNVL : "
				+ MDGP2Query.KNVL_UPDATE.replace("%DATAB%", knvl.getDatab()).replace("%DATBI%", knvl.getDatbi())
						.replace("%BELIC%", knvl.getBelic()).replace("%SHAD_UPDATE_TS%", knvl.getShad_update_ts())
						.replace("%SHAD_UPDATE_IND%", knvl.getShad_update_ind()).replace("%SAP_TS%", knvl.getSap_ts())
						.replace("%MANDT%", knvl.getMandt()).replace("%KUNNR%", knvl.getKunnr())
						.replace("%ALAND%", knvl.getAland()).replace("%TATYP%", knvl.getTatyp())
						.replace("%LICNR%", knvl.getLicnr()));

	}

	@Override
	public void updateKNVP(KNVP knvp) throws SQLException {
		Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		db.executeQuery(MDGP2Query.KNVP_UPDATE.replace("%KUNN2%", knvp.getKUNN2()).replace("%LIFNR%", knvp.getLIFNR())
				.replace("%PERNR%", knvp.getPERNR()).replace("%PARNR%", knvp.getPARNR())
				.replace("%KNREF%", knvp.getKNREF()).replace("%DEFPA%", knvp.getDEFPA())
				.replace("%SHAD_UPDATE_TS%", knvp.getSHAD_UPDATE_TS())
				.replace("%SHAD_UPDATE_IND%", knvp.getSHAD_UPDATE_IND()).replace("%SAP_TS%", knvp.getSAP_TS())
				.replace("%MANDT%", knvp.getMANDT()).replace("%KUNNR%", knvp.getKUNNR())
				.replace("%VKORG%", knvp.getVKORG()).replace("%VTWEG%", knvp.getVTWEG())
				.replace("%SPART%", knvp.getSPART()).replace("%PARVW%", knvp.getPARVW())
				.replace("%PARZA%", knvp.getPARZA()), con);
		LOGGER.info("Update : KNVP : " + MDGP2Query.KNVP_UPDATE.replace("%KUNN2%", knvp.getKUNN2())
				.replace("%LIFNR%", knvp.getLIFNR()).replace("%PERNR%", knvp.getPERNR())
				.replace("%PARNR%", knvp.getPARNR()).replace("%KNREF%", knvp.getKNREF())
				.replace("%DEFPA%", knvp.getDEFPA()).replace("%SHAD_UPDATE_TS%", knvp.getSHAD_UPDATE_TS())
				.replace("%SHAD_UPDATE_IND%", knvp.getSHAD_UPDATE_IND()).replace("%SAP_TS%", knvp.getSAP_TS())
				.replace("%MANDT%", knvp.getMANDT()).replace("%KUNNR%", knvp.getKUNNR())
				.replace("%VKORG%", knvp.getVKORG()).replace("%VTWEG%", knvp.getVTWEG())
				.replace("%SPART%", knvp.getSPART()).replace("%PARVW%", knvp.getPARVW())
				.replace("%PARZA%", knvp.getPARZA()));
	}

	@Override
	public void updateKNVV(KNVV knvv, Connection con) {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		/*
		 * if (con == null) { con = db.getConnection(rdc_url, rdc_username,
		 * rdc_password); }
		 */
		try {
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.KNVV_UPDATE.replace("%MANDT%", knvv.getMandt() != null ? knvv.getMandt() : "")
					.replace("%KUNNR%", knvv.getKunnr() != null ? knvv.getKunnr() : "")
					.replace("%KDGRP%", knvv.getKdgrp() != null ? knvv.getKdgrp() : "")
					.replace("%KVGR1%", knvv.getKvgr1() != null ? knvv.getKvgr1() : "")
					.replace("%WAERS%", knvv.getWaers() != null ? knvv.getWaers() : "")
					.replace("%VKORG%", knvv.getVkorg() != null ? knvv.getVkorg() : "")
					.replace("%ERNAM%", knvv.getErnam() != null ? knvv.getErnam() : "")
					.replace("%ERDAT%", knvv.getErdat() != null ? knvv.getErdat() : "")
					.replace("%BEGRU%", knvv.getBegru() != null ? knvv.getBegru() : "")
					.replace("%LOEVM%", knvv.getLoevm() != null ? knvv.getLoevm() : "")
					.replace("%AUFSD%", knvv.getAufsd() != null ? knvv.getAufsd() : "")
					.replace("%VKBUR%", knvv.getVkbur() != null ? knvv.getVkbur() : "").replace("%SHAD_UPDATE_TS%",
							knvv.getShad_update_ts() != null ? knvv.getShad_update_ts().toString() : ""),
					con);

			LOGGER.info("Update : KNVV : " + MDGP2Query.KNVV_UPDATE
					.replace("%MANDT%", knvv.getMandt() != null ? knvv.getMandt() : "")
					.replace("%KUNNR%", knvv.getKunnr() != null ? knvv.getKunnr() : "")
					.replace("%KDGRP%", knvv.getKdgrp() != null ? knvv.getKdgrp() : "")
					.replace("%KVGR1%", knvv.getKvgr1() != null ? knvv.getKvgr1() : "")
					.replace("%WAERS%", knvv.getWaers() != null ? knvv.getWaers() : "")
					.replace("%VKORG%", knvv.getVkorg() != null ? knvv.getVkorg() : "")
					.replace("%ERNAM%", knvv.getErnam() != null ? knvv.getErnam() : "")
					.replace("%ERDAT%", knvv.getErdat() != null ? knvv.getErdat() : "")
					.replace("%BEGRU%", knvv.getBegru() != null ? knvv.getBegru() : "")
					.replace("%LOEVM%", knvv.getLoevm() != null ? knvv.getLoevm() : "")
					.replace("%AUFSD%", knvv.getAufsd() != null ? knvv.getAufsd() : "")
					.replace("%VKBUR%", knvv.getVkbur() != null ? knvv.getVkbur() : "").replace("%SHAD_UPDATE_TS%",
							knvv.getShad_update_ts() != null ? knvv.getShad_update_ts().toString() : ""));
		}

		catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void updateKUNNR_EXT(KUNNR_EXT kunnr_ext, Connection con) {

		try {
			con.setAutoCommit(false);
			;
			DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();

			con.setAutoCommit(false);

			db.executeQuery(MDGP2Query.KUNNR_EXT_UPDATE
					.replace("%GOE_IND%", kunnr_ext.getGoe_ind() != null ? kunnr_ext.getGoe_ind() : "")
					.replace("%GOE_RSN_CD%", kunnr_ext.getGoe_rsn_cd() != null ? kunnr_ext.getGoe_rsn_cd() : "")
					.replace("%CAP_IND%", kunnr_ext.getCap_ind() != null ? kunnr_ext.getCap_ind() : "")
					.replace("%GOE_EXP_DATE%",
							(kunnr_ext.getGoe_exp_date() != null) ? kunnr_ext.getGoe_exp_date().toString() : "NULL")
					.replace("%COV_ELG_IND%", kunnr_ext.getCov_elg_ind() != null ? kunnr_ext.getCov_elg_ind() : "")
					.replace("%EXT_WALLET_ID%",
							kunnr_ext.getExt_wallet_id() != null ? kunnr_ext.getExt_wallet_id() : "")
					.replace("%VAT_IND%", kunnr_ext.getVat_ind() != null ? kunnr_ext.getVat_ind() : "")
					.replace("%KUNNR%", kunnr_ext.getKunnr()).replace("%MANDT%", kunnr_ext.getMandt()), con);

			LOGGER.info("Insert KUNNR_EXT " + MDGP2Query.KUNNR_EXT_UPDATE
					.replace("%GOE_IND%", kunnr_ext.getGoe_ind() != null ? kunnr_ext.getGoe_ind() : "")
					.replace("%GOE_RSN_CD%", kunnr_ext.getGoe_rsn_cd() != null ? kunnr_ext.getGoe_rsn_cd() : "")
					.replace("%CAP_IND%", kunnr_ext.getCap_ind() != null ? kunnr_ext.getCap_ind() : "")
					.replace("%GOE_EXP_DATE%",
							(kunnr_ext.getGoe_exp_date() != null) ? kunnr_ext.getGoe_exp_date().toString() : "NULL")
					.replace("%COV_ELG_IND%", kunnr_ext.getCov_elg_ind() != null ? kunnr_ext.getCov_elg_ind() : "")
					.replace("%EXT_WALLET_ID%",
							kunnr_ext.getExt_wallet_id() != null ? kunnr_ext.getExt_wallet_id() : "")
					.replace("%VAT_IND%", kunnr_ext.getVat_ind() != null ? kunnr_ext.getVat_ind() : "")
					.replace("%KUNNR%", kunnr_ext.getKunnr()).replace("%MANDT%", kunnr_ext.getMandt()));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}

	}

	@Override
	public void updateSADR(SADR sadr, Connection con) {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		/*
		 * if (con == null) { con = db.getConnection(rdc_url, rdc_username,
		 * rdc_password); }
		 */
		try {
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.SADR_UPDATE.replace("%NAME3%", sadr.getNAME3())
					.replace("%NAME4%", sadr.getNAME4() != null ? sadr.getNAME4() : "")
					.replace("%ORT01%", sadr.getORT01() != null ? sadr.getORT01() : "")
					.replace("%ORT02%", sadr.getORT02() != null ? sadr.getORT02() : "")
					.replace("%PSTL2%", sadr.getPSTL2() != null ? sadr.getPSTL2() : "")
					.replace("%PFACH%", sadr.getPFACH() != null ? sadr.getPFACH() : "")
					.replace("%STRAS%", sadr.getSTRAS() != null ? sadr.getSTRAS() : "")
					.replace("%LAND1%", sadr.getLAND1() != null ? sadr.getLAND1() : "")
					.replace("%REGIO%", sadr.getREGIO() != null ? sadr.getREGIO() : "")
					.replace("%CRNAM%", sadr.getCRNAM() != null ? sadr.getCRNAM() : "")
					.replace("%CRDAT%", sadr.getCRDAT() != null ? sadr.getCRDAT() : "")
					.replace("%CHNAM%", sadr.getCHNAM() != null ? sadr.getCHNAM() : "")
					.replace("%SHAD_UPDATE_TS%", sadr.getSHAD_UPDATE_TS().toString())
					.replace("%MANDT%", sadr.getMANDT() != null ? sadr.getMANDT() : "")
					.replace("%NATIO%", sadr.getNATIO() != null ? sadr.getNATIO() : ""), con);

			LOGGER.info("Update : SADR : " + MDGP2Query.SADR_UPDATE.replace("%NAME3%", sadr.getNAME3())
					.replace("%NAME4%", sadr.getNAME4() != null ? sadr.getNAME4() : "")
					.replace("%ORT01%", sadr.getORT01() != null ? sadr.getORT01() : "")
					.replace("%ORT02%", sadr.getORT02() != null ? sadr.getORT02() : "")
					.replace("%PSTL2%", sadr.getPSTL2() != null ? sadr.getPSTL2() : "")
					.replace("%PFACH%", sadr.getPFACH() != null ? sadr.getPFACH() : "")
					.replace("%STRAS%", sadr.getSTRAS() != null ? sadr.getSTRAS() : "")
					.replace("%LAND1%", sadr.getLAND1() != null ? sadr.getLAND1() : "")
					.replace("%REGIO%", sadr.getREGIO() != null ? sadr.getREGIO() : "")
					.replace("%CRNAM%", sadr.getCRNAM() != null ? sadr.getCRNAM() : "")
					.replace("%CRDAT%", sadr.getCRDAT() != null ? sadr.getCRDAT() : "")
					.replace("%CHNAM%", sadr.getCHNAM() != null ? sadr.getCHNAM() : "")
					.replace("%SHAD_UPDATE_TS%", sadr.getSHAD_UPDATE_TS().toString())
					.replace("%MANDT%", sadr.getMANDT() != null ? sadr.getMANDT() : "")
					.replace("%NATIO%", sadr.getNATIO() != null ? sadr.getNATIO() : ""));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void updateSTXL(STXL stxl, Connection con) {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		/*
		 * if (con == null) { con = db.getConnection(rdc_url, rdc_username,
		 * rdc_password); }
		 */
		try {
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.STXL_UPDATE.replace("%MANDT%", stxl.getMANDT() != null ? stxl.getMANDT() : "")
					.replace("%RELID%", stxl.getRELID() != null ? stxl.getRELID() : "")
					.replace("%TDOBJECT%", stxl.getTDOBJECT() != null ? stxl.getTDOBJECT() : "")
					.replace("%TDNAME%", stxl.getTDNAME() != null ? stxl.getTDNAME() : "")
					.replace("%TDID%", stxl.getTDID() != null ? stxl.getTDID() : "")
					.replace("%CLUSTD%", stxl.getCLUSTD() != null ? stxl.getCLUSTD() : ""), con);
			LOGGER.info("Update : STXL : "
					+ MDGP2Query.STXL_UPDATE.replace("%MANDT%", stxl.getMANDT() != null ? stxl.getMANDT() : "")
							.replace("%RELID%", stxl.getRELID() != null ? stxl.getRELID() : "")
							.replace("%TDOBJECT%", stxl.getTDOBJECT() != null ? stxl.getTDOBJECT() : "")
							.replace("%TDNAME%", stxl.getTDNAME() != null ? stxl.getTDNAME() : "")
							.replace("%TDID%", stxl.getTDID() != null ? stxl.getTDID() : "")
							.replace("%TDSPRAS%", stxl.getTDSPRAS() != null ? stxl.getTDSPRAS() : "")
							.replace("%SRTF2%", Integer.toString(stxl.getSRTF2()))
							.replace("%CLUSTD%", stxl.getCLUSTD() != null ? stxl.getCLUSTD() : ""));

		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public LOCN_IDS getT_LOCN_IDS(String instance, String locnIdsRowId, Connection con) throws ParseException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(mdg_url, mdg_username, mdg_password);
		}
		LOCN_IDS t_locn_ids = db.executeQueryGetT_LOCN_IDS(
				MDGP2Query.T_LOCN_IDS.replace("%instance%", instance).replace("%locnIdsRowId%", locnIdsRowId), con);
		return t_locn_ids;

	}

	@Override
	public LOCNNAME getT_LOCNNAME(String instance, String locnNameCd, Connection con) throws ParseException { // Connection
																												// con =
																												// null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(mdg_url, mdg_username, mdg_password);
		}
		LOCNNAME t_locnname = db.executeQueryGetT_LOCNNAME(
				MDGP2Query.T_LOCNNAME.replace("%instance%", instance).replace("%locnNameCd%", locnNameCd), con);
		return t_locnname;

	}

	@Override
	public LOCNMAIN getT_LOCNMAIN(String instance, String siteId, Connection con) throws ParseException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(mdg_url, mdg_username, mdg_password);
		}
		LOCNMAIN t_locnmain = db.executeQueryGetT_LOCNMAIN(
				MDGP2Query.T_LOCNMAIN.replace("%instance%", instance).replace("%siteId%", siteId), con);
		return t_locnmain;
	}

	@Override
	public LOCNADDR getT_LOCNADDR(String instance, String locnAddrId, Connection con) throws ParseException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(mdg_url, mdg_username, mdg_password);
		}
		LOCNADDR t_locnaddr = db.executeQueryGetT_LOCNADDR(
				MDGP2Query.T_LOCNADDR.replace("%instance%", instance).replace("%locnAddrId%", locnAddrId), con);

		return t_locnaddr;
	}

	@Override
	public LOCAL_LANG_NAME getT_LOCAL_LANG_NAME(String instance, String locnNameId, Connection con) {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(mdg_url, mdg_username, mdg_password);
		}
		LOCAL_LANG_NAME t_local_lang_name = db.executeQueryGetT_LOCAL_LANG_NAME(
				MDGP2Query.T_LOCAL_LANG_NAME.replace("%instance%", instance).replace("%locnNameId%", locnNameId), con);

		return t_local_lang_name;
	}

	@Override
	public LOCAL_LANG_ADDR getT_LOCAL_LANG_ADDR(String instance, String locnAddrId, Connection con) {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(mdg_url, mdg_username, mdg_password);
		}
		LOCAL_LANG_ADDR t_local_lang_addr = db.executeQueryGetT_LOCAL_LANG_ADDR(
				MDGP2Query.T_LOCAL_LANG_ADDR.replace("%instance%", instance).replace("%locnAddrId%", locnAddrId), con);
		return t_local_lang_addr;

	}

	@Override
	public Cust_cmr_xref getCust_cmr_xref(String instance, String siteId, String address_type, String issuing_country,
			String cmr_no, Connection con) throws ParseException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();

		Cust_cmr_xref cust_cmr_xref = db.executeQueryGetCust_cmr_xref(MDGP2Query.CUST_CMR_XREF
				.replace("%instance%", instance).replace("%siteId%", siteId).replace("%address_type%", address_type)
				.replace("%issuing_country%", issuing_country).replace("%cmr_no%", cmr_no), con);
		return cust_cmr_xref;
	}

	@Override
	public void insertCust_cmr_xref(Cust_cmr_xref cust_cmr_xref, Connection con) {
		try {
			con.setAutoCommit(false);
			DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
			db.executeQuery(MDGP2Query.Insert_CUST_CMR_XREF
					.replace("%INSTANCE%", cust_cmr_xref.getInstance() != null ? cust_cmr_xref.getInstance() : "")
					.replace("%SITE_ID%", cust_cmr_xref.getSite_id() != null ? cust_cmr_xref.getSite_id() : "")
					.replace("%IERP_SITE_ID%",
							cust_cmr_xref.getIerp_site_id() != null ? cust_cmr_xref.getIerp_site_id() : "")
					.replace("%KUNNR%", cust_cmr_xref.getKunnr() != null ? cust_cmr_xref.getKunnr() : "")
					.replace("%PRIMARY_FLAG%",
							cust_cmr_xref.getPrimary_flag() != null ? cust_cmr_xref.getPrimary_flag() : "")
					.replace("%ADDRESS_TYPE%",
							cust_cmr_xref.getAddress_type() != null ? cust_cmr_xref.getAddress_type() : "")
					.replace("%ISSUING_COUNTRY%",
							cust_cmr_xref.getIssuing_country() != null ? cust_cmr_xref.getIssuing_country() : "")
					.replace("%CMR_NO%", cust_cmr_xref.getCmr_no() != null ? cust_cmr_xref.getCmr_no() : "")
					.replace("%SEQUENCE_NO%",
							cust_cmr_xref.getSequence_no() != null ? cust_cmr_xref.getSequence_no() : "")
					.replace("%LOGICAL_DELETE_INDICATOR%",
							cust_cmr_xref.getLogical_delete_indicator() != null
									? cust_cmr_xref.getLogical_delete_indicator()
									: ""),
					con);

			LOGGER.info("Insert CUST_CMR_XREF " + MDGP2Query.Insert_CUST_CMR_XREF
					.replace("%INSTANCE%", cust_cmr_xref.getInstance() != null ? cust_cmr_xref.getInstance() : "")
					.replace("%SITE_ID%", cust_cmr_xref.getSite_id() != null ? cust_cmr_xref.getSite_id() : "")
					.replace("%IERP_SITE_ID%",
							cust_cmr_xref.getIerp_site_id() != null ? cust_cmr_xref.getIerp_site_id() : "")
					.replace("%KUNNR%", cust_cmr_xref.getKunnr() != null ? cust_cmr_xref.getKunnr() : "")
					.replace("%PRIMARY_FLAG%",
							cust_cmr_xref.getPrimary_flag() != null ? cust_cmr_xref.getPrimary_flag() : "")
					.replace("%ADDRESS_TYPE%",
							cust_cmr_xref.getAddress_type() != null ? cust_cmr_xref.getAddress_type() : "")
					.replace("%ISSUING_COUNTRY%",
							cust_cmr_xref.getIssuing_country() != null ? cust_cmr_xref.getIssuing_country() : "")
					.replace("%CMR_NO%", cust_cmr_xref.getCmr_no() != null ? cust_cmr_xref.getCmr_no() : "")
					.replace("%SEQUENCE_NO%",
							cust_cmr_xref.getSequence_no() != null ? cust_cmr_xref.getSequence_no() : "")
					.replace("%LOGICAL_DELETE_INDICATOR%",
							cust_cmr_xref.getLogical_delete_indicator() != null
									? cust_cmr_xref.getLogical_delete_indicator()
									: ""));

		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}

	}

	@Override
	public void DeleteFromRevTransPending(Revtranspending revtranspending, Connection con) {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		/*
		 * if (con == null) { con = db.getConnection(mdg_url, mdg_username,
		 * mdg_password); }
		 */
		try {
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.DeleteFromRevTransPendingreplace
					.replace("%INSTANCE%",
							revtranspending.getId().getInstance() != null ? revtranspending.getId().getInstance() : "")
					.replace("%SITE_ID%",
							revtranspending.getId().getSite_id() != null ? revtranspending.getId().getSite_id() : "")
					.replace("%ACCOUNT_GROUP%",
							revtranspending.getId().getAccount_group() != null
									? revtranspending.getId().getAccount_group()
									: "")
					.replace("%ISSUING_COUNTRY%",
							revtranspending.getId().getIssuing_cntry() != null
									? revtranspending.getId().getIssuing_cntry()
									: "")
					.replace("%CMR_NO%",
							revtranspending.getId().getCmr_no() != null ? revtranspending.getId().getCmr_no() : ""),
					con);

		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public String getADRNR_KNA1(String instance, String kunnr, Connection con) {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		String adrnr = db.executeQueryGetAdrnrFromKNA1(
				MDGP2Query.GetADRNRFromKNA1.replace("%MANDT%", instance).replace("%KUNNR%", kunnr), con);
		return adrnr;
	}

	@Override
	public void insertExternal_CUST_IDS(External_CUST_IDS external_CUST_IDS, Connection con) {

		try {
			DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
			if (con == null) {
				con = db.getConnection(rdc_url, rdc_username, rdc_password);
			}
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.Insert_EXTERNAL_CUST_IDS
					.replace("%MANDT%", external_CUST_IDS.getMANDT() != null ? external_CUST_IDS.getMANDT() : "")
					.replace("%KUNNR%", external_CUST_IDS.getKUNNR() != null ? external_CUST_IDS.getKUNNR() : "")
					.replace("%NATIONAL_ID%",
							external_CUST_IDS.getNATIONAL_ID() != null ? external_CUST_IDS.getNATIONAL_ID() : ""),
					con);
			LOGGER.info("Insert : External_Cust_IDS : " + MDGP2Query.Insert_EXTERNAL_CUST_IDS
					.replace("%MANDT%", external_CUST_IDS.getMANDT() != null ? external_CUST_IDS.getMANDT() : "")
					.replace("%KUNNR%", external_CUST_IDS.getKUNNR() != null ? external_CUST_IDS.getKUNNR() : "")
					.replace("%NATIONAL_ID%",
							external_CUST_IDS.getNATIONAL_ID() != null ? external_CUST_IDS.getNATIONAL_ID() : ""));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void insertSTXH(STXH stxh, Connection con) {

		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		try {
			if (con == null) {
				con = db.getConnection(rdc_url, rdc_username, rdc_password);
			}
			con.setAutoCommit(false);
			;
			db.executeQuery(MDGP2Query.STXH_INSERT.replace("%MANDT%", stxh.getMANDT() != null ? stxh.getMANDT() : "")
					.replace("%TDOBJECT%", stxh.getTDOBJECT() != null ? stxh.getTDOBJECT() : "")
					.replace("%TDNAME%", stxh.getTDNAME() != null ? stxh.getTDNAME() : "")
					.replace("%TDID%", stxh.getTDID() != null ? stxh.getTDID() : "")
					.replace("%TDSPRAS%", stxh.getTDSPRAS() != null ? stxh.getTDSPRAS() : "")
					.replace("%TDTITLE%", stxh.getTDTITLE() != null ? stxh.getTDTITLE() : "")
					.replace("%TDFRELES%", stxh.getTDFRELES() != null ? stxh.getTDFRELES() : "")
					.replace("%TDFUSER%", stxh.getTDFUSER() != null ? stxh.getTDFUSER() : "")
					.replace("%TDFDATE%", stxh.getTDFDATE() != null ? stxh.getTDFDATE() : "")
					.replace("%TDFTIME%", stxh.getTDFTIME() != null ? stxh.getTDFTIME() : "")
					.replace("%TDLRELES%", stxh.getTDLRELES() != null ? stxh.getTDLRELES() : "")
					.replace("%TDLUSER%", stxh.getTDLUSER() != null ? stxh.getTDLUSER() : "")
					.replace("%TDLDATE%", stxh.getTDFTIME() != null ? stxh.getTDFTIME() : "")
					.replace("%TDLTIME%", stxh.getTDLTIME() != null ? stxh.getTDLTIME() : "")
					.replace("%TDVERSION%", stxh.getTDVERSION() != null ? stxh.getTDVERSION() : "")
					.replace("%TDSTYLE%", stxh.getTDSTYLE() != null ? stxh.getTDSTYLE() : "")
					.replace("%TDFORM%", stxh.getTDFORM() != null ? stxh.getTDFORM() : "")
					.replace("%TDHYPHENAT%", stxh.getTDHYPHENAT() != null ? stxh.getTDHYPHENAT() : "")
					.replace("%TDTRANSTAT%", stxh.getTDTRANSTAT() != null ? stxh.getTDTRANSTAT() : "")
					.replace("%TDOSPRAS%", stxh.getTDOSPRAS() != null ? stxh.getTDOSPRAS() : "")
					.replace("%TDMACODE1%", stxh.getTDMACODE1() != null ? stxh.getTDMACODE1() : "")
					.replace("%TDMACODE2%", stxh.getTDMACODE2() != null ? stxh.getTDMACODE2() : "")
					.replace("%TDTXTLINES%", stxh.getTDTXTLINES() != null ? stxh.getTDTXTLINES() : "")
					.replace("%TDREF%", stxh.getTDREF() != null ? stxh.getTDREF() : "")
					.replace("%TDREFOBJ%", stxh.getTDREFOBJ() != null ? stxh.getTDREFOBJ() : "")
					.replace("%TDREFNAME%", stxh.getTDREFNAME() != null ? stxh.getTDREFNAME() : "")
					.replace("%TDREFID%", stxh.getTDREFID() != null ? stxh.getTDREFID() : "")
					.replace("%TDTEXTTYPE%", stxh.getTDTEXTTYPE() != null ? stxh.getTDTEXTTYPE() : "")
					.replace("%TDCOMPRESS%", stxh.getTDCOMPRESS() != null ? stxh.getTDCOMPRESS() : "")
					.replace("%TDOCLASS%", stxh.getTDOCLASS() != null ? stxh.getTDOCLASS() : ""), con);
			LOGGER.info("Insert : STXH : "
					+ MDGP2Query.STXH_INSERT.replace("%MANDT%", stxh.getMANDT() != null ? stxh.getMANDT() : "")
							.replace("%TDOBJECT%", stxh.getTDOBJECT() != null ? stxh.getTDOBJECT() : "")
							.replace("%TDNAME%", stxh.getTDNAME() != null ? stxh.getTDNAME() : "")
							.replace("%TDID%", stxh.getTDID() != null ? stxh.getTDID() : "")
							.replace("%TDSPRAS%", stxh.getTDSPRAS() != null ? stxh.getTDSPRAS() : "")
							.replace("%TDTITLE", stxh.getTDTITLE() != null ? stxh.getTDTITLE() : "")
							.replace("%TDFRELES%", stxh.getTDFRELES() != null ? stxh.getTDFRELES() : "")
							.replace("%TDFUSER%", stxh.getTDFUSER() != null ? stxh.getTDFUSER() : "")
							.replace("%TDFDATE%", stxh.getTDFDATE() != null ? stxh.getTDFDATE() : "")
							.replace("%TDFTIME%", stxh.getTDFTIME() != null ? stxh.getTDFTIME() : "")
							.replace("%TDLRELES%", stxh.getTDLRELES() != null ? stxh.getTDLRELES() : "")
							.replace("%TDLUSER%", stxh.getTDLUSER() != null ? stxh.getTDLUSER() : "")
							.replace("%TDLDATE%", stxh.getTDFTIME() != null ? stxh.getTDFTIME() : "")
							.replace("%TDLTIME%", stxh.getTDLTIME() != null ? stxh.getTDLTIME() : "")
							.replace("%TDVERSION%", stxh.getTDVERSION() != null ? stxh.getTDVERSION() : "")
							.replace("%TDSTYLE%", stxh.getTDSTYLE() != null ? stxh.getTDSTYLE() : "")
							.replace("%TDFORM%", stxh.getTDFORM() != null ? stxh.getTDFORM() : "")
							.replace("%TDHYPHENAT%", stxh.getTDHYPHENAT() != null ? stxh.getTDHYPHENAT() : "")
							.replace("%TDTRANSTAT%", stxh.getTDTRANSTAT() != null ? stxh.getTDTRANSTAT() : "")
							.replace("%TDOSPRAS%", stxh.getTDOSPRAS() != null ? stxh.getTDOSPRAS() : "")
							.replace("%TDMACODE1%", stxh.getTDMACODE1() != null ? stxh.getTDMACODE1() : "")
							.replace("%TDMACODE2%", stxh.getTDMACODE2() != null ? stxh.getTDMACODE2() : "")
							.replace("%TDTXTLINES%", stxh.getTDTXTLINES() != null ? stxh.getTDTXTLINES() : "")
							.replace("%TDREF%", stxh.getTDREF() != null ? stxh.getTDREF() : "")
							.replace("%TDREFOBJ%", stxh.getTDREFOBJ() != null ? stxh.getTDREFOBJ() : "")
							.replace("%TDREFNAME%", stxh.getTDREFNAME() != null ? stxh.getTDREFNAME() : "")
							.replace("%TDREFID%", stxh.getTDREFID() != null ? stxh.getTDREFID() : "")
							.replace("%TDTEXTTYPE%", stxh.getTDTEXTTYPE() != null ? stxh.getTDTEXTTYPE() : "")
							.replace("%TDCOMPRESS%", stxh.getTDCOMPRESS() != null ? stxh.getTDCOMPRESS() : "")
							.replace("%TDOCLASS%", stxh.getTDOCLASS() != null ? stxh.getTDOCLASS() : ""));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}

	}

	@Override
	public void updateSTXH(STXH stxh) {

	}

	@Override
	public void insertAdlctrydata(AddlCtryData addlCtryData, Connection con) throws SQLException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		con.setAutoCommit(false);
		db.executeQuery(MDGP2Query.ADDLCTRYDATA_INSERT
				.replace("%MANDT%", addlCtryData.getMandt() != null ? addlCtryData.getMandt() : "")
				.replace("%KUNNR%", addlCtryData.getKunnr() != null ? addlCtryData.getKunnr() : "")
				.replace("%FIELD_NAME%", addlCtryData.getField_Name() != null ? addlCtryData.getField_Name() : "")
				.replace("%FIELD_VALUE%", addlCtryData.getField_Value() != null ? addlCtryData.getField_Value() : "")
				.replace("%FIELD_QUALIFIER%",
						addlCtryData.getField_Qualifier() != null ? addlCtryData.getField_Qualifier() : "")
				.replace("%LOEVM%", addlCtryData.getLoevm() != null ? addlCtryData.getLoevm() : ""), con);

		LOGGER.info("Insert : ADDLCTRYDATA : " + MDGP2Query.ADDLCTRYDATA_INSERT
				.replace("%MANDT%", addlCtryData.getMandt() != null ? addlCtryData.getMandt() : "")
				.replace("%KUNNR%", addlCtryData.getKunnr() != null ? addlCtryData.getKunnr() : "")
				.replace("%FIELD_NAME%", addlCtryData.getField_Name() != null ? addlCtryData.getField_Name() : "")
				.replace("%FIELD_VALUE%", addlCtryData.getField_Value() != null ? addlCtryData.getField_Value() : "")
				.replace("%FIELD_QUALIFIER%",
						addlCtryData.getField_Qualifier() != null ? addlCtryData.getField_Qualifier() : "")
				.replace("%LOEVM%", addlCtryData.getLoevm() != null ? addlCtryData.getLoevm() : ""));

	}

	@Override
	public void insertKna1AddlBilling(Kna1AddlBilling kna1AddlBilling, Connection con_rdc) throws SQLException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con_rdc == null) {
			con_rdc = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		con_rdc.setAutoCommit(false);
		db.executeQuery(
				MDGP2Query.KNAL_ADDL_BILLING_INSERT
						.replace("%MANDT%", kna1AddlBilling.getMandt() != null ? kna1AddlBilling.getMandt() : "")
						.replace("%KUNNR%", kna1AddlBilling.getKunnr() != null ? kna1AddlBilling.getKunnr() : "")
						.replace("%NO_OF_INVOICES%",
								kna1AddlBilling.getNo_of_invoices() != null ? kna1AddlBilling.getNo_of_invoices() : "")
						.replace("%BANK_ACCOUNT_NO%",
								kna1AddlBilling.getBank_account_no() != null ? kna1AddlBilling.getBank_account_no()
										: "")
						.replace("%BANK_BRANCH_NO%",
								kna1AddlBilling.getBank_branch_no() != null ? kna1AddlBilling.getBank_branch_no() : "")
						.replace("%CA_QST_ID%",
								kna1AddlBilling.getCa_qst_id() != null ? kna1AddlBilling.getCa_qst_id() : "")
						.replace("%CA_PST_ID%",
								kna1AddlBilling.getCa_pst_id() != null ? kna1AddlBilling.getCa_pst_id() : "")
						.replace("%LEASING_INDC%",
								kna1AddlBilling.getLeasing_indc() != null ? kna1AddlBilling.getLeasing_indc() : "")
						.replace("%ESTAB_FUNC_CD%",
								kna1AddlBilling.getEstab_func_cd() != null ? kna1AddlBilling.getEstab_func_cd() : "")
						.replace("%PURCH_ORDR_NO%",
								kna1AddlBilling.getPurch_ordr_no() != null ? kna1AddlBilling.getPurch_ordr_no() : "")
						.replace("%LOEVM%", kna1AddlBilling.getLoevm() != null ? kna1AddlBilling.getLoevm() : "")
						.replace("%MEXICO_FISCAL_REGIME%",
								kna1AddlBilling.getMexico_fiscal_regime() != null
										? kna1AddlBilling.getMexico_fiscal_regime()
										: "")
						.replace("%MEXICO_BILLING_NAME%",
								kna1AddlBilling.getMexico_billing_name() != null
										? kna1AddlBilling.getMexico_billing_name()
										: "")
						.replace("%CODCOND%", kna1AddlBilling.getCodcond() != null ? kna1AddlBilling.getCodcond() : "")
						.replace("%CODREAS%", kna1AddlBilling.getCodreas() != null ? kna1AddlBilling.getCodreas() : "")
						.replace("%CODEFFDATE%",
								kna1AddlBilling.getCodeffdate() != null ? kna1AddlBilling.getCodeffdate().toString()
										: null),
				con_rdc);

		LOGGER.info("Insert : KNAL_ADDL_BILLING : " + MDGP2Query.KNAL_ADDL_BILLING_INSERT
				.replace("%MANDT%", kna1AddlBilling.getMandt() != null ? kna1AddlBilling.getMandt() : "")
				.replace("%KUNNR%", kna1AddlBilling.getKunnr() != null ? kna1AddlBilling.getKunnr() : "")
				.replace("%NO_OF_INVOICES%",
						kna1AddlBilling.getNo_of_invoices() != null ? kna1AddlBilling.getNo_of_invoices() : "")
				.replace("%BANK_ACCOUNT_NO%",
						kna1AddlBilling.getBank_account_no() != null ? kna1AddlBilling.getBank_account_no() : "")
				.replace("%BANK_BRANCH_NO%",
						kna1AddlBilling.getBank_branch_no() != null ? kna1AddlBilling.getBank_branch_no() : "")
				.replace("%CA_QST_ID%", kna1AddlBilling.getCa_qst_id() != null ? kna1AddlBilling.getCa_qst_id() : "")
				.replace("%CA_PST_ID%", kna1AddlBilling.getCa_pst_id() != null ? kna1AddlBilling.getCa_pst_id() : "")
				.replace("%LEASING_INDC%",
						kna1AddlBilling.getLeasing_indc() != null ? kna1AddlBilling.getLeasing_indc() : "")
				.replace("%ESTAB_FUNC_CD%",
						kna1AddlBilling.getEstab_func_cd() != null ? kna1AddlBilling.getEstab_func_cd() : "")
				.replace("%PURCH_ORDR_NO%",
						kna1AddlBilling.getPurch_ordr_no() != null ? kna1AddlBilling.getPurch_ordr_no() : "")
				.replace("%LOEVM%", kna1AddlBilling.getLoevm() != null ? kna1AddlBilling.getLoevm() : "")
				.replace("%MEXICO_FISCAL_REGIME%",
						kna1AddlBilling.getMexico_fiscal_regime() != null ? kna1AddlBilling.getMexico_fiscal_regime()
								: "")
				.replace("%MEXICO_BILLING_NAME%",
						kna1AddlBilling.getMexico_billing_name() != null ? kna1AddlBilling.getMexico_billing_name()
								: "")
				.replace("%CODCOND%", kna1AddlBilling.getCodcond() != null ? kna1AddlBilling.getCodcond() : "")
				.replace("%CODREAS%", kna1AddlBilling.getCodreas() != null ? kna1AddlBilling.getCodreas() : "")
				.replace("%CODEFFDATE%",
						kna1AddlBilling.getCodeffdate() != null ? kna1AddlBilling.getCodeffdate().toString() : null));

	}

	@Override
	public void insertKNB1(KNB1 knb1, Connection con_rdc) throws SQLException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con_rdc == null) {
			con_rdc = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		con_rdc.setAutoCommit(false);
		db.executeQuery(MDGP2Query.KNB1_INSERT.replace("%MANDT%", knb1.getMANDT() != null ? knb1.getMANDT() : "")
				.replace("%KUNNR%", knb1.getKUNNR() != null ? knb1.getKUNNR() : "")
				.replace("%BUKRS%", knb1.getBUKRS() != null ? knb1.getBUKRS() : "")
				.replace("%ERDAT%", knb1.getERDAT() != null ? knb1.getERDAT() : "")
				.replace("%ERNAM%", knb1.getERNAM() != null ? knb1.getERNAM() : "")
				.replace("%SPERR%", knb1.getSPERR() != null ? knb1.getSPERR() : "")
				.replace("%LOEVM%", knb1.getLOEVM() != null ? knb1.getLOEVM() : "")
				.replace("%ZUAWA%", knb1.getZUAWA() != null ? knb1.getZUAWA() : "")
				.replace("%BUSAB%", knb1.getBUSAB() != null ? knb1.getBUSAB() : "")
				.replace("%AKONT%", knb1.getAKONT() != null ? knb1.getAKONT() : "")
				.replace("%BEGRU%", knb1.getBEGRU() != null ? knb1.getBEGRU() : "")
				.replace("%KNRZE%", knb1.getKNRZE() != null ? knb1.getKNRZE() : "")
				.replace("%KNRZB%", knb1.getKNRZB() != null ? knb1.getKNRZB() : "")
				.replace("%ZAMIM%", knb1.getZAMIM() != null ? knb1.getZAMIM() : "")
				.replace("%ZAMIV%", knb1.getZAMIV() != null ? knb1.getZAMIV() : "")
				.replace("%ZAMIR%", knb1.getZAMIR() != null ? knb1.getZAMIR() : "")
				.replace("%ZAMIB%", knb1.getZAMIB() != null ? knb1.getZAMIB() : "")
				.replace("%ZAMIO%", knb1.getZAMIO() != null ? knb1.getZAMIO() : "")
				.replace("%ZWELS%", knb1.getZWELS() != null ? knb1.getZWELS() : "")
				.replace("%XVERR%", knb1.getXVERR() != null ? knb1.getXVERR() : "")
				.replace("%ZAHLS%", knb1.getZAHLS() != null ? knb1.getZAHLS() : "")
				.replace("%ZTERM%", knb1.getZTERM() != null ? knb1.getZTERM() : "")
				.replace("%WAKON%", knb1.getWAKON() != null ? knb1.getWAKON() : "")
				.replace("%VZSKZ%", knb1.getVZSKZ() != null ? knb1.getVZSKZ() : "")
				.replace("%ZINDT%", knb1.getZINDT() != null ? knb1.getZINDT() : "")
				.replace("%ZINRT%", knb1.getZINRT() != null ? knb1.getZINRT() : "")
				.replace("%EIKTO%", knb1.getEIKTO() != null ? knb1.getEIKTO() : "")
				.replace("%ZSABE%", knb1.getZSABE() != null ? knb1.getZSABE() : "")
				.replace("%KVERM%", knb1.getKVERM() != null ? knb1.getKVERM() : "")
				.replace("%FDGRV%", knb1.getFDGRV() != null ? knb1.getFDGRV() : "")
				.replace("%VRBKZ%", knb1.getVRBKZ() != null ? knb1.getVRBKZ() : "")
				.replace("%VLIBB%", knb1.getVLIBB() != null ? knb1.getVLIBB().toString() : "")
				.replace("%VRSZL%", knb1.getVRSZL() != null ? knb1.getVRSZL().toString() : "")
				.replace("%VRSPR%", knb1.getVRSPR() != null ? knb1.getVRSPR().toString() : "")
				.replace("%VRSNR%", knb1.getVRSNR() != null ? knb1.getVRSNR() : "")
				.replace("%VERDT%", knb1.getVERDT() != null ? knb1.getVERDT() : "")
				.replace("%PERKZ%", knb1.getPERKZ() != null ? knb1.getPERKZ() : "")
				.replace("%XDEZV%", knb1.getXDEZV() != null ? knb1.getXDEZV() : "")
				.replace("%XAUSZ%", knb1.getXAUSZ() != null ? knb1.getXAUSZ() : "")
				.replace("%WEBTR%", knb1.getWEBTR() != null ? knb1.getWEBTR().toString() : "")
				.replace("%REMIT%", knb1.getREMIT() != null ? knb1.getREMIT() : "")
				.replace("%DATLZ%", knb1.getDATLZ() != null ? knb1.getDATLZ() : "")
				.replace("%XZVER%", knb1.getXZVER() != null ? knb1.getXZVER() : "")
				.replace("%TOGRU%", knb1.getTOGRU() != null ? knb1.getTOGRU() : "")
				.replace("%KULTG%", knb1.getKULTG() != null ? knb1.getKULTG().toString() : "")
				.replace("%HBKID%", knb1.getHBKID() != null ? knb1.getHBKID() : "")
				.replace("%XPORE%", knb1.getXPORE() != null ? knb1.getXPORE() : "")
				.replace("%BLNKZ%", knb1.getBLNKZ() != null ? knb1.getBLNKZ() : "")
				.replace("%ALTKN%", knb1.getALTKN() != null ? knb1.getALTKN() : "")
				.replace("%ZGRUP%", knb1.getZGRUP() != null ? knb1.getZGRUP() : "")
				.replace("%URLID%", knb1.getURLID() != null ? knb1.getURLID() : "")
				.replace("%MGRUP%", knb1.getMGRUP() != null ? knb1.getMGRUP() : "")
				.replace("%LOCKB%", knb1.getLOCKB() != null ? knb1.getLOCKB() : "")
				.replace("%UZAWE%", knb1.getUZAWE() != null ? knb1.getUZAWE() : "")
				.replace("%EKVBD%", knb1.getEKVBD() != null ? knb1.getEKVBD() : "")
				.replace("%SREGL%", knb1.getSREGL() != null ? knb1.getSREGL() : "")
				.replace("%XEDIP%", knb1.getXEDIP() != null ? knb1.getXEDIP() : "")
				.replace("%FRGRP%", knb1.getFRGRP() != null ? knb1.getFRGRP() : "")
				.replace("%VRSDG%", knb1.getVRSDG() != null ? knb1.getVRSDG() : "")
				.replace("%PERNR%", knb1.getPERNR() != null ? knb1.getPERNR() : "")
				.replace("%TLFXS%", knb1.getTLFXS() != null ? knb1.getTLFXS() : "")
				.replace("%INTAD%", knb1.getINTAD() != null ? knb1.getINTAD() : ""), con_rdc);

		LOGGER.info("Insert : KNB1 : "
				+ MDGP2Query.KNB1_INSERT.replace("%MANDT%", knb1.getMANDT() != null ? knb1.getMANDT() : "")
						.replace("%KUNNR%", knb1.getKUNNR() != null ? knb1.getKUNNR() : "")
						.replace("%BUKRS%", knb1.getBUKRS() != null ? knb1.getBUKRS() : "")
						.replace("%ERDAT%", knb1.getERDAT() != null ? knb1.getERDAT() : "")
						.replace("%ERNAM%", knb1.getERNAM() != null ? knb1.getERNAM() : "")
						.replace("%SPERR%", knb1.getSPERR() != null ? knb1.getSPERR() : "")
						.replace("%LOEVM%", knb1.getLOEVM() != null ? knb1.getLOEVM() : "")
						.replace("%ZUAWA%", knb1.getZUAWA() != null ? knb1.getZUAWA() : "")
						.replace("%BUSAB%", knb1.getBUSAB() != null ? knb1.getBUSAB() : "")
						.replace("%AKONT%", knb1.getAKONT() != null ? knb1.getAKONT() : "")
						.replace("%BEGRU%", knb1.getBEGRU() != null ? knb1.getBEGRU() : "")
						.replace("%KNRZE%", knb1.getKNRZE() != null ? knb1.getKNRZE() : "")
						.replace("%KNRZB%", knb1.getKNRZB() != null ? knb1.getKNRZB() : "")
						.replace("%ZAMIM%", knb1.getZAMIM() != null ? knb1.getZAMIM() : "")
						.replace("%ZAMIV%", knb1.getZAMIV() != null ? knb1.getZAMIV() : "")
						.replace("%ZAMIR%", knb1.getZAMIR() != null ? knb1.getZAMIR() : "")
						.replace("%ZAMIB%", knb1.getZAMIB() != null ? knb1.getZAMIB() : "")
						.replace("%ZAMIO%", knb1.getZAMIO() != null ? knb1.getZAMIO() : "")
						.replace("%ZWELS%", knb1.getZWELS() != null ? knb1.getZWELS() : "")
						.replace("%XVERR%", knb1.getXVERR() != null ? knb1.getXVERR() : "")
						.replace("%ZAHLS%", knb1.getZAHLS() != null ? knb1.getZAHLS() : "")
						.replace("%ZTERM%", knb1.getZTERM() != null ? knb1.getZTERM() : "")
						.replace("%WAKON%", knb1.getWAKON() != null ? knb1.getWAKON() : "")
						.replace("%VZSKZ%", knb1.getVZSKZ() != null ? knb1.getVZSKZ() : "")
						.replace("%ZINDT%", knb1.getZINDT() != null ? knb1.getZINDT() : "")
						.replace("%ZINRT%", knb1.getZINRT() != null ? knb1.getZINRT() : "")
						.replace("%EIKTO%", knb1.getEIKTO() != null ? knb1.getEIKTO() : "")
						.replace("%ZSABE%", knb1.getZSABE() != null ? knb1.getZSABE() : "")
						.replace("%KVERM%", knb1.getKVERM() != null ? knb1.getKVERM() : "")
						.replace("%FDGRV%", knb1.getFDGRV() != null ? knb1.getFDGRV() : "")
						.replace("%VRBKZ%", knb1.getVRBKZ() != null ? knb1.getVRBKZ() : "")
						.replace("%VLIBB%", knb1.getVLIBB() != null ? knb1.getVLIBB().toString() : "")
						.replace("%VRSZL%", knb1.getVRSZL() != null ? knb1.getVRSZL().toString() : "")
						.replace("%VRSPR%", knb1.getVRSPR() != null ? knb1.getVRSPR().toString() : "")
						.replace("%VRSNR%", knb1.getVRSNR() != null ? knb1.getVRSNR() : "")
						.replace("%VERDT%", knb1.getVERDT() != null ? knb1.getVERDT() : "")
						.replace("%PERKZ%", knb1.getPERKZ() != null ? knb1.getPERKZ() : "")
						.replace("%XDEZV%", knb1.getXDEZV() != null ? knb1.getXDEZV() : "")
						.replace("%XAUSZ%", knb1.getXAUSZ() != null ? knb1.getXAUSZ() : "")
						.replace("%WEBTR%", knb1.getWEBTR() != null ? knb1.getWEBTR().toString() : "")
						.replace("%REMIT%", knb1.getREMIT() != null ? knb1.getREMIT() : "")
						.replace("%DATLZ%", knb1.getDATLZ() != null ? knb1.getDATLZ() : "")
						.replace("%XZVER%", knb1.getXZVER() != null ? knb1.getXZVER() : "")
						.replace("%TOGRU%", knb1.getTOGRU() != null ? knb1.getTOGRU() : "")
						.replace("%KULTG%", knb1.getKULTG() != null ? knb1.getKULTG().toString() : "")
						.replace("%HBKID%", knb1.getHBKID() != null ? knb1.getHBKID() : "")
						.replace("%XPORE%", knb1.getXPORE() != null ? knb1.getXPORE() : "")
						.replace("%BLNKZ%", knb1.getBLNKZ() != null ? knb1.getBLNKZ() : "")
						.replace("%ALTKN%", knb1.getALTKN() != null ? knb1.getALTKN() : "")
						.replace("%ZGRUP%", knb1.getZGRUP() != null ? knb1.getZGRUP() : "")
						.replace("%URLID%", knb1.getURLID() != null ? knb1.getURLID() : "")
						.replace("%MGRUP%", knb1.getMGRUP() != null ? knb1.getMGRUP() : "")
						.replace("%LOCKB%", knb1.getLOCKB() != null ? knb1.getLOCKB() : "")
						.replace("%UZAWE%", knb1.getUZAWE() != null ? knb1.getUZAWE() : "")
						.replace("%EKVBD%", knb1.getEKVBD() != null ? knb1.getEKVBD() : "")
						.replace("%SREGL%", knb1.getSREGL() != null ? knb1.getSREGL() : "")
						.replace("%XEDIP%", knb1.getXEDIP() != null ? knb1.getXEDIP() : "")
						.replace("%FRGRP%", knb1.getFRGRP() != null ? knb1.getFRGRP() : "")
						.replace("%VRSDG%", knb1.getVRSDG() != null ? knb1.getVRSDG() : "")
						.replace("%PERNR%", knb1.getPERNR() != null ? knb1.getPERNR() : "")
						.replace("%TLFXS%", knb1.getTLFXS() != null ? knb1.getTLFXS() : "")
						.replace("%INTAD%", knb1.getINTAD() != null ? knb1.getINTAD() : ""));

	}

	@Override
	public void insertKNVV_EXT(KNVV_EXT knvv_ext, Connection con) throws SQLException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		con.setAutoCommit(false);
		db.executeQuery(
				MDGP2Query.KNVV_EXT_INSERT.replace("%MANDT%", knvv_ext.getMandt() != null ? knvv_ext.getMandt() : "")
						.replace("%KUNNR%", knvv_ext.getKunnr() != null ? knvv_ext.getKunnr() : "")
						.replace("%VKORG%", knvv_ext.getVkorg() != null ? knvv_ext.getVkorg() : "")
						.replace("%VTWEG%", knvv_ext.getVtweg() != null ? knvv_ext.getVtweg() : "")
						.replace("%SPART%", knvv_ext.getSpart() != null ? knvv_ext.getSpart() : "")
						.replace("%CSO_SITE%", knvv_ext.getCso_site() != null ? knvv_ext.getCso_site() : "")
						.replace("%CUST_TYPE_2%", knvv_ext.getCust_type_2() != null ? knvv_ext.getCust_type_2() : "")
						.replace("%CUST_TYPE_3%", knvv_ext.getCust_type_3() != null ? knvv_ext.getCust_type_3() : "")
						.replace("%MISC_BILLING%", knvv_ext.getMisc_billing() != null ? knvv_ext.getMisc_billing() : "")
						.replace("%MKTG_AREA%", knvv_ext.getMktg_area() != null ? knvv_ext.getMktg_area() : "")
						.replace("%MKTG_AR_DEPT%", knvv_ext.getMktg_ar_dept() != null ? knvv_ext.getMktg_ar_dept() : "")
						.replace("%MKTG_DEPT%", knvv_ext.getMktg_dept() != null ? knvv_ext.getMktg_dept() : "")
						.replace("%ORG_MKTG_BR_OFC%",
								knvv_ext.getOrg_mktg_br_ofc() != null ? knvv_ext.getOrg_mktg_br_ofc() : "")
						.replace("%PCC_AR_BO%", knvv_ext.getPcc_ar_bo() != null ? knvv_ext.getPcc_ar_bo() : "")
						.replace("%PCC_MKTG_BO%", knvv_ext.getPcc_mktg_bo() != null ? knvv_ext.getPcc_mktg_bo() : "")
						.replace("%US_RESTRICT_TO%",
								knvv_ext.getUs_restrict_to() != null ? knvv_ext.getUs_restrict_to() : "")
						.replace("%SVC_AR_OFC%", knvv_ext.getSvc_ar_ofc() != null ? knvv_ext.getSvc_ar_ofc() : "")
						.replace("%SVC_LGSYS_OFC%",
								knvv_ext.getSvc_lgsys_ofc() != null ? knvv_ext.getSvc_lgsys_ofc() : "")
						.replace("%SVC_SMSYS_OFC%",
								knvv_ext.getSvc_smsys_ofc() != null ? knvv_ext.getSvc_smsys_ofc() : "")
						.replace("%SVC_OTH_OFC%", knvv_ext.getSvc_oth_ofc() != null ? knvv_ext.getSvc_oth_ofc() : "")
						.replace("%ACCT_RECV_BO%", knvv_ext.getAcct_recv_bo() != null ? knvv_ext.getAcct_recv_bo() : "")
						.replace("%MKTG_BO%", knvv_ext.getMktg_bo() != null ? knvv_ext.getMktg_bo() : "")
						.replace("%MKTG_RESP_CD%", knvv_ext.getMktg_resp_cd() != null ? knvv_ext.getMktg_resp_cd() : "")
						.replace("%INSTALL_BO_GRP%",
								knvv_ext.getInstall_bo_grp() != null ? knvv_ext.getInstall_bo_grp() : "")
						.replace("%INSTALL_BO_NUM%",
								knvv_ext.getInstall_bo_num() != null ? knvv_ext.getInstall_bo_num() : "")
						.replace("%SELLING_BO_GRP%",
								knvv_ext.getSelling_bo_grp() != null ? knvv_ext.getSelling_bo_grp() : "")
						.replace("%SELLING_BO_NUM%",
								knvv_ext.getSelling_bo_num() != null ? knvv_ext.getSelling_bo_num() : "")
						.replace("%CE_GRP%", knvv_ext.getCe_grp() != null ? knvv_ext.getCe_grp() : "")
						.replace("%CRS_ID_CODE%", knvv_ext.getCrs_id_code() != null ? knvv_ext.getCrs_id_code() : "")
						.replace("%CUST_SET%", knvv_ext.getCust_set() != null ? knvv_ext.getCust_set() : "")
						.replace("%LOEVM%", knvv_ext.getLoevm() != null ? knvv_ext.getLoevm() : "")
						.replace("%CUST_CREDIT_CD%",
								knvv_ext.getCust_credit_cd() != null ? knvv_ext.getCust_credit_cd() : "")
						.replace("%SVC_MASTER_BO%",
								knvv_ext.getSvc_master_bo() != null ? knvv_ext.getSvc_master_bo() : "")
						.replace("%BO_DIVISION%", knvv_ext.getBo_division() != null ? knvv_ext.getBo_division() : "")
						.replace("%BO_TRADING_AREA%",
								knvv_ext.getBo_trading_area() != null ? knvv_ext.getBo_trading_area() : "")
						.replace("%NON_IBM_COMP_IND%",
								knvv_ext.getNon_ibm_comp_ind() != null ? knvv_ext.getNon_ibm_comp_ind() : "")
						.replace("%OEM_IND%", knvv_ext.getOem_ind() != null ? knvv_ext.getOem_ind() : "")
						.replace("%COLLBO%", knvv_ext.getCollbo() != null ? knvv_ext.getCollbo() : "")
						.replace("%PROXI_LOCN%", knvv_ext.getProxi_locn() != null ? knvv_ext.getProxi_locn() : "")
						.replace("%CHANNEL_CD%", knvv_ext.getChannel_cd() != null ? knvv_ext.getChannel_cd() : "")
						.replace("%JP_TAIGA_CD%", knvv_ext.getJp_taiga_cd() != null ? knvv_ext.getJp_taiga_cd() : ""),
				con);

		LOGGER.info("Insert : KNVV_EXT " + MDGP2Query.KNVV_EXT_INSERT
				.replace("%MANDT%", knvv_ext.getMandt() != null ? knvv_ext.getMandt() : "")
				.replace("%KUNNR%", knvv_ext.getKunnr() != null ? knvv_ext.getKunnr() : "")
				.replace("%VKORG%", knvv_ext.getVkorg() != null ? knvv_ext.getVkorg() : "")
				.replace("%VTWEG%", knvv_ext.getVtweg() != null ? knvv_ext.getVtweg() : "")
				.replace("%SPART%", knvv_ext.getSpart() != null ? knvv_ext.getSpart() : "")
				.replace("%CSO_SITE%", knvv_ext.getCso_site() != null ? knvv_ext.getCso_site() : "")
				.replace("%CUST_TYPE_2%", knvv_ext.getCust_type_2() != null ? knvv_ext.getCust_type_2() : "")
				.replace("%CUST_TYPE_3%", knvv_ext.getCust_type_3() != null ? knvv_ext.getCust_type_3() : "")
				.replace("%MISC_BILLING%", knvv_ext.getMisc_billing() != null ? knvv_ext.getMisc_billing() : "")
				.replace("%MKTG_AREA%", knvv_ext.getMktg_area() != null ? knvv_ext.getMktg_area() : "")
				.replace("%MKTG_AR_DEPT%", knvv_ext.getMktg_ar_dept() != null ? knvv_ext.getMktg_ar_dept() : "")
				.replace("%MKTG_DEPT%", knvv_ext.getMktg_dept() != null ? knvv_ext.getMktg_dept() : "")
				.replace("%ORG_MKTG_BR_OFC%",
						knvv_ext.getOrg_mktg_br_ofc() != null ? knvv_ext.getOrg_mktg_br_ofc() : "")
				.replace("%PCC_AR_BO%", knvv_ext.getPcc_ar_bo() != null ? knvv_ext.getPcc_ar_bo() : "")
				.replace("%PCC_MKTG_BO%", knvv_ext.getPcc_mktg_bo() != null ? knvv_ext.getPcc_mktg_bo() : "")
				.replace("%US_RESTRICT_TO%", knvv_ext.getUs_restrict_to() != null ? knvv_ext.getUs_restrict_to() : "")
				.replace("%SVC_AR_OFC%", knvv_ext.getSvc_ar_ofc() != null ? knvv_ext.getSvc_ar_ofc() : "")
				.replace("%SVC_LGSYS_OFC%", knvv_ext.getSvc_lgsys_ofc() != null ? knvv_ext.getSvc_lgsys_ofc() : "")
				.replace("%SVC_SMSYS_OFC%", knvv_ext.getSvc_smsys_ofc() != null ? knvv_ext.getSvc_smsys_ofc() : "")
				.replace("%SVC_OTH_OFC%", knvv_ext.getSvc_oth_ofc() != null ? knvv_ext.getSvc_oth_ofc() : "")
				.replace("%ACCT_RECV_BO%", knvv_ext.getAcct_recv_bo() != null ? knvv_ext.getAcct_recv_bo() : "")
				.replace("%MKTG_BO%", knvv_ext.getMktg_bo() != null ? knvv_ext.getMktg_bo() : "")
				.replace("%MKTG_RESP_CD%", knvv_ext.getMktg_resp_cd() != null ? knvv_ext.getMktg_resp_cd() : "")
				.replace("%INSTALL_BO_GRP%", knvv_ext.getInstall_bo_grp() != null ? knvv_ext.getInstall_bo_grp() : "")
				.replace("%INSTALL_BO_NUM%", knvv_ext.getInstall_bo_num() != null ? knvv_ext.getInstall_bo_num() : "")
				.replace("%SELLING_BO_GRP%", knvv_ext.getSelling_bo_grp() != null ? knvv_ext.getSelling_bo_grp() : "")
				.replace("%SELLING_BO_NUM%", knvv_ext.getSelling_bo_num() != null ? knvv_ext.getSelling_bo_num() : "")
				.replace("%CE_GRP%", knvv_ext.getCe_grp() != null ? knvv_ext.getCe_grp() : "")
				.replace("%CRS_ID_CODE%", knvv_ext.getCrs_id_code() != null ? knvv_ext.getCrs_id_code() : "")
				.replace("%CUST_SET%", knvv_ext.getCust_set() != null ? knvv_ext.getCust_set() : "")
				.replace("%LOEVM%", knvv_ext.getLoevm() != null ? knvv_ext.getLoevm() : "")
				.replace("%CUST_CREDIT_CD%", knvv_ext.getCust_credit_cd() != null ? knvv_ext.getCust_credit_cd() : "")
				.replace("%SVC_MASTER_BO%", knvv_ext.getSvc_master_bo() != null ? knvv_ext.getSvc_master_bo() : "")
				.replace("%BO_DIVISION%", knvv_ext.getBo_division() != null ? knvv_ext.getBo_division() : "")
				.replace("%BO_TRADING_AREA%",
						knvv_ext.getBo_trading_area() != null ? knvv_ext.getBo_trading_area() : "")
				.replace("%NON_IBM_COMP_IND%",
						knvv_ext.getNon_ibm_comp_ind() != null ? knvv_ext.getNon_ibm_comp_ind() : "")
				.replace("%OEM_IND%", knvv_ext.getOem_ind() != null ? knvv_ext.getOem_ind() : "")
				.replace("%COLLBO%", knvv_ext.getCollbo() != null ? knvv_ext.getCollbo() : "")
				.replace("%PROXI_LOCN%", knvv_ext.getProxi_locn() != null ? knvv_ext.getProxi_locn() : "")
				.replace("%CHANNEL_CD%", knvv_ext.getChannel_cd() != null ? knvv_ext.getChannel_cd() : "")
				.replace("%JP_TAIGA_CD%", knvv_ext.getJp_taiga_cd() != null ? knvv_ext.getJp_taiga_cd() : ""));

	}

	@Override
	public void insertUS_COMPANY(US_COMPANY us_company, Connection con) throws SQLException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		con.setAutoCommit(false);
		db.executeQuery(MDGP2Query.US_COMPANY_INSERT
				.replace("%MANDT%", us_company.getMANDT() != null ? us_company.getMANDT() : "")
				.replace("%COMP_NO%", us_company.getCOMP_NO() != null ? us_company.getCOMP_NO() : "")
				.replace("%ENT_NO%", us_company.getENT_NO() != null ? us_company.getENT_NO() : "")
				.replace("%COMP_LEGAL_NAME%",
						us_company.getCOMP_LEGAL_NAME() != null ? us_company.getCOMP_LEGAL_NAME() : "")
				.replace("%KATR10%", us_company.getKATR10() != null ? us_company.getKATR10() : "")
				.replace("%LOEVM%", us_company.getLOEVM() != null ? us_company.getLOEVM() : ""), con);

		LOGGER.info("Insert : US_COMPANY " + MDGP2Query.US_COMPANY_INSERT
				.replace("%MANDT%", us_company.getMANDT() != null ? us_company.getMANDT() : "")
				.replace("%COMP_NO%", us_company.getCOMP_NO() != null ? us_company.getCOMP_NO() : "")
				.replace("%ENT_NO%", us_company.getENT_NO() != null ? us_company.getENT_NO() : "")
				.replace("%COMP_LEGAL_NAME%",
						us_company.getCOMP_LEGAL_NAME() != null ? us_company.getCOMP_LEGAL_NAME() : "")
				.replace("%KATR10%", us_company.getKATR10() != null ? us_company.getKATR10() : "")
				.replace("%LOEVM%", us_company.getLOEVM() != null ? us_company.getLOEVM() : ""));

	}

	@Override
	public void insertUS_ENTERPRISE(US_ENTERPRISE us_enterprise, Connection con) throws SQLException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		con.setAutoCommit(false);
		db.executeQuery(MDGP2Query.US_ENTERPRISE_INSERT
				.replace("%MANDT%", us_enterprise.getMANDT() != null ? us_enterprise.getMANDT() : "")
				.replace("%ENT_NO%", us_enterprise.getENT_NO() != null ? us_enterprise.getENT_NO() : "")
				.replace("%ENT_LEGAL_NAME%",
						us_enterprise.getENT_LEGAL_NAME() != null ? us_enterprise.getENT_LEGAL_NAME() : "")
				.replace("%ENT_TYPE_CODE%",
						us_enterprise.getENT_TYPE_CODE() != null ? us_enterprise.getENT_TYPE_CODE() : "")
				.replace("%KATR10%", us_enterprise.getKATR10() != null ? us_enterprise.getKATR10() : "")
				.replace("%LOEVM%", us_enterprise.getLOEVM() != null ? us_enterprise.getLOEVM() : ""), con);

		LOGGER.info("Insert : US_ENTERPRISE " + MDGP2Query.US_ENTERPRISE_INSERT
				.replace("%MANDT%", us_enterprise.getMANDT() != null ? us_enterprise.getMANDT() : "")
				.replace("%ENT_NO%", us_enterprise.getENT_NO() != null ? us_enterprise.getENT_NO() : "")
				.replace("%ENT_LEGAL_NAME%",
						us_enterprise.getENT_LEGAL_NAME() != null ? us_enterprise.getENT_LEGAL_NAME() : "")
				.replace("%ENT_TYPE_CODE%",
						us_enterprise.getENT_TYPE_CODE() != null ? us_enterprise.getENT_TYPE_CODE() : "")
				.replace("%KATR10%", us_enterprise.getKATR10() != null ? us_enterprise.getKATR10() : "")
				.replace("%LOEVM%", us_enterprise.getLOEVM() != null ? us_enterprise.getLOEVM() : ""));
	}

	@Override
	public void insertUS_GEM_TRANS(US_GEM_TRANS us_gem_trans, Connection con) throws SQLException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(rdc_url, rdc_username, rdc_password);
		}
		con.setAutoCommit(false);
		db.executeQuery(MDGP2Query.US_GEM_TRANS_INSERT
				.replace("%MANDT%", us_gem_trans.getMANDT() != null ? us_gem_trans.getMANDT() : "")
				.replace("%KUKLA%", us_gem_trans.getKUKLA() != null ? us_gem_trans.getKUKLA() : "")
				.replace("%ZZKV_IND%", us_gem_trans.getZZKV_IND() != null ? us_gem_trans.getZZKV_IND() : "")
				.replace("%GEM_CD%", us_gem_trans.getGEM_CD() != null ? us_gem_trans.getGEM_CD() : "").replace(
						"%TAX_CUST_TYP%", us_gem_trans.getTAX_CUST_TYP() != null ? us_gem_trans.getTAX_CUST_TYP() : ""),
				con);
		LOGGER.info("Insert : US_GEM_TRANS " + MDGP2Query.US_GEM_TRANS_INSERT
				.replace("%MANDT%", us_gem_trans.getMANDT() != null ? us_gem_trans.getMANDT() : "")
				.replace("%KUKLA%", us_gem_trans.getKUKLA() != null ? us_gem_trans.getKUKLA() : "")
				.replace("%ZZKV_IND%", us_gem_trans.getZZKV_IND() != null ? us_gem_trans.getZZKV_IND() : "")
				.replace("%GEM_CD%", us_gem_trans.getGEM_CD() != null ? us_gem_trans.getGEM_CD() : "")
				.replace("%TAX_CUST_TYP%",
						us_gem_trans.getTAX_CUST_TYP() != null ? us_gem_trans.getTAX_CUST_TYP() : ""));

	}

	@Override
	public void updateAdlctrydata(AddlCtryData addlCtryData, Connection con) throws SQLException {

		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		con.setAutoCommit(false);
		try {
			db.executeQuery(MDGP2Query.ADDLCTRYDATA_UPDATE
					.replace("%MANDT%", addlCtryData.getMandt() != null ? addlCtryData.getMandt() : "")
					.replace("%KUNNR%", addlCtryData.getKunnr() != null ? addlCtryData.getKunnr() : "")
					.replace("%FIELD_NAME%", addlCtryData.getField_Name() != null ? addlCtryData.getField_Name() : "")
					.replace("%FIELD_VALUE%",
							addlCtryData.getField_Value() != null ? addlCtryData.getField_Value() : "")
					.replace("%FIELD_QUALIFIER%",
							addlCtryData.getField_Qualifier() != null ? addlCtryData.getField_Qualifier() : "")
					.replace("%LOEVM%", addlCtryData.getLoevm() != null ? addlCtryData.getLoevm() : ""), con);

			LOGGER.info("Update : ADDLCTRYDATA : " + MDGP2Query.ADDLCTRYDATA_UPDATE
					.replace("%MANDT%", addlCtryData.getMandt() != null ? addlCtryData.getMandt() : "")
					.replace("%KUNNR%", addlCtryData.getKunnr() != null ? addlCtryData.getKunnr() : "")
					.replace("%FIELD_NAME%", addlCtryData.getField_Name() != null ? addlCtryData.getField_Name() : "")
					.replace("%FIELD_VALUE%",
							addlCtryData.getField_Value() != null ? addlCtryData.getField_Value() : "")
					.replace("%FIELD_QUALIFIER%",
							addlCtryData.getField_Qualifier() != null ? addlCtryData.getField_Qualifier() : "")
					.replace("%LOEVM%", addlCtryData.getLoevm() != null ? addlCtryData.getLoevm() : ""));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void updateKna1AddlBilling(Kna1AddlBilling kna1AddlBilling, Connection con) throws SQLException {
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();

		try {
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.KNAL_ADDL_BILLING_UPDATE
					.replace("%MANDT%", kna1AddlBilling.getMandt() != null ? kna1AddlBilling.getMandt() : "")
					.replace("%KUNNR%", kna1AddlBilling.getKunnr() != null ? kna1AddlBilling.getKunnr() : "")
					.replace("%NO_OF_INVOICES%",
							kna1AddlBilling.getNo_of_invoices() != null ? kna1AddlBilling.getNo_of_invoices() : "")
					.replace("%LEASING_INDC%",
							kna1AddlBilling.getLeasing_indc() != null ? kna1AddlBilling.getLeasing_indc() : "")
					.replace("%ESTAB_FUNC_CD%",
							kna1AddlBilling.getEstab_func_cd() != null ? kna1AddlBilling.getEstab_func_cd() : "")
					// .replace("%MEXICO_FISCAL_REGIME%", kna1AddlBilling.getMexico_fiscal_regime()
					// != null ? kna1AddlBilling.getMexico_fiscal_regime() : "")
					// .replace("%MEXICO_BILLING_NAME%", kna1AddlBilling.getMexico_billing_name() !=
					// null ? kna1AddlBilling.getMexico_billing_name() : "")
					.replace("%CODCOND%", kna1AddlBilling.getCodcond() != null ? kna1AddlBilling.getCodcond() : "")
					.replace("%CODREAS%", kna1AddlBilling.getCodreas() != null ? kna1AddlBilling.getCodreas() : "")
					.replace("%CODEFFDATE%", kna1AddlBilling.getCodeffdate() == null ? null
							: kna1AddlBilling.getCodeffdate().toString()),
					con);

			LOGGER.info("Update : KNAL_ADDL_BILLING : " + MDGP2Query.KNAL_ADDL_BILLING_UPDATE
					.replace("%MANDT%", kna1AddlBilling.getMandt() != null ? kna1AddlBilling.getMandt() : "")
					.replace("%KUNNR%", kna1AddlBilling.getKunnr() != null ? kna1AddlBilling.getKunnr() : "")
					.replace("%NO_OF_INVOICES%",
							kna1AddlBilling.getNo_of_invoices() != null ? kna1AddlBilling.getNo_of_invoices() : "")
					.replace("%LEASING_INDC%",
							kna1AddlBilling.getLeasing_indc() != null ? kna1AddlBilling.getLeasing_indc() : "")
					.replace("%ESTAB_FUNC_CD%",
							kna1AddlBilling.getEstab_func_cd() != null ? kna1AddlBilling.getEstab_func_cd() : "")
					.replace("%MEXICO_FISCAL_REGIME%",
							kna1AddlBilling.getMexico_fiscal_regime() != null
									? kna1AddlBilling.getMexico_fiscal_regime()
									: "")
					.replace("%MEXICO_BILLING_NAME%",
							kna1AddlBilling.getMexico_billing_name() != null ? kna1AddlBilling.getMexico_billing_name()
									: "")
					.replace("%CODCOND%", kna1AddlBilling.getCodcond() != null ? kna1AddlBilling.getCodcond() : "")
					.replace("%CODREAS%", kna1AddlBilling.getCodreas() != null ? kna1AddlBilling.getCodreas() : "")
					.replace("%CODEFFDATE%",
							kna1AddlBilling.getCodeffdate() != null ? kna1AddlBilling.getCodeffdate().toString()
									: null));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void updateKNB1(KNB1 knb1, Connection con) throws SQLException {

		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		try {
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.KNB1_UPDATE.replace("%MANDT%", knb1.getMANDT() != null ? knb1.getMANDT() : "")
					.replace("%KUNNR%", knb1.getKUNNR() != null ? knb1.getKUNNR() : "")
					.replace("%KNRZB%", knb1.getKNRZB() != null ? knb1.getKNRZB() : "")
					.replace("%ZAMIO%", knb1.getZAMIO() != null ? knb1.getZAMIO() : "")
					.replace("%VZSKZ%", knb1.getVZSKZ() != null ? knb1.getVZSKZ() : ""), con);

			LOGGER.info("Update : KNB1 : "
					+ MDGP2Query.KNB1_UPDATE.replace("%MANDT%", knb1.getMANDT() != null ? knb1.getMANDT() : "")
							.replace("%KUNNR%", knb1.getKUNNR() != null ? knb1.getKUNNR() : "")
							.replace("%KNRZB%", knb1.getKNRZB() != null ? knb1.getKNRZB() : "")
							.replace("%ZAMIO%", knb1.getZAMIO() != null ? knb1.getZAMIO() : "")
							.replace("%VZSKZ%", knb1.getVZSKZ() != null ? knb1.getVZSKZ() : ""));

		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}

	}

	@Override
	public void updateKNVV_EXT(KNVV_EXT knvv_ext, Connection con) throws SQLException {

		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		try {
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.KNVV_EXT_UPDATE
					.replace("%MANDT%", knvv_ext.getMandt() != null ? knvv_ext.getMandt() : "")
					.replace("%KUNNR%", knvv_ext.getKunnr() != null ? knvv_ext.getKunnr() : "")
					.replace("%VKORG%", knvv_ext.getVkorg() != null ? knvv_ext.getVkorg() : "")
					.replace("%VTWEG%", knvv_ext.getVtweg() != null ? knvv_ext.getVtweg() : "")
					.replace("%SPART%", knvv_ext.getSpart() != null ? knvv_ext.getSpart() : "")
					.replace("%CSO_SITE%", knvv_ext.getCso_site() != null ? knvv_ext.getCso_site() : "")
					.replace("%MISC_BILLING%", knvv_ext.getMisc_billing() != null ? knvv_ext.getMisc_billing() : "")
					.replace("%MKTG_AR_DEPT%", knvv_ext.getMktg_ar_dept() != null ? knvv_ext.getMktg_ar_dept() : "")
					.replace("%MKTG_DEPT%", knvv_ext.getMktg_dept() != null ? knvv_ext.getMktg_dept() : "")
					.replace("%PCC_AR_BO%", knvv_ext.getPcc_ar_bo() != null ? knvv_ext.getPcc_ar_bo() : "")
					.replace("%PCC_MKTG_BO%", knvv_ext.getPcc_mktg_bo() != null ? knvv_ext.getPcc_mktg_bo() : "")
					.replace("%SVC_AR_OFC%", knvv_ext.getSvc_ar_ofc() != null ? knvv_ext.getSvc_ar_ofc() : "")
					.replace("%SVC_LGSYS_OFC%", knvv_ext.getSvc_lgsys_ofc() != null ? knvv_ext.getSvc_lgsys_ofc() : "")
					.replace("%SVC_SMSYS_OFC%", knvv_ext.getSvc_smsys_ofc() != null ? knvv_ext.getSvc_smsys_ofc() : "")
					.replace("%SVC_OTH_OFC%", knvv_ext.getSvc_oth_ofc() != null ? knvv_ext.getSvc_oth_ofc() : "")
					.replace("%ACCT_RECV_BO%", knvv_ext.getAcct_recv_bo() != null ? knvv_ext.getAcct_recv_bo() : "")
					.replace("%MKTG_RESP_CD%", knvv_ext.getMktg_resp_cd() != null ? knvv_ext.getMktg_resp_cd() : "")
					.replace("%INSTALL_BO_NUM%",
							knvv_ext.getInstall_bo_num() != null ? knvv_ext.getInstall_bo_num() : "")
					.replace("%SELLING_BO_NUM%",
							knvv_ext.getSelling_bo_num() != null ? knvv_ext.getSelling_bo_num() : "")
					.replace("%CE_GRP%", knvv_ext.getCe_grp() != null ? knvv_ext.getCe_grp() : "")
					.replace("%CUST_CREDIT_CD%",
							knvv_ext.getCust_credit_cd() != null ? knvv_ext.getCust_credit_cd() : "")
					.replace("%SVC_MASTER_BO%", knvv_ext.getSvc_master_bo() != null ? knvv_ext.getSvc_master_bo() : "")
					.replace("%BO_DIVISION%", knvv_ext.getBo_division() != null ? knvv_ext.getBo_division() : "")
					.replace("%BO_TRADING_AREA%",
							knvv_ext.getBo_trading_area() != null ? knvv_ext.getBo_trading_area() : "")
					.replace("%OEM_IND%", knvv_ext.getOem_ind() != null ? knvv_ext.getOem_ind() : "")
					.replace("%COLLBO%", knvv_ext.getCollbo() != null ? knvv_ext.getCollbo() : "")
					.replace("%PROXI_LOCN%", knvv_ext.getProxi_locn() != null ? knvv_ext.getProxi_locn() : "")
					.replace("%CHANNEL_CD%", knvv_ext.getChannel_cd() != null ? knvv_ext.getChannel_cd() : "")
					.replace("%JP_TAIGA_CD%", knvv_ext.getJp_taiga_cd() != null ? knvv_ext.getJp_taiga_cd() : ""), con);
			LOGGER.info("Update KNVV_EXT " + MDGP2Query.KNVV_EXT_UPDATE
					.replace("%MANDT%", knvv_ext.getMandt() != null ? knvv_ext.getMandt() : "")
					.replace("%KUNNR%", knvv_ext.getKunnr() != null ? knvv_ext.getKunnr() : "")
					.replace("%VKORG%", knvv_ext.getVkorg() != null ? knvv_ext.getVkorg() : "")
					.replace("%VTWEG%", knvv_ext.getVtweg() != null ? knvv_ext.getVtweg() : "")
					.replace("%SPART%", knvv_ext.getSpart() != null ? knvv_ext.getSpart() : "")
					.replace("%CSO_SITE%", knvv_ext.getCso_site() != null ? knvv_ext.getCso_site() : "")
					.replace("%MISC_BILLING%", knvv_ext.getMisc_billing() != null ? knvv_ext.getMisc_billing() : "")
					.replace("%MKTG_AR_DEPT%", knvv_ext.getMktg_ar_dept() != null ? knvv_ext.getMktg_ar_dept() : "")
					.replace("%MKTG_DEPT%", knvv_ext.getMktg_dept() != null ? knvv_ext.getMktg_dept() : "")
					.replace("%PCC_AR_BO%", knvv_ext.getPcc_ar_bo() != null ? knvv_ext.getPcc_ar_bo() : "")
					.replace("%PCC_MKTG_BO%", knvv_ext.getPcc_mktg_bo() != null ? knvv_ext.getPcc_mktg_bo() : "")
					.replace("%SVC_AR_OFC%", knvv_ext.getSvc_ar_ofc() != null ? knvv_ext.getSvc_ar_ofc() : "")
					.replace("%SVC_LGSYS_OFC%", knvv_ext.getSvc_lgsys_ofc() != null ? knvv_ext.getSvc_lgsys_ofc() : "")
					.replace("%SVC_SMSYS_OFC%", knvv_ext.getSvc_smsys_ofc() != null ? knvv_ext.getSvc_smsys_ofc() : "")
					.replace("%SVC_OTH_OFC%", knvv_ext.getSvc_oth_ofc() != null ? knvv_ext.getSvc_oth_ofc() : "")
					.replace("%ACCT_RECV_BO%", knvv_ext.getAcct_recv_bo() != null ? knvv_ext.getAcct_recv_bo() : "")
					.replace("%MKTG_RESP_CD%", knvv_ext.getMktg_resp_cd() != null ? knvv_ext.getMktg_resp_cd() : "")
					.replace("%INSTALL_BO_NUM%",
							knvv_ext.getInstall_bo_num() != null ? knvv_ext.getInstall_bo_num() : "")
					.replace("%SELLING_BO_NUM%",
							knvv_ext.getSelling_bo_num() != null ? knvv_ext.getSelling_bo_num() : "")
					.replace("%CE_GRP%", knvv_ext.getCe_grp() != null ? knvv_ext.getCe_grp() : "")
					.replace("%CUST_CREDIT_CD%",
							knvv_ext.getCust_credit_cd() != null ? knvv_ext.getCust_credit_cd() : "")
					.replace("%SVC_MASTER_BO%", knvv_ext.getSvc_master_bo() != null ? knvv_ext.getSvc_master_bo() : "")
					.replace("%BO_DIVISION%", knvv_ext.getBo_division() != null ? knvv_ext.getBo_division() : "")
					.replace("%BO_TRADING_AREA%",
							knvv_ext.getBo_trading_area() != null ? knvv_ext.getBo_trading_area() : "")
					.replace("%OEM_IND%", knvv_ext.getOem_ind() != null ? knvv_ext.getOem_ind() : "")
					.replace("%COLLBO%", knvv_ext.getCollbo() != null ? knvv_ext.getCollbo() : "")
					.replace("%PROXI_LOCN%", knvv_ext.getProxi_locn() != null ? knvv_ext.getProxi_locn() : "")
					.replace("%CHANNEL_CD%", knvv_ext.getChannel_cd() != null ? knvv_ext.getChannel_cd() : "")
					.replace("%JP_TAIGA_CD%", knvv_ext.getJp_taiga_cd() != null ? knvv_ext.getJp_taiga_cd() : ""));

		} catch (SQLException e) {
			con.rollback();
			throw e;
		} finally {
			con.setAutoCommit(true);
		}
	}

	@Override
	public void updateUS_COMPANY(US_COMPANY us_company, Connection con) throws SQLException {
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		try {
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.US_COMPANY_UPDATE
					.replace("%MANDT%", us_company.getMANDT() != null ? us_company.getMANDT() : "")
					.replace("%COMP_NO%", us_company.getCOMP_NO() != null ? us_company.getCOMP_NO() : "")
					.replace("%ENT_NO%", us_company.getENT_NO() != null ? us_company.getENT_NO() : "")
					.replace("%COMP_LEGAL_NAME%",
							us_company.getCOMP_LEGAL_NAME() != null ? us_company.getCOMP_LEGAL_NAME() : "")
					.replace("%KATR10%", us_company.getKATR10() != null ? us_company.getKATR10() : ""), con);

			LOGGER.info("Update US_COMPANY " + MDGP2Query.US_COMPANY_UPDATE
					.replace("%MANDT%", us_company.getMANDT() != null ? us_company.getMANDT() : "")
					.replace("%COMP_NO%", us_company.getCOMP_NO() != null ? us_company.getCOMP_NO() : "")
					.replace("%ENT_NO%", us_company.getENT_NO() != null ? us_company.getENT_NO() : "")
					.replace("%COMP_LEGAL_NAME%",
							us_company.getCOMP_LEGAL_NAME() != null ? us_company.getCOMP_LEGAL_NAME() : "")
					.replace("%KATR10%", us_company.getKATR10() != null ? us_company.getKATR10() : ""));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void updateUS_ENTERPRISE(US_ENTERPRISE us_enterprise, Connection con) throws SQLException {
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		try {
			con.setAutoCommit(false);
			db.executeQuery(
					MDGP2Query.US_ENTERPRISE_UPDATE
							.replace("%MANDT%", us_enterprise.getMANDT() != null ? us_enterprise.getMANDT() : "")
							.replace("%ENT_NO%", us_enterprise.getENT_NO() != null ? us_enterprise.getENT_NO() : "")
							.replace("%ENT_LEGAL_NAME%",
									us_enterprise.getENT_LEGAL_NAME() != null ? us_enterprise.getENT_LEGAL_NAME() : "")
							.replace("%KATR10%", us_enterprise.getKATR10() != null ? us_enterprise.getKATR10() : ""),
					con);

			LOGGER.info("Update US_ENTERPRISE " + MDGP2Query.US_ENTERPRISE_UPDATE
					.replace("%MANDT%", us_enterprise.getMANDT() != null ? us_enterprise.getMANDT() : "")
					.replace("%ENT_NO%", us_enterprise.getENT_NO() != null ? us_enterprise.getENT_NO() : "")
					.replace("%ENT_LEGAL_NAME%",
							us_enterprise.getENT_LEGAL_NAME() != null ? us_enterprise.getENT_LEGAL_NAME() : "")
					.replace("%KATR10%", us_enterprise.getKATR10() != null ? us_enterprise.getKATR10() : ""));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public void updateUS_GEM_TRANS(US_GEM_TRANS us_gem_trans, Connection con) throws SQLException {

		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		try {
			con.setAutoCommit(false);
			db.executeQuery(MDGP2Query.US_GEM_TRANS_UPDATE
					.replace("%MANDT%", us_gem_trans.getMANDT() != null ? us_gem_trans.getMANDT() : "")
					.replace("%KUKLA%", us_gem_trans.getKUKLA() != null ? us_gem_trans.getKUKLA() : "")
					.replace("%ZZKV_IND%", us_gem_trans.getZZKV_IND() != null ? us_gem_trans.getZZKV_IND() : "")
					.replace("%GEM_CD%", us_gem_trans.getGEM_CD() != null ? us_gem_trans.getGEM_CD() : "")
					.replace("%TAX_CUST_TYP%",
							us_gem_trans.getTAX_CUST_TYP() != null ? us_gem_trans.getTAX_CUST_TYP() : ""),
					con);

			LOGGER.info("Update US_GEM_TRANS " + MDGP2Query.US_GEM_TRANS_UPDATE
					.replace("%MANDT%", us_gem_trans.getMANDT() != null ? us_gem_trans.getMANDT() : "")
					.replace("%KUKLA%", us_gem_trans.getKUKLA() != null ? us_gem_trans.getKUKLA() : "")
					.replace("%ZZKV_IND%", us_gem_trans.getZZKV_IND() != null ? us_gem_trans.getZZKV_IND() : "")
					.replace("%GEM_CD%", us_gem_trans.getGEM_CD() != null ? us_gem_trans.getGEM_CD() : "")
					.replace("%TAX_CUST_TYP%",
							us_gem_trans.getTAX_CUST_TYP() != null ? us_gem_trans.getTAX_CUST_TYP() : ""));
		} catch (SQLException ex) {
			// In case of any exception, print error and roll back the transaction
			if (con != null) {
				try {
					System.out.println("Rolling back transaction due to error: " + ex.getMessage());
					con.rollback();
					// Always close the connection
					if (con != null && !con.isClosed()) {
						con.close();
					}
					System.exit(0);
				} catch (SQLException rollbackEx) {
					System.out.println("Error during rollback: " + rollbackEx.getMessage());
					System.exit(0);
				}

			}
		}
	}

	@Override
	public SiteLegacy getSiteLegacy(String instance, String siteId, String issuing_country, String cmr_no,
			String address_type, String address_seq, Connection con) throws ParseException {
		// Connection con = null;
		DB2ConnectionMDGP2 db = new DB2ConnectionMDGP2();
		if (con == null) {
			con = db.getConnection(mdg_url, mdg_username, mdg_password);
		}
		SiteLegacy siteLegacy = db.executeQueryGetSiteLegacy(
				MDGP2Query.SITE_LEGACY.replace("%instance%", instance != null ? instance : "")
						.replace("%siteId%", siteId != null ? siteId : "")
						.replace("%ISSUING_COUNTRY%", issuing_country != null ? issuing_country : "")
						.replace("%CMR_NO%", cmr_no != null ? cmr_no : "")
						.replace("%ADDRESS_TYPE%", address_type != null ? address_type : "")
						.replace("%ADDRESS_SEQ%", address_seq != null ? address_seq : ""),
				con);
		return siteLegacy;

	}

	@Override
	public void insertBOCodesMap(BOCodesMap boCodesMap, Connection con) {

	}
}
