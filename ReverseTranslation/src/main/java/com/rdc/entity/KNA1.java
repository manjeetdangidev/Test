package com.rdc.entity;
import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "KNA1", schema = "SAPR3")
public class KNA1 implements Serializable{
	private static final long serialVersionUID = 1L;

	public KNA1() {
		super();
		
		
		this.begru = "";
		this.katr10 = "";
		this.brsch = "";
		this.katr3 = "";
		this.ktokd = "";
		this.land1 = "";
		this.pstlz = "";
		this.regio = "";
		this.counc = "";
		this.sortl = "";
		this.bran1 = "";
		this.bran5 = "";
		this.name1 = "";
		this.katr6 = "";
		this.katr7 = "";
		this.katr8 = "";
		this.katr9 = "";
		this.bran3 = "";
		this.anred = "";
		this.ernam = "";
		this.erdat = "";
		this.ort02 = "";
		this.name2 = "";
		this.name3 = "";
		this.pfach = "";
		this.name4 = "";
		this.pfort = "";
		this.pstl2 = "";
		this.stras = "";
		this.ort01 = "";
		this.bahns = "";
		this.lzone = "";
		this.stcd1 = "";
		this.loevm = "";
		this.stcd2 = "";
		this.aufsd = "";
		this.stceg = "";
		this.faksd = "";
		this.txjcd = "";
		this.lifsd = "";
		this.kukla = "";
		this.rpmkr = "";
		this.milve = "";
		this.zzkvSeqno = "";
		this.zzkvInact = "";
		this.zzkvInac = "";
		this.zzkvNode1 = "";
		this.periv = "";
		this.zzkvNode2 = "";
		this.zzkvSic = "";
		this.konzs = "";
		this.datlt = "";
		this.spras = "";
		this.telf1 = "";
		this.telf2 = "";
		this.telfx = "";
		this.telx1 = "";
		this.katr1 = "";
		this.katr2 = "";
		this.katr5 = "";
		this.sap_ts = new Timestamp(serialVersionUID);
		this.zzkvSndxName1 = "";
		this.shadUpdateInd = "";
		this.zzkvUcStrtAddr = "";
		this.stkzn = "";
		this.bahne = "";
		this.zzkvLic = "";
		this.katr4 = "";
		this.adrnr = "";
		this.bbbnr = "";
		this.bbsnr = "";
		this.bubkz = "";
		this.exabl = "";
		this.fiskn = "";
		this.knazk = "";
		this.knrza = "";
		this.lifnr = "";
		this.locco = "";
		this.niels = "";
		this.cityc = "";
		this.sperr = "";
		this.stkza = "";
		this.stkzu = "";
		this.telbx = "";
		this.teltx = "";
		this.xcpdk = "";
		this.xzemp = "";
		this.vbund = "";
		this.dear1 = "";
		this.dear2 = "";
		this.dear3 = "";
		this.dear4 = "";
		this.dear5 = "";
		this.gform = "";
		this.bran2 = "";
		this.bran4 = "";
		this.ekont = "";
		this.umsat = 0;
		this.umjah = "";
		this.uwaer = "";
		this.jmzah = "";
		this.jmjah = "";
		this.umsa1 = 0;
		this.mcod1 = "";
		this.mcod2 = "";
		this.mcod3 = "";
		this.abrvw = "";
		this.inspbydebi = "";
		this.inspatdebi = "";
		this.ktocd = "";
		this.werks = "";
		this.dtams = "";
		this.dtaws = "";
		this.duefl = "";
		this.hzuor = "";
		this.sperz = "";
		this.etikg = "";
		this.civve = "";
		this.kdkg1 = "";
		this.kdkg2 = "";
		this.kdkg3 = "";
		this.kdkg4 = "";
		this.kdkg5 = "";
		this.zzkv_lotid = "";
		this.zzkv_sic = "";
		this.zzkv_lic = "";
		this.zzkv_cusno = "";
		this.zzkv_seqno = "";
		this.zzkv_dept = "";
		this.zzkv_inac = "";
		this.zzkv_inact = "";
		this.zzkv_duns = "";
		this.zzkv_node1 = "";
		this.zzkv_node2 = "";
		this.shad_update_ts = new Timestamp(serialVersionUID);
		this.shad_update_ind = "";
		this.zzkv_estab = "";
		this.zzkv_intloc = "";
		this.zzkv_intuser = "";
		this.zzkv_intfunc = "";
		this.zzkv_uc_strt_addr = "";
		this.zzkv_sndx_name1 = "";
		this.zzkv_org_flg = "";
		this.restrict_cd = "";
		this.create_opt_num = "";
		this.zzkv_partyid = "";
	}

	
	  @EmbeddedId
	  KNA1PK id;
	 
	/*
	 * @Column(name = "MANDT") String mandt = "";
	 * 
	 * //@Size(max = 10)
	 * 
	 * @Column(name = "KUNNR") //@NotNull(message = "INVALID_PRIMARY_KEY") String
	 * knb1kunnr = "";
	 * 
	 * public String getMandt() { return mandt; }
	 * 
	 * public void setMandt(String mandt) { this.mandt = mandt; }
	 * 
	 * public String getKnb1kunnr() { return knb1kunnr; }
	 * 
	 * public void setKnb1kunnr(String knb1kunnr) { this.knb1kunnr = knb1kunnr; }
	 * 
	 */	

	@Column(name = "BEGRU")
	private String begru = "";

	@Column(name = "KATR10", updatable = false)
	private String katr10 = "";

	@Column(name = "BRSCH")
	private String brsch = "";

	@Column(name = "KATR3")
	private String katr3 = "";

	@Column(name = "KTOKD")
	private String ktokd = "";

	@Column(name = "LAND1")
	private String land1 = "";

	@Column(name = "PSTLZ")
	private String pstlz = "";

	@Column(name = "REGIO")
	private String regio = "";

	@Column(name = "COUNC")
	private String counc = "";

	@Column(name = "SORTL")
	private String sortl = "";

	@Column(name = "BRAN1")
	private String bran1 = "";

	@Column(name = "BRAN5")
	private String bran5 = "";

	@Column(name = "NAME1")
	private String name1 = "";

	
	private String katr6 = "";

	@Column(name = "KATR7")
	private String katr7 = "";

	@Column(name = "KATR8")
	private String katr8 = "";

	@Column(name = "KATR9")
	private String katr9 = "";

	@Column(name = "BRAN3")
	private String bran3 = "";

	@Column(name = "ANRED")
	private String anred = "";

	@Column(name = "ERNAM")
	private String ernam = "";

	@Column(name = "ERDAT")
	private String erdat = "";

	@Column(name = "ORT02")
	private String ort02 = "";

	@Column(name = "NAME2")
	private String name2 = "";

	@Column(name = "NAME3")
	private String name3 = "";

	@Column(name = "PFACH")
	private String pfach = "";

	@Column(name = "NAME4")
	private String name4 = "";

	@Column(name = "PFORT")
	private String pfort = "";

	@Column(name = "PSTL2")
	private String pstl2 = "";

	@Column(name = "STRAS")
	private String stras = "";

	@Column(name = "ORT01")
	private String ort01 = "";

	@Column(name = "BAHNS")
	private String bahns = "";

	@Column(name = "LZONE")
	private String lzone = "";

	@Column(name = "STCD1")
	private String stcd1 = "";

	@Column(name = "LOEVM")
	private String loevm = "";

	@Column(name = "STCD2")
	private String stcd2 = "";

	@Column(name = "AUFSD")
	private String aufsd = "";

	@Column(name = "STCEG")
	private String stceg = "";

	@Column(name = "FAKSD")
	private String faksd = "";

	@Column(name = "TXJCD")
	private String txjcd = "";

	@Column(name = "LIFSD")
	private String lifsd = "";

	@Column(name = "KUKLA")
	private String kukla = "";

	@Column(name = "RPMKR")
	private String rpmkr = "";

	@Column(name = "MILVE")
	private String milve = "";

	@Column(name = "ZZKV_SEQNO", updatable = false)
	private String zzkvSeqno = "";

	@Column(name = "ZZKV_INACT")
	private String zzkvInact = "";

	@Column(name = "ZZKV_INAC")
	private String zzkvInac = "";

	@Column(name = "ZZKV_NODE1")
	private String zzkvNode1 = "";

	@Column(name = "PERIV")
	private String periv = "";

	@Column(name = "ZZKV_NODE2")
	private String zzkvNode2 = "";

	@Column(name = "ZZKV_SIC")
	private String zzkvSic = "";

	@Column(name = "KONZS")
	private String konzs = "";

	

	@Column(name = "DATLT")
	private String datlt = "";

	@Column(name = "SPRAS")
	private String spras = "";

	@Column(name = "TELF1")
	private String telf1 = "";

	@Column(name = "TELF2")
	private String telf2 = "";

	@Column(name = "TELFX")
	private String telfx = "";

	@Column(name = "TELX1")
	private String telx1 = "";

	@Column(name = "KATR1")
	private String katr1 = "";

	@Column(name = "KATR2")
	private String katr2 = "";

	@Column(name = "KATR5")
	private String katr5 = "";

	@Column(name = "SAP_TS")
	java.sql.Timestamp sap_ts = new java.sql.Timestamp(System.currentTimeMillis());

	@Column(name = "ZZKV_SNDX_NAME1")
	private String zzkvSndxName1 = "";

	@Column(name = "SHAD_UPDATE_IND")
	private String shadUpdateInd = "";

	@Column(name = "ZZKV_UC_STRT_ADDR", nullable = true)
	private String zzkvUcStrtAddr = "";

	@Column(name = "STKZN")
	private String stkzn = "";

	@Column(name = "BAHNE")
	private String bahne = "";

	@Column(name = "ZZKV_LIC")
	private String zzkvLic = "";

	@Column(name = "KATR4")
	private String katr4 = "";
	
	private String adrnr;
	private String bbbnr;
	private String bbsnr;
	private String bubkz;
	private String exabl;
	private String fiskn;
	private String knazk;
	private String knrza;
	private String lifnr;
	private String locco;
	private String niels;
	private String cityc;
	private String sperr;
	private String stkza;
	private String stkzu;
	private String telbx;
	private String teltx;
	private String xcpdk;
	private String xzemp;
	private String vbund;
	private String dear1;
	private String dear2;
	private String dear3;
	private String dear4;
	private String dear5;
	private String gform;
	private String bran2;
	private String bran4;
	private String ekont;
	private int umsat;
	private String umjah;
	private String uwaer;
	private String jmzah;
	private String jmjah;
	private int umsa1;
	private String mcod1;
	private String mcod2;
	private String mcod3;
	private String abrvw;
	private String inspbydebi;
	private String inspatdebi;
	private String ktocd;
	private String werks;
	private String dtams;
	private String dtaws;
	private String duefl;
	private String hzuor;
	private String sperz;
	private String etikg;
	private String civve;
	private String kdkg1;
	private String kdkg2;
	private String kdkg3;
	private String kdkg4;
	private String kdkg5;
	private String zzkv_lotid;
	private String zzkv_sic;
	private String zzkv_lic;
	private String zzkv_cusno;
	private String zzkv_seqno;
	private String zzkv_dept;
	private String zzkv_inac;
	private String zzkv_inact;
	private String zzkv_duns;
	private String zzkv_node1;
	private String zzkv_node2;
	private Timestamp shad_update_ts;
	private String shad_update_ind;
	private String zzkv_estab;
	private String zzkv_intloc;
	private String zzkv_intuser;
	private String zzkv_intfunc;
	private String zzkv_uc_strt_addr;
	private String zzkv_sndx_name1;
	private String zzkv_org_flg;
	private String restrict_cd;
	private String create_opt_num;
	private String zzkv_partyid;
	
	public String getAdrnr() {
		return adrnr;
	}

	public void setAdrnr(String adrnr) {
		this.adrnr = adrnr;
	}

	public String getBbbnr() {
		return bbbnr;
	}

	public void setBbbnr(String bbbnr) {
		this.bbbnr = bbbnr;
	}

	public String getBbsnr() {
		return bbsnr;
	}

	public void setBbsnr(String bbsnr) {
		this.bbsnr = bbsnr;
	}

	public String getBubkz() {
		return bubkz;
	}

	public void setBubkz(String bubkz) {
		this.bubkz = bubkz;
	}

