package com.rdc.entity;

import java.sql.Timestamp;

public class US_TAX_DATA {

    private String mandt;
    private String kunnr;
    private String i_type_cust_1;
    private String i_tax_class_1;
    private String i_type_cust_2;
    private String i_tax_class_2;
    private String i_type_cust_3;
    private String i_tax_class_3;
    private String c_icc_te;
    private String c_icc_tax_class;
    private String c_te_cert_st_1;
    private String c_te_cert_st_2;
    private String c_te_cert_st_3;
    private String c_scc;
    private String f_ocl;
    private String loevm;
    private String ea_status;
    private String created_by;
    private Timestamp create_dt;
    private String updated_by;
    private Timestamp update_dt;
    private String update_type;

    // Default Constructor
    public US_TAX_DATA() {
        this.mandt = "";
        this.kunnr = "";
        this.i_type_cust_1 = "";
        this.i_tax_class_1 = "";
        this.i_type_cust_2 = "";
        this.i_tax_class_2 = "";
        this.i_type_cust_3 = "";
        this.i_tax_class_3 = "";
        this.c_icc_te = "";
        this.c_icc_tax_class = "";
        this.c_te_cert_st_1 = "";
        this.c_te_cert_st_2 = "";
        this.c_te_cert_st_3 = "";
        this.c_scc = "";
        this.f_ocl = "";
        this.loevm = "";
        this.ea_status = "";
        this.created_by = "";
        this.create_dt = new Timestamp(System.currentTimeMillis()); // Current timestamp
        this.updated_by = "";
        this.update_dt = new Timestamp(System.currentTimeMillis()); // Current timestamp
        this.update_type = "";
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

    public String getI_type_cust_1() {
        return i_type_cust_1;
    }

    public void setI_type_cust_1(String i_type_cust_1) {
        this.i_type_cust_1 = i_type_cust_1;
    }

    public String getI_tax_class_1() {
        return i_tax_class_1;
    }

    public void setI_tax_class_1(String i_tax_class_1) {
        this.i_tax_class_1 = i_tax_class_1;
    }

    public String getI_type_cust_2() {
        return i_type_cust_2;
    }

    public void setI_type_cust_2(String i_type_cust_2) {
        this.i_type_cust_2 = i_type_cust_2;
    }

    public String getI_tax_class_2() {
        return i_tax_class_2;
    }

    public void setI_tax_class_2(String i_tax_class_2) {
        this.i_tax_class_2 = i_tax_class_2;
    }

    public String getI_type_cust_3() {
        return i_type_cust_3;
    }

    public void setI_type_cust_3(String i_type_cust_3) {
        this.i_type_cust_3 = i_type_cust_3;
    }

    public String getI_tax_class_3() {
        return i_tax_class_3;
    }

    public void setI_tax_class_3(String i_tax_class_3) {
        this.i_tax_class_3 = i_tax_class_3;
    }

    public String getC_icc_te() {
        return c_icc_te;
    }

    public void setC_icc_te(String c_icc_te) {
        this.c_icc_te = c_icc_te;
    }

    public String getC_icc_tax_class() {
        return c_icc_tax_class;
    }

    public void setC_icc_tax_class(String c_icc_tax_class) {
        this.c_icc_tax_class = c_icc_tax_class;
    }

    public String getC_te_cert_st_1() {
        return c_te_cert_st_1;
    }

    public void setC_te_cert_st_1(String c_te_cert_st_1) {
        this.c_te_cert_st_1 = c_te_cert_st_1;
    }

    public String getC_te_cert_st_2() {
        return c_te_cert_st_2;
    }

    public void setC_te_cert_st_2(String c_te_cert_st_2) {
        this.c_te_cert_st_2 = c_te_cert_st_2;
    }

    public String getC_te_cert_st_3() {
        return c_te_cert_st_3;
    }

    public void setC_te_cert_st_3(String c_te_cert_st_3) {
        this.c_te_cert_st_3 = c_te_cert_st_3;
    }

    public String getC_scc() {
        return c_scc;
    }

    public void setC_scc(String c_scc) {
        this.c_scc = c_scc;
    }

    public String getF_ocl() {
        return f_ocl;
    }

    public void setF_ocl(String f_ocl) {
        this.f_ocl = f_ocl;
    }

    public String getLoevm() {
        return loevm;
    }

    public void setLoevm(String loevm) {
        this.loevm = loevm;
    }

    public String getEa_status() {
        return ea_status;
    }

    public void setEa_status(String ea_status) {
        this.ea_status = ea_status;
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
}

