package com.rdc.entity;

public class T_CUSTADDR {

	private String INSTANCE;
	private String SITE_ID;
	private String ADDR_ID;
	private String OWNING_ENTITY;
	private String LANGUAGE_CD;
	private String ADDRESS_LINE1;
	private String ADDRESS_LINE2;
	private String ADDRESS_LINE3;
	private String ADDRESS_LINE4;
	private String CITY;
	private String DISTRICT;
	private String COUNTY;
	private String STATE_PROVINCE;
	private String POSTAL_CD;
	private String PO_BOX;
	private String PO_BOX_CITY;
	private String PO_BOX_POSTAL_CD;
	private String LANDED_COUNTRY;
	private String EMAIL;
	private String PHONE;
	private String CREATED_BY;
	private String CREATED_ON;
	private String LAST_UPDATE_ACTION;
	private String LAST_UPDATED_BY;
	private String LAST_UPDATED_ON;

	public String getINSTANCE() {
		return INSTANCE;
	}

	public void setINSTANCE(String iNSTANCE) {
		INSTANCE = iNSTANCE;
	}

	public String getSITE_ID() {
		return SITE_ID;
	}

	public void setSITE_ID(String sITE_ID) {
		SITE_ID = sITE_ID;
	}

	public String getADDR_ID() {
		return ADDR_ID;
	}

	public void setADDR_ID(String aDDR_ID) {
		ADDR_ID = aDDR_ID;
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

	public String getADDRESS_LINE1() {
		return ADDRESS_LINE1;
	}

	public void setADDRESS_LINE1(String aDDRESS_LINE1) {
		ADDRESS_LINE1 = aDDRESS_LINE1;
	}

	public String getADDRESS_LINE2() {
		return ADDRESS_LINE2;
	}

	public void setADDRESS_LINE2(String aDDRESS_LINE2) {
		ADDRESS_LINE2 = aDDRESS_LINE2;
	}

	public String getADDRESS_LINE3() {
		return ADDRESS_LINE3;
	}

	public void setADDRESS_LINE3(String aDDRESS_LINE3) {
		ADDRESS_LINE3 = aDDRESS_LINE3;
	}

	public String getADDRESS_LINE4() {
		return ADDRESS_LINE4;
	}

	public void setADDRESS_LINE4(String aDDRESS_LINE4) {
		ADDRESS_LINE4 = aDDRESS_LINE4;
	}

	public String getCITY() {
		return CITY;
	}

	public void setCITY(String cITY) {
		CITY = cITY;
	}

	public String getDISTRICT() {
		return DISTRICT;
	}

	public void setDISTRICT(String dISTRICT) {
		DISTRICT = dISTRICT;
	}

	public String getCOUNTY() {
		return COUNTY;
	}

	public void setCOUNTY(String cOUNTY) {
		COUNTY = cOUNTY;
	}

	public String getSTATE_PROVINCE() {
		return STATE_PROVINCE;
	}

	public void setSTATE_PROVINCE(String sTATE_PROVINCE) {
		STATE_PROVINCE = sTATE_PROVINCE;
	}

	public String getPOSTAL_CD() {
		return POSTAL_CD;
	}

	public void setPOSTAL_CD(String pOSTAL_CD) {
		POSTAL_CD = pOSTAL_CD;
	}

	public String getPO_BOX() {
		return PO_BOX;
	}

	public void setPO_BOX(String pO_BOX) {
		PO_BOX = pO_BOX;
	}

	public String getPO_BOX_CITY() {
		return PO_BOX_CITY;
	}

	public void setPO_BOX_CITY(String pO_BOX_CITY) {
		PO_BOX_CITY = pO_BOX_CITY;
	}

	public String getPO_BOX_POSTAL_CD() {
		return PO_BOX_POSTAL_CD;
	}

	public void setPO_BOX_POSTAL_CD(String pO_BOX_POSTAL_CD) {
		PO_BOX_POSTAL_CD = pO_BOX_POSTAL_CD;
	}

	public String getLANDED_COUNTRY() {
		return LANDED_COUNTRY;
	}

	public void setLANDED_COUNTRY(String lANDED_COUNTRY) {
		LANDED_COUNTRY = lANDED_COUNTRY;
	}

	public String getEMAIL() {
		return EMAIL;
	}

	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}

