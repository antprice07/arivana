package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class CharMiscInventory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="charId")
	private Characters character;
	@ManyToOne
	@JoinColumn(name="miscItemId")
	private MiscItem miscItem;
	private int quantity;
	
	public CharMiscInventory() {}

	public CharMiscInventory(int id, Characters character, MiscItem miscItem, int quantity) {
		super();
		this.id = id;
		this.character = character;
		this.miscItem = miscItem;
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

	public MiscItem getMiscItem() {
		return miscItem;
	}

	public void setMiscItem(MiscItem miscItem) {
		this.miscItem = miscItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
