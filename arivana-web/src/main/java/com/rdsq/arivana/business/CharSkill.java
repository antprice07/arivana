package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class CharSkill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="charId")
	private Characters character;
	@ManyToOne
	@JoinColumn(name="skillId")
	private Skill skill;
	private int level;

	public CharSkill() {}

	public CharSkill(int id, Characters character, Skill skill, int level) {
		super();
		this.id = id;
		this.character = character;
		this.skill = skill;
		this.level = level;
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

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	

}
