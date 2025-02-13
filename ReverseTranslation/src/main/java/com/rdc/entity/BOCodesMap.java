package com.rdc.entity;
import java.sql.Timestamp;

public class BOCodesMap {


    private String subsidiary_cd;
    private String office_cd;
    private String sub_office_cd;
    private String bo_cd;
    private String field_sales_cd;
    private String sales_office_cd;
    private String mktg_div_cd;
    private String mrc_cd;
    private String dept_cd;
    private String mktg_dept_name;
    private String cluster_id;
    private String client_tier_cd;
    private String isu_cd_override;
    private String isic_cd;
    private String create_by;
    private Timestamp create_ts;
    private String last_updt_by;
    private Timestamp last_updt_ts;
    
    public BOCodesMap() {
        this.subsidiary_cd = "";
        this.office_cd = "";
        this.sub_office_cd = "";
        this.bo_cd = "";
        this.field_sales_cd = "";
        this.sales_office_cd = "";
        this.mktg_div_cd = "";
        this.mrc_cd = "";
        this.dept_cd = "";
        this.mktg_dept_name = "";
        this.cluster_id = "";
        this.client_tier_cd = "";
        this.isu_cd_override = "";
        this.isic_cd = "";
        this.create_by = "";
        this.create_ts = new Timestamp(System.currentTimeMillis()); // Current timestamp
        this.last_updt_by = "";
        this.last_updt_ts = new Timestamp(System.currentTimeMillis()); // Current timestamp
    }

    // Getters and Setters
    public String getSubsidiary_cd() {
        return subsidiary_cd;
    }

    public void setSubsidiary_cd(String subsidiary_cd) {
        this.subsidiary_cd = subsidiary_cd;
    }

    public String getOffice_cd() {
        return office_cd;
    }

    public void setOffice_cd(String office_cd) {
        this.office_cd = office_cd;
    }

    public String getSub_office_cd() {
        return sub_office_cd;
    }

    public void setSub_office_cd(String sub_office_cd) {
        this.sub_office_cd = sub_office_cd;
    }

    public String getBo_cd() {
        return bo_cd;
    }

    public void setBo_cd(String bo_cd) {
        this.bo_cd = bo_cd;
    }

    public String getField_sales_cd() {
        return field_sales_cd;
    }

    public void setField_sales_cd(String field_sales_cd) {
        this.field_sales_cd = field_sales_cd;
    }

    public String getSales_office_cd() {
        return sales_office_cd;
    }

    public void setSales_office_cd(String sales_office_cd) {
        this.sales_office_cd = sales_office_cd;
    }

    public String getMktg_div_cd() {
        return mktg_div_cd;
    }

    public void setMktg_div_cd(String mktg_div_cd) {
        this.mktg_div_cd = mktg_div_cd;
    }

    public String getMrc_cd() {
        return mrc_cd;
    }

    public void setMrc_cd(String mrc_cd) {
        this.mrc_cd = mrc_cd;
    }

    public String getDept_cd() {
        return dept_cd;
    }

    public void setDept_cd(String dept_cd) {
        this.dept_cd = dept_cd;
    }

    public String getMktg_dept_name() {
        return mktg_dept_name;
    }

    public void setMktg_dept_name(String mktg_dept_name) {
        this.mktg_dept_name = mktg_dept_name;
    }

    public String getCluster_id() {
        return cluster_id;
    }

    public void setCluster_id(String cluster_id) {
        this.cluster_id = cluster_id;
    }

    public String getClient_tier_cd() {
        return client_tier_cd;
    }

    public void setClient_tier_cd(String client_tier_cd) {
        this.client_tier_cd = client_tier_cd;
    }

    public String getIsu_cd_override() {
        return isu_cd_override;
    }

    public void setIsu_cd_override(String isu_cd_override) {
        this.isu_cd_override = isu_cd_override;
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

