package com.rdc;


import java.sql.Date;
import java.sql.Timestamp;

public class Sitemain {
	
	private String instance;

	private String site_id;

	public String getInstance() {
		return instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	

	private String billing_Block;

	private String capIndicator;

	private String coverageEligibleIndicator;

	private String created_by;

	private String created_on;

	private String delivery_block;

	private String dplStatus;

	private Date goeExpDate;

	private String goe_indicator;

	private String goeReason;

	private String last_update_action;

	private String last_updated_by;

	private Timestamp last_updated_on;

	private String logical_delete_indicator;

	private String order_block;

	private String owning_entity;

	private String stcFlag;

	public Sitemain() {
	}

	

	

	public String getCapIndicator() {
		return this.capIndicator;
	}

	public void setCapIndicator(String capIndicator) {
		this.capIndicator = capIndicator;
	}

	public String getCoverageEligibleIndicator() {
		return this.coverageEligibleIndicator;
	}

	public void setCoverageEligibleIndicator(String coverageEligibleIndicator) {
		this.coverageEligibleIndicator = coverageEligibleIndicator;
	}

	public String getDpl_status() {
		return this.dplStatus;
	}

	public void setDplStatus(String dplStatus) {
		this.dplStatus = dplStatus;
	}

	public Date getGoeExpDate() {
		return this.goeExpDate;
	}

	public void setGoeExpDate(Date goeExpDate) {
		this.goeExpDate = goeExpDate;
	}

	public String getGoeReason() {
		return this.goeReason;
	}

	public void setGoeReason(String goeReason) {
		this.goeReason = goeReason;
	}

	public String getStcFlag() {
		return this.stcFlag;
	}

	

	public String getSite_id() {
		return site_id;
	}

	public void setSite_id(String site_id) {
		this.site_id = site_id;
	}

	public String getBilling_block() {
		return billing_Block;
	}

	public void setBilling_block(String billing_Block) {
		this.billing_Block = billing_Block;
	}

	
	public String get_Logicaldelete_indicator() {
		return logical_delete_indicator;
	}

	public void setLogicaldelete_indicator(String logicaldelete_indicator) {
		this.logical_delete_indicator = logicaldelete_indicator;
	}

	public String getOrder_block() {
		return order_block;
	}

	public void setOrder_block(String order_block) {
		this.order_block = order_block;
	}

	public String getOwning_entity() {
		return owning_entity;
	}

	public void setOwning_entity(String owning_entity) {
		this.owning_entity = owning_entity;
	}

	public String getDplStatus() {
		return dplStatus;
	}

	public void setStcFlag(String stcFlag) {
		this.stcFlag = stcFlag;
	}

	public String getBilling_Block() {
		return billing_Block;
	}

	public void setBilling_Block(String billing_Block) {
		this.billing_Block = billing_Block;
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

	public String getDelivery_block() {
		return delivery_block;
	}

	public void setDelivery_block(String delivery_block) {
		this.delivery_block = delivery_block;
	}

	public String getGoe_indicator() {
		return goe_indicator;
	}

	public void setGoe_indicator(String goe_indicator) {
		this.goe_indicator = goe_indicator;
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

	public String getLogical_delete_indicator() {
		return logical_delete_indicator;
	}

	public void setLogical_delete_indicator(String logical_delete_indicator) {
		this.logical_delete_indicator = logical_delete_indicator;
	}

	public Sitemain(String instance, String site_id, String billing_Block, String capIndicator,
			String coverageEligibleIndicator, String created_by, String created_on, String delivery_block,
			String dplStatus, Date goeExpDate, String goe_indicator, String goeReason, String last_update_action,
			String last_updated_by, Timestamp last_updated_on, String logical_delete_indicator, String order_block,
			String owning_entity, String stcFlag) {
		super();
		this.instance = instance;
		this.site_id = site_id;
		this.billing_Block = billing_Block;
		this.capIndicator = capIndicator;
		this.coverageEligibleIndicator = coverageEligibleIndicator;
		this.created_by = created_by;
		this.created_on = created_on;
		this.delivery_block = delivery_block;
		this.dplStatus = dplStatus;
		this.goeExpDate = goeExpDate;
		this.goe_indicator = goe_indicator;
		this.goeReason = goeReason;
		this.last_update_action = last_update_action;
		this.last_updated_by = last_updated_by;
		this.last_updated_on = last_updated_on;
		this.logical_delete_indicator = logical_delete_indicator;
		this.order_block = order_block;
		this.owning_entity = owning_entity;
		this.stcFlag = stcFlag;
	}

	


}
