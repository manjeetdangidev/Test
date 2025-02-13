package com.rdc.entity;

import java.sql.Timestamp;
import java.util.Objects;

public class External_CUST_IDS {

	private String MANDT;
	private String KUNNR;
	private String NATIONAL_ID;
	private Timestamp 	CREATE_DT;
	private String CREATED_BY;
	private String LAST_UPDT_TYPE;
	private Timestamp LAST_UPDT_DT;
	private String LAST_UPDT_BY;
	public String getMANDT() {
		return MANDT;
	}
	public void setMANDT(String mANDT) {
		MANDT = mANDT;
	}
	public String getKUNNR() {
		return KUNNR;
	}
	public void setKUNNR(String kUNNR) {
		KUNNR = kUNNR;
	}
	public String getNATIONAL_ID() {
		return NATIONAL_ID;
	}
	public void setNATIONAL_ID(String nATIONAL_ID) {
		NATIONAL_ID = nATIONAL_ID;
	}
	public Timestamp getCREATE_DT() {
		return CREATE_DT;
	}
	public void setCREATE_DT(Timestamp cREATE_DT) {
		CREATE_DT = cREATE_DT;
	}
	public String getCREATED_BY() {
		return CREATED_BY;
	}
	public void setCREATED_BY(String cREATED_BY) {
		CREATED_BY = cREATED_BY;
	}
	public String getLAST_UPDT_TYPE() {
		return LAST_UPDT_TYPE;
	}
	public void setLAST_UPDT_TYPE(String lAST_UPDT_TYPE) {
		LAST_UPDT_TYPE = lAST_UPDT_TYPE;
	}
	public Timestamp getLAST_UPDT_DT() {
		return LAST_UPDT_DT;
	}
	public void setLAST_UPDT_DT(Timestamp lAST_UPDT_DT) {
		LAST_UPDT_DT = lAST_UPDT_DT;
	}
	public String getLAST_UPDT_BY() {
		return LAST_UPDT_BY;
	}
	public void setLAST_UPDT_BY(String lAST_UPDT_BY) {
		LAST_UPDT_BY = lAST_UPDT_BY;
	}
	public External_CUST_IDS() {
		super();
		this.MANDT="";
		this.KUNNR="";
		this.NATIONAL_ID="";
		this.CREATE_DT=new java.sql.Timestamp(System.currentTimeMillis());
		this.CREATED_BY="";
		this.LAST_UPDT_TYPE="";
		this.LAST_UPDT_DT=new java.sql.Timestamp(System.currentTimeMillis());
		this.LAST_UPDT_BY="";
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(CREATED_BY, CREATE_DT, KUNNR, LAST_UPDT_BY, LAST_UPDT_DT, LAST_UPDT_TYPE, MANDT,
				NATIONAL_ID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		External_CUST_IDS other = (External_CUST_IDS) obj;
		return Objects.equals(CREATED_BY, other.CREATED_BY) && Objects.equals(CREATE_DT, other.CREATE_DT)
				&& Objects.equals(KUNNR, other.KUNNR) && Objects.equals(LAST_UPDT_BY, other.LAST_UPDT_BY)
				&& Objects.equals(LAST_UPDT_DT, other.LAST_UPDT_DT)
				&& Objects.equals(LAST_UPDT_TYPE, other.LAST_UPDT_TYPE) && Objects.equals(MANDT, other.MANDT)
				&& Objects.equals(NATIONAL_ID, other.NATIONAL_ID);
	}
	
	
	
}
