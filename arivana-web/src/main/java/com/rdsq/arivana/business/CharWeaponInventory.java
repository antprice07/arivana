package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class CharWeaponInventory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="charId")
	private Characters character;
	@ManyToOne
	@JoinColumn(name="weaponId")
	private Weapon weapon;
	private int quantity;

	public CharWeaponInventory() {}

	public CharWeaponInventory(int id, Characters character, Weapon weapon, int quantity) {
		super();
		this.id = id;
		this.character = character;
		this.weapon = weapon;
		this.quantity = quantity;
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

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
