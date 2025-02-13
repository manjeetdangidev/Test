package com.rdc.entity;

import java.sql.Timestamp;

public class TAX_DATA {

    private String mandt;
    private String kunnr;
    private String tax_cd;
    private String tax_num;
    private String tax_separation_indc;
    private String billing_print_indc;
    private String contract_print_indc;
    private String cntry_use;
    private String loevm;
    private Timestamp create_ts;
    private String create_by_id;
    private Timestamp updt_ts;
    private String updt_by_id;

    // Default Constructor
    public TAX_DATA() {
        this.mandt = "";
        this.kunnr = "";
        this.tax_cd = "";
        this.tax_num = "";
        this.tax_separation_indc = "";
        this.billing_print_indc = "";
        this.contract_print_indc = "";
        this.cntry_use = "";
        this.loevm = "";
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

    public String getKunnr() {
        return kunnr;
    }

    public void setKunnr(String kunnr) {
        this.kunnr = kunnr;
    }

    public String getTax_cd() {
        return tax_cd;
    }

    public void setTax_cd(String tax_cd) {
        this.tax_cd = tax_cd;
    }

    public String getTax_num() {
        return tax_num;
    }

    public void setTax_num(String tax_num) {
        this.tax_num = tax_num;
    }

    public String getTax_separation_indc() {
        return tax_separation_indc;
    }

    public void setTax_separation_indc(String tax_separation_indc) {
        this.tax_separation_indc = tax_separation_indc;
    }

    public String getBilling_print_indc() {
        return billing_print_indc;
    }

    public void setBilling_print_indc(String billing_print_indc) {
        this.billing_print_indc = billing_print_indc;
    }

    public String getContract_print_indc() {
        return contract_print_indc;
    }

    public void setContract_print_indc(String contract_print_indc) {
        this.contract_print_indc = contract_print_indc;
    }

    public String getCntry_use() {
        return cntry_use;
    }

    public void setCntry_use(String cntry_use) {
        this.cntry_use = cntry_use;
    }

    public String getLoevm() {
        return loevm;
    }

    public void setLoevm(String loevm) {
        this.loevm = loevm;
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

