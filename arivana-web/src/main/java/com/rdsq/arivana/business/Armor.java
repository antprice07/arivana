package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class Armor implements InventoryItems {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int slashProt;
	private int crushProt;
	private int pierceProt;
	private int magicProt;
	private int dexterBuff;
	private int monetaryVal;
	@ManyToOne
	@JoinColumn(name="monetaryType")
	private CurrencyType monetaryType;
	
	public Armor() {}

	public Armor(int id, String name, int slashProt, int crushProt, int pierceProt, int magicProt, int dexterBuff,
			int monetaryVal, CurrencyType monetaryType) {
		super();
		this.id = id;
		this.name = name;
		this.slashProt = slashProt;
		this.crushProt = crushProt;
		this.pierceProt = pierceProt;
		this.magicProt = magicProt;
		this.dexterBuff = dexterBuff;
		this.monetaryVal = monetaryVal;
		this.monetaryType = monetaryType;
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

	public int getSlashProt() {
		return slashProt;
	}

	public void setSlashProt(int slashProt) {
		this.slashProt = slashProt;
	}

	public int getCrushProt() {
		return crushProt;
	}

	public void setCrushProt(int crushProt) {
		this.crushProt = crushProt;
	}

	public int getPierceProt() {
		return pierceProt;
	}

	public void setPierceProt(int pierceProt) {
		this.pierceProt = pierceProt;
	}

	public int getMagicProt() {
		return magicProt;
	}

	public void setMagicProt(int magicProt) {
		this.magicProt = magicProt;
	}

	public int getDexterBuff() {
		return dexterBuff;
	}

	public void setDexterBuff(int dexterBuff) {
		this.dexterBuff = dexterBuff;
	}

	public int getMonetaryVal() {
		return monetaryVal;
	}

	public void setMonetaryVal(int monetaryVal) {
		this.monetaryVal = monetaryVal;
	}

	public CurrencyType getMonetaryType() {
		return monetaryType;
	}

	public void setMonetaryType(CurrencyType monetaryType) {
		this.monetaryType = monetaryType;
	}
	
	

}
