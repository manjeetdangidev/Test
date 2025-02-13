package com.rdc.entity;

import java.sql.Timestamp;

public class SiteLegacy {

	
    private String instance;
    private String owning_entity;
    private String site_id;
    private String issuing_country;
    private String cmr_no;
    private String address_type;
    private String cmrdb2d_cmrtaddr_addrlu;
    private String cmrdb2d_cmrtcext_coddes;
    private String cmrdb2d_cmrtcext_idcli;
    private String cmrdb2d_cmrtcext_indemail;
    private String cmrdb2d_cmrtcext_iva;
    private String cmrdb2d_cmrtcext_tipocl;
    private String cmrdb2d_cmrtcust_cclxa;
    private String cmrdb2d_cmrtcust_cebo;
    private String cmrdb2d_cmrtcust_clgxc;
    private String cmrdb2d_cmrtcust_cpmxa;
    private String cmrdb2d_cmrtcust_crgac;
    private String cmrdb2d_cmrtcust_ctxxa;
    private String cmrdb2d_cmrtcust_remxa;
    private String cmrdb2d_cmrtcust_remxd;
    private String jpinterim_bo_codes_map_bo_cd;
    private String jpinterim_bo_codes_map_field_sales_cd;
    private String jpinterim_bo_codes_map_last_updt_ts;
    private String jpinterim_bo_codes_map_mrc_cd;
    private String jpinterim_bo_codes_map_office_cd;
    private String jpinterim_bo_codes_map_sales_office_cd;
    private String jpinterim_sales_payment_close_day_1;
    private String jpinterim_sales_payment_close_day_2;
    private String jpinterim_sales_payment_close_day_3;
    private String jpinterim_sales_payment_close_day_4;
    private String jpinterim_sales_payment_close_day_5;
    private String jpinterim_sales_payment_close_day_6;
    private String jpinterim_sales_payment_close_day_7;
    private String jpinterim_sales_payment_close_day_8;
    private String jpinterim_sales_payment_contract_sign_dt;
    private String jpinterim_sales_payment_pay_cycle_cd_1;
    private String jpinterim_sales_payment_pay_cycle_cd_2;
    private String jpinterim_sales_payment_pay_cycle_cd_3;
    private String jpinterim_sales_payment_pay_day_1;
    private String jpinterim_sales_payment_pay_day_2;
    private String jpinterim_sales_payment_pay_day_3;
    private String jpinterim_sales_payment_pay_day_4;
    private String jpinterim_sales_payment_pay_day_5;
    private String jpinterim_sales_payment_pay_day_6;
    private String jpinterim_sales_payment_pay_day_7;
    private String jpinterim_sales_payment_pay_day_8;
    private String jpinterim_sales_payment_payment_cycle_cd_4;
    private String jpinterim_sales_payment_payment_cycle_cd_5;
    private String jpinterim_sales_payment_payment_cycle_cd_6;
    private String jpinterim_sales_payment_payment_cycle_cd_7;
    private String jpinterim_sales_payment_payment_cycle_cd_8;
    private String jpinterim_sales_payment_sales_team_no;
    private String lainterim_tax_data_cntry_use_taxcd1;
    private String lainterim_tax_data_cntry_use_taxcd10;
    private String lainterim_tax_data_cntry_use_taxcd11;
    private String lainterim_tax_data_cntry_use_taxcd12;
    private String lainterim_tax_data_cntry_use_taxcd13;
    private String lainterim_tax_data_cntry_use_taxcd15;
    private String lainterim_tax_data_cntry_use_taxcd16;
    private String lainterim_tax_data_cntry_use_taxcd17;
    private String lainterim_tax_data_cntry_use_taxcd2;
    private String lainterim_tax_data_cntry_use_taxcd3;
    private String lainterim_tax_data_cntry_use_taxcd4;
    private String lainterim_tax_data_cntry_use_taxcd5;
    private String lainterim_tax_data_cntry_use_taxcd6;
    private String lainterim_tax_data_cntry_use_taxcd7;
    private String lainterim_tax_data_cntry_use_taxcd8;
    private String lainterim_tax_data_cntry_use_taxcd9;
    private String lainterim_tax_data_tax_separation_indc_taxcd1;
    private String sapr3_addlctrydata_fr_no_of_invoices;
    private String sapr3_addlctrydata_it_code_iva;
    private String sapr3_addlctrydata_it_code_ssv;
    private String sapr3_addlctrydata_sk_bank_account_no;
    private String sapr3_addlctrydata_sk_bank_branch_no;
    private String sapr3_addlctrydata_tax_juris_cd;
    private String sapr3_addlctrydata_tr_economic_cd;
    private String sapr3_addlctrydata_tr_vat_cd;
    private String sapr3_addlctrydata_tr_vat_cd_type;
    private String sapr3_addlctrydata_tr_vat_percentage;
    private String sapr3_kna1_addl_billing_codcond;
    private String sapr3_kna1_addl_billing_codeffdate;
    private String sapr3_kna1_addl_billing_codreas;
    private String sapr3_kna1_addl_billing_estab_func_cd;
    private String sapr3_kna1_addl_billing_leasing_indc;
    private String sapr3_kna1_addl_billing_no_of_invoices;
    private String sapr3_kna1_konzs;
    private String sapr3_kna1_txjcd;
    private String sapr3_kna1_zzkv_estab;
    private String sapr3_kna1_zzkv_node1;
    private String sapr3_kna1_zzkv_node2;
    private String sapr3_knb1_knrzb;
    private String sapr3_knb1_vzskz;
    private String sapr3_knb1_zamio;
    private String sapr3_knvk_name1;
    private String sapr3_knvk_namev;
    private String sapr3_knvk_telf1;
    private String sapr3_knvp_parnr;
    private String sapr3_knvv_ext_acct_recv_bo;
    private String sapr3_knvv_ext_bo_division;
    private String sapr3_knvv_ext_bo_trading_area;
    private String sapr3_knvv_ext_ce_grp;
    private String sapr3_knvv_ext_channel_cd;
    private String sapr3_knvv_ext_collbo;
    private String sapr3_knvv_ext_cso_site;
    private String sapr3_knvv_ext_cust_credit_cd;
    private String sapr3_knvv_ext_install_bo_num;
    private String sapr3_knvv_ext_jp_taiga_cd;
    private String sapr3_knvv_ext_misc_billing;
    private String sapr3_knvv_ext_mktg_ar_dept;
    private String sapr3_knvv_ext_mktg_dept;
    private String sapr3_knvv_ext_mktg_resp_cd;
    private String sapr3_knvv_ext_oem_ind;
    private String sapr3_knvv_ext_pcc_ar_bo;
    private String sapr3_knvv_ext_pcc_mktg_bo;
    private String sapr3_knvv_ext_proxi_locn;
    private String sapr3_knvv_ext_selling_bo_num;
    private String sapr3_knvv_ext_svc_ar_ofc;
    private String sapr3_knvv_ext_svc_lgsys_ofc;
    private String sapr3_knvv_ext_svc_master_bo;
    private String sapr3_knvv_ext_svc_oth_ofc;
    private String sapr3_knvv_ext_svc_smsys_ofc;
    private String sapr3_knvv_ext_us_restrict_to;
    private String sapr3_knvv_kdgrp;
    private String sapr3_knvv_kvgr1;
    private String sapr3_knvv_waers;
    private String sapr3_kunnr_ext_action_txt;
    private String sapr3_kunnr_ext_bill_text1;
    private String sapr3_kunnr_ext_bill_text2;
    private String sapr3_kunnr_ext_bp_mbr_lvl_type;
    private String sapr3_kunnr_ext_cmr_addr_rec_no;
    private String sapr3_kunnr_ext_cmr_addr_rec_type;
    private String sapr3_kunnr_ext_geo_loc_cd;
    private String sapr3_kunnr_ext_hangar;
    private String sapr3_kunnr_ext_hw_instl_mstr_flg;
    private String sapr3_kunnr_ext_ibm_aml_cd;
    private String sapr3_kunnr_ext_pier;
    private String sapr3_kunnr_ext_privacy_ind;
    private String sapr3_kunnr_ext_sales_force_id;
    private String sapr3_kunnr_ext_sc_account_id;
    private String sapr3_stxl_clustd_tdid9013;
    private String sapr3_us_bp_int_codes_bp_code;
    private String sapr3_us_bp_int_codes_bp_full_nm;
    private String sapr3_us_company_comp_legal_name;
    private String sapr3_us_company_comp_no;
    private String sapr3_us_company_ent_no;
    private String sapr3_us_enterprise_ent_legal_name;
    private String sapr3_us_enterprise_ent_type_code;
    private String sapr3_us_gem_trans_gem_cd;
    private String sapr3_us_restrict_codes_restrict_to_cd;
    private String sapr3_us_restrict_codes_restrict_to_nm;
    private String usinterim_us_tax_data_c_icc_tax_class;
    private String usinterim_us_tax_data_c_icc_te;
    private String usinterim_us_tax_data_c_scc;
    private String usinterim_us_tax_data_c_te_cert_st_1;
    private String usinterim_us_tax_data_c_te_cert_st_2;
    private String usinterim_us_tax_data_c_te_cert_st_3;
    private String usinterim_us_tax_data_ea_status;
    private String usinterim_us_tax_data_f_ocl;
    private String usinterim_us_tax_data_i_tax_class_1;
    private String usinterim_us_tax_data_i_tax_class_2;
    private String usinterim_us_tax_data_i_tax_class_3;
    private String usinterim_us_tax_data_i_type_cust_1;
    private String usinterim_us_tax_data_i_type_cust_2;
    private String usinterim_us_tax_data_i_type_cust_3;
    private String sapr3_kna1_stcd1;
    private String sapr3_kna1_lzone;
    private String sapr3_stxl_clustd_tdid;
    private String sapr3_knvl_ext_tax_exempt_reason;
    private String row_access_id;
    private Timestamp created_on;
    private String created_by;
    private String last_update_action;
    private Timestamp last_updated_on;
    private String last_updated_by;
    private String address_seq;

	    public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	public String getOwning_entity() {
		return owning_entity;
	}

	public void setOwning_entity(String owning_entity) {
		this.owning_entity = owning_entity;
	}

	public String getSite_id() {
		return site_id;
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	public String getIssuing_country() {
		return issuing_country;
	}

	public void setIssuing_country(String issuing_country) {
		this.issuing_country = issuing_country;
	}

	public String getCmr_no() {
		return cmr_no;
	}

	public void setCmr_no(String cmr_no) {
		this.cmr_no = cmr_no;
	}

	public String getAddress_type() {
		return address_type;
	}

	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}

	public String getCmrdb2d_cmrtaddr_addrlu() {
		return cmrdb2d_cmrtaddr_addrlu;
	}

	public void setCmrdb2d_cmrtaddr_addrlu(String cmrdb2d_cmrtaddr_addrlu) {
		this.cmrdb2d_cmrtaddr_addrlu = cmrdb2d_cmrtaddr_addrlu;
	}

	public String getCmrdb2d_cmrtcext_coddes() {
		return cmrdb2d_cmrtcext_coddes;
	}

	public void setCmrdb2d_cmrtcext_coddes(String cmrdb2d_cmrtcext_coddes) {
		this.cmrdb2d_cmrtcext_coddes = cmrdb2d_cmrtcext_coddes;
	}

	public String getCmrdb2d_cmrtcext_idcli() {
		return cmrdb2d_cmrtcext_idcli;
	}

	public void setCmrdb2d_cmrtcext_idcli(String cmrdb2d_cmrtcext_idcli) {
		this.cmrdb2d_cmrtcext_idcli = cmrdb2d_cmrtcext_idcli;
	}

	public String getCmrdb2d_cmrtcext_indemail() {
		return cmrdb2d_cmrtcext_indemail;
	}

	public void setCmrdb2d_cmrtcext_indemail(String cmrdb2d_cmrtcext_indemail) {
		this.cmrdb2d_cmrtcext_indemail = cmrdb2d_cmrtcext_indemail;
	}

	public String getCmrdb2d_cmrtcext_iva() {
		return cmrdb2d_cmrtcext_iva;
	}

	public void setCmrdb2d_cmrtcext_iva(String cmrdb2d_cmrtcext_iva) {
		this.cmrdb2d_cmrtcext_iva = cmrdb2d_cmrtcext_iva;
	}

	public String getCmrdb2d_cmrtcext_tipocl() {
		return cmrdb2d_cmrtcext_tipocl;
	}

	public void setCmrdb2d_cmrtcext_tipocl(String cmrdb2d_cmrtcext_tipocl) {
		this.cmrdb2d_cmrtcext_tipocl = cmrdb2d_cmrtcext_tipocl;
	}

	public String getCmrdb2d_cmrtcust_cclxa() {
		return cmrdb2d_cmrtcust_cclxa;
	}

	public void setCmrdb2d_cmrtcust_cclxa(String cmrdb2d_cmrtcust_cclxa) {
		this.cmrdb2d_cmrtcust_cclxa = cmrdb2d_cmrtcust_cclxa;
	}

	public String getCmrdb2d_cmrtcust_cebo() {
		return cmrdb2d_cmrtcust_cebo;
	}

	public void setCmrdb2d_cmrtcust_cebo(String cmrdb2d_cmrtcust_cebo) {
		this.cmrdb2d_cmrtcust_cebo = cmrdb2d_cmrtcust_cebo;
	}

	public String getCmrdb2d_cmrtcust_clgxc() {
		return cmrdb2d_cmrtcust_clgxc;
	}

	public void setCmrdb2d_cmrtcust_clgxc(String cmrdb2d_cmrtcust_clgxc) {
		this.cmrdb2d_cmrtcust_clgxc = cmrdb2d_cmrtcust_clgxc;
	}

	public String getCmrdb2d_cmrtcust_cpmxa() {
		return cmrdb2d_cmrtcust_cpmxa;
	}

	public void setCmrdb2d_cmrtcust_cpmxa(String cmrdb2d_cmrtcust_cpmxa) {
		this.cmrdb2d_cmrtcust_cpmxa = cmrdb2d_cmrtcust_cpmxa;
	}

	public String getCmrdb2d_cmrtcust_crgac() {
		return cmrdb2d_cmrtcust_crgac;
	}

	public void setCmrdb2d_cmrtcust_crgac(String cmrdb2d_cmrtcust_crgac) {
		this.cmrdb2d_cmrtcust_crgac = cmrdb2d_cmrtcust_crgac;
	}

	public String getCmrdb2d_cmrtcust_ctxxa() {
		return cmrdb2d_cmrtcust_ctxxa;
	}

	public void setCmrdb2d_cmrtcust_ctxxa(String cmrdb2d_cmrtcust_ctxxa) {
		this.cmrdb2d_cmrtcust_ctxxa = cmrdb2d_cmrtcust_ctxxa;
	}

	public String getCmrdb2d_cmrtcust_remxa() {
		return cmrdb2d_cmrtcust_remxa;
	}

	public void setCmrdb2d_cmrtcust_remxa(String cmrdb2d_cmrtcust_remxa) {
		this.cmrdb2d_cmrtcust_remxa = cmrdb2d_cmrtcust_remxa;
	}

	public String getCmrdb2d_cmrtcust_remxd() {
		return cmrdb2d_cmrtcust_remxd;
	}

	public void setCmrdb2d_cmrtcust_remxd(String cmrdb2d_cmrtcust_remxd) {
		this.cmrdb2d_cmrtcust_remxd = cmrdb2d_cmrtcust_remxd;
	}

	public String getJpinterim_bo_codes_map_bo_cd() {
		return jpinterim_bo_codes_map_bo_cd;
	}

	public void setJpinterim_bo_codes_map_bo_cd(String jpinterim_bo_codes_map_bo_cd) {
		this.jpinterim_bo_codes_map_bo_cd = jpinterim_bo_codes_map_bo_cd;
	}

	public String getJpinterim_bo_codes_map_field_sales_cd() {
		return jpinterim_bo_codes_map_field_sales_cd;
	}

	public void setJpinterim_bo_codes_map_field_sales_cd(String jpinterim_bo_codes_map_field_sales_cd) {
		this.jpinterim_bo_codes_map_field_sales_cd = jpinterim_bo_codes_map_field_sales_cd;
	}

	public String getJpinterim_bo_codes_map_last_updt_ts() {
		return jpinterim_bo_codes_map_last_updt_ts;
	}

	public void setJpinterim_bo_codes_map_last_updt_ts(String jpinterim_bo_codes_map_last_updt_ts) {
		this.jpinterim_bo_codes_map_last_updt_ts = jpinterim_bo_codes_map_last_updt_ts;
	}

	public String getJpinterim_bo_codes_map_mrc_cd() {
		return jpinterim_bo_codes_map_mrc_cd;
	}

	public void setJpinterim_bo_codes_map_mrc_cd(String jpinterim_bo_codes_map_mrc_cd) {
		this.jpinterim_bo_codes_map_mrc_cd = jpinterim_bo_codes_map_mrc_cd;
	}

	public String getJpinterim_bo_codes_map_office_cd() {
		return jpinterim_bo_codes_map_office_cd;
	}

	public void setJpinterim_bo_codes_map_office_cd(String jpinterim_bo_codes_map_office_cd) {
		this.jpinterim_bo_codes_map_office_cd = jpinterim_bo_codes_map_office_cd;
	}

	public String getJpinterim_bo_codes_map_sales_office_cd() {
		return jpinterim_bo_codes_map_sales_office_cd;
	}

	public void setJpinterim_bo_codes_map_sales_office_cd(String jpinterim_bo_codes_map_sales_office_cd) {
		this.jpinterim_bo_codes_map_sales_office_cd = jpinterim_bo_codes_map_sales_office_cd;
	}

