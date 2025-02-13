package com.rdc.entity;

import java.sql.Timestamp;

public class US_GEM_TRANS {

    private String MANDT;
    private String KUKLA;
    private String ZZKV_IND;
    private String GEM_CD;
    private String CREATED_BY;
    private Timestamp CREATE_DT;
    private String UPDATED_BY;
    private Timestamp UPDATE_DT;
    private String UPDATE_TYPE;
    private String TAX_CUST_TYP;

    // Constructor with blank values
    public US_GEM_TRANS() {
        this.MANDT = "";
        this.KUKLA = "";
        this.ZZKV_IND = "";
        this.GEM_CD = "";
        this.CREATED_BY = "";
        this.CREATE_DT = new java.sql.Timestamp(System.currentTimeMillis());
        this.UPDATED_BY = "";
        this.UPDATE_DT = new java.sql.Timestamp(System.currentTimeMillis());
        this.UPDATE_TYPE = "";
        this.TAX_CUST_TYP = "";
    }

    // Getters and Setters for all fields

    public String getMANDT() {
        return MANDT;
    }

    public void setMANDT(String MANDT) {
        this.MANDT = MANDT;
    }

    public String getKUKLA() {
        return KUKLA;
    }

    public void setKUKLA(String KUKLA) {
        this.KUKLA = KUKLA;
    }

    public String getZZKV_IND() {
        return ZZKV_IND;
    }

    public void setZZKV_IND(String ZZKV_IND) {
        this.ZZKV_IND = ZZKV_IND;
    }

    public String getGEM_CD() {
        return GEM_CD;
    }

    public void setGEM_CD(String GEM_CD) {
        this.GEM_CD = GEM_CD;
    }

    public String getCREATED_BY() {
        return CREATED_BY;
    }

    public void setCREATED_BY(String CREATED_BY) {
        this.CREATED_BY = CREATED_BY;
    }

    public Timestamp getCREATE_DT() {
        return CREATE_DT;
    }

    public void setCREATE_DT(Timestamp CREATE_DT) {
        this.CREATE_DT = CREATE_DT;
    }

    public String getUPDATED_BY() {
        return UPDATED_BY;
    }

    public void setUPDATED_BY(String UPDATED_BY) {
        this.UPDATED_BY = UPDATED_BY;
    }

    public Timestamp getUPDATE_DT() {
        return UPDATE_DT;
    }

    public void setUPDATE_DT(Timestamp UPDATE_DT) {
        this.UPDATE_DT = UPDATE_DT;
    }

    public String getUPDATE_TYPE() {
        return UPDATE_TYPE;
    }

    public void setUPDATE_TYPE(String UPDATE_TYPE) {
        this.UPDATE_TYPE = UPDATE_TYPE;
    }

    public String getTAX_CUST_TYP() {
        return TAX_CUST_TYP;
    }

    public void setTAX_CUST_TYP(String TAX_CUST_TYP) {
        this.TAX_CUST_TYP = TAX_CUST_TYP;
    }
}

