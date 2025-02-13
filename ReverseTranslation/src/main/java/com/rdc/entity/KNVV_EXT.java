package com.rdc.entity;

import java.sql.Timestamp;

public class KNVV_EXT {

	private String mandt;
    private String kunnr;
    private String vkorg;
    private String vtweg;
    private String spart;
    private String cso_site;
    private String cust_type_2;
    private String cust_type_3;
    private String misc_billing;
    private String mktg_area;
    private String mktg_ar_dept;
    private String mktg_dept;
    private String org_mktg_br_ofc;
    private String pcc_ar_bo;
    private String pcc_mktg_bo;
    private String us_restrict_to;
    private String svc_ar_ofc;
    private String svc_lgsys_ofc;
    private String svc_smsys_ofc;
    private String svc_oth_ofc;
    private String acct_recv_bo;
    private String mktg_bo;
    
    private String mktg_resp_cd;
    private String install_bo_grp;
    private String install_bo_num;
    private String selling_bo_grp;
    private String selling_bo_num;
    private String ce_grp;
    private String crs_id_code;
    private String cust_set;
    private String loevm;
    private String created_by;
    private Timestamp create_dt;
    private String updated_by;
    private Timestamp update_dt;
    private String update_type;
    private String cust_credit_cd;
    private String svc_master_bo;
    private String bo_division;
    private String bo_trading_area;
    private String non_ibm_comp_ind;
    private String oem_ind;
    private String collbo;
    private String proxi_locn;
    private String channel_cd;
    private String jp_taiga_cd;

    // Constructor with blank values
    public KNVV_EXT() {
    	this.mandt="";
    	this.kunnr="";
    	this.vkorg="";
    	this.vtweg="";
    	this.spart="";
    	this.cso_site="";
    	this.cust_type_2="";
    	this.cust_type_3="";
    	this.misc_billing="";
    	this.mktg_area="";
    	this.mktg_ar_dept="";
    	this.mktg_dept="";
    	this.org_mktg_br_ofc="";
    	this.pcc_ar_bo="";
    	this.pcc_mktg_bo="";
    	this.us_restrict_to="";
    	this.svc_ar_ofc="";
    	this.svc_lgsys_ofc="";
    	this.svc_smsys_ofc="";
    	this.svc_oth_ofc="";
    	this.acct_recv_bo="";
    	this.mktg_bo="";    
    	this.mktg_resp_cd="";
    	this.install_bo_grp="";
    	this.install_bo_num="";
    	this.selling_bo_grp="";
    	this.selling_bo_num="";
    	this.ce_grp="";
    	this.crs_id_code="";
    	this.cust_set="";
    	this.loevm="";
    	this.created_by="";
    	this.create_dt=new java.sql.Timestamp(System.currentTimeMillis());
    	this.updated_by="";
    	this.update_dt=new java.sql.Timestamp(System.currentTimeMillis());
    	this.update_type="";
    	this.cust_credit_cd="";
    	this.svc_master_bo="";
    	this.bo_division="";
    	this.bo_trading_area="";
    	this.non_ibm_comp_ind="";
    	this.oem_ind="";
    	this.collbo="";
    	this.proxi_locn="";
    	this.channel_cd="";
    	this.jp_taiga_cd="";
        
        
    }

	public String getMandt() {
		return mandt;
	}

	public void setMandt(String mandt) {
		this.mandt = mandt;
	}

	public String getKunnr() {
		return kunnr;
	}

	public void setKunnr(String kunnr) {
		this.kunnr = kunnr;
	}

	public String getVkorg() {
		return vkorg;
	}

	public void setVkorg(String vkorg) {
		this.vkorg = vkorg;
	}

	public String getVtweg() {
		return vtweg;
	}

	public void setVtweg(String vtweg) {
		this.vtweg = vtweg;
	}

	public String getSpart() {
		return spart;
	}

	public void setSpart(String spart) {
		this.spart = spart;
	}

	public String getCso_site() {
		return cso_site;
	}

	public void setCso_site(String cso_site) {
		this.cso_site = cso_site;
	}

	public String getCust_type_2() {
		return cust_type_2;
	}

	public void setCust_type_2(String cust_type_2) {
		this.cust_type_2 = cust_type_2;
	}

	public String getCust_type_3() {
		return cust_type_3;
	}

	public void setCust_type_3(String cust_type_3) {
		this.cust_type_3 = cust_type_3;
	}

	public String getMisc_billing() {
		return misc_billing;
	}

	public void setMisc_billing(String misc_billing) {
		this.misc_billing = misc_billing;
	}

	public String getMktg_area() {
		return mktg_area;
	}

	public void setMktg_area(String mktg_area) {
		this.mktg_area = mktg_area;
	}

	public String getMktg_ar_dept() {
		return mktg_ar_dept;
	}

	public void setMktg_ar_dept(String mktg_ar_dept) {
		this.mktg_ar_dept = mktg_ar_dept;
	}

	public String getMktg_dept() {
		return mktg_dept;
	}

	public void setMktg_dept(String mktg_dept) {
		this.mktg_dept = mktg_dept;
	}

	public String getOrg_mktg_br_ofc() {
		return org_mktg_br_ofc;
	}

	public void setOrg_mktg_br_ofc(String org_mktg_br_ofc) {
		this.org_mktg_br_ofc = org_mktg_br_ofc;
	}

	public String getPcc_ar_bo() {
		return pcc_ar_bo;
	}

	public void setPcc_ar_bo(String pcc_ar_bo) {
		this.pcc_ar_bo = pcc_ar_bo;
	}

