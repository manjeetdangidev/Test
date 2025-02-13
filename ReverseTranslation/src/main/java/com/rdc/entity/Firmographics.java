package com.rdc.entity;

import java.sql.Timestamp;

public class Firmographics {

	private String instance;
	private String site_id;
	private String owning_entity;
	private String industry;
	private String industry_category;
	private String geo_ind;
	private String sic;
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
	
	public String getIndustry() {
		return industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getIndustry_category() {
		return industry_category;
	}
	public void setIndustry_category(String industry_category) {
		this.industry_category = industry_category;
	}
	public String getGeo_ind() {
		return geo_ind;
	}
	public void setGeo_ind(String geo_ind) {
		this.geo_ind = geo_ind;
	}
	public String getSic() {
		return sic;
	}
	public void setSic(String sic) {
		this.sic = sic;
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