	public String getExabl() {
		return exabl;
	}

	public void setExabl(String exabl) {
		this.exabl = exabl;
	}

	public String getFiskn() {
		return fiskn;
	}

	public void setFiskn(String fiskn) {
		this.fiskn = fiskn;
	}

	public String getKnazk() {
		return knazk;
	}

	public void setKnazk(String knazk) {
		this.knazk = knazk;
	}

	public String getKnrza() {
		return knrza;
	}

	public void setKnrza(String knrza) {
		this.knrza = knrza;
	}

	public String getLifnr() {
		return lifnr;
	}

	public void setLifnr(String lifnr) {
		this.lifnr = lifnr;
	}

	public String getLocco() {
		return locco;
	}

	public void setLocco(String locco) {
		this.locco = locco;
	}

	public String getNiels() {
		return niels;
	}

	public void setNiels(String niels) {
		this.niels = niels;
	}

	public String getCityc() {
		return cityc;
	}

	public void setCityc(String cityc) {
		this.cityc = cityc;
	}

	public String getSperr() {
		return sperr;
	}

	public void setSperr(String sperr) {
		this.sperr = sperr;
	}

	public String getStkza() {
		return stkza;
	}

	public void setStkza(String stkza) {
		this.stkza = stkza;
	}

	public String getStkzu() {
		return stkzu;
	}

	public void setStkzu(String stkzu) {
		this.stkzu = stkzu;
	}

	public String getTelbx() {
		return telbx;
	}

	public void setTelbx(String telbx) {
		this.telbx = telbx;
	}

	public String getTeltx() {
		return teltx;
	}

	public void setTeltx(String teltx) {
		this.teltx = teltx;
	}

	public String getXcpdk() {
		return xcpdk;
	}

	public void setXcpdk(String xcpdk) {
		this.xcpdk = xcpdk;
	}

	public String getXzemp() {
		return xzemp;
	}

	public void setXzemp(String xzemp) {
		this.xzemp = xzemp;
	}

	public String getVbund() {
		return vbund;
	}

	public void setVbund(String vbund) {
		this.vbund = vbund;
	}

	public String getDear1() {
		return dear1;
	}

	public void setDear1(String dear1) {
		this.dear1 = dear1;
	}

	public String getDear2() {
		return dear2;
	}

	public void setDear2(String dear2) {
		this.dear2 = dear2;
	}

	public String getDear3() {
		return dear3;
	}

	public void setDear3(String dear3) {
		this.dear3 = dear3;
	}

	public String getDear4() {
		return dear4;
	}

	public void setDear4(String dear4) {
		this.dear4 = dear4;
	}

	public String getDear5() {
		return dear5;
	}

	public void setDear5(String dear5) {
		this.dear5 = dear5;
	}

	public String getGform() {
		return gform;
	}

	public void setGform(String gform) {
		this.gform = gform;
	}

	public String getBran2() {
		return bran2;
	}

	public void setBran2(String bran2) {
		this.bran2 = bran2;
	}

	public String getBran4() {
		return bran4;
	}

	public void setBran4(String bran4) {
		this.bran4 = bran4;
	}

	public String getEkont() {
		return ekont;
	}

	public void setEkont(String ekont) {
		this.ekont = ekont;
	}

	public int getUmsat() {
		return umsat;
	}

	public void setUmsat(int umsat) {
		this.umsat = 0;
	}

	public String getUmjah() {
		return umjah;
	}

	public void setUmjah(String umjah) {
		this.umjah = umjah;
	}

	public String getUwaer() {
		return uwaer;
	}

	public void setUwaer(String uwaer) {
		this.uwaer = uwaer;
	}

	public String getJmzah() {
		return jmzah;
	}

	public void setJmzah(String jmzah) {
		this.jmzah = jmzah;
	}

	public String getJmjah() {
		return jmjah;
	}

	public void setJmjah(String jmjah) {
		this.jmjah = jmjah;
	}

	public int getUmsa1() {
		return umsa1;
	}

	public void setUmsa1(int umsa1) {
		this.umsa1 = umsa1;
	}

	public String getMcod1() {
		return mcod1.toUpperCase();
	}