	public String getJpinterim_sales_payment_close_day_1() {
		return jpinterim_sales_payment_close_day_1;
	}

	public void setJpinterim_sales_payment_close_day_1(String jpinterim_sales_payment_close_day_1) {
		this.jpinterim_sales_payment_close_day_1 = jpinterim_sales_payment_close_day_1;
	}

	public String getJpinterim_sales_payment_close_day_2() {
		return jpinterim_sales_payment_close_day_2;
	}

	public void setJpinterim_sales_payment_close_day_2(String jpinterim_sales_payment_close_day_2) {
		this.jpinterim_sales_payment_close_day_2 = jpinterim_sales_payment_close_day_2;
	}

	public String getJpinterim_sales_payment_close_day_3() {
		return jpinterim_sales_payment_close_day_3;
	}

	public void setJpinterim_sales_payment_close_day_3(String jpinterim_sales_payment_close_day_3) {
		this.jpinterim_sales_payment_close_day_3 = jpinterim_sales_payment_close_day_3;
	}

	public String getJpinterim_sales_payment_close_day_4() {
		return jpinterim_sales_payment_close_day_4;
	}

	public void setJpinterim_sales_payment_close_day_4(String jpinterim_sales_payment_close_day_4) {
		this.jpinterim_sales_payment_close_day_4 = jpinterim_sales_payment_close_day_4;
	}

	public String getJpinterim_sales_payment_close_day_5() {
		return jpinterim_sales_payment_close_day_5;
	}

	public void setJpinterim_sales_payment_close_day_5(String jpinterim_sales_payment_close_day_5) {
		this.jpinterim_sales_payment_close_day_5 = jpinterim_sales_payment_close_day_5;
	}

	public String getJpinterim_sales_payment_close_day_6() {
		return jpinterim_sales_payment_close_day_6;
	}

	public void setJpinterim_sales_payment_close_day_6(String jpinterim_sales_payment_close_day_6) {
		this.jpinterim_sales_payment_close_day_6 = jpinterim_sales_payment_close_day_6;
	}

	public String getJpinterim_sales_payment_close_day_7() {
		return jpinterim_sales_payment_close_day_7;
	}

	public void setJpinterim_sales_payment_close_day_7(String jpinterim_sales_payment_close_day_7) {
		this.jpinterim_sales_payment_close_day_7 = jpinterim_sales_payment_close_day_7;
	}

	public String getJpinterim_sales_payment_close_day_8() {
		return jpinterim_sales_payment_close_day_8;
	}

	public void setJpinterim_sales_payment_close_day_8(String jpinterim_sales_payment_close_day_8) {
		this.jpinterim_sales_payment_close_day_8 = jpinterim_sales_payment_close_day_8;
	}

	public String getJpinterim_sales_payment_contract_sign_dt() {
		return jpinterim_sales_payment_contract_sign_dt;
	}

	public void setJpinterim_sales_payment_contract_sign_dt(String jpinterim_sales_payment_contract_sign_dt) {
		this.jpinterim_sales_payment_contract_sign_dt = jpinterim_sales_payment_contract_sign_dt;
	}

	public String getJpinterim_sales_payment_pay_cycle_cd_1() {
		return jpinterim_sales_payment_pay_cycle_cd_1;
	}

	public void setJpinterim_sales_payment_pay_cycle_cd_1(String jpinterim_sales_payment_pay_cycle_cd_1) {
		this.jpinterim_sales_payment_pay_cycle_cd_1 = jpinterim_sales_payment_pay_cycle_cd_1;
	}

	public String getJpinterim_sales_payment_pay_cycle_cd_2() {
		return jpinterim_sales_payment_pay_cycle_cd_2;
	}

	public void setJpinterim_sales_payment_pay_cycle_cd_2(String jpinterim_sales_payment_pay_cycle_cd_2) {
		this.jpinterim_sales_payment_pay_cycle_cd_2 = jpinterim_sales_payment_pay_cycle_cd_2;
	}

	public String getJpinterim_sales_payment_pay_cycle_cd_3() {
		return jpinterim_sales_payment_pay_cycle_cd_3;
	}

	public void setJpinterim_sales_payment_pay_cycle_cd_3(String jpinterim_sales_payment_pay_cycle_cd_3) {
		this.jpinterim_sales_payment_pay_cycle_cd_3 = jpinterim_sales_payment_pay_cycle_cd_3;
	}

	public String getJpinterim_sales_payment_pay_day_1() {
		return jpinterim_sales_payment_pay_day_1;
	}

	public void setJpinterim_sales_payment_pay_day_1(String jpinterim_sales_payment_pay_day_1) {
		this.jpinterim_sales_payment_pay_day_1 = jpinterim_sales_payment_pay_day_1;
	}

	public String getJpinterim_sales_payment_pay_day_2() {
		return jpinterim_sales_payment_pay_day_2;
	}

	public void setJpinterim_sales_payment_pay_day_2(String jpinterim_sales_payment_pay_day_2) {
		this.jpinterim_sales_payment_pay_day_2 = jpinterim_sales_payment_pay_day_2;
	}

	public String getJpinterim_sales_payment_pay_day_3() {
		return jpinterim_sales_payment_pay_day_3;
	}

	public void setJpinterim_sales_payment_pay_day_3(String jpinterim_sales_payment_pay_day_3) {
		this.jpinterim_sales_payment_pay_day_3 = jpinterim_sales_payment_pay_day_3;
	}

	public String getJpinterim_sales_payment_pay_day_4() {
		return jpinterim_sales_payment_pay_day_4;
	}

	public void setJpinterim_sales_payment_pay_day_4(String jpinterim_sales_payment_pay_day_4) {
		this.jpinterim_sales_payment_pay_day_4 = jpinterim_sales_payment_pay_day_4;
	}

	public String getJpinterim_sales_payment_pay_day_5() {
		return jpinterim_sales_payment_pay_day_5;
	}

	public void setJpinterim_sales_payment_pay_day_5(String jpinterim_sales_payment_pay_day_5) {
		this.jpinterim_sales_payment_pay_day_5 = jpinterim_sales_payment_pay_day_5;
	}

	public String getJpinterim_sales_payment_pay_day_6() {
		return jpinterim_sales_payment_pay_day_6;
	}

	public void setJpinterim_sales_payment_pay_day_6(String jpinterim_sales_payment_pay_day_6) {
		this.jpinterim_sales_payment_pay_day_6 = jpinterim_sales_payment_pay_day_6;
	}

	public String getJpinterim_sales_payment_pay_day_7() {
		return jpinterim_sales_payment_pay_day_7;
	}

	public void setJpinterim_sales_payment_pay_day_7(String jpinterim_sales_payment_pay_day_7) {
		this.jpinterim_sales_payment_pay_day_7 = jpinterim_sales_payment_pay_day_7;
	}

	public String getJpinterim_sales_payment_pay_day_8() {
		return jpinterim_sales_payment_pay_day_8;
	}

	public void setJpinterim_sales_payment_pay_day_8(String jpinterim_sales_payment_pay_day_8) {
		this.jpinterim_sales_payment_pay_day_8 = jpinterim_sales_payment_pay_day_8;
	}

	public String getJpinterim_sales_payment_payment_cycle_cd_4() {
		return jpinterim_sales_payment_payment_cycle_cd_4;
	}

	public void setJpinterim_sales_payment_payment_cycle_cd_4(String jpinterim_sales_payment_payment_cycle_cd_4) {
		this.jpinterim_sales_payment_payment_cycle_cd_4 = jpinterim_sales_payment_payment_cycle_cd_4;
	}

	public String getJpinterim_sales_payment_payment_cycle_cd_5() {
		return jpinterim_sales_payment_payment_cycle_cd_5;
	}

	public void setJpinterim_sales_payment_payment_cycle_cd_5(String jpinterim_sales_payment_payment_cycle_cd_5) {
		this.jpinterim_sales_payment_payment_cycle_cd_5 = jpinterim_sales_payment_payment_cycle_cd_5;
	}

	public String getJpinterim_sales_payment_payment_cycle_cd_6() {
		return jpinterim_sales_payment_payment_cycle_cd_6;
	}

	public void setJpinterim_sales_payment_payment_cycle_cd_6(String jpinterim_sales_payment_payment_cycle_cd_6) {
		this.jpinterim_sales_payment_payment_cycle_cd_6 = jpinterim_sales_payment_payment_cycle_cd_6;
	}

	public String getJpinterim_sales_payment_payment_cycle_cd_7() {
		return jpinterim_sales_payment_payment_cycle_cd_7;
	}

	public void setJpinterim_sales_payment_payment_cycle_cd_7(String jpinterim_sales_payment_payment_cycle_cd_7) {
		this.jpinterim_sales_payment_payment_cycle_cd_7 = jpinterim_sales_payment_payment_cycle_cd_7;
	}

