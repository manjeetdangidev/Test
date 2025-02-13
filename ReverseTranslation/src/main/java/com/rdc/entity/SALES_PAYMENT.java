package com.rdc.entity;

import java.sql.Timestamp;

public class SALES_PAYMENT {

    private String payment_cycle_cd_6;
    private String pay_day_6;
    private String close_day_7;
    private String payment_cycle_cd_7;
    private String pay_day_7;
    private String close_day_8;
    private String payment_cycle_cd_8;
    private String pay_day_8;
    private String contract_sign_dt;
    private String sales_team_no;
    private Timestamp sales_team_updt_dt;
    private String create_by;
    private Timestamp create_ts;
    private String last_updt_by;
    private Timestamp last_updt_ts;

    // Default Constructor
    public SALES_PAYMENT() {
        this.payment_cycle_cd_6 = "";
        this.pay_day_6 = "";
        this.close_day_7 = "";
        this.payment_cycle_cd_7 = "";
        this.pay_day_7 = "";
        this.close_day_8 = "";
        this.payment_cycle_cd_8 = "";
        this.pay_day_8 = "";
        this.contract_sign_dt = "";
        this.sales_team_no = "";
        this.sales_team_updt_dt = null;
        this.create_by = "";
        this.create_ts = new Timestamp(System.currentTimeMillis()); // Current timestamp
        this.last_updt_by = "";
        this.last_updt_ts = new Timestamp(System.currentTimeMillis()); // Current timestamp
    }

    // Getters and Setters
    public String getPayment_cycle_cd_6() {
        return payment_cycle_cd_6;
    }

    public void setPayment_cycle_cd_6(String payment_cycle_cd_6) {
        this.payment_cycle_cd_6 = payment_cycle_cd_6;
    }

    public String getPay_day_6() {
        return pay_day_6;
    }

    public void setPay_day_6(String pay_day_6) {
        this.pay_day_6 = pay_day_6;
    }

    public String getClose_day_7() {
        return close_day_7;
    }

    public void setClose_day_7(String close_day_7) {
        this.close_day_7 = close_day_7;
    }

    public String getPayment_cycle_cd_7() {
        return payment_cycle_cd_7;
    }

    public void setPayment_cycle_cd_7(String payment_cycle_cd_7) {
        this.payment_cycle_cd_7 = payment_cycle_cd_7;
    }

    public String getPay_day_7() {
        return pay_day_7;
    }

    public void setPay_day_7(String pay_day_7) {
        this.pay_day_7 = pay_day_7;
    }

    public String getClose_day_8() {
        return close_day_8;
    }

    public void setClose_day_8(String close_day_8) {
        this.close_day_8 = close_day_8;
    }

    public String getPayment_cycle_cd_8() {
        return payment_cycle_cd_8;
    }

    public void setPayment_cycle_cd_8(String payment_cycle_cd_8) {
        this.payment_cycle_cd_8 = payment_cycle_cd_8;
    }

    public String getPay_day_8() {
        return pay_day_8;
    }

    public void setPay_day_8(String pay_day_8) {
        this.pay_day_8 = pay_day_8;
    }

    public String getContract_sign_dt() {
        return contract_sign_dt;
    }

    public void setContract_sign_dt(String contract_sign_dt) {
        this.contract_sign_dt = contract_sign_dt;
    }

    public String getSales_team_no() {
        return sales_team_no;
    }

    public void setSales_team_no(String sales_team_no) {
        this.sales_team_no = sales_team_no;
    }

    public Timestamp getSales_team_updt_dt() {
        return sales_team_updt_dt;
    }

    public void setSales_team_updt_dt(Timestamp sales_team_updt_dt) {
        this.sales_team_updt_dt = sales_team_updt_dt;
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

