package com.rdc.entity;

import java.sql.Timestamp;

public class ISIC_TO_JSIC_MAP {

    private String mandt;
    private String jsic_cd;
    private String isic_cd;
    private String create_by;
    private Timestamp create_ts;
    private String last_updt_by;
    private Timestamp last_updt_ts;

    // Default Constructor
    public ISIC_TO_JSIC_MAP() {
        this.mandt = "";
        this.jsic_cd = "";
        this.isic_cd = "";
        this.create_by = "";
        this.create_ts = new Timestamp(System.currentTimeMillis()); // Current timestamp
        this.last_updt_by = "";
        this.last_updt_ts = new Timestamp(System.currentTimeMillis()); // Current timestamp
    }

    // Getters and Setters
    public String getMandt() {
        return mandt;
    }

    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    public String getJsic_cd() {
        return jsic_cd;
    }

    public void setJsic_cd(String jsic_cd) {
        this.jsic_cd = jsic_cd;
    }

    public String getIsic_cd() {
        return isic_cd;
    }

    public void setIsic_cd(String isic_cd) {
        this.isic_cd = isic_cd;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Timestamp getCreate_ts() {
        return create_ts;
    }

    public void setCreate_ts(Timestamp create_ts) {
        this.create_ts = create_ts;
    }

    public String getLast_updt_by() {
        return last_updt_by;
    }

    public void setLast_updt_by(String last_updt_by) {
        this.last_updt_by = last_updt_by;
    }

    public Timestamp getLast_updt_ts() {
        return last_updt_ts;
    }

    public void setLast_updt_ts(Timestamp last_updt_ts) {
        this.last_updt_ts = last_updt_ts;
    }
}