	public String getJpinterim_sales_payment_payment_cycle_cd_8() {
		return jpinterim_sales_payment_payment_cycle_cd_8;
	}

	public void setJpinterim_sales_payment_payment_cycle_cd_8(String jpinterim_sales_payment_payment_cycle_cd_8) {
		this.jpinterim_sales_payment_payment_cycle_cd_8 = jpinterim_sales_payment_payment_cycle_cd_8;
	}

	public String getJpinterim_sales_payment_sales_team_no() {
		return jpinterim_sales_payment_sales_team_no;
	}

	public void setJpinterim_sales_payment_sales_team_no(String jpinterim_sales_payment_sales_team_no) {
		this.jpinterim_sales_payment_sales_team_no = jpinterim_sales_payment_sales_team_no;
	}

	public String getLainterim_tax_data_cntry_use_taxcd1() {
		return lainterim_tax_data_cntry_use_taxcd1;
	}

	public void setLainterim_tax_data_cntry_use_taxcd1(String lainterim_tax_data_cntry_use_taxcd1) {
		this.lainterim_tax_data_cntry_use_taxcd1 = lainterim_tax_data_cntry_use_taxcd1;
	}

	public String getLainterim_tax_data_cntry_use_taxcd10() {
		return lainterim_tax_data_cntry_use_taxcd10;
	}

	public void setLainterim_tax_data_cntry_use_taxcd10(String lainterim_tax_data_cntry_use_taxcd10) {
		this.lainterim_tax_data_cntry_use_taxcd10 = lainterim_tax_data_cntry_use_taxcd10;
	}

	public String getLainterim_tax_data_cntry_use_taxcd11() {
		return lainterim_tax_data_cntry_use_taxcd11;
	}

	public void setLainterim_tax_data_cntry_use_taxcd11(String lainterim_tax_data_cntry_use_taxcd11) {
		this.lainterim_tax_data_cntry_use_taxcd11 = lainterim_tax_data_cntry_use_taxcd11;
	}

	public String getLainterim_tax_data_cntry_use_taxcd12() {
		return lainterim_tax_data_cntry_use_taxcd12;
	}

	public void setLainterim_tax_data_cntry_use_taxcd12(String lainterim_tax_data_cntry_use_taxcd12) {
		this.lainterim_tax_data_cntry_use_taxcd12 = lainterim_tax_data_cntry_use_taxcd12;
	}

	public String getLainterim_tax_data_cntry_use_taxcd13() {
		return lainterim_tax_data_cntry_use_taxcd13;
	}

	public void setLainterim_tax_data_cntry_use_taxcd13(String lainterim_tax_data_cntry_use_taxcd13) {
		this.lainterim_tax_data_cntry_use_taxcd13 = lainterim_tax_data_cntry_use_taxcd13;
	}

	public String getLainterim_tax_data_cntry_use_taxcd15() {
		return lainterim_tax_data_cntry_use_taxcd15;
	}

	public void setLainterim_tax_data_cntry_use_taxcd15(String lainterim_tax_data_cntry_use_taxcd15) {
		this.lainterim_tax_data_cntry_use_taxcd15 = lainterim_tax_data_cntry_use_taxcd15;
	}

	public String getLainterim_tax_data_cntry_use_taxcd16() {
		return lainterim_tax_data_cntry_use_taxcd16;
	}

	public void setLainterim_tax_data_cntry_use_taxcd16(String lainterim_tax_data_cntry_use_taxcd16) {
		this.lainterim_tax_data_cntry_use_taxcd16 = lainterim_tax_data_cntry_use_taxcd16;
	}

	public String getLainterim_tax_data_cntry_use_taxcd17() {
		return lainterim_tax_data_cntry_use_taxcd17;
	}

	public void setLainterim_tax_data_cntry_use_taxcd17(String lainterim_tax_data_cntry_use_taxcd17) {
		this.lainterim_tax_data_cntry_use_taxcd17 = lainterim_tax_data_cntry_use_taxcd17;
	}

	public String getLainterim_tax_data_cntry_use_taxcd2() {
		return lainterim_tax_data_cntry_use_taxcd2;
	}

	public void setLainterim_tax_data_cntry_use_taxcd2(String lainterim_tax_data_cntry_use_taxcd2) {
		this.lainterim_tax_data_cntry_use_taxcd2 = lainterim_tax_data_cntry_use_taxcd2;
	}

	public String getLainterim_tax_data_cntry_use_taxcd3() {
		return lainterim_tax_data_cntry_use_taxcd3;
	}

	public void setLainterim_tax_data_cntry_use_taxcd3(String lainterim_tax_data_cntry_use_taxcd3) {
		this.lainterim_tax_data_cntry_use_taxcd3 = lainterim_tax_data_cntry_use_taxcd3;
	}

	public String getLainterim_tax_data_cntry_use_taxcd4() {
		return lainterim_tax_data_cntry_use_taxcd4;
	}

	public void setLainterim_tax_data_cntry_use_taxcd4(String lainterim_tax_data_cntry_use_taxcd4) {
		this.lainterim_tax_data_cntry_use_taxcd4 = lainterim_tax_data_cntry_use_taxcd4;
	}

	public String getLainterim_tax_data_cntry_use_taxcd5() {
		return lainterim_tax_data_cntry_use_taxcd5;
	}

	public void setLainterim_tax_data_cntry_use_taxcd5(String lainterim_tax_data_cntry_use_taxcd5) {
		this.lainterim_tax_data_cntry_use_taxcd5 = lainterim_tax_data_cntry_use_taxcd5;
	}

	public String getLainterim_tax_data_cntry_use_taxcd6() {
		return lainterim_tax_data_cntry_use_taxcd6;
	}

	public void setLainterim_tax_data_cntry_use_taxcd6(String lainterim_tax_data_cntry_use_taxcd6) {
		this.lainterim_tax_data_cntry_use_taxcd6 = lainterim_tax_data_cntry_use_taxcd6;
	}

	public String getLainterim_tax_data_cntry_use_taxcd7() {
		return lainterim_tax_data_cntry_use_taxcd7;
	}

	public void setLainterim_tax_data_cntry_use_taxcd7(String lainterim_tax_data_cntry_use_taxcd7) {
		this.lainterim_tax_data_cntry_use_taxcd7 = lainterim_tax_data_cntry_use_taxcd7;
	}

	public String getLainterim_tax_data_cntry_use_taxcd8() {
		return lainterim_tax_data_cntry_use_taxcd8;
	}

	public void setLainterim_tax_data_cntry_use_taxcd8(String lainterim_tax_data_cntry_use_taxcd8) {
		this.lainterim_tax_data_cntry_use_taxcd8 = lainterim_tax_data_cntry_use_taxcd8;
	}

	public String getLainterim_tax_data_cntry_use_taxcd9() {
		return lainterim_tax_data_cntry_use_taxcd9;
	}

	public void setLainterim_tax_data_cntry_use_taxcd9(String lainterim_tax_data_cntry_use_taxcd9) {
		this.lainterim_tax_data_cntry_use_taxcd9 = lainterim_tax_data_cntry_use_taxcd9;
	}

	public String getLainterim_tax_data_tax_separation_indc_taxcd1() {
		return lainterim_tax_data_tax_separation_indc_taxcd1;
	}

	public void setLainterim_tax_data_tax_separation_indc_taxcd1(String lainterim_tax_data_tax_separation_indc_taxcd1) {
		this.lainterim_tax_data_tax_separation_indc_taxcd1 = lainterim_tax_data_tax_separation_indc_taxcd1;
	}

	public String getSapr3_addlctrydata_fr_no_of_invoices() {
		return sapr3_addlctrydata_fr_no_of_invoices;
	}

	public void setSapr3_addlctrydata_fr_no_of_invoices(String sapr3_addlctrydata_fr_no_of_invoices) {
		this.sapr3_addlctrydata_fr_no_of_invoices = sapr3_addlctrydata_fr_no_of_invoices;
	}

	public String getSapr3_addlctrydata_it_code_iva() {
		return sapr3_addlctrydata_it_code_iva;
	}

	public void setSapr3_addlctrydata_it_code_iva(String sapr3_addlctrydata_it_code_iva) {
		this.sapr3_addlctrydata_it_code_iva = sapr3_addlctrydata_it_code_iva;
	}

	public String getSapr3_addlctrydata_it_code_ssv() {
		return sapr3_addlctrydata_it_code_ssv;
	}

	public void setSapr3_addlctrydata_it_code_ssv(String sapr3_addlctrydata_it_code_ssv) {
		this.sapr3_addlctrydata_it_code_ssv = sapr3_addlctrydata_it_code_ssv;
	}

	public String getSapr3_addlctrydata_sk_bank_account_no() {
		return sapr3_addlctrydata_sk_bank_account_no;
	}

	public void setSapr3_addlctrydata_sk_bank_account_no(String sapr3_addlctrydata_sk_bank_account_no) {
		this.sapr3_addlctrydata_sk_bank_account_no = sapr3_addlctrydata_sk_bank_account_no;
	}

