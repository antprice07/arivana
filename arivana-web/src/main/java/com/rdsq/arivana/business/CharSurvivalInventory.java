package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class CharSurvivalInventory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="charId")
	private Characters character;
	@ManyToOne
	@JoinColumn(name="suvivalItemId")
	private SurvivalItem survivalItem;
	private int quantity;

	public CharSurvivalInventory() {}

	public CharSurvivalInventory(int id, Characters character, SurvivalItem survivalItem, int quantity) {
		super();
		this.id = id;
		this.character = character;
		this.survivalItem = survivalItem;
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

	public SurvivalItem getSurvivalItem() {
		return survivalItem;
	}

	public void setSurvivalItem(SurvivalItem survivalItem) {
		this.survivalItem = survivalItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
