package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class Success {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int columnName;
	private int roll;
	private boolean successful;
	private boolean critical;
	

	public Success(int id, int columnName, int roll, boolean successful, boolean critical) {
		super();
		this.id = id;
		this.columnName = columnName;
		this.roll = roll;
		this.successful = successful;
		this.critical = critical;
	}


	public Success() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public int getColumnName() {
		return columnName;
	}


	public int getRoll() {
		return roll;
	}


	public boolean isSuccessful() {
		return successful;
	}


	public boolean isCritical() {
		return critical;
	}
	

}