	public String getSapr3_addlctrydata_sk_bank_branch_no() {
		return sapr3_addlctrydata_sk_bank_branch_no;
	}

	public void setSapr3_addlctrydata_sk_bank_branch_no(String sapr3_addlctrydata_sk_bank_branch_no) {
		this.sapr3_addlctrydata_sk_bank_branch_no = sapr3_addlctrydata_sk_bank_branch_no;
	}

	public String getSapr3_addlctrydata_tax_juris_cd() {
		return sapr3_addlctrydata_tax_juris_cd;
	}

	public void setSapr3_addlctrydata_tax_juris_cd(String sapr3_addlctrydata_tax_juris_cd) {
		this.sapr3_addlctrydata_tax_juris_cd = sapr3_addlctrydata_tax_juris_cd;
	}

	public String getSapr3_addlctrydata_tr_economic_cd() {
		return sapr3_addlctrydata_tr_economic_cd;
	}

	public void setSapr3_addlctrydata_tr_economic_cd(String sapr3_addlctrydata_tr_economic_cd) {
		this.sapr3_addlctrydata_tr_economic_cd = sapr3_addlctrydata_tr_economic_cd;
	}

	public String getSapr3_addlctrydata_tr_vat_cd() {
		return sapr3_addlctrydata_tr_vat_cd;
	}

	public void setSapr3_addlctrydata_tr_vat_cd(String sapr3_addlctrydata_tr_vat_cd) {
		this.sapr3_addlctrydata_tr_vat_cd = sapr3_addlctrydata_tr_vat_cd;
	}

	public String getSapr3_addlctrydata_tr_vat_cd_type() {
		return sapr3_addlctrydata_tr_vat_cd_type;
	}

	public void setSapr3_addlctrydata_tr_vat_cd_type(String sapr3_addlctrydata_tr_vat_cd_type) {
		this.sapr3_addlctrydata_tr_vat_cd_type = sapr3_addlctrydata_tr_vat_cd_type;
	}

	public String getSapr3_addlctrydata_tr_vat_percentage() {
		return sapr3_addlctrydata_tr_vat_percentage;
	}

	public void setSapr3_addlctrydata_tr_vat_percentage(String sapr3_addlctrydata_tr_vat_percentage) {
		this.sapr3_addlctrydata_tr_vat_percentage = sapr3_addlctrydata_tr_vat_percentage;
	}

	public String getSapr3_kna1_addl_billing_codcond() {
		return sapr3_kna1_addl_billing_codcond;
	}

	public void setSapr3_kna1_addl_billing_codcond(String sapr3_kna1_addl_billing_codcond) {
		this.sapr3_kna1_addl_billing_codcond = sapr3_kna1_addl_billing_codcond;
	}

	public String getSapr3_kna1_addl_billing_codeffdate() {
		return sapr3_kna1_addl_billing_codeffdate;
	}

	public void setSapr3_kna1_addl_billing_codeffdate(String sapr3_kna1_addl_billing_codeffdate) {
		this.sapr3_kna1_addl_billing_codeffdate = sapr3_kna1_addl_billing_codeffdate;
	}

	public String getSapr3_kna1_addl_billing_codreas() {
		return sapr3_kna1_addl_billing_codreas;
	}

	public void setSapr3_kna1_addl_billing_codreas(String sapr3_kna1_addl_billing_codreas) {
		this.sapr3_kna1_addl_billing_codreas = sapr3_kna1_addl_billing_codreas;
	}

	public String getSapr3_kna1_addl_billing_estab_func_cd() {
		return sapr3_kna1_addl_billing_estab_func_cd;
	}

	public void setSapr3_kna1_addl_billing_estab_func_cd(String sapr3_kna1_addl_billing_estab_func_cd) {
		this.sapr3_kna1_addl_billing_estab_func_cd = sapr3_kna1_addl_billing_estab_func_cd;
	}

	public String getSapr3_kna1_addl_billing_leasing_indc() {
		return sapr3_kna1_addl_billing_leasing_indc;
	}

	public void setSapr3_kna1_addl_billing_leasing_indc(String sapr3_kna1_addl_billing_leasing_indc) {
		this.sapr3_kna1_addl_billing_leasing_indc = sapr3_kna1_addl_billing_leasing_indc;
	}

	public String getSapr3_kna1_addl_billing_no_of_invoices() {
		return sapr3_kna1_addl_billing_no_of_invoices;
	}

	public void setSapr3_kna1_addl_billing_no_of_invoices(String sapr3_kna1_addl_billing_no_of_invoices) {
		this.sapr3_kna1_addl_billing_no_of_invoices = sapr3_kna1_addl_billing_no_of_invoices;
	}

	public String getSapr3_kna1_konzs() {
		return sapr3_kna1_konzs;
	}

	public void setSapr3_kna1_konzs(String sapr3_kna1_konzs) {
		this.sapr3_kna1_konzs = sapr3_kna1_konzs;
	}

	public String getSapr3_kna1_txjcd() {
		return sapr3_kna1_txjcd;
	}

	public void setSapr3_kna1_txjcd(String sapr3_kna1_txjcd) {
		this.sapr3_kna1_txjcd = sapr3_kna1_txjcd;
	}

	public String getSapr3_kna1_zzkv_estab() {
		return sapr3_kna1_zzkv_estab;
	}

	public void setSapr3_kna1_zzkv_estab(String sapr3_kna1_zzkv_estab) {
		this.sapr3_kna1_zzkv_estab = sapr3_kna1_zzkv_estab;
	}

	public String getSapr3_kna1_zzkv_node1() {
		return sapr3_kna1_zzkv_node1;
	}

	public void setSapr3_kna1_zzkv_node1(String sapr3_kna1_zzkv_node1) {
		this.sapr3_kna1_zzkv_node1 = sapr3_kna1_zzkv_node1;
	}

	public String getSapr3_kna1_zzkv_node2() {
		return sapr3_kna1_zzkv_node2;
	}

	public void setSapr3_kna1_zzkv_node2(String sapr3_kna1_zzkv_node2) {
		this.sapr3_kna1_zzkv_node2 = sapr3_kna1_zzkv_node2;
	}

	public String getSapr3_knb1_knrzb() {
		return sapr3_knb1_knrzb;
	}

	public void setSapr3_knb1_knrzb(String sapr3_knb1_knrzb) {
		this.sapr3_knb1_knrzb = sapr3_knb1_knrzb;
	}

	public String getSapr3_knb1_vzskz() {
		return sapr3_knb1_vzskz;
	}

	public void setSapr3_knb1_vzskz(String sapr3_knb1_vzskz) {
		this.sapr3_knb1_vzskz = sapr3_knb1_vzskz;
	}

	public String getSapr3_knb1_zamio() {
		return sapr3_knb1_zamio;
	}

	public void setSapr3_knb1_zamio(String sapr3_knb1_zamio) {
		this.sapr3_knb1_zamio = sapr3_knb1_zamio;
	}

	public String getSapr3_knvk_name1() {
		return sapr3_knvk_name1;
	}

	public void setSapr3_knvk_name1(String sapr3_knvk_name1) {
		this.sapr3_knvk_name1 = sapr3_knvk_name1;
	}

	public String getSapr3_knvk_namev() {
		return sapr3_knvk_namev;
	}

	public void setSapr3_knvk_namev(String sapr3_knvk_namev) {
		this.sapr3_knvk_namev = sapr3_knvk_namev;
	}

	public String getSapr3_knvk_telf1() {
		return sapr3_knvk_telf1;
	}

	public void setSapr3_knvk_telf1(String sapr3_knvk_telf1) {
		this.sapr3_knvk_telf1 = sapr3_knvk_telf1;
	}

	public String getSapr3_knvp_parnr() {
		return sapr3_knvp_parnr;
	}

	public void setSapr3_knvp_parnr(String sapr3_knvp_parnr) {
		this.sapr3_knvp_parnr = sapr3_knvp_parnr;
	}

	public String getSapr3_knvv_ext_acct_recv_bo() {
		return sapr3_knvv_ext_acct_recv_bo;
	}

	public void setSapr3_knvv_ext_acct_recv_bo(String sapr3_knvv_ext_acct_recv_bo) {
		this.sapr3_knvv_ext_acct_recv_bo = sapr3_knvv_ext_acct_recv_bo;
	}

	public String getSapr3_knvv_ext_bo_division() {
		return sapr3_knvv_ext_bo_division;
	}

	public void setSapr3_knvv_ext_bo_division(String sapr3_knvv_ext_bo_division) {
		this.sapr3_knvv_ext_bo_division = sapr3_knvv_ext_bo_division;
	}

	public String getSapr3_knvv_ext_bo_trading_area() {
		return sapr3_knvv_ext_bo_trading_area;
	}

	public void setSapr3_knvv_ext_bo_trading_area(String sapr3_knvv_ext_bo_trading_area) {
		this.sapr3_knvv_ext_bo_trading_area = sapr3_knvv_ext_bo_trading_area;
	}

