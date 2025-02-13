package com.rdc.entity;

import java.sql.Timestamp;

public class TAX_CD_LOV {

    private String mandt;
    private String katr6;
    private String tax_cd;
    private String desc;
    private Timestamp create_ts;
    private String create_by_id;
    private Timestamp updt_ts;
    private String updt_by_id;

    // Default Constructor
    public TAX_CD_LOV() {
        this.mandt = "";
        this.katr6 = "";
        this.tax_cd = "";
        this.desc = "";
        this.create_ts = new Timestamp(System.currentTimeMillis()); // Current timestamp
        this.create_by_id = "";
        this.updt_ts = new Timestamp(System.currentTimeMillis()); // Current timestamp
        this.updt_by_id = "";
    }

    // Getters and Setters
    public String getMandt() {
        return mandt;
    }

    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    public String getKatr6() {
        return katr6;
    }

    public void setKatr6(String katr6) {
        this.katr6 = katr6;
    }

    public String getTax_cd() {
        return tax_cd;
    }

    public void setTax_cd(String tax_cd) {
        this.tax_cd = tax_cd;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Timestamp getCreate_ts() {
        return create_ts;
    }

    public void setCreate_ts(Timestamp create_ts) {
        this.create_ts = create_ts;
    }

    public String getCreate_by_id() {
        return create_by_id;
    }

    public void setCreate_by_id(String create_by_id) {
        this.create_by_id = create_by_id;
    }

    public Timestamp getUpdt_ts() {
        return updt_ts;
    }

    public void setUpdt_ts(Timestamp updt_ts) {
        this.updt_ts = updt_ts;
    }

    public String getUpdt_by_id() {
        return updt_by_id;
    }

    public void setUpdt_by_id(String updt_by_id) {
        this.updt_by_id = updt_by_id;
    }
}
