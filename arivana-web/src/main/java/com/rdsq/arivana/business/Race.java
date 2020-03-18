package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class Race {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String subRace;
	private String description;
	private boolean playable;
	private int intelligence;
	private int strength;
	private int perception;
	private int charisma;
	private int dexterity;
	private int wisdom;
	private int sturdiness;
	private int natMagic;
	private int endurance;
	private int luck;

	public Race() {}

	public Race(int id, String name, String subRace, String description, boolean playable, int intelligence,
			int strength, int perception, int charisma, int dexterity, int wisdom, int sturdiness, int natMagic,
			int endurance, int luck) {
		super();
		this.id = id;
		this.name = name;
		this.subRace = subRace;
		this.description = description;
		this.playable = playable;
		this.intelligence = intelligence;
		this.strength = strength;
		this.perception = perception;
		this.charisma = charisma;
		this.dexterity = dexterity;
		this.wisdom = wisdom;
		this.sturdiness = sturdiness;
		this.natMagic = natMagic;
		this.endurance = endurance;
		this.luck = luck;
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

	public String getSubRace() {
		return subRace;
	}

	public void setSubRace(String subRace) {
		this.subRace = subRace;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isPlayable() {
		return playable;
	}

	public void setPlayable(boolean playable) {
		this.playable = playable;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getPerception() {
		return perception;
	}

	public void setPerception(int perception) {
		this.perception = perception;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getSturdiness() {
		return sturdiness;
	}

	public void setSturdiness(int sturdiness) {
		this.sturdiness = sturdiness;
	}

	public int getNatMagic() {
		return natMagic;
	}

	public void setNatMagic(int natMagic) {
		this.natMagic = natMagic;
	}

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}
	
	

}
