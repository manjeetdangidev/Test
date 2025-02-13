package com.rdc.entity;

import java.sql.Timestamp;

public class KNVL_EXT {
    private String mandt;
    private String kunnr;
    private String aland;
    private String tatyp;
    private String licnr;
    private String tax_exempt_reason;
    private String loevm;
    private String created_by;
    private Timestamp create_dt;
    private String updated_by;
    private Timestamp update_dt;
    private String update_type;

    // Constructor with blank values
    public KNVL_EXT() {
    	this.mandt="";
    	this.kunnr="";
    	this.aland="";
    	this.tatyp="";
    	this.licnr="";
    	this.tax_exempt_reason="";
    	this.loevm="";
    	this.created_by="";
    	this.create_dt=new java.sql.Timestamp(System.currentTimeMillis());
    	this.updated_by="";
    	this.update_dt=new java.sql.Timestamp(System.currentTimeMillis());
    	this.update_type="";
       
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

	public String getAland() {
		return aland;
	}

	public void setAland(String aland) {
		this.aland = aland;
	}

	public String getTatyp() {
		return tatyp;
	}

	public void setTatyp(String tatyp) {
		this.tatyp = tatyp;
	}

	public String getLicnr() {
		return licnr;
	}

	public void setLicnr(String licnr) {
		this.licnr = licnr;
	}

	public String getTax_exempt_reason() {
		return tax_exempt_reason;
	}

	public void setTax_exempt_reason(String tax_exempt_reason) {
		this.tax_exempt_reason = tax_exempt_reason;
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

    // Getters and Setters
    
}
