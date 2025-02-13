package com.rdc.entity;

import java.util.Date;
import java.sql.Timestamp;

public class KUNNR_EXT {

    private String kunnr;
    private String mandt;
    private String goe_ind;
    private String goe_src_cd;
    private String goe_rsn_cd;
    private String privacy_ind;
    private String ibm_aml_cd;
    private String cap_ind;
    private String geo_loc_cd;
    private String building;
    private String floor;
    private String front;
    private String hangar;
    private String lobby;
    private String lot;
    private String lower;
    private String office;
    private String penthouse;
    private String pier;
    private String rear;
    private String room;
    private String suite;
    private String bill_text1;
    private String bill_text2;
    private String update_ind;
    private Timestamp create_ts;
    private Timestamp update_ts;
    private String create_user;
    private String update_user;
    private String cmr_addr_rec_no;
    private String cmr_addr_rec_type;
    private String department;
    private String bp_mbr_lvl_type;
    private Date goe_exp_date;
    private String action_txt;
    private String sc_account_id;
    private String bus_cmr_name;
    private String sadr_bus_cmr_name;
    private String lang_cd;
    private String comments;
    private String sadr_lang_cd;
    private String cov_elg_ind;
    private String sales_force_id;
    private String hw_instl_mstr_flg;
    private String ext_wallet_id;
    private String vat_ind;

	public KUNNR_EXT() {
		super();
		this.kunnr="";
		this.mandt="";
		this.goe_ind="";
		this.goe_src_cd="";
		this.goe_rsn_cd="";
		this.privacy_ind="";
		this.ibm_aml_cd="";
		this.cap_ind="";
		this.geo_loc_cd="";
		this.building="";
		this.floor="";
		this.front="";
		this.hangar="";
		this.lobby="";
		this.lot="";
		this.lower="";
		this.office="";
		this.penthouse="";
		this.pier="";
		this.rear="";
		this.room="";
		this.suite="";
		this.bill_text1="";
		this.bill_text2="";
		this.update_ind="";
		this.create_ts=new java.sql.Timestamp(System.currentTimeMillis());
		this.update_ts=new java.sql.Timestamp(System.currentTimeMillis());
		this.create_user="";
		this.update_user="";
		this.cmr_addr_rec_no="";
		this.cmr_addr_rec_type="";
		this.department="";
		this.bp_mbr_lvl_type="";
		this.goe_exp_date=new java.sql.Timestamp(System.currentTimeMillis());
		this.action_txt="";
		this.sc_account_id="";
		this.bus_cmr_name="";
		this.sadr_bus_cmr_name="";
		this.lang_cd="";
		this.comments="";
		this.sadr_lang_cd="";
		this.cov_elg_ind="";
		this.sales_force_id="";
		this.hw_instl_mstr_flg="";
		this.ext_wallet_id="";
		this.vat_ind="";
		
		
	}

	public String getKunnr() {
		return kunnr;
	}

	public void setKunnr(String kunnr) {
		this.kunnr = kunnr;
	}

	public String getMandt() {
		return mandt;
	}

	public void setMandt(String mandt) {
		this.mandt = mandt;
	}

	public String getGoe_ind() {
		return goe_ind;
	}

	public void setGoe_ind(String goe_ind) {
		this.goe_ind = goe_ind;
	}

	public String getGoe_src_cd() {
		return goe_src_cd;
	}

	public void setGoe_src_cd(String goe_src_cd) {
		this.goe_src_cd = goe_src_cd;
	}

	public String getGoe_rsn_cd() {
		return goe_rsn_cd;
	}

	public void setGoe_rsn_cd(String goe_rsn_cd) {
		this.goe_rsn_cd = goe_rsn_cd;
	}

	public String getPrivacy_ind() {
		return privacy_ind;
	}

	public void setPrivacy_ind(String privacy_ind) {
		this.privacy_ind = privacy_ind;
	}

	public String getIbm_aml_cd() {
		return ibm_aml_cd;
	}

	public void setIbm_aml_cd(String ibm_aml_cd) {
		this.ibm_aml_cd = ibm_aml_cd;
	}

	public String getCap_ind() {
		return cap_ind;
	}

	public void setCap_ind(String cap_ind) {
		this.cap_ind = cap_ind;
	}

	public String getGeo_loc_cd() {
		return geo_loc_cd;
	}