	public String getPHONE() {
		return PHONE;
	}

	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}

	public String getCREATED_BY() {
		return CREATED_BY;
	}

	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}

	public String getCREATED_ON() {
		return CREATED_ON;
	}

	public void setCREATED_ON(String cREATED_ON) {
		CREATED_ON = cREATED_ON;
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

	public String getLAST_UPDATED_ON() {
		return LAST_UPDATED_ON;
	}

	public void setLAST_UPDATED_ON(String lAST_UPDATED_ON) {
		LAST_UPDATED_ON = lAST_UPDATED_ON;
	}

	@Override
	public String toString() {
		return "T_CUSTADDR [INSTANCE=" + INSTANCE + ", SITE_ID=" + SITE_ID + ", ADDR_ID=" + ADDR_ID + ", OWNING_ENTITY="
				+ OWNING_ENTITY + ", LANGUAGE_CD=" + LANGUAGE_CD + ", ADDRESS_LINE1=" + ADDRESS_LINE1
				+ ", ADDRESS_LINE2=" + ADDRESS_LINE2 + ", ADDRESS_LINE3=" + ADDRESS_LINE3 + ", ADDRESS_LINE4="
				+ ADDRESS_LINE4 + ", CITY=" + CITY + ", DISTRICT=" + DISTRICT + ", COUNTY=" + COUNTY
				+ ", STATE_PROVINCE=" + STATE_PROVINCE + ", POSTAL_CD=" + POSTAL_CD + ", PO_BOX=" + PO_BOX
				+ ", PO_BOX_CITY=" + PO_BOX_CITY + ", PO_BOX_POSTAL_CD=" + PO_BOX_POSTAL_CD + ", LANDED_COUNTRY="
				+ LANDED_COUNTRY + ", EMAIL=" + EMAIL + ", PHONE=" + PHONE + ", CREATED_BY=" + CREATED_BY
				+ ", CREATED_ON=" + CREATED_ON + ", LAST_UPDATE_ACTION=" + LAST_UPDATE_ACTION + ", LAST_UPDATED_BY="
				+ LAST_UPDATED_BY + ", LAST_UPDATED_ON=" + LAST_UPDATED_ON + ", getINSTANCE()=" + getINSTANCE()
				+ ", getSITE_ID()=" + getSITE_ID() + ", getADDR_ID()=" + getADDR_ID() + ", getOWNING_ENTITY()="
				+ getOWNING_ENTITY() + ", getLANGUAGE_CD()=" + getLANGUAGE_CD() + ", getADDRESS_LINE1()="
				+ getADDRESS_LINE1() + ", getADDRESS_LINE2()=" + getADDRESS_LINE2() + ", getADDRESS_LINE3()="
				+ getADDRESS_LINE3() + ", getADDRESS_LINE4()=" + getADDRESS_LINE4() + ", getCITY()=" + getCITY()
				+ ", getDISTRICT()=" + getDISTRICT() + ", getCOUNTY()=" + getCOUNTY() + ", getSTATE_PROVINCE()="
				+ getSTATE_PROVINCE() + ", getPOSTAL_CD()=" + getPOSTAL_CD() + ", getPO_BOX()=" + getPO_BOX()
				+ ", getPO_BOX_CITY()=" + getPO_BOX_CITY() + ", getPO_BOX_POSTAL_CD()=" + getPO_BOX_POSTAL_CD()
				+ ", getLANDED_COUNTRY()=" + getLANDED_COUNTRY() + ", getEMAIL()=" + getEMAIL() + ", getPHONE()="
				+ getPHONE() + ", getCREATED_BY()=" + getCREATED_BY() + ", getCREATED_ON()=" + getCREATED_ON()
				+ ", getLAST_UPDATE_ACTION()=" + getLAST_UPDATE_ACTION() + ", getLAST_UPDATED_BY()="
				+ getLAST_UPDATED_BY() + ", getLAST_UPDATED_ON()=" + getLAST_UPDATED_ON() + "]";
	}
}