package com.rdc.entity;

import java.sql.Timestamp;

public class Custmain {
	
	private String instance;
	private String site_id;
	private String owning_entity;
	private String logical_delete_indicator;
	private String order_block;
	private String billing_block;
	private String delivery_block;
	private String coverage_eligible_indicator;
	private String cap_indicator;
	
	public String getCap_indicator() {
		return cap_indicator;
	}
	public void setCap_indicator(String cap_indicator) {
		this.cap_indicator = cap_indicator;
	}
	private String row_access_id;
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
	public String getLogical_delete_indicator() {
		return logical_delete_indicator;
	}
	public void setLogical_delete_indicator(String logical_delete_indicator) {
		this.logical_delete_indicator = logical_delete_indicator;
	}
	public String getOrder_block() {
		return order_block;
	}
	public void setOrder_block(String order_block) {
		this.order_block = order_block;
	}
	public String getBilling_block() {
		return billing_block;
	}
	public void setBilling_block(String billing_block) {
		this.billing_block = billing_block;
	}
	public String getDelivery_block() {
		return delivery_block;
	}
	public void setDelivery_block(String delivery_block) {
		this.delivery_block = delivery_block;
	}
	public String getCoverage_eligible_indicator() {
		return coverage_eligible_indicator;
	}
	public void setCoverage_eligible_indicator(String coverage_eligible_indicator) {
		this.coverage_eligible_indicator = coverage_eligible_indicator;
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

}
