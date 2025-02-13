package com.rdc.entity;

import java.sql.Timestamp;

public class Kna1AddlBilling {

    private String mandt;               // MANDT (CHARACTER(3))
    private String kunnr;               // KUNNR (VARCHAR(10))
    private String no_of_invoices;      // NO_OF_INVOICES (CHARACTER(2)) - nullable
    private String bank_account_no;     // BANK_ACCOUNT_NO (VARCHAR(35)) - nullable
    private String bank_branch_no;      // BANK_BRANCH_NO (VARCHAR(35)) - nullable
    private String ca_qst_id;           // CA_QST_ID (CHARACTER(18)) - nullable
    private String ca_pst_id;           // CA_PST_ID (CHARACTER(18)) - nullable
    private String leasing_indc;        // LEASING_INDC (CHARACTER(1)) - nullable
    private String estab_func_cd;       // ESTAB_FUNC_CD (CHARACTER(1)) - nullable
    private String purch_ordr_no;       // PURCH_ORDR_NO (CHARACTER(27)) - nullable
    private String loevm;               // LOEVM (CHARACTER(1)) - nullable
    private String created_by;          // CREATED_BY (VARCHAR(255))
    private Timestamp create_dt;        // CREATE_DT (TIMESTAMP)
    private String updated_by;          // UPDATED_BY (VARCHAR(255))
    private Timestamp update_dt;        // UPDATE_DT (TIMESTAMP)
    private String update_type;         // UPDATE_TYPE (CHARACTER(1))
    private String mexico_fiscal_regime; // MEXICO_FISCAL_REGIME (VARCHAR(3)) - nullable
    private String mexico_billing_name; // MEXICO_BILLING_NAME (VARCHAR(254)) - nullable
    private String codcond;             // CODCOND (VARCHAR(2)) - nullable
    private String codreas;             // CODREAS (VARCHAR(2)) - nullable
    private Timestamp codeffdate;       // CODEFFDATE (TIMESTAMP) - nullable

    // Default constructor with empty string values for Strings and null for Timestamps
    public Kna1AddlBilling() {
        this.mandt = "";
        this.kunnr = "";
        this.no_of_invoices = "";
        this.bank_account_no = "";
        this.bank_branch_no = "";
        this.ca_qst_id = "";
        this.ca_pst_id = "";
        this.leasing_indc = "";
        this.estab_func_cd = "";
        this.purch_ordr_no = "";
        this.loevm = "";
        this.created_by = "";
        this.create_dt = new java.sql.Timestamp(System.currentTimeMillis());
        this.updated_by = "";
        this.update_dt = new java.sql.Timestamp(System.currentTimeMillis());
        this.update_type = "";
        this.mexico_fiscal_regime = "";
        this.mexico_billing_name = "";
        this.codcond = "";
        this.codreas = "";
        this.codeffdate = new java.sql.Timestamp(System.currentTimeMillis());
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

    public String getNo_of_invoices() {
        return no_of_invoices;
    }

    public void setNo_of_invoices(String no_of_invoices) {
        this.no_of_invoices = no_of_invoices;
    }

    public String getBank_account_no() {
        return bank_account_no;
    }

    public void setBank_account_no(String bank_account_no) {
        this.bank_account_no = bank_account_no;
    }

    public String getBank_branch_no() {
        return bank_branch_no;
    }

    public void setBank_branch_no(String bank_branch_no) {
        this.bank_branch_no = bank_branch_no;
    }

    public String getCa_qst_id() {
        return ca_qst_id;
    }

    public void setCa_qst_id(String ca_qst_id) {
        this.ca_qst_id = ca_qst_id;
    }

    public String getCa_pst_id() {
        return ca_pst_id;
    }

    public void setCa_pst_id(String ca_pst_id) {
        this.ca_pst_id = ca_pst_id;
    }

    public String getLeasing_indc() {
        return leasing_indc;
    }

    public void setLeasing_indc(String leasing_indc) {
        this.leasing_indc = leasing_indc;
    }

    public String getEstab_func_cd() {
        return estab_func_cd;
    }

    public void setEstab_func_cd(String estab_func_cd) {
        this.estab_func_cd = estab_func_cd;
    }

    public String getPurch_ordr_no() {
        return purch_ordr_no;
    }

    public void setPurch_ordr_no(String purch_ordr_no) {
        this.purch_ordr_no = purch_ordr_no;
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

    public String getMexico_fiscal_regime() {
        return mexico_fiscal_regime;
    }

    public void setMexico_fiscal_regime(String mexico_fiscal_regime) {
        this.mexico_fiscal_regime = mexico_fiscal_regime;
    }

    public String getMexico_billing_name() {
        return mexico_billing_name;
    }

    public void setMexico_billing_name(String mexico_billing_name) {
        this.mexico_billing_name = mexico_billing_name;
    }

    public String getCodcond() {
        return codcond;
    }

    public void setCodcond(String codcond) {
        this.codcond = codcond;
    }

    public String getCodreas() {
        return codreas;
    }

    public void setCodreas(String codreas) {
        this.codreas = codreas;
    }

    public Timestamp getCodeffdate() {
        return codeffdate;
    }

    public void setCodeffdate(Timestamp codeffdate) {
        this.codeffdate = codeffdate;
    }

    // toString() method for displaying object contents (useful for debugging)
    @Override
    public String toString() {
        return "Kna1AddlBilling{" +
                "mandt='" + mandt + '\'' +
                ", kunnr='" + kunnr + '\'' +
                ", no_of_invoices='" + no_of_invoices + '\'' +
                ", bank_account_no='" + bank_account_no + '\'' +
                ", bank_branch_no='" + bank_branch_no + '\'' +
                ", ca_qst_id='" + ca_qst_id + '\'' +
                ", ca_pst_id='" + ca_pst_id + '\'' +
                ", leasing_indc='" + leasing_indc + '\'' +
                ", estab_func_cd='" + estab_func_cd + '\'' +
                ", purch_ordr_no='" + purch_ordr_no + '\'' +
                ", loevm='" + loevm + '\'' +
                ", created_by='" + created_by + '\'' +
                ", create_dt=" + create_dt +
                ", updated_by='" + updated_by + '\'' +
                ", update_dt=" + update_dt +
                ", update_type='" + update_type + '\'' +
                ", mexico_fiscal_regime='" + mexico_fiscal_regime + '\'' +
                ", mexico_billing_name='" + mexico_billing_name + '\'' +
                ", codcond='" + codcond + '\'' +
                ", codreas='" + codreas + '\'' +
                ", codeffdate=" + codeffdate +
                '}';
    }
}