	public void setMcod1(String mcod1) {
		this.mcod1 = mcod1;
	}

	public String getMcod2() {
		return mcod2.toUpperCase();
	}

	public void setMcod2(String mcod2) {
		this.mcod2 = mcod2;
	}

	public String getMcod3() {
		return mcod3.toUpperCase();
	}

	public void setMcod3(String mcod3) {
		this.mcod3 = mcod3;
	}

	public String getAbrvw() {
		return abrvw;
	}

	public void setAbrvw(String abrvw) {
		this.abrvw = abrvw;
	}

	public String getInspbydebi() {
		return inspbydebi;
	}

	public void setInspbydebi(String inspbydebi) {
		this.inspbydebi = inspbydebi;
	}

	public String getInspatdebi() {
		return inspatdebi;
	}

	public void setInspatdebi(String inspatdebi) {
		this.inspatdebi = inspatdebi;
	}

	public String getKtocd() {
		return ktocd;
	}

	public void setKtocd(String ktocd) {
		this.ktocd = ktocd;
	}

	public String getWerks() {
		return werks;
	}

	public void setWerks(String werks) {
		this.werks = werks;
	}

	public String getDtams() {
		return dtams;
	}

	public void setDtams(String dtams) {
		this.dtams = dtams;
	}

	public String getDtaws() {
		return dtaws;
	}

	public void setDtaws(String dtaws) {
		this.dtaws = dtaws;
	}

	public String getDuefl() {
		return duefl;
	}

	public void setDuefl(String duefl) {
		this.duefl = duefl;
	}

	public String getHzuor() {
		return hzuor;
	}

	public void setHzuor(String hzuor) {
		this.hzuor = hzuor;
	}

	public String getSperz() {
		return sperz;
	}

	public void setSperz(String sperz) {
		this.sperz = sperz;
	}

	public String getEtikg() {
		return etikg;
	}

	public void setEtikg(String etikg) {
		this.etikg = etikg;
	}

	public String getCivve() {
		return civve;
	}

	public void setCivve(String civve) {
		this.civve = civve;
	}

	public String getKdkg1() {
		return kdkg1;
	}

	public void setKdkg1(String kdkg1) {
		this.kdkg1 = kdkg1;
	}

	public String getKdkg2() {
		return kdkg2;
	}

	public void setKdkg2(String kdkg2) {
		this.kdkg2 = kdkg2;
	}

	public String getKdkg3() {
		return kdkg3;
	}

	public void setKdkg3(String kdkg3) {
		this.kdkg3 = kdkg3;
	}

	public String getKdkg4() {
		return kdkg4;
	}

	public void setKdkg4(String kdkg4) {
		this.kdkg4 = kdkg4;
	}

	public String getKdkg5() {
		return kdkg5;
	}

	public void setKdkg5(String kdkg5) {
		this.kdkg5 = kdkg5;
	}

	public String getZzkv_lotid() {
		return zzkv_lotid;
	}

	public void setZzkv_lotid(String zzkv_lotid) {
		this.zzkv_lotid = zzkv_lotid;
	}

	public String getZzkv_sic() {
		return zzkv_sic;
	}

	public void setZzkv_sic(String zzkv_sic) {
		this.zzkv_sic = zzkv_sic;
	}

	public String getZzkv_lic() {
		return zzkv_lic;
	}

	public void setZzkv_lic(String zzkv_lic) {
		this.zzkv_lic = zzkv_lic;
	}

	public String getZzkv_cusno() {
		return zzkv_cusno;
	}

	public void setZzkv_cusno(String zzkv_cusno) {
		this.zzkv_cusno = zzkv_cusno;
	}

	public String getZzkv_seqno() {
		return zzkv_seqno;
	}

	public void setZzkv_seqno(String zzkv_seqno) {
		this.zzkv_seqno = zzkv_seqno;
	}

	public String getZzkv_dept() {
		return zzkv_dept;
	}

	public void setZzkv_dept(String zzkv_dept) {
		this.zzkv_dept = zzkv_dept;
	}

	public String getZzkv_inac() {
		return zzkv_inac;
	}

	public void setZzkv_inac(String zzkv_inac) {
		this.zzkv_inac = zzkv_inac;
	}

	public String getZzkv_inact() {
		return zzkv_inact;
	}

	public void setZzkv_inact(String zzkv_inact) {
		this.zzkv_inact = zzkv_inact;
	}

	public String getZzkv_duns() {
		return zzkv_duns;
	}

	public void setZzkv_duns(String zzkv_duns) {
		this.zzkv_duns = zzkv_duns;
	}

	public String getZzkv_node1() {
		return zzkv_node1;
	}

	public void setZzkv_node1(String zzkv_node1) {
		this.zzkv_node1 = zzkv_node1;
	}

	public String getZzkv_node2() {
		return zzkv_node2;
	}

	public void setZzkv_node2(String zzkv_node2) {
		this.zzkv_node2 = zzkv_node2;
	}

	public Timestamp getShad_update_ts() {
		return shad_update_ts;
	}

	public void setShad_update_ts(Timestamp shad_update_ts) {
		this.shad_update_ts = shad_update_ts;
	}

	public String getShad_update_ind() {
		return shad_update_ind;
	}

	public void setShad_update_ind(String shad_update_ind) {
		this.shad_update_ind = shad_update_ind;
	}

	public String getZzkv_estab() {
		return zzkv_estab;
	}

	public void setZzkv_estab(String zzkv_estab) {
		this.zzkv_estab = zzkv_estab;
	}

	public String getZzkv_intloc() {
		return zzkv_intloc;
	}

	public void setZzkv_intloc(String zzkv_intloc) {
		this.zzkv_intloc = zzkv_intloc;
	}

	public String getZzkv_intuser() {
		return zzkv_intuser;
	}

	public void setZzkv_intuser(String zzkv_intuser) {
		this.zzkv_intuser = zzkv_intuser;
	}

	public String getZzkv_intfunc() {
		return zzkv_intfunc;
	}

	public void setZzkv_intfunc(String zzkv_intfunc) {
		this.zzkv_intfunc = zzkv_intfunc;
	}

	public String getZzkv_uc_strt_addr() {
		return zzkv_uc_strt_addr;
	}

	public void setZzkv_uc_strt_addr(String zzkv_uc_strt_addr) {
		this.zzkv_uc_strt_addr = zzkv_uc_strt_addr;
	}

	public String getZzkv_sndx_name1() {
		return zzkv_sndx_name1;
	}

	public void setZzkv_sndx_name1(String zzkv_sndx_name1) {
		this.zzkv_sndx_name1 = zzkv_sndx_name1;
	}

	public String getZzkv_org_flg() {
		return zzkv_org_flg;
	}

	public void setZzkv_org_flg(String zzkv_org_flg) {
		this.zzkv_org_flg = zzkv_org_flg;
	}

	public String getRestrict_cd() {
		return restrict_cd;
	}

	public void setRestrict_cd(String restrict_cd) {
		this.restrict_cd = restrict_cd;
	}

	public String getCreate_opt_num() {
		return create_opt_num;
	}

	public void setCreate_opt_num(String create_opt_num) {
		this.create_opt_num = create_opt_num;
	}

	public String getZzkv_partyid() {
		return zzkv_partyid;
	}

	public void setZzkv_partyid(String zzkv_partyid) {
		this.zzkv_partyid = zzkv_partyid;
	}


	



	
	  public KNA1PK getId() { return id; }
	  
	  public void setId(KNA1PK id) { this.id = id; }
	 

	

	public String getZzkvSeqno() {
		return zzkvSeqno;
	}

	public void setZzkvSeqno(String zzkvSeqno) {
		this.zzkvSeqno = zzkvSeqno;
	}

	public String getBegru() {
		return begru;
	}

	public void setBegru(String begru) {
		this.begru = begru;
	}

	public String getKatr10() {
		return katr10;
	}

	public void setKatr10(String katr10) {
		this.katr10 = katr10;
	}

	public String getBrsch() {
		return brsch;
	}

	public void setBrsch(String brsch) {
		this.brsch = brsch;
	}

	public String getKatr3() {
		return katr3;
	}

	public void setKatr3(String katr3) {
		this.katr3 = katr3;
	}

	public String getKtokd() {
		return ktokd;
	}

