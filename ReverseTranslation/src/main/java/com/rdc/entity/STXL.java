package com.rdc.entity;

import java.sql.Timestamp;

public class STXL {

	private String MANDT;
	private String RELID;
	private String TDOBJECT;
	private String TDNAME;
	private String TDID;
	private String TDSPRAS;
	private int SRTF2;
	private int CLUSTR;
	private String CLUSTD;
	private Timestamp SHAD_UPDATE_TS;
	private String SHAD_UPDATE_IND;
	private Timestamp SAP_TS;

	public String getMANDT() {
		return MANDT;
	}

	public void setMANDT(String mANDT) {
		MANDT = mANDT;
	}

	public String getRELID() {
		return RELID;
	}

	public void setRELID(String rELID) {
		RELID = rELID;
	}

	public String getTDOBJECT() {
		return TDOBJECT;
	}

	public void setTDOBJECT(String tDOBJECT) {
		TDOBJECT = tDOBJECT;
	}

	public String getTDNAME() {
		return TDNAME;
	}

	public void setTDNAME(String tDNAME) {
		TDNAME = tDNAME;
	}

	public String getTDID() {
		return TDID;
	}

	public void setTDID(String tDID) {
		TDID = tDID;
	}

	public String getTDSPRAS() {
		return TDSPRAS;
	}

	public void setTDSPRAS(String tDSPRAS) {
		TDSPRAS = tDSPRAS;
	}

	public int getSRTF2() {
		return SRTF2;
	}

	public void setSRTF2(int sRTF2) {
		SRTF2 = sRTF2;
	}

	public int getCLUSTR() {
		return CLUSTR;
	}

	public void setCLUSTR(int cLUSTR) {
		CLUSTR = cLUSTR;
	}

	public String getCLUSTD() {
		return CLUSTD;
	}

	public void setCLUSTD(String cLUSTD) {
		CLUSTD = cLUSTD;
	}

	public Timestamp getSHAD_UPDATE_TS() {
		return SHAD_UPDATE_TS;
	}

	public void setSHAD_UPDATE_TS(Timestamp sHAD_UPDATE_TS) {
		SHAD_UPDATE_TS = sHAD_UPDATE_TS;
	}

	public String getSHAD_UPDATE_IND() {
		return SHAD_UPDATE_IND;
	}

	public void setSHAD_UPDATE_IND(String sHAD_UPDATE_IND) {
		SHAD_UPDATE_IND = sHAD_UPDATE_IND;
	}

	public Timestamp getSAP_TS() {
		return SAP_TS;
	}

	public void setSAP_TS(Timestamp sAP_TS) {
		SAP_TS = sAP_TS;
	}

	public STXL() {
		super();
		this.MANDT="";
		this.RELID="";
		this.TDOBJECT="";
		this.TDNAME="";
		this.TDID="";
		this.TDSPRAS="";
		this.SRTF2=0;
		this.CLUSTR=0;
		this.CLUSTD="";
		this.SHAD_UPDATE_TS=new java.sql.Timestamp(System.currentTimeMillis());;
		this.SHAD_UPDATE_IND="";
		this.SAP_TS=new java.sql.Timestamp(System.currentTimeMillis());;
	}
	
}