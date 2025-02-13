package com.rdc.entity;

import java.sql.Timestamp;

public class US_TCR_UPDT_QUEUE {

    private String mandt;
    private String tcr_input_file_nm;
    private long seq_no;
    private String line_content;
    private String cmr_no;
    private String tax_cust_typ_1;
    private String tax_class_1;
    private String tax_cust_typ_2;
    private String tax_class_2;
    private String tax_cust_typ_3;
    private String tax_class_3;
    private String tax_exempt_status_1;
    private String tax_exempt_status_2;
    private String tax_exempt_status_3;
    private String proc_status;
    private String proc_msg;
    private String created_by;
    private Timestamp create_dt;
    private String updated_by;
    private Timestamp update_dt;
    private String katr10;

    // Default Constructor
    public US_TCR_UPDT_QUEUE() {
        this.mandt = "";
        this.tcr_input_file_nm = "";
        this.seq_no = 0;
        this.line_content = "";
        this.cmr_no = "";
        this.tax_cust_typ_1 = "";
        this.tax_class_1 = "";
        this.tax_cust_typ_2 = "";
        this.tax_class_2 = "";
        this.tax_cust_typ_3 = "";
        this.tax_class_3 = "";
        this.tax_exempt_status_1 = "";
        this.tax_exempt_status_2 = "";
        this.tax_exempt_status_3 = "";
        this.proc_status = "";
        this.proc_msg = "";
        this.created_by = "";
        this.create_dt = new Timestamp(System.currentTimeMillis()); // Current timestamp
        this.updated_by = "";
        this.update_dt = new Timestamp(System.currentTimeMillis()); // Current timestamp
        this.katr10 = "";
    }

    // Getters and Setters
    public String getMandt() {
        return mandt;
    }

    public void setMandt(String mandt) {
        this.mandt = mandt;
    }

    public String getTcr_input_file_nm() {
        return tcr_input_file_nm;
    }

    public void setTcr_input_file_nm(String tcr_input_file_nm) {
        this.tcr_input_file_nm = tcr_input_file_nm;
    }

    public long getSeq_no() {
        return seq_no;
    }

    public void setSeq_no(long seq_no) {
        this.seq_no = seq_no;
    }

    public String getLine_content() {
        return line_content;
    }

    public void setLine_content(String line_content) {
        this.line_content = line_content;
    }

    public String getCmr_no() {
        return cmr_no;
    }

    public void setCmr_no(String cmr_no) {
        this.cmr_no = cmr_no;
    }

    public String getTax_cust_typ_1() {
        return tax_cust_typ_1;
    }

    public void setTax_cust_typ_1(String tax_cust_typ_1) {
        this.tax_cust_typ_1 = tax_cust_typ_1;
    }

    public String getTax_class_1() {
        return tax_class_1;
    }

    public void setTax_class_1(String tax_class_1) {
        this.tax_class_1 = tax_class_1;
    }

    public String getTax_cust_typ_2() {
        return tax_cust_typ_2;
    }

    public void setTax_cust_typ_2(String tax_cust_typ_2) {
        this.tax_cust_typ_2 = tax_cust_typ_2;
    }

    public String getTax_class_2() {
        return tax_class_2;
    }

    public void setTax_class_2(String tax_class_2) {
        this.tax_class_2 = tax_class_2;
    }

    public String getTax_cust_typ_3() {
        return tax_cust_typ_3;
    }

    public void setTax_cust_typ_3(String tax_cust_typ_3) {
        this.tax_cust_typ_3 = tax_cust_typ_3;
    }

    public String getTax_class_3() {
        return tax_class_3;
    }

    public void setTax_class_3(String tax_class_3) {
        this.tax_class_3 = tax_class_3;
    }

    public String getTax_exempt_status_1() {
        return tax_exempt_status_1;
    }

    public void setTax_exempt_status_1(String tax_exempt_status_1) {
        this.tax_exempt_status_1 = tax_exempt_status_1;
    }

    public String getTax_exempt_status_2() {
        return tax_exempt_status_2;
    }

    public void setTax_exempt_status_2(String tax_exempt_status_2) {
        this.tax_exempt_status_2 = tax_exempt_status_2;
    }

    public String getTax_exempt_status_3() {
        return tax_exempt_status_3;
    }

    public void setTax_exempt_status_3(String tax_exempt_status_3) {
        this.tax_exempt_status_3 = tax_exempt_status_3;
    }

    public String getProc_status() {
        return proc_status;
    }

    public void setProc_status(String proc_status) {
        this.proc_status = proc_status;
    }

    public String getProc_msg() {
        return proc_msg;
    }

    public void setProc_msg(String proc_msg) {
        this.proc_msg = proc_msg;
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

    public String getKatr10() {
        return katr10;
    }

    public void setKatr10(String katr10) {
        this.katr10 = katr10;
    }
}
