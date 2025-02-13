package com.rdc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RevtranspendingPK implements Serializable{
	
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	
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
	
	public String getIssuing_cntry() {
		return issuing_cntry;
	}

	public void setIssuing_cntry(String issuing_cntry) {
		this.issuing_cntry = issuing_cntry;
	}

	public String getCmr_no() {
		return cmr_no;
	}

	public void setCmr_no(String cmr_no) {
		this.cmr_no = cmr_no;
	}

	public String getAccount_group() {
		return account_group;
	}

	public void setAccount_group(String account_group) {
		this.account_group = account_group;
	}
	

	@Column(name="INSTANCE")
	private String instance;
	
	@Column(name="SITE_ID")
	private String site_id;
	
	@Column(name="ACCOUNT_GROUP")
	private String account_group;
	
	@Column(name="ISSUING_COUNTRY")
	private String issuing_cntry;
	
	@Column(name="CMR_NO")
	private String cmr_no;

	
	
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RevtranspendingPK)) {
			return false;
		}
		RevtranspendingPK castOther = (RevtranspendingPK)other;
		return 
			this.instance.equals(castOther.instance)
			&& this.site_id.equals(castOther.site_id)
			&& this.issuing_cntry.equals(castOther.issuing_cntry)
			&& this.cmr_no.equals(castOther.cmr_no)
			&& this.account_group.equals(castOther.account_group);
			
			
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.instance.hashCode();
		hash = hash * prime + this.site_id.hashCode();
		hash = hash * prime + this.issuing_cntry.hashCode();
		hash = hash * prime + this.cmr_no.hashCode();
		hash = hash * prime + this.account_group.hashCode();
		
			
		return hash;
	}

	

}
