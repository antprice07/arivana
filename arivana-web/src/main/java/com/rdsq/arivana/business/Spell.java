package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class Spell {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private int skillPointPer;
	private int castLvl;
	

	public Spell(int id, String name, String description, int skillPointPer, int castLvl) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.skillPointPer = skillPointPer;
		this.castLvl = castLvl;
	}


	public Spell() {
		// TODO Auto-generated constructor stub
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getSkillPointPer() {
		return skillPointPer;
	}


	public void setSkillPointPer(int skillPointPer) {
		this.skillPointPer = skillPointPer;
	}


	public int getCastLvl() {
		return castLvl;
	}


	public void setCastLvl(int castLvl) {
		this.castLvl = castLvl;
	}

}
