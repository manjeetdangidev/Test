package com.rdc.entity;

import java.sql.Timestamp;

public class LOCNNAME {

	private String INSTANCE;
	private String LOCN_NAME_ID;
	private String OWNING_ENTITY;
	private String LANGUAGE_CD;
	private String ALT_LANGUAGE_FLAG;
	private String LOCATION_NAME;
	private String LOCATION_NAME_1;
	private String LOCATION_NAME_2;
	private String LOCATION_DIV_OR_DEPT;
	private String LOCATION_BUSINESS_NAME;
	private String CONSUMER_PREFERRED_NAME;
	private String ABBREVIATED_NAME;
	private String ROW_ACCESS_ID;
	private String CREATED_BY;
	private Timestamp CREATED_ON;
	private String LAST_UPDATE_ACTION;
	private String LAST_UPDATED_BY;
	private Timestamp LAST_UPDATED_ON;

	public String getINSTANCE() {
		return INSTANCE;
	}

	public void setINSTANCE(String iNSTANCE) {
		INSTANCE = iNSTANCE;
	}

	public String getLOCN_NAME_ID() {
		return LOCN_NAME_ID;
	}

	public void setLOCN_NAME_ID(String lOCN_NAME_ID) {
		LOCN_NAME_ID = lOCN_NAME_ID;
	}

	public String getOWNING_ENTITY() {
		return OWNING_ENTITY;
	}

	public void setOWNING_ENTITY(String oWNING_ENTITY) {
		OWNING_ENTITY = oWNING_ENTITY;
	}

	public String getLANGUAGE_CD() {
		return LANGUAGE_CD;
	}

	public void setLANGUAGE_CD(String lANGUAGE_CD) {
		LANGUAGE_CD = lANGUAGE_CD;
	}

	public String getALT_LANGUAGE_FLAG() {
		return ALT_LANGUAGE_FLAG;
	}

	public void setALT_LANGUAGE_FLAG(String aLT_LANGUAGE_FLAG) {
		ALT_LANGUAGE_FLAG = aLT_LANGUAGE_FLAG;
	}

	public String getLOCATION_NAME() {
		return LOCATION_NAME;
	}

	public void setLOCATION_NAME(String lOCATION_NAME) {
		LOCATION_NAME = lOCATION_NAME;
	}

	public String getLOCATION_NAME_1() {
		return LOCATION_NAME_1;
	}

	public void setLOCATION_NAME_1(String lOCATION_NAME_1) {
		LOCATION_NAME_1 = lOCATION_NAME_1;
	}

	public String getLOCATION_NAME_2() {
		return LOCATION_NAME_2;
	}

	public void setLOCATION_NAME_2(String lOCATION_NAME_2) {
		LOCATION_NAME_2 = lOCATION_NAME_2;
	}

	public String getLOCATION_DIV_OR_DEPT() {
		return LOCATION_DIV_OR_DEPT;
	}

	public void setLOCATION_DIV_OR_DEPT(String lOCATION_DIV_OR_DEPT) {
		LOCATION_DIV_OR_DEPT = lOCATION_DIV_OR_DEPT;
	}

	public String getLOCATION_BUSINESS_NAME() {
		return LOCATION_BUSINESS_NAME;
	}

	public void setLOCATION_BUSINESS_NAME(String lOCATION_BUSINESS_NAME) {
		LOCATION_BUSINESS_NAME = lOCATION_BUSINESS_NAME;
	}

	public String getCONSUMER_PREFERRED_NAME() {
		return CONSUMER_PREFERRED_NAME;
	}

	public void setCONSUMER_PREFERRED_NAME(String cONSUMER_PREFERRED_NAME) {
		CONSUMER_PREFERRED_NAME = cONSUMER_PREFERRED_NAME;
	}

	public String getABBREVIATED_NAME() {
		return ABBREVIATED_NAME;
	}

	public void setABBREVIATED_NAME(String aBBREVIATED_NAME) {
		ABBREVIATED_NAME = aBBREVIATED_NAME;
	}

	public String getROW_ACCESS_ID() {
		return ROW_ACCESS_ID;
	}

