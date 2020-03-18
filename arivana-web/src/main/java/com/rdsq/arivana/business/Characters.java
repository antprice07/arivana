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
	@ManyToOne
	@JoinColumn(name="userId")
	private User user;

	public Characters() {}

	

}