	public String getSapr3_knvv_ext_ce_grp() {
		return sapr3_knvv_ext_ce_grp;
	}

	public void setSapr3_knvv_ext_ce_grp(String sapr3_knvv_ext_ce_grp) {
		this.sapr3_knvv_ext_ce_grp = sapr3_knvv_ext_ce_grp;
	}

	public String getSapr3_knvv_ext_channel_cd() {
		return sapr3_knvv_ext_channel_cd;
	}

	public void setSapr3_knvv_ext_channel_cd(String sapr3_knvv_ext_channel_cd) {
		this.sapr3_knvv_ext_channel_cd = sapr3_knvv_ext_channel_cd;
	}

	public String getSapr3_knvv_ext_collbo() {
		return sapr3_knvv_ext_collbo;
	}

	public void setSapr3_knvv_ext_collbo(String sapr3_knvv_ext_collbo) {
		this.sapr3_knvv_ext_collbo = sapr3_knvv_ext_collbo;
	}

	public String getSapr3_knvv_ext_cso_site() {
		return sapr3_knvv_ext_cso_site;
	}

	public void setSapr3_knvv_ext_cso_site(String sapr3_knvv_ext_cso_site) {
		this.sapr3_knvv_ext_cso_site = sapr3_knvv_ext_cso_site;
	}

	public String getSapr3_knvv_ext_cust_credit_cd() {
		return sapr3_knvv_ext_cust_credit_cd;
	}

	public void setSapr3_knvv_ext_cust_credit_cd(String sapr3_knvv_ext_cust_credit_cd) {
		this.sapr3_knvv_ext_cust_credit_cd = sapr3_knvv_ext_cust_credit_cd;
	}

	public String getSapr3_knvv_ext_install_bo_num() {
		return sapr3_knvv_ext_install_bo_num;
	}

	public void setSapr3_knvv_ext_install_bo_num(String sapr3_knvv_ext_install_bo_num) {
		this.sapr3_knvv_ext_install_bo_num = sapr3_knvv_ext_install_bo_num;
	}

	public String getSapr3_knvv_ext_jp_taiga_cd() {
		return sapr3_knvv_ext_jp_taiga_cd;
	}

	public void setSapr3_knvv_ext_jp_taiga_cd(String sapr3_knvv_ext_jp_taiga_cd) {
		this.sapr3_knvv_ext_jp_taiga_cd = sapr3_knvv_ext_jp_taiga_cd;
	}

		// Getters and Setters
	    public String getSapr3_knvv_ext_misc_billing() {
	        return sapr3_knvv_ext_misc_billing;
	    }

	    public void setSapr3_knvv_ext_misc_billing(String sapr3_knvv_ext_misc_billing) {
	        this.sapr3_knvv_ext_misc_billing = sapr3_knvv_ext_misc_billing;
	    }

	    public String getSapr3_knvv_ext_mktg_ar_dept() {
	        return sapr3_knvv_ext_mktg_ar_dept;
	    }

	    public void setSapr3_knvv_ext_mktg_ar_dept(String sapr3_knvv_ext_mktg_ar_dept) {
	        this.sapr3_knvv_ext_mktg_ar_dept = sapr3_knvv_ext_mktg_ar_dept;
	    }

	    public String getSapr3_knvv_ext_mktg_dept() {
	        return sapr3_knvv_ext_mktg_dept;
	    }

	    public void setSapr3_knvv_ext_mktg_dept(String sapr3_knvv_ext_mktg_dept) {
	        this.sapr3_knvv_ext_mktg_dept = sapr3_knvv_ext_mktg_dept;
	    }

	    public String getSapr3_knvv_ext_mktg_resp_cd() {
	        return sapr3_knvv_ext_mktg_resp_cd;
	    }

	    public void setSapr3_knvv_ext_mktg_resp_cd(String sapr3_knvv_ext_mktg_resp_cd) {
	        this.sapr3_knvv_ext_mktg_resp_cd = sapr3_knvv_ext_mktg_resp_cd;
	    }

	    public String getSapr3_knvv_ext_oem_ind() {
	        return sapr3_knvv_ext_oem_ind;
	    }

	    public void setSapr3_knvv_ext_oem_ind(String sapr3_knvv_ext_oem_ind) {
	        this.sapr3_knvv_ext_oem_ind = sapr3_knvv_ext_oem_ind;
	    }

	    public String getSapr3_knvv_ext_pcc_ar_bo() {
	        return sapr3_knvv_ext_pcc_ar_bo;
	    }

	    public void setSapr3_knvv_ext_pcc_ar_bo(String sapr3_knvv_ext_pcc_ar_bo) {
	        this.sapr3_knvv_ext_pcc_ar_bo = sapr3_knvv_ext_pcc_ar_bo;
	    }

	    public String getSapr3_knvv_ext_pcc_mktg_bo() {
	        return sapr3_knvv_ext_pcc_mktg_bo;
	    }

	    public void setSapr3_knvv_ext_pcc_mktg_bo(String sapr3_knvv_ext_pcc_mktg_bo) {
	        this.sapr3_knvv_ext_pcc_mktg_bo = sapr3_knvv_ext_pcc_mktg_bo;
	    }

	    public String getSapr3_knvv_ext_proxi_locn() {
	        return sapr3_knvv_ext_proxi_locn;
	    }

	    public void setSapr3_knvv_ext_proxi_locn(String sapr3_knvv_ext_proxi_locn) {
	        this.sapr3_knvv_ext_proxi_locn = sapr3_knvv_ext_proxi_locn;
	    }

	    public String getSapr3_knvv_ext_selling_bo_num() {
	        return sapr3_knvv_ext_selling_bo_num;
	    }

	    public void setSapr3_knvv_ext_selling_bo_num(String sapr3_knvv_ext_selling_bo_num) {
	        this.sapr3_knvv_ext_selling_bo_num = sapr3_knvv_ext_selling_bo_num;
	    }

	    public String getSapr3_knvv_ext_svc_ar_ofc() {
	        return sapr3_knvv_ext_svc_ar_ofc;
	    }

	    public void setSapr3_knvv_ext_svc_ar_ofc(String sapr3_knvv_ext_svc_ar_ofc) {
	        this.sapr3_knvv_ext_svc_ar_ofc = sapr3_knvv_ext_svc_ar_ofc;
	    }

	    public String getSapr3_knvv_ext_svc_lgsys_ofc() {
	        return sapr3_knvv_ext_svc_lgsys_ofc;
	    }

	    public void setSapr3_knvv_ext_svc_lgsys_ofc(String sapr3_knvv_ext_svc_lgsys_ofc) {
	        this.sapr3_knvv_ext_svc_lgsys_ofc = sapr3_knvv_ext_svc_lgsys_ofc;
	    }

	    public String getSapr3_knvv_ext_svc_master_bo() {
	        return sapr3_knvv_ext_svc_master_bo;
	    }

	    public void setSapr3_knvv_ext_svc_master_bo(String sapr3_knvv_ext_svc_master_bo) {
	        this.sapr3_knvv_ext_svc_master_bo = sapr3_knvv_ext_svc_master_bo;
	    }

	    public String getSapr3_knvv_ext_svc_oth_ofc() {
	        return sapr3_knvv_ext_svc_oth_ofc;
	    }

	    public void setSapr3_knvv_ext_svc_oth_ofc(String sapr3_knvv_ext_svc_oth_ofc) {
	        this.sapr3_knvv_ext_svc_oth_ofc = sapr3_knvv_ext_svc_oth_ofc;
	    }

	    public String getSapr3_knvv_ext_svc_smsys_ofc() {
	        return sapr3_knvv_ext_svc_smsys_ofc;
	    }

	    public void setSapr3_knvv_ext_svc_smsys_ofc(String sapr3_knvv_ext_svc_smsys_ofc) {
	        this.sapr3_knvv_ext_svc_smsys_ofc = sapr3_knvv_ext_svc_smsys_ofc;
	    }

	    public String getSapr3_knvv_ext_us_restrict_to() {
	        return sapr3_knvv_ext_us_restrict_to;
	    }

	    public void setSapr3_knvv_ext_us_restrict_to(String sapr3_knvv_ext_us_restrict_to) {
	        this.sapr3_knvv_ext_us_restrict_to = sapr3_knvv_ext_us_restrict_to;
	    }

	    public String getSapr3_knvv_kdgrp() {
	        return sapr3_knvv_kdgrp;
	    }

	    public void setSapr3_knvv_kdgrp(String sapr3_knvv_kdgrp) {
	        this.sapr3_knvv_kdgrp = sapr3_knvv_kdgrp;
	    }

	    public String getSapr3_knvv_kvgr1() {
	        return sapr3_knvv_kvgr1;
	    }

	    public void setSapr3_knvv_kvgr1(String sapr3_knvv_kvgr1) {
	        this.sapr3_knvv_kvgr1 = sapr3_knvv_kvgr1;
	    }

