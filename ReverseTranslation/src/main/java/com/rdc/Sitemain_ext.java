package com.rdc;
import java.sql.Timestamp;

/**
 * The persistent class for the T_SITEMAIN_EXT database table.
 * 
 */

public class Sitemain_ext  {
	

	private String instance;

	private String site_Id;

	private String siteExt_Id;

	private String address_type;

	private String authorizationGroup;

	private String created_by;

	private String created_on;

	private String customer_class;

	private String issuing_country;

	private String lastUpdateAction;

	private String last_updated_by;

	private Timestamp last_updated_on;

	private String logicalDeleteIndicator;

	private String owning_Entity;

	private String sales_off;

	private String sales_org;

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	

	public String getAuthorizationGroup() {
		return authorizationGroup;
	}

	public void setAuthorizationGroup(String authorizationGroup) {
		this.authorizationGroup = authorizationGroup;
	}

	

	public String getLastUpdateAction() {
		return lastUpdateAction;
	}

	public void setLastUpdateAction(String lastUpdateAction) {
		this.lastUpdateAction = lastUpdateAction;
	}

	public String getLastUpdatedBy() {
		return last_updated_by;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.last_updated_by = lastUpdatedBy;
	}

	

	public String getLogicalDeleteIndicator() {
		return logicalDeleteIndicator;
	}

	public void setLogicalDeleteIndicator(String logicalDeleteIndicator) {
		this.logicalDeleteIndicator = logicalDeleteIndicator;
	}

	

	public String getSales_off() {
		return sales_off;
	}

	public void setSales_off(String sales_off) {
		this.sales_off = sales_off;
	}

	public String getSales_org() {
		return sales_org;
	}

	public void setSalesOrg(String sales_org) {
		this.sales_org = sales_org;
	}

	
	

	public String getSite_Id() {
		return site_Id;
	}

	public void setSite_Id(String site_Id) {
		this.site_Id = site_Id;
	}

	public String getSiteExt_Id() {
		return siteExt_Id;
	}

	public void setSiteExt_Id(String siteExt_Id) {
		this.siteExt_Id = siteExt_Id;
	}

	

	public Sitemain_ext(String instance, String site_Id, String siteExt_Id, String address_type,
			String authorizationGroup, String created_by, String created_on, String customer_class,
			String issuing_country, String lastUpdateAction, String last_updated_by, Timestamp last_updated_on,
			String logicalDeleteIndicator, String owning_Entity, String sales_off, String sales_org) {
		super();
		this.instance = instance;
		this.site_Id = site_Id;
		this.siteExt_Id = siteExt_Id;
		this.address_type = address_type;
		this.authorizationGroup = authorizationGroup;
		this.created_by = created_by;
		this.created_on = created_on;
		this.customer_class = customer_class;
		this.issuing_country = issuing_country;
		this.lastUpdateAction = lastUpdateAction;
		this.last_updated_by = last_updated_by;
		this.last_updated_on = last_updated_on;
		this.logicalDeleteIndicator = logicalDeleteIndicator;
		this.owning_Entity = owning_Entity;
		this.sales_off = sales_off;
		this.sales_org = sales_org;
	}

	public String getAddress_type() {
		return address_type;
	}

	public void setAddress_type(String address_type) {
		this.address_type = address_type;
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

	public String getCustomer_class() {
		return customer_class;
	}

	public void setCustomer_class(String customer_class) {
		this.customer_class = customer_class;
	}

	public String getIssuing_country() {
		return issuing_country;
	}

	public void setIssuing_country(String issuing_country) {
		this.issuing_country = issuing_country;
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

	public void setSales_org(String sales_org) {
		this.sales_org = sales_org;
	}

	public String getOwning_Entity() {
		return owning_Entity;
	}

	public void setOwning_Entity(String owning_Entity) {
		this.owning_Entity = owning_Entity;
	}

	public Sitemain_ext() {}

	}
