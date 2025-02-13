package com.rdc.entity;

import java.sql.Timestamp;

public class US_COMPANY {

    private String MANDT;
    private String COMP_NO;
    private String ENT_NO;
    private String COMP_LEGAL_NAME;
    private String KATR10;
    private String LOEVM;
    private String CREATED_BY;
    private Timestamp CREATE_DT;
    private String UPDATED_BY;
    private Timestamp UPDATE_DT;
    private String UPDATE_TYPE;

    // Constructor with blank values
    public US_COMPANY() {
        this.MANDT = "";
        this.COMP_NO = "";
        this.ENT_NO = "";
        this.COMP_LEGAL_NAME = "";
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

    public String getCOMP_NO() {
        return COMP_NO;
    }

    public void setCOMP_NO(String COMP_NO) {
        this.COMP_NO = COMP_NO;
    }

    public String getENT_NO() {
        return ENT_NO;
    }

    public void setENT_NO(String ENT_NO) {
        this.ENT_NO = ENT_NO;
    }

    public String getCOMP_LEGAL_NAME() {
        return COMP_LEGAL_NAME;
    }

    public void setCOMP_LEGAL_NAME(String COMP_LEGAL_NAME) {
        this.COMP_LEGAL_NAME = COMP_LEGAL_NAME;
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