	    public String getSapr3_knvv_waers() {
	        return sapr3_knvv_waers;
	    }

	    public void setSapr3_knvv_waers(String sapr3_knvv_waers) {
	        this.sapr3_knvv_waers = sapr3_knvv_waers;
	    }

	    public String getSapr3_kunnr_ext_action_txt() {
	        return sapr3_kunnr_ext_action_txt;
	    }

	    public void setSapr3_kunnr_ext_action_txt(String sapr3_kunnr_ext_action_txt) {
	        this.sapr3_kunnr_ext_action_txt = sapr3_kunnr_ext_action_txt;
	    }

	    public String getSapr3_kunnr_ext_bill_text1() {
	        return sapr3_kunnr_ext_bill_text1;
	    }

	    public void setSapr3_kunnr_ext_bill_text1(String sapr3_kunnr_ext_bill_text1) {
	        this.sapr3_kunnr_ext_bill_text1 = sapr3_kunnr_ext_bill_text1;
	    }

	    public String getSapr3_kunnr_ext_bill_text2() {
	        return sapr3_kunnr_ext_bill_text2;
	    }

	    public void setSapr3_kunnr_ext_bill_text2(String sapr3_kunnr_ext_bill_text2) {
	        this.sapr3_kunnr_ext_bill_text2 = sapr3_kunnr_ext_bill_text2;
	    }

	    public String getSapr3_kunnr_ext_bp_mbr_lvl_type() {
	        return sapr3_kunnr_ext_bp_mbr_lvl_type;
	    }

	    public void setSapr3_kunnr_ext_bp_mbr_lvl_type(String sapr3_kunnr_ext_bp_mbr_lvl_type) {
	        this.sapr3_kunnr_ext_bp_mbr_lvl_type = sapr3_kunnr_ext_bp_mbr_lvl_type;
	    }

	    public String getSapr3_kunnr_ext_cmr_addr_rec_no() {
	        return sapr3_kunnr_ext_cmr_addr_rec_no;
	    }

	    public void setSapr3_kunnr_ext_cmr_addr_rec_no(String sapr3_kunnr_ext_cmr_addr_rec_no) {
	        this.sapr3_kunnr_ext_cmr_addr_rec_no = sapr3_kunnr_ext_cmr_addr_rec_no;
	    }

	    public String getSapr3_kunnr_ext_cmr_addr_rec_type() {
	        return sapr3_kunnr_ext_cmr_addr_rec_type;
	    }

	    public void setSapr3_kunnr_ext_cmr_addr_rec_type(String sapr3_kunnr_ext_cmr_addr_rec_type) {
	        this.sapr3_kunnr_ext_cmr_addr_rec_type = sapr3_kunnr_ext_cmr_addr_rec_type;
	    }

	    public String getSapr3_kunnr_ext_geo_loc_cd() {
	        return sapr3_kunnr_ext_geo_loc_cd;
	    }

	    public void setSapr3_kunnr_ext_geo_loc_cd(String sapr3_kunnr_ext_geo_loc_cd) {
	        this.sapr3_kunnr_ext_geo_loc_cd = sapr3_kunnr_ext_geo_loc_cd;
	    }

	    public String getSapr3_kunnr_ext_hangar() {
	        return sapr3_kunnr_ext_hangar;
	    }

	    public void setSapr3_kunnr_ext_hangar(String sapr3_kunnr_ext_hangar) {
	        this.sapr3_kunnr_ext_hangar = sapr3_kunnr_ext_hangar;
	    }

	    public String getSapr3_kunnr_ext_hw_instl_mstr_flg() {
	        return sapr3_kunnr_ext_hw_instl_mstr_flg;
	    }

	    public void setSapr3_kunnr_ext_hw_instl_mstr_flg(String sapr3_kunnr_ext_hw_instl_mstr_flg) {
	        this.sapr3_kunnr_ext_hw_instl_mstr_flg = sapr3_kunnr_ext_hw_instl_mstr_flg;
	    }

	    public String getSapr3_kunnr_ext_ibm_aml_cd() {
	        return sapr3_kunnr_ext_ibm_aml_cd;
	    }

	    public void setSapr3_kunnr_ext_ibm_aml_cd(String sapr3_kunnr_ext_ibm_aml_cd) {
	        this.sapr3_kunnr_ext_ibm_aml_cd = sapr3_kunnr_ext_ibm_aml_cd;
	    }

	    public String getSapr3_kunnr_ext_pier() {
	        return sapr3_kunnr_ext_pier;
	    }

	    public void setSapr3_kunnr_ext_pier(String sapr3_kunnr_ext_pier) {
	        this.sapr3_kunnr_ext_pier = sapr3_kunnr_ext_pier;
	    }

	    public String getSapr3_kunnr_ext_privacy_ind() {
	        return sapr3_kunnr_ext_privacy_ind;
	    }

	    public void setSapr3_kunnr_ext_privacy_ind(String sapr3_kunnr_ext_privacy_ind) {
	        this.sapr3_kunnr_ext_privacy_ind = sapr3_kunnr_ext_privacy_ind;
	    }

	    public String getSapr3_kunnr_ext_sales_force_id() {
	        return sapr3_kunnr_ext_sales_force_id;
	    }

	    public void setSapr3_kunnr_ext_sales_force_id(String sapr3_kunnr_ext_sales_force_id) {
	        this.sapr3_kunnr_ext_sales_force_id = sapr3_kunnr_ext_sales_force_id;
	    }

	    public String getSapr3_kunnr_ext_sc_account_id() {
	        return sapr3_kunnr_ext_sc_account_id;
	    }

	    public void setSapr3_kunnr_ext_sc_account_id(String sapr3_kunnr_ext_sc_account_id) {
	        this.sapr3_kunnr_ext_sc_account_id = sapr3_kunnr_ext_sc_account_id;
	    }

	    public String getSapr3_stxl_clustd_tdid9013() {
	        return sapr3_stxl_clustd_tdid9013;
	    }

	    public void setSapr3_stxl_clustd_tdid9013(String sapr3_stxl_clustd_tdid9013) {
	        this.sapr3_stxl_clustd_tdid9013 = sapr3_stxl_clustd_tdid9013;
	    }

	    public String getSapr3_us_bp_int_codes_bp_code() {
	        return sapr3_us_bp_int_codes_bp_code;
	    }

	    public void setSapr3_us_bp_int_codes_bp_code(String sapr3_us_bp_int_codes_bp_code) {
	        this.sapr3_us_bp_int_codes_bp_code = sapr3_us_bp_int_codes_bp_code;
	    }

	    public String getSapr3_us_bp_int_codes_bp_full_nm() {
	        return sapr3_us_bp_int_codes_bp_full_nm;
	    }

	    public void setSapr3_us_bp_int_codes_bp_full_nm(String sapr3_us_bp_int_codes_bp_full_nm) {
	        this.sapr3_us_bp_int_codes_bp_full_nm = sapr3_us_bp_int_codes_bp_full_nm;
	    }

	    public String getSapr3_us_company_comp_legal_name() {
	        return sapr3_us_company_comp_legal_name;
	    }

	    public void setSapr3_us_company_comp_legal_name(String sapr3_us_company_comp_legal_name) {
	        this.sapr3_us_company_comp_legal_name = sapr3_us_company_comp_legal_name;
	    }

	    public String getSapr3_us_company_comp_no() {
	        return sapr3_us_company_comp_no;
	    }

	    public void setSapr3_us_company_comp_no(String sapr3_us_company_comp_no) {
	        this.sapr3_us_company_comp_no = sapr3_us_company_comp_no;
	    }

	    public String getSapr3_us_company_ent_no() {
	        return sapr3_us_company_ent_no;
	    }

	    public void setSapr3_us_company_ent_no(String sapr3_us_company_ent_no) {
	        this.sapr3_us_company_ent_no = sapr3_us_company_ent_no;
	    }

	    public String getSapr3_us_enterprise_ent_legal_name() {
	        return sapr3_us_enterprise_ent_legal_name;
	    }

	    public void setSapr3_us_enterprise_ent_legal_name(String sapr3_us_enterprise_ent_legal_name) {
	        this.sapr3_us_enterprise_ent_legal_name = sapr3_us_enterprise_ent_legal_name;
	    }

	    public String getSapr3_us_enterprise_ent_type_code() {
	        return sapr3_us_enterprise_ent_type_code;
	    }

	    public void setSapr3_us_enterprise_ent_type_code(String sapr3_us_enterprise_ent_type_code) {
	        this.sapr3_us_enterprise_ent_type_code = sapr3_us_enterprise_ent_type_code;
	    }

	    public String getSapr3_us_gem_trans_gem_cd() {
	        return sapr3_us_gem_trans_gem_cd;
	    }

	    public void setSapr3_us_gem_trans_gem_cd(String sapr3_us_gem_trans_gem_cd) {
	        this.sapr3_us_gem_trans_gem_cd = sapr3_us_gem_trans_gem_cd;
	    }