	public void setROW_ACCESS_ID(String rOW_ACCESS_ID) {
		ROW_ACCESS_ID = rOW_ACCESS_ID;
	}

	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	public Timestamp getCREATED_ON() {
		return CREATED_ON;
	}

	public void setCREATED_ON(Timestamp timestamp_createdOn) {
		CREATED_ON = timestamp_createdOn;
	}

	public String getLAST_UPDATE_ACTION() {
		return LAST_UPDATE_ACTION;
	}

	public void setLAST_UPDATE_ACTION(String lAST_UPDATE_ACTION) {
		LAST_UPDATE_ACTION = lAST_UPDATE_ACTION;
	}

	public String getLAST_UPDATED_BY() {
		return LAST_UPDATED_BY;
	}

	public void setLAST_UPDATED_BY(String lAST_UPDATED_BY) {
		LAST_UPDATED_BY = lAST_UPDATED_BY;
	}

	public Timestamp getLAST_UPDATED_ON() {
		return LAST_UPDATED_ON;
	}

	public void setLAST_UPDATED_ON(Timestamp lAST_UPDATED_ON) {
		LAST_UPDATED_ON = lAST_UPDATED_ON;
	}

	@Override
	public String toString() {
		return "T_LOCNNAME [INSTANCE=" + INSTANCE + ", LOCN_NAME_ID=" + LOCN_NAME_ID + ", OWNING_ENTITY="
				+ OWNING_ENTITY + ", LANGUAGE_CD=" + LANGUAGE_CD + ", ALT_LANGUAGE_FLAG=" + ALT_LANGUAGE_FLAG
				+ ", LOCATION_NAME=" + LOCATION_NAME + ", LOCATION_NAME_1=" + LOCATION_NAME_1 + ", LOCATION_NAME_2="
				+ LOCATION_NAME_2 + ", LOCATION_DIV_OR_DEPT=" + LOCATION_DIV_OR_DEPT + ", LOCATION_BUSINESS_NAME="
				+ LOCATION_BUSINESS_NAME + ", CONSUMER_PREFERRED_NAME=" + CONSUMER_PREFERRED_NAME
				+ ", ABBREVIATED_NAME=" + ABBREVIATED_NAME + ", ROW_ACCESS_ID=" + ROW_ACCESS_ID + ", CREATED_BY="
				+ CREATED_BY + ", CREATED_ON=" + CREATED_ON + ", LAST_UPDATE_ACTION=" + LAST_UPDATE_ACTION
				+ ", LAST_UPDATED_BY=" + LAST_UPDATED_BY + ", LAST_UPDATED_ON=" + LAST_UPDATED_ON + ", getINSTANCE()="
				+ getINSTANCE() + ", getLOCN_NAME_ID()=" + getLOCN_NAME_ID() + ", getOWNING_ENTITY()="
				+ getOWNING_ENTITY() + ", getLANGUAGE_CD()=" + getLANGUAGE_CD() + ", getALT_LANGUAGE_FLAG()="
				+ getALT_LANGUAGE_FLAG() + ", getLOCATION_NAME()=" + getLOCATION_NAME() + ", getLOCATION_NAME_1()="
				+ getLOCATION_NAME_1() + ", getLOCATION_NAME_2()=" + getLOCATION_NAME_2()
				+ ", getLOCATION_DIV_OR_DEPT()=" + getLOCATION_DIV_OR_DEPT() + ", getLOCATION_BUSINESS_NAME()="
				+ getLOCATION_BUSINESS_NAME() + ", getCONSUMER_PREFERRED_NAME()=" + getCONSUMER_PREFERRED_NAME()
				+ ", getABBREVIATED_NAME()=" + getABBREVIATED_NAME() + ", getROW_ACCESS_ID()=" + getROW_ACCESS_ID()
				+ ", getCREATED_BY()=" + getCREATED_BY() + ", getCREATED_ON()=" + getCREATED_ON()
				+ ", getLAST_UPDATE_ACTION()=" + getLAST_UPDATE_ACTION() + ", getLAST_UPDATED_BY()="
				+ getLAST_UPDATED_BY() + ", getLAST_UPDATED_ON()=" + getLAST_UPDATED_ON() + "]";
	}
}