package com.rdc.entity;

import java.sql.Timestamp;

public class US_ENTERPRISE {

    private String MANDT;
    private String ENT_NO;
    private String ENT_LEGAL_NAME;
    private String ENT_TYPE_CODE;
    private String KATR10;
    private String LOEVM;
    private String CREATED_BY;
    private Timestamp CREATE_DT;
    private String UPDATED_BY;
    private Timestamp UPDATE_DT;
    private String UPDATE_TYPE;

    // Constructor with blank values
    public US_ENTERPRISE() {
        this.MANDT = "";
        this.ENT_NO = "";
        this.ENT_LEGAL_NAME = "";
        this.ENT_TYPE_CODE = "";
        this.KATR10 = "";
        this.LOEVM = "";
        this.CREATED_BY = "";
        this.CREATE_DT = new java.sql.Timestamp(System.currentTimeMillis());
        this.UPDATED_BY = "";
        this.UPDATE_DT = new java.sql.Timestamp(System.currentTimeMillis());
        this.UPDATE_TYPE = "";
    }

    // Getters and Setters for all fields

    public String getMANDT() {
        return MANDT;
    }

    public void setMANDT(String MANDT) {
        this.MANDT = MANDT;
    }

    public String getENT_NO() {
        return ENT_NO;
    }

    public void setENT_NO(String ENT_NO) {
        this.ENT_NO = ENT_NO;
    }

    public String getENT_LEGAL_NAME() {
        return ENT_LEGAL_NAME;
    }

    public void setENT_LEGAL_NAME(String ENT_LEGAL_NAME) {
        this.ENT_LEGAL_NAME = ENT_LEGAL_NAME;
    }

    public String getENT_TYPE_CODE() {
        return ENT_TYPE_CODE;
    }

    public void setENT_TYPE_CODE(String ENT_TYPE_CODE) {
        this.ENT_TYPE_CODE = ENT_TYPE_CODE;
    }

    public String getKATR10() {
        return KATR10;
    }

    public void setKATR10(String KATR10) {
        this.KATR10 = KATR10;
    }

    public String getLOEVM() {
        return LOEVM;
    }

    public void setLOEVM(String LOEVM) {
        this.LOEVM = LOEVM;
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
}

