package com.rdc.entity;

import java.sql.Timestamp;

public class Cust_cmr_xref {
	
	private String instance;
	private String site_id;
	private String ierp_site_id;
	private String kunnr;
	private String primary_flag;
	private String address_type;
	private String issuing_country;
	private String cmr_no;
	private String sequence_no;
	private String logical_delete_indicator;
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
	public String getIerp_site_id() {
		return ierp_site_id;
	}
	public void setIerp_site_id(String ierp_site_id) {
		this.ierp_site_id = ierp_site_id;
	}
	public String getKunnr() {
		return kunnr;
	}
	public void setKunnr(String kunnr) {
		this.kunnr = kunnr;
	}
	public String getPrimary_flag() {
		return primary_flag;
	}
	public void setPrimary_flag(String primary_flag) {
		this.primary_flag = primary_flag;
	}
	public String getAddress_type() {
		return address_type;
	}
	public void setAddress_type(String address_type) {
		this.address_type = address_type;
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
	public String getSequence_no() {
		return sequence_no;
	}
	public void setSequence_no(String sequence_no) {
		this.sequence_no = sequence_no;
	}
	public String getLogical_delete_indicator() {
		return logical_delete_indicator;
	}
	public void setLogical_delete_indicator(String logical_delete_indicator) {
		this.logical_delete_indicator = logical_delete_indicator;
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
	public void setCreated_on(Timestamp created_on) {
		this.created_on = created_on;
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
	public Cust_cmr_xref() {
		super();
		this.instance="";
		this.site_id="";
		this.ierp_site_id="";
		this.kunnr="";
		this.primary_flag="";
		this.address_type="";
		this.issuing_country="";
		this.cmr_no="";
		this.sequence_no="";
		this.logical_delete_indicator="";
		this.created_by="";
		this.created_on=new java.sql.Timestamp(System.currentTimeMillis());
		this.last_update_action="";
		this.last_updated_by="";
		this.last_updated_on=new java.sql.Timestamp(System.currentTimeMillis());
		
	}
		
	

}