	    public String getSapr3_us_restrict_codes_restrict_to_cd() {
	        return sapr3_us_restrict_codes_restrict_to_cd;
	    }

	    public void setSapr3_us_restrict_codes_restrict_to_cd(String sapr3_us_restrict_codes_restrict_to_cd) {
	        this.sapr3_us_restrict_codes_restrict_to_cd = sapr3_us_restrict_codes_restrict_to_cd;
	    }

	    public String getSapr3_us_restrict_codes_restrict_to_nm() {
	        return sapr3_us_restrict_codes_restrict_to_nm;
	    }

	    public void setSapr3_us_restrict_codes_restrict_to_nm(String sapr3_us_restrict_codes_restrict_to_nm) {
	        this.sapr3_us_restrict_codes_restrict_to_nm = sapr3_us_restrict_codes_restrict_to_nm;
	    }

	    public String getUsinterim_us_tax_data_c_icc_tax_class() {
	        return usinterim_us_tax_data_c_icc_tax_class;
	    }

	    public void setUsinterim_us_tax_data_c_icc_tax_class(String usinterim_us_tax_data_c_icc_tax_class) {
	        this.usinterim_us_tax_data_c_icc_tax_class = usinterim_us_tax_data_c_icc_tax_class;
	    }

	    public String getUsinterim_us_tax_data_c_icc_te() {
	        return usinterim_us_tax_data_c_icc_te;
	    }

	    public void setUsinterim_us_tax_data_c_icc_te(String usinterim_us_tax_data_c_icc_te) {
	        this.usinterim_us_tax_data_c_icc_te = usinterim_us_tax_data_c_icc_te;
	    }

	    public String getUsinterim_us_tax_data_c_scc() {
	        return usinterim_us_tax_data_c_scc;
	    }

	    public void setUsinterim_us_tax_data_c_scc(String usinterim_us_tax_data_c_scc) {
	        this.usinterim_us_tax_data_c_scc = usinterim_us_tax_data_c_scc;
	    }

	    public String getUsinterim_us_tax_data_c_te_cert_st_1() {
	        return usinterim_us_tax_data_c_te_cert_st_1;
	    }

	    public void setUsinterim_us_tax_data_c_te_cert_st_1(String usinterim_us_tax_data_c_te_cert_st_1) {
	        this.usinterim_us_tax_data_c_te_cert_st_1 = usinterim_us_tax_data_c_te_cert_st_1;
	    }

	    public String getUsinterim_us_tax_data_c_te_cert_st_2() {
	        return usinterim_us_tax_data_c_te_cert_st_2;
	    }

	    public void setUsinterim_us_tax_data_c_te_cert_st_2(String usinterim_us_tax_data_c_te_cert_st_2) {
	        this.usinterim_us_tax_data_c_te_cert_st_2 = usinterim_us_tax_data_c_te_cert_st_2;
	    }

	    public String getUsinterim_us_tax_data_c_te_cert_st_3() {
	        return usinterim_us_tax_data_c_te_cert_st_3;
	    }

	    public void setUsinterim_us_tax_data_c_te_cert_st_3(String usinterim_us_tax_data_c_te_cert_st_3) {
	        this.usinterim_us_tax_data_c_te_cert_st_3 = usinterim_us_tax_data_c_te_cert_st_3;
	    }

	    public String getUsinterim_us_tax_data_ea_status() {
	        return usinterim_us_tax_data_ea_status;
	    }

	    public void setUsinterim_us_tax_data_ea_status(String usinterim_us_tax_data_ea_status) {
	        this.usinterim_us_tax_data_ea_status = usinterim_us_tax_data_ea_status;
	    }

	    public String getUsinterim_us_tax_data_f_ocl() {
	        return usinterim_us_tax_data_f_ocl;
	    }

	    public void setUsinterim_us_tax_data_f_ocl(String usinterim_us_tax_data_f_ocl) {
	        this.usinterim_us_tax_data_f_ocl = usinterim_us_tax_data_f_ocl;
	    }

	    public String getUsinterim_us_tax_data_i_tax_class_1() {
	        return usinterim_us_tax_data_i_tax_class_1;
	    }

	    public void setUsinterim_us_tax_data_i_tax_class_1(String usinterim_us_tax_data_i_tax_class_1) {
	        this.usinterim_us_tax_data_i_tax_class_1 = usinterim_us_tax_data_i_tax_class_1;
	    }

	    public String getUsinterim_us_tax_data_i_tax_class_2() {
	        return usinterim_us_tax_data_i_tax_class_2;
	    }

	    public void setUsinterim_us_tax_data_i_tax_class_2(String usinterim_us_tax_data_i_tax_class_2) {
	        this.usinterim_us_tax_data_i_tax_class_2 = usinterim_us_tax_data_i_tax_class_2;
	    }

	    public String getUsinterim_us_tax_data_i_tax_class_3() {
	        return usinterim_us_tax_data_i_tax_class_3;
	    }

	    public void setUsinterim_us_tax_data_i_tax_class_3(String usinterim_us_tax_data_i_tax_class_3) {
	        this.usinterim_us_tax_data_i_tax_class_3 = usinterim_us_tax_data_i_tax_class_3;
	    }

	    public String getUsinterim_us_tax_data_i_type_cust_1() {
	        return usinterim_us_tax_data_i_type_cust_1;
	    }

	    public void setUsinterim_us_tax_data_i_type_cust_1(String usinterim_us_tax_data_i_type_cust_1) {
	        this.usinterim_us_tax_data_i_type_cust_1 = usinterim_us_tax_data_i_type_cust_1;
	    }

	    public String getUsinterim_us_tax_data_i_type_cust_2() {
	        return usinterim_us_tax_data_i_type_cust_2;
	    }

	    public void setUsinterim_us_tax_data_i_type_cust_2(String usinterim_us_tax_data_i_type_cust_2) {
	        this.usinterim_us_tax_data_i_type_cust_2 = usinterim_us_tax_data_i_type_cust_2;
	    }

	    public String getUsinterim_us_tax_data_i_type_cust_3() {
	        return usinterim_us_tax_data_i_type_cust_3;
	    }

	    public void setUsinterim_us_tax_data_i_type_cust_3(String usinterim_us_tax_data_i_type_cust_3) {
	        this.usinterim_us_tax_data_i_type_cust_3 = usinterim_us_tax_data_i_type_cust_3;
	    }

	    public String getSapr3_kna1_stcd1() {
	        return sapr3_kna1_stcd1;
	    }

	    public void setSapr3_kna1_stcd1(String sapr3_kna1_stcd1) {
	        this.sapr3_kna1_stcd1 = sapr3_kna1_stcd1;
	    }

	    public String getSapr3_kna1_lzone() {
	        return sapr3_kna1_lzone;
	    }

	    public void setSapr3_kna1_lzone(String sapr3_kna1_lzone) {
	        this.sapr3_kna1_lzone = sapr3_kna1_lzone;
	    }

	    public String getSapr3_stxl_clustd_tdid() {
	        return sapr3_stxl_clustd_tdid;
	    }

	    public void setSapr3_stxl_clustd_tdid(String sapr3_stxl_clustd_tdid) {
	        this.sapr3_stxl_clustd_tdid = sapr3_stxl_clustd_tdid;
	    }

	    public String getSapr3_knvl_ext_tax_exempt_reason() {
	        return sapr3_knvl_ext_tax_exempt_reason;
	    }

	    public void setSapr3_knvl_ext_tax_exempt_reason(String sapr3_knvl_ext_tax_exempt_reason) {
	        this.sapr3_knvl_ext_tax_exempt_reason = sapr3_knvl_ext_tax_exempt_reason;
	    }

	    public String getRow_access_id() {
	        return row_access_id;
	    }

	    public void setRow_access_id(String row_access_id) {
	        this.row_access_id = row_access_id;
	    }

	    public Timestamp getCreated_on() {
	        return created_on;
	    }

	    public void setCreated_on(Timestamp created_on) {
	        this.created_on = created_on;
	    }

	    public String getCreated_by() {
	        return created_by;
	    }

	    public void setCreated_by(String created_by) {
	        this.created_by = created_by;
	    }

	    public String getLast_update_action() {
	        return last_update_action;
	    }

	    public void setLast_update_action(String last_update_action) {
	        this.last_update_action = last_update_action;
	    }

	    public Timestamp getLast_updated_on() {
	        return last_updated_on;
	    }

	    public void setLast_updated_on(Timestamp last_updated_on) {
	        this.last_updated_on = last_updated_on;
	    }

	    public String getLast_updated_by() {
	        return last_updated_by;
	    }

	    public void setLast_updated_by(String last_updated_by) {
	        this.last_updated_by = last_updated_by;
	    }

	    public String getAddress_seq() {
	        return address_seq;
	    }

	    public void setAddress_seq(String address_seq) {
	        this.address_seq = address_seq;
	    }
	}
