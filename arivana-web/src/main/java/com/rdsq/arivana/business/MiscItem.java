package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class MiscItem implements InventoryItems {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int monetaryVal;
	@ManyToOne
	@JoinColumn(name="monetaryType")
	private CurrencyType currencyType;

	public MiscItem() {}

	public MiscItem(int id, String name, int monetaryVal, CurrencyType currencyType) {
		super();
		this.id = id;
		this.name = name;
		this.monetaryVal = monetaryVal;
		this.currencyType = currencyType;
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
