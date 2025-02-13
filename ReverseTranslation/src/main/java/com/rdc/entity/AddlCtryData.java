package com.rdc.entity;
import java.sql.Timestamp;

public class AddlCtryData {
	
	

	

	    public String getField_Name() {
		return field_Name;
	}

	public void setField_Name(String field_Name) {
		this.field_Name = field_Name;
	}

	public String getField_Value() {
		return field_Value;
	}

	public void setField_Value(String field_Value) {
		this.field_Value = field_Value;
	}

	public String getField_Qualifier() {
		return field_Qualifier;
	}

	public void setField_Qualifier(String field_Qualifier) {
		this.field_Qualifier = field_Qualifier;
	}

	public Timestamp getCreate_Dt() {
		return create_Dt;
	}

	public void setCreate_Dt(Timestamp create_Dt) {
		this.create_Dt = create_Dt;
	}

	public Timestamp getUpdate_Dt() {
		return update_Dt;
	}

	public void setUpdate_Dt(Timestamp update_Dt) {
		this.update_Dt = update_Dt;
	}

	public String getUpdated_By() {
		return updated_By;
	}

	public void setUpdated_By(String updated_By) {
		this.updated_By = updated_By;
	}

	public String getUpdate_Type() {
		return update_Type;
	}

	public void setUpdate_Type(String update_Type) {
		this.update_Type = update_Type;
	}

		private String mandt;           // MANDT (CHARACTER(3))
	    private String kunnr;           // KUNNR (VARCHAR(10))
	    private String field_Name;       // FIELD_NAME (VARCHAR(35))
	    private String field_Value;      // FIELD_VALUE (VARCHAR(60))
	    private String field_Qualifier;  // FIELD_QUALIFIER (CHARACTER(4)) - nullable
	    private String loevm;           // LOEVM (CHARACTER(1)) - nullable
	    private Timestamp create_Dt;     // CREATE_DT (TIMESTAMP)
	    private String created_By;       // CREATED_BY (VARCHAR(20))
	    private Timestamp update_Dt;     // UPDATE_DT (TIMESTAMP) - nullable
	    private String updated_By;       // UPDATED_BY (VARCHAR(20)) - nullable
	    private String update_Type;      // UPDATE_TYPE (CHARACTER(1))

	   

	    // Getters and Setters

	    public String getMandt() {
	        return mandt;
	    }

	    public void setMandt(String mandt) {
	        this.mandt = mandt;
	    }

	    public String getKunnr() {
	        return kunnr;
	    }

	    public void setKunnr(String kunnr) {
	        this.kunnr = kunnr;
	    }

	    

	    public String getLoevm() {
	        return loevm;
	    }

	    public void setLoevm(String loevm) {
	        this.loevm = loevm;
	    }

	    

	    public String getCreated_By() {
	        return created_By;
	    }

	    public void setCreated_By(String created_By) {
	        this.created_By = created_By;
	    }

	    public Timestamp getUpdateDt() {
	        return update_Dt;
	    }

	    

	    // toString() method for displaying object contents (useful for debugging)
	    @Override
	    public String toString() {
	        return "AddlCtryData{" +
	                "mandt='" + mandt + '\'' +
	                ", kunnr='" + kunnr + '\'' +
	                ", fieldName='" + field_Name + '\'' +
	                ", fieldValue='" + field_Value + '\'' +
	                ", fieldQualifier='" + field_Qualifier + '\'' +
	                ", loevm='" + loevm + '\'' +
	                ", create_Dt=" + create_Dt +
	                ", created_By='" + created_By + '\'' +
	                ", update_Dt=" + update_Dt +
	                ", updated_By='" + updated_By + '\'' +
	                ", update_Type='" + update_Type + '\'' +
	                '}';
	    }
	    
	    // Constructor
	    
	    public AddlCtryData() {
	        this.mandt = "";
	        this.kunnr = "";
	        this.field_Name = "";
	        this.field_Value = "";
	        this.field_Qualifier = "";
	        this.loevm = "";
	        this.create_Dt = new java.sql.Timestamp(System.currentTimeMillis());
	        this.created_By = "";
	        this.update_Dt = new java.sql.Timestamp(System.currentTimeMillis());
	        this.updated_By = "";
	        this.update_Type = "";
	    }
	}


