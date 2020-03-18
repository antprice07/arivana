package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class CharCombatSkill {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="charId")
	private Characters character;
	@ManyToOne
	@JoinColumn(name="combatSkillId")
	private CombatSkill combatSkill;
	private int level;
	
	public CharCombatSkill() {}

	public CharCombatSkill(int id, Characters character, CombatSkill combatSkill, int level) {
		super();
		this.id = id;
		this.character = character;
		this.combatSkill = combatSkill;
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

	public CombatSkill getCombatSkill() {
		return combatSkill;
	}

	public void setCombatSkill(CombatSkill combatSkill) {
		this.combatSkill = combatSkill;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	

}