	public void setKtokd(String ktokd) {
		this.ktokd = ktokd;
	}

	public String getLand1() {
		return land1;
	}

	public void setLand1(String land1) {
		this.land1 = land1;
	}

	public String getPstlz() {
		return pstlz;
	}

	public void setPstlz(String pstlz) {
		this.pstlz = pstlz;
	}

	public String getRegio() {
		return regio;
	}

	public void setRegio(String regio) {
		this.regio = regio;
	}

	public String getCounc() {
		return counc;
	}

	public void setCounc(String counc) {
		this.counc = counc;
	}

	public String getSortl() {
		return sortl;
	}

	public void setSortl(String sortl) {
		this.sortl = sortl;
	}

	public String getBran1() {
		return bran1;
	}

	public void setBran1(String bran1) {
		this.bran1 = bran1;
	}

	public String getBran5() {
		return bran5;
	}

	public void setBran5(String bran5) {
		this.bran5 = bran5;
	}

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getKatr6() {
		return katr6;
	}

	public void setKatr6(String katr6) {
		this.katr6 = katr6;
	}

	public String getKatr7() {
		return katr7;
	}

	public void setKatr7(String katr7) {
		this.katr7 = katr7;
	}

	public String getKatr8() {
		return katr8;
	}

	public void setKatr8(String katr8) {
		this.katr8 = katr8;
	}

	public String getKatr9() {
		return katr9;
	}

	public void setKatr9(String katr9) {
		this.katr9 = katr9;
	}

	public String getBran3() {
		return bran3;
	}

	public void setBran3(String bran3) {
		this.bran3 = bran3;
	}

	public String getAnred() {
		return anred;
	}

	public void setAnred(String anred) {
		this.anred = anred;
	}

	public String getErnam() {
		return ernam;
	}

	public void setErnam(String ernam) {
		this.ernam = ernam;
	}

	public String getErdat() {
		return erdat;
	}

	public void setErdat(String erdat) {
		this.erdat = erdat;
	}

	public String getOrt02() {
		return ort02;
	}

