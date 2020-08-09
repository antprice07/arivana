package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class Characters {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int xp;
	private int level;
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;
	@ManyToOne
	@JoinColumn(name="raceId")
	private Race race;
	@ManyToOne
	@JoinColumn(name="charClassId")
	private CharClass charclass;
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
	private int hp;
	private int maxHp;
	private int skillPoints;
	private int statPoints;
	private int magicPoints;
	private int slashArmor;
	private int crushArmor;
	private int pierceArmor;
	private int magicArmor;
	

	public Characters(int id, String name, int xp, int level, User user, Race race, CharClass charclass,
			int intelligence, int strength, int perception, int charisma, int dexterity, int wisdom, int sturdiness,
			int natMagic, int endurance, int luck, int hp, int maxHp, int skillPoints, int statPoints, int magicPoints,
			int slashArmor, int crushArmor, int pierceArmor, int magicArmor) {
		super();
		this.id = id;
		this.name = name;
		this.xp = xp;
		this.level = level;
		this.user = user;
		this.race = race;
		this.charclass = charclass;
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
		this.hp = hp;
		this.maxHp = maxHp;
		this.skillPoints = skillPoints;
		this.statPoints = statPoints;
		this.magicPoints = magicPoints;
		this.slashArmor = slashArmor;
		this.crushArmor = crushArmor;
		this.pierceArmor = pierceArmor;
		this.magicArmor = magicArmor;
	}


	public Characters() {}


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


	public int getXp() {
		return xp;
	}


	public void setXp(int xp) {
		this.xp = xp;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Race getRace() {
		return race;
	}


	public void setRace(Race race) {
		this.race = race;
	}


	public CharClass getCharclass() {
		return charclass;
	}


	public void setCharclass(CharClass charclass) {
		this.charclass = charclass;
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


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getMaxHp() {
		return maxHp;
	}


	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}


	public int getSkillPoints() {
		return skillPoints;
	}


	public void setSkillPoints(int skillPoints) {
		this.skillPoints = skillPoints;
	}


	public int getStatPoints() {
		return statPoints;
	}


	public void setStatPoints(int statPoints) {
		this.statPoints = statPoints;
	}


	public int getMagicPoints() {
		return magicPoints;
	}


	public void setMagicPoints(int magicPoints) {
		this.magicPoints = magicPoints;
	}


	public int getSlashArmor() {
		return slashArmor;
	}


	public void setSlashArmor(int slashArmor) {
		this.slashArmor = slashArmor;
	}


	public int getCrushArmor() {
		return crushArmor;
	}


	public void setCrushArmor(int crushArmor) {
		this.crushArmor = crushArmor;
	}


	public int getPierceArmor() {
		return pierceArmor;
	}


	public void setPierceArmor(int pierceArmor) {
		this.pierceArmor = pierceArmor;
	}


	public int getMagicArmor() {
		return magicArmor;
	}


	public void setMagicArmor(int magicArmor) {
		this.magicArmor = magicArmor;
	}
	

	

}
