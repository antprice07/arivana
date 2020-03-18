package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class CharArmorInventory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="charId")
	private Characters character;
	@ManyToOne
	@JoinColumn(name="armorId")
	private Armor armor;
	private int quantity;
	private boolean head;
	private boolean body;
	private boolean leg;
	private boolean wearing;
	
	public CharArmorInventory() {}

	public CharArmorInventory(int id, Characters character, Armor armor, int quantity, boolean head, boolean body,
			boolean leg, boolean wearing) {
		super();
		this.id = id;
		this.character = character;
		this.armor = armor;
		this.quantity = quantity;
		this.head = head;
		this.body = body;
		this.leg = leg;
		this.wearing = wearing;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Characters getCharacter() {
		return character;
	}

	public void setCharacter(Characters character) {
		this.character = character;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isHead() {
		return head;
	}

	public void setHead(boolean head) {
		this.head = head;
	}

	public boolean isBody() {
		return body;
	}

	public void setBody(boolean body) {
		this.body = body;
	}

	public boolean isLeg() {
		return leg;
	}

	public void setLeg(boolean leg) {
		this.leg = leg;
	}

	public boolean isWearing() {
		return wearing;
	}

	public void setWearing(boolean wearing) {
		this.wearing = wearing;
	}
	
	

}
