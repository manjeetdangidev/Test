package com.rdc.entity;


public class T_EINVOICE_DATA {

	private String INSTANCE;
	private String SITE_ID;
	private String OWNING_ENTITY;
	private String EINVOICE_TYPE;
	private String EINVOICE_VALUE;
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

	public String getOWNING_ENTITY() {
		return OWNING_ENTITY;
	}

	public void setOWNING_ENTITY(String oWNING_ENTITY) {
		OWNING_ENTITY = oWNING_ENTITY;
	}

	public String getEINVOICE_TYPE() {
		return EINVOICE_TYPE;
	}

	public void setEINVOICE_TYPE(String eINVOICE_TYPE) {
		EINVOICE_TYPE = eINVOICE_TYPE;
	}

	public String getEINVOICE_VALUE() {
		return EINVOICE_VALUE;
	}

	public void setEINVOICE_VALUE(String eINVOICE_VALUE) {
		EINVOICE_VALUE = eINVOICE_VALUE;
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
		return "T_EINVOICE_DATA [INSTANCE=" + INSTANCE + ", SITE_ID=" + SITE_ID + ", OWNING_ENTITY=" + OWNING_ENTITY
				+ ", EINVOICE_TYPE=" + EINVOICE_TYPE + ", EINVOICE_VALUE=" + EINVOICE_VALUE + ", CREATED_BY="
				+ CREATED_BY + ", CREATED_ON=" + CREATED_ON + ", LAST_UPDATE_ACTION=" + LAST_UPDATE_ACTION
				+ ", LAST_UPDATED_BY=" + LAST_UPDATED_BY + ", LAST_UPDATED_ON=" + LAST_UPDATED_ON + ", getINSTANCE()="
				+ getINSTANCE() + ", getSITE_ID()=" + getSITE_ID() + ", getOWNING_ENTITY()=" + getOWNING_ENTITY()
				+ ", getEINVOICE_TYPE()=" + getEINVOICE_TYPE() + ", getEINVOICE_VALUE()=" + getEINVOICE_VALUE()
				+ ", getCREATED_BY()=" + getCREATED_BY() + ", getCREATED_ON()=" + getCREATED_ON()
				+ ", getLAST_UPDATE_ACTION()=" + getLAST_UPDATE_ACTION() + ", getLAST_UPDATED_BY()="
				+ getLAST_UPDATED_BY() + ", getLAST_UPDATED_ON()=" + getLAST_UPDATED_ON() + "]";
	}
}