package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class Weapon {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int damage;
	private String typeOfDmg;
	private int monetaryVal;
	@ManyToOne
	@JoinColumn(name="monetaryType")
	private CurrencyType currencyType;

	public Weapon() {}

	public Weapon(int id, String name, int damage, String typeOfDmg, int monetaryVal, CurrencyType currencyType) {
		super();
		this.id = id;
		this.name = name;
		this.damage = damage;
		this.typeOfDmg = typeOfDmg;
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

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public String getTypeOfDmg() {
		return typeOfDmg;
	}

	public void setTypeOfDmg(String typeOfDmg) {
		this.typeOfDmg = typeOfDmg;
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