	public void setOrt02(String ort02) {
		this.ort02 = ort02;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	public String getPfach() {
		return pfach;
	}

	public void setPfach(String pfach) {
		this.pfach = pfach;
	}

	public String getName4() {
		return name4;
	}

	public void setName4(String name4) {
		this.name4 = name4;
	}

	public String getPfort() {
		return pfort;
	}

	public void setPfort(String pfort) {
		this.pfort = pfort;
	}

	public String getPstl2() {
		return pstl2;
	}

	public void setPstl2(String pstl2) {
		this.pstl2 = pstl2;
	}

	public String getStras() {
		return stras;
	}

	public void setStras(String stras) {
		this.stras = stras;
	}

	public String getOrt01() {
		return ort01;
	}

	public void setOrt01(String ort01) {
		this.ort01 = ort01;
	}

	public String getBahns() {
		return bahns;
	}

	public void setBahns(String bahns) {
		this.bahns = bahns;
	}

	public String getLzone() {
		return lzone;
	}

	public void setLzone(String lzone) {
		this.lzone = lzone;
	}

	public String getStcd1() {
		return stcd1;
	}

	public void setStcd1(String stcd1) {
		this.stcd1 = stcd1;
	}

	public String getLoevm() {
		return loevm;
	}

	public void setLoevm(String loevm) {
		this.loevm = loevm;
	}

	public String getStcd2() {
		return stcd2;
	}

	public void setStcd2(String stcd2) {
		this.stcd2 = stcd2;
	}

	public String getAufsd() {
		return aufsd;
	}

	public void setAufsd(String aufsd) {
		this.aufsd = aufsd;
	}

	public String getStceg() {
		return stceg;
	}

	public void setStceg(String stceg) {
		this.stceg = stceg;
	}

	public String getFaksd() {
		return faksd;
	}

	public void setFaksd(String faksd) {
		this.faksd = faksd;
	}

	public String getTxjcd() {
		return txjcd;
	}

	public void setTxjcd(String txjcd) {
		this.txjcd = txjcd;
	}

	public String getLifsd() {
		return lifsd;
	}

	public void setLifsd(String lifsd) {
		this.lifsd = lifsd;
	}

	public String getKukla() {
		return kukla;
	}

	public void setKukla(String kukla) {
		this.kukla = kukla;
	}

	public String getRpmkr() {
		return rpmkr;
	}

	public void setRpmkr(String rpmkr) {
		this.rpmkr = rpmkr;
	}

	public String getMilve() {
		return milve;
	}

	public void setMilve(String milve) {
		this.milve = milve;
	}

	public String getZzkvInact() {
		return zzkvInact;
	}

	public void setZzkvInact(String zzkvInact) {
		this.zzkvInact = zzkvInact;
	}

	public String getZzkvNode1() {
		return zzkvNode1;
	}

	public void setZzkvNode1(String zzkvNode1) {
		this.zzkvNode1 = zzkvNode1;
	}

	public String getPeriv() {
		return periv;
	}

	public void setPeriv(String periv) {
		this.periv = periv;
	}

	public String getZzkvNode2() {
		return zzkvNode2;
	}

	public void setZzkvNode2(String zzkvNode2) {
		this.zzkvNode2 = zzkvNode2;
	}

	public String getZzkvSic() {
		return zzkvSic;
	}

	public void setZzkvSic(String zzkvSic) {
		this.zzkvSic = zzkvSic;
	}

	public String getKonzs() {
		return konzs;
	}

	public void setKonzs(String konzs) {
		this.konzs = konzs;
	}

	public String getDatlt() {
		return datlt;
	}

	public void setDatlt(String datlt) {
		this.datlt = datlt;
	}

	public String getSpras() {
		return spras;
	}

	public void setSpras(String spras) {
		this.spras = spras;
	}

	public String getTelf1() {
		return telf1;
	}

	public void setTelf1(String telf1) {
		this.telf1 = telf1;
	}

	public String getTelf2() {
		return telf2;
	}

	public void setTelf2(String telf2) {
		this.telf2 = telf2;
	}

	public String getTelfx() {
		return telfx;
	}

	public void setTelfx(String telfx) {
		this.telfx = telfx;
	}

	public String getTelx1() {
		return telx1;
	}

	public void setTelx1(String telx1) {
		this.telx1 = telx1;
	}

	public String getKatr1() {
		return katr1;
	}

	public void setKatr1(String katr1) {
		this.katr1 = katr1;
	}

	public String getKatr2() {
		return katr2;
	}

	public void setKatr2(String katr2) {
		this.katr2 = katr2;
	}

	public String getKatr5() {
		return katr5;
	}

	public void setKatr5(String katr5) {
		this.katr5 = katr5;
	}

	public Timestamp getSap_ts() {
		return sap_ts;
	}

	public void setSap_ts(Timestamp sap_ts) {
		this.sap_ts = sap_ts;
	}

	public String getZzkvSndxName1() {
		return zzkvSndxName1;
	}

	public void setZzkvSndxName1(String zzkvSndxName1) {
		this.zzkvSndxName1 = zzkvSndxName1;
	}

	public String getShadUpdateInd() {
		return shadUpdateInd;
	}

	public void setShadUpdateInd(String shadUpdateInd) {
		this.shadUpdateInd = shadUpdateInd;
	}

	public String getZzkvUcStrtAddr() {
		return this.zzkvUcStrtAddr;
	}

	public void setZzkvUcStrtAddr(String zzkvUcStrtAddr) {
		this.zzkvUcStrtAddr = zzkvUcStrtAddr;
	}

	public String getZzkvInac() {
		return zzkvInac;
	}

	public void setZzkvInac(String zzkvInac) {
		this.zzkvInac = zzkvInac;
	}

	public String getStkzn() {
		return stkzn;
	}

	public void setStkzn(String stkzn) {
		this.stkzn = stkzn;
	}

	public String getBahne() {
		return bahne;
	}

	public void setBahne(String bahne) {
		this.bahne = bahne;
	}

	public String getZzkvLic() {
		return zzkvLic;
	}

	public void setZzkvLic(String zzkvLic) {
		this.zzkvLic = zzkvLic;
	}

	public String getKatr4() {
		return katr4;
	}

	public void setKatr4(String katr4) {
		this.katr4 = katr4;
	}

}