	public void setGeo_loc_cd(String geo_loc_cd) {
		this.geo_loc_cd = geo_loc_cd;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getFront() {
		return front;
	}

	public void setFront(String front) {
		this.front = front;
	}

	public String getHangar() {
		return hangar;
	}

	public void setHangar(String hangar) {
		this.hangar = hangar;
	}

	public String getLobby() {
		return lobby;
	}

	public void setLobby(String lobby) {
		this.lobby = lobby;
	}

	public String getLot() {
		return lot;
	}

	public void setLot(String lot) {
		this.lot = lot;
	}

	public String getLower() {
		return lower;
	}

	public void setLower(String lower) {
		this.lower = lower;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getPenthouse() {
		return penthouse;
	}

	public void setPenthouse(String penthouse) {
		this.penthouse = penthouse;
	}

	public String getPier() {
		return pier;
	}

	public void setPier(String pier) {
		this.pier = pier;
	}

	public String getRear() {
		return rear;
	}

	public void setRear(String rear) {
		this.rear = rear;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite;
	}

	public String getBill_text1() {
		return bill_text1;
	}

	public void setBill_text1(String bill_text1) {
		this.bill_text1 = bill_text1;
	}

	public String getBill_text2() {
		return bill_text2;
	}

	public void setBill_text2(String bill_text2) {
		this.bill_text2 = bill_text2;
	}

	public String getUpdate_ind() {
		return update_ind;
	}

	public void setUpdate_ind(String update_ind) {
		this.update_ind = update_ind;
	}

	public Timestamp getCreate_ts() {
		return create_ts;
	}

	public void setCreate_ts(Timestamp create_ts) {
		this.create_ts = create_ts;
	}

	public Timestamp getUpdate_ts() {
		return update_ts;
	}

	public void setUpdate_ts(Timestamp update_ts) {
		this.update_ts = update_ts;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public String getUpdate_user() {
		return update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	public String getCmr_addr_rec_no() {
		return cmr_addr_rec_no;
	}

	public void setCmr_addr_rec_no(String cmr_addr_rec_no) {
		this.cmr_addr_rec_no = cmr_addr_rec_no;
	}

	public String getCmr_addr_rec_type() {
		return cmr_addr_rec_type;
	}

	public void setCmr_addr_rec_type(String cmr_addr_rec_type) {
		this.cmr_addr_rec_type = cmr_addr_rec_type;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getBp_mbr_lvl_type() {
		return bp_mbr_lvl_type;
	}

	public void setBp_mbr_lvl_type(String bp_mbr_lvl_type) {
		this.bp_mbr_lvl_type = bp_mbr_lvl_type;
	}

	public Date getGoe_exp_date() {
		return goe_exp_date;
	}

	public void setGoe_exp_date(Date goe_exp_date) {
		this.goe_exp_date = goe_exp_date;
	}

	public String getAction_txt() {
		return action_txt;
	}

	public void setAction_txt(String action_txt) {
		this.action_txt = action_txt;
	}

	public String getSc_account_id() {
		return sc_account_id;
	}

	public void setSc_account_id(String sc_account_id) {
		this.sc_account_id = sc_account_id;
	}

	public String getBus_cmr_name() {
		return bus_cmr_name;
	}

	public void setBus_cmr_name(String bus_cmr_name) {
		this.bus_cmr_name = bus_cmr_name;
	}

	public String getSadr_bus_cmr_name() {
		return sadr_bus_cmr_name;
	}

	public void setSadr_bus_cmr_name(String sadr_bus_cmr_name) {
		this.sadr_bus_cmr_name = sadr_bus_cmr_name;
	}

	public String getLang_cd() {
		return lang_cd;
	}

	public void setLang_cd(String lang_cd) {
		this.lang_cd = lang_cd;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSadr_lang_cd() {
		return sadr_lang_cd;
	}

	public void setSadr_lang_cd(String sadr_lang_cd) {
		this.sadr_lang_cd = sadr_lang_cd;
	}

	public String getCov_elg_ind() {
		return cov_elg_ind;
	}

	public void setCov_elg_ind(String cov_elg_ind) {
		this.cov_elg_ind = cov_elg_ind;
	}

	public String getSales_force_id() {
		return sales_force_id;
	}

	public void setSales_force_id(String sales_force_id) {
		this.sales_force_id = sales_force_id;
	}

	public String getHw_instl_mstr_flg() {
		return hw_instl_mstr_flg;
	}

	public void setHw_instl_mstr_flg(String hw_instl_mstr_flg) {
		this.hw_instl_mstr_flg = hw_instl_mstr_flg;
	}

	public String getExt_wallet_id() {
		return ext_wallet_id;
	}

	public void setExt_wallet_id(String ext_wallet_id) {
		this.ext_wallet_id = ext_wallet_id;
	}

	public String getVat_ind() {
		return vat_ind;
	}

	public void setVat_ind(String vat_ind) {
		this.vat_ind = vat_ind;
	}

	
}