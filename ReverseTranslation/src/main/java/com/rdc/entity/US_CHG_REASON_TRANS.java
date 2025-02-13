package com.rdc.entity;

import java.sql.Timestamp;

public class US_CHG_REASON_TRANS {

    private String rdc_field_name;
    private String acct_grp;
    private String reason_cd;
    private String reason_desc;
    private String created_by;
    private Timestamp create_dt;
    private String updated_by;
    private Timestamp update_dt;

    // Default Constructor
    public US_CHG_REASON_TRANS() {
        this.rdc_field_name = "";
        this.acct_grp = "";
        this.reason_cd = "";
        this.reason_desc = "";
        this.created_by = "";
        this.create_dt = new Timestamp(System.currentTimeMillis()); // Current timestamp
        this.updated_by = "";
        this.update_dt = new Timestamp(System.currentTimeMillis()); // Current timestamp
    }

    // Getters and Setters
    public String getRdc_field_name() {
        return rdc_field_name;
    }

    public void setRdc_field_name(String rdc_field_name) {
        this.rdc_field_name = rdc_field_name;
    }

    public String getAcct_grp() {
        return acct_grp;
    }

    public void setAcct_grp(String acct_grp) {
        this.acct_grp = acct_grp;
    }

    public String getReason_cd() {
        return reason_cd;
    }

    public void setReason_cd(String reason_cd) {
        this.reason_cd = reason_cd;
    }

    public String getReason_desc() {
        return reason_desc;
    }

    public void setReason_desc(String reason_desc) {
        this.reason_desc = reason_desc;
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
}
