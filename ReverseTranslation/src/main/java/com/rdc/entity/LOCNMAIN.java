package com.rdc.entity;

import java.sql.Timestamp;
import java.util.Date;

public class LOCNMAIN {

	private String instance;
	private String site_id;
	private String customer_role_flg;
	private String ecosyst_role_flg;
	private String vendor_role_flg;
	private String locn_name_id;
	private String locn_addr_id;
	private String locn_ids_rowid;
	private String owning_entity;
	private String logical_delete_indicator;
	private String dpl_status;
	private String stc_flag;
	private String goe_indicator;
	private String goe_reason;
	private Date goe_exp_date;
	private String row_access_id;
	private String created_by;
	private Timestamp created_on;
	private String last_update_action;
	private String last_updated_by;
	private Timestamp last_updated_on;
	
	

	public String getInstance() {
		return instance;
	}



	public void setInstance(String instance) {
		this.instance = instance;
	}



	public String getSite_id() {
		return site_id;
	}



	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}



	public String getCustomer_role_flg() {
		return customer_role_flg;
	}



	public void setCustomer_role_flg(String customer_role_flg) {
		this.customer_role_flg = customer_role_flg;
	}



	public String getEcosyst_role_flg() {
		return ecosyst_role_flg;
	}



	public void setEcosyst_role_flg(String ecosyst_role_flg) {
		this.ecosyst_role_flg = ecosyst_role_flg;
	}



	public String getVendor_role_flg() {
		return vendor_role_flg;
	}



	public void setVendor_role_flg(String vendor_role_flg) {
		this.vendor_role_flg = vendor_role_flg;
	}



	public String getLocn_name_id() {
		return locn_name_id;
	}



	public void setLocn_name_id(String locn_name_id) {
		this.locn_name_id = locn_name_id;
	}



	public String getLocn_addr_id() {
		return locn_addr_id;
	}



	public void setLocn_addr_id(String locn_addr_id) {
		this.locn_addr_id = locn_addr_id;
	}



	public String getLocn_ids_rowid() {
		return locn_ids_rowid;
	}



	public void setLocn_ids_rowid(String locn_ids_rowid) {
		this.locn_ids_rowid = locn_ids_rowid;
	}



	public String getOwning_entity() {
		return owning_entity;
	}



	public void setOwning_entity(String owning_entity) {
		this.owning_entity = owning_entity;
	}



	public String getLogical_delete_indicator() {
		return logical_delete_indicator;
	}



	public void setLogical_delete_indicator(String logical_delete_indicator) {
		this.logical_delete_indicator = logical_delete_indicator;
	}



	public String getDpl_status() {
		return dpl_status;
	}



	public void setDpl_status(String dpl_status) {
		this.dpl_status = dpl_status;
	}



	public String getStc_flag() {
		return stc_flag;
	}



	public void setStc_flag(String stc_flag) {
		this.stc_flag = stc_flag;
	}



	public String getGoe_indicator() {
		return goe_indicator;
	}



	public void setGoe_indicator(String goe_indicator) {
		this.goe_indicator = goe_indicator;
	}



	public String getGoe_reason() {
		return goe_reason;
	}



	public void setGoe_reason(String goe_reason) {
		this.goe_reason = goe_reason;
	}



	public Date getGoe_exp_date() {
		return goe_exp_date;
	}



	public void setGoe_exp_date(Date goe_exp_date) {
		this.goe_exp_date = goe_exp_date;
	}



	public String getRow_access_id() {
		return row_access_id;
	}



	public void setRow_access_id(String row_access_id) {
		this.row_access_id = row_access_id;
	}



	public String getCreated_by() {
		return created_by;
	}



	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}



	public Timestamp getCreated_on() {
		return created_on;
	}



	public void setCreated_on(Timestamp timestamp_createdOn) {
		this.created_on = timestamp_createdOn;
	}



	public String getLast_update_action() {
		return last_update_action;
	}



	public void setLast_update_action(String last_update_action) {
		this.last_update_action = last_update_action;
	}



	public String getLast_updated_by() {
		return last_updated_by;
	}



	public void setLast_updated_by(String last_updated_by) {
		this.last_updated_by = last_updated_by;
	}



	public Timestamp getLast_updated_on() {
		return last_updated_on;
	}



	public void setLast_updated_on(Timestamp last_updated_on) {
		this.last_updated_on = last_updated_on;
	}



	@Override
	public String toString() {
		return "T_LOCNMAIN [instance=" + instance + ", site_id=" + site_id + ", customer_role_flg=" + customer_role_flg
				+ ", ecosyst_role_flg=" + ecosyst_role_flg + ", vendor_role_flg=" + vendor_role_flg + ", locn_name_id="
				+ locn_name_id + ", locn_addr_id=" + locn_addr_id + ", locn_ids_rowid=" + locn_ids_rowid
				+ ", owning_entity=" + owning_entity + ", logical_delete_indicator=" + logical_delete_indicator
				+ ", dpl_status=" + dpl_status + ", stc_flag=" + stc_flag + ", goe_indicator=" + goe_indicator
				+ ", goe_reason=" + goe_reason + ", goe_exp_date=" + goe_exp_date + ", row_access_id=" + row_access_id
				+ ", created_by=" + created_by + ", created_on=" + created_on + ", last_update_action="
				+ last_update_action + ", last_updated_by=" + last_updated_by + ", last_updated_on=" + last_updated_on
				+ "]";
	}



	
}