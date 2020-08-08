package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class Potion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private int monetaryVal;
	@ManyToOne
	@JoinColumn(name="monetaryType")
	private CurrencyType currencyType;
	
	
	
	public Potion(int id, String name, String description, int monetaryVal, CurrencyType currencyType) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.monetaryVal = monetaryVal;
		this.currencyType = currencyType;
	}



	public Potion() {
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public int getMonetaryVal() {
		return monetaryVal;
	}



	public void setMonetaryVal(int monetaryVal) {
		this.monetaryVal = monetaryVal;
	}



	public CurrencyType getCurrencyType() {
		return currencyType;
	}



	public void setCurrencyType(CurrencyType currencyType) {
		this.currencyType = currencyType;
	}

	
}
