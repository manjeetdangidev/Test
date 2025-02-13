package com.rdc.entity;

import java.sql.Timestamp;

public class Internal_id {
	
	private String instance;
	private String site_id;
	private String owning_entity;
	private String inac;
	private String nac;
	private String wallet_id;
	private String ceid;
	private String company_id;
	
	
	private String created_by;
	private String created_on;
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
	public String getOwning_entity() {
		return owning_entity;
	}
	public void setOwning_entity(String owning_entity) {
		this.owning_entity = owning_entity;
	}
	
	public String getInac() {
		return inac;
	}
	public void setInac(String inac) {
		this.inac = inac;
	}
	public String getNac() {
		return nac;
	}
	public void setNac(String nac) {
		this.nac = nac;
	}
	public String getWallet_id() {
		return wallet_id;
	}
	public void setWallet_id(String wallet_id) {
		this.wallet_id = wallet_id;
	}
	public String getCeid() {
		return ceid;
	}
	public void setCeid(String ceid) {
		this.ceid = ceid;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	public String getCreated_on() {
		return created_on;
	}
	public void setCreated_on(String created_on) {
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
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
}