	public String getPcc_mktg_bo() {
		return pcc_mktg_bo;
	}

	public void setPcc_mktg_bo(String pcc_mktg_bo) {
		this.pcc_mktg_bo = pcc_mktg_bo;
	}

	public String getUs_restrict_to() {
		return us_restrict_to;
	}

	public void setUs_restrict_to(String us_restrict_to) {
		this.us_restrict_to = us_restrict_to;
	}

	public String getSvc_ar_ofc() {
		return svc_ar_ofc;
	}

	public void setSvc_ar_ofc(String svc_ar_ofc) {
		this.svc_ar_ofc = svc_ar_ofc;
	}

	public String getSvc_lgsys_ofc() {
		return svc_lgsys_ofc;
	}

	public void setSvc_lgsys_ofc(String svc_lgsys_ofc) {
		this.svc_lgsys_ofc = svc_lgsys_ofc;
	}

	public String getSvc_smsys_ofc() {
		return svc_smsys_ofc;
	}

	public void setSvc_smsys_ofc(String svc_smsys_ofc) {
		this.svc_smsys_ofc = svc_smsys_ofc;
	}

	public String getSvc_oth_ofc() {
		return svc_oth_ofc;
	}

	public void setSvc_oth_ofc(String svc_oth_ofc) {
		this.svc_oth_ofc = svc_oth_ofc;
	}

	public String getAcct_recv_bo() {
		return acct_recv_bo;
	}

	public void setAcct_recv_bo(String acct_recv_bo) {
		this.acct_recv_bo = acct_recv_bo;
	}

	public String getMktg_bo() {
		return mktg_bo;
	}

	public void setMktg_bo(String mktg_bo) {
		this.mktg_bo = mktg_bo;
	}

	public String getMktg_resp_cd() {
		return mktg_resp_cd;
	}

	public void setMktg_resp_cd(String mktg_resp_cd) {
		this.mktg_resp_cd = mktg_resp_cd;
	}

	public String getInstall_bo_grp() {
		return install_bo_grp;
	}

	public void setInstall_bo_grp(String install_bo_grp) {
		this.install_bo_grp = install_bo_grp;
	}

	public String getInstall_bo_num() {
		return install_bo_num;
	}

	public void setInstall_bo_num(String install_bo_num) {
		this.install_bo_num = install_bo_num;
	}

	public String getSelling_bo_grp() {
		return selling_bo_grp;
	}

	public void setSelling_bo_grp(String selling_bo_grp) {
		this.selling_bo_grp = selling_bo_grp;
	}

	public String getSelling_bo_num() {
		return selling_bo_num;
	}

	public void setSelling_bo_num(String selling_bo_num) {
		this.selling_bo_num = selling_bo_num;
	}

	public String getCe_grp() {
		return ce_grp;
	}

	public void setCe_grp(String ce_grp) {
		this.ce_grp = ce_grp;
	}

	public String getCrs_id_code() {
		return crs_id_code;
	}

	public void setCrs_id_code(String crs_id_code) {
		this.crs_id_code = crs_id_code;
	}

	public String getCust_set() {
		return cust_set;
	}

	public void setCust_set(String cust_set) {
		this.cust_set = cust_set;
	}

	public String getLoevm() {
		return loevm;
	}

	public void setLoevm(String loevm) {
		this.loevm = loevm;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public Timestamp getCreate_dt() {
		return create_dt;
	}

	public void setCreate_dt(Timestamp create_dt) {
		this.create_dt = create_dt;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public Timestamp getUpdate_dt() {
		return update_dt;
	}

	public void setUpdate_dt(Timestamp update_dt) {
		this.update_dt = update_dt;
	}

	public String getUpdate_type() {
		return update_type;
	}

	public void setUpdate_type(String update_type) {
		this.update_type = update_type;
	}

	public String getCust_credit_cd() {
		return cust_credit_cd;
	}

	public void setCust_credit_cd(String cust_credit_cd) {
		this.cust_credit_cd = cust_credit_cd;
	}

	public String getSvc_master_bo() {
		return svc_master_bo;
	}

	public void setSvc_master_bo(String svc_master_bo) {
		this.svc_master_bo = svc_master_bo;
	}

	public String getBo_division() {
		return bo_division;
	}

	public void setBo_division(String bo_division) {
		this.bo_division = bo_division;
	}

	public String getBo_trading_area() {
		return bo_trading_area;
	}

	public void setBo_trading_area(String bo_trading_area) {
		this.bo_trading_area = bo_trading_area;
	}

	public String getNon_ibm_comp_ind() {
		return non_ibm_comp_ind;
	}

	public void setNon_ibm_comp_ind(String non_ibm_comp_ind) {
		this.non_ibm_comp_ind = non_ibm_comp_ind;
	}

	public String getOem_ind() {
		return oem_ind;
	}

	public void setOem_ind(String oem_ind) {
		this.oem_ind = oem_ind;
	}

	public String getCollbo() {
		return collbo;
	}

	public void setCollbo(String collbo) {
		this.collbo = collbo;
	}

	public String getProxi_locn() {
		return proxi_locn;
	}

	public void setProxi_locn(String proxi_locn) {
		this.proxi_locn = proxi_locn;
	}

	public String getChannel_cd() {
		return channel_cd;
	}

	public void setChannel_cd(String channel_cd) {
		this.channel_cd = channel_cd;
	}

	public String getJp_taiga_cd() {
		return jp_taiga_cd;
	}

	public void setJp_taiga_cd(String jp_taiga_cd) {
		this.jp_taiga_cd = jp_taiga_cd;
	}

   
   
}
