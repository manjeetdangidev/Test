package com.rdc.entity;

import java.sql.Timestamp;

public class LOCN_IDS {

	private String INSTANCE;
	private String LOCN_IDS_ROWID;
	private String COMPANY_ID;
	private String DUNS_ESTABLISHMENT_NUMBER;
	private String VAT_ID;
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

	public String getLOCN_IDS_ROWID() {
		return LOCN_IDS_ROWID;
	}

	public void setLOCN_IDS_ROWID(String lOCN_IDS_ROWID) {
		LOCN_IDS_ROWID = lOCN_IDS_ROWID;
	}

	public String getCOMPANY_ID() {
		return COMPANY_ID;
	}

	public void setCOMPANY_ID(String cOMPANY_ID) {
		COMPANY_ID = cOMPANY_ID;
	}

	public String getDUNS_ESTABLISHMENT_NUMBER() {
		return DUNS_ESTABLISHMENT_NUMBER;
	}

	public void setDUNS_ESTABLISHMENT_NUMBER(String dUNS_ESTABLISHMENT_NUMBER) {
		DUNS_ESTABLISHMENT_NUMBER = dUNS_ESTABLISHMENT_NUMBER;
	}

	public String getVAT_ID() {
		return VAT_ID;
	}

	public void setVAT_ID(String vAT_ID) {
		VAT_ID = vAT_ID;
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

	

	public String getLAST_UPDATE_ACTION() {
		return LAST_UPDATE_ACTION;
	}

	public void setLAST_UPDATE_ACTION(String lAST_UPDATE_ACTION) {
		LAST_UPDATE_ACTION = lAST_UPDATE_ACTION;
	}

	

	@Override
	public String toString() {
		return "T_LOCN_IDS [INSTANCE=" + INSTANCE + ", LOCN_IDS_ROWID=" + LOCN_IDS_ROWID + ", COMPANY_ID=" + COMPANY_ID
				+ ", DUNS_ESTABLISHMENT_NUMBER=" + DUNS_ESTABLISHMENT_NUMBER + ", VAT_ID=" + VAT_ID + ", ROW_ACCESS_ID="
				+ ROW_ACCESS_ID + ", CREATED_BY=" + CREATED_BY + ", CREATED_ON=" + CREATED_ON + ", LAST_UPDATE_ACTION="
				+ LAST_UPDATE_ACTION + ", LAST_UPDATED_BY=" + LAST_UPDATED_BY + ", LAST_UPDATED_ON=" + LAST_UPDATED_ON
				+ "]";
	}

	public Timestamp getCREATED_ON() {
		return CREATED_ON;
	}

	public void setCREATED_ON(Timestamp cREATED_ON) {
		CREATED_ON = cREATED_ON;
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

	

	
}