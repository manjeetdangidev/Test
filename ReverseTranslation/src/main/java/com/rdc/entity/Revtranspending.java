package com.rdc.entity;


import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "T_REV_TRANS_PENDING", schema = "CUSTOMER")
public class Revtranspending implements Serializable {
		private static final long serialVersionUID = 1L;

		@EmbeddedId
		private RevtranspendingPK id;

		public RevtranspendingPK getId() {
			return id;
		}

		public void setId(RevtranspendingPK id) {
			this.id = id;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Timestamp getCreate_ts() {
			return create_ts;
		}

		public void setCreate_ts(Timestamp create_ts) {
			this.create_ts = create_ts;
		}

		public String getCreate_user() {
			return create_user;
		}

		public void setCreate_user(String create_user) {
			this.create_user = create_user;
		}

		public Timestamp getUpdate_ts() {
			return update_ts;
		}

		public void setUpdate_ts(Timestamp update_ts) {
			this.update_ts = update_ts;
		}

		public String getUpdate_user() {
			return update_user;
		}

		public void setUpdate_user(String update_user) {
			this.update_user = update_user;
		}

		public String getReq_status() {
			return req_status;
		}

		public void setReq_status(String req_status) {
			this.req_status = req_status;
		}

		@Column(name = "REQ_STATUS")
		private String req_status;

		@Column(name = "STATUS")
		private String status;

		@Column(name = "CREATE_TS")
		private Timestamp create_ts;

		@Column(name = "CREATE_USER")
		private String create_user;

		@Column(name = "UPDATE_TS")
		private Timestamp update_ts;

		@Column(name = "UPDATE_USER")
		private String update_user;
		
		@Column(name = "SEQ_NO")
		private String seq_no;

		public String getSeq_no() {
			return seq_no;
		}

		public void setSeq_no(String seq_no) {
			this.seq_no = seq_no;
		}

	}


