package com.rdc.entity;
import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class KNA1PK implements Serializable{

	
	private static final long serialVersionUID = 1L;

	//@NotNull(message = "INVALID_PRIMARY_KEY")
	//@Size(max = 3)
	@Column(name = "MANDT")
	String mandt = "";

	//@Size(max = 10)
	@Column(name = "KUNNR")
	//@NotNull(message = "INVALID_PRIMARY_KEY")
	String knb1kunnr = "";

	public KNA1PK() {
		mandt = "";
		knb1kunnr = "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(knb1kunnr, mandt);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		KNA1PK other = (KNA1PK) obj;
		return Objects.equals(knb1kunnr, other.knb1kunnr) && Objects.equals(mandt, other.mandt);
	}

	public KNA1PK(String mandt, String knb1kunnr) {
		this.mandt = mandt;
		this.knb1kunnr = knb1kunnr;
	}

	public String getMandt() {
		return mandt;
	}

	@Override
	public String toString() {
		return "KNA1PK [mandt=" + mandt + ", knb1kunnr=" + knb1kunnr + "]";
	}

	public void setMandt(String mandt) {
		this.mandt = mandt;
	}

	public String getKnb1kunnr() {
		return knb1kunnr;
	}

	public void setKnb1kunnr(String knb1kunnr) {
		this.knb1kunnr = knb1kunnr;
	}
}