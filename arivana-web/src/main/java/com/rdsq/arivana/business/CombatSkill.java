package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class CombatSkill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int skillPointPerLvl;
	private int maxLvl;
	private int lvlReq;
	private int preReq;
	private int preReqLvlReq;
	private String stacksWith;

	public CombatSkill() {}

	public CombatSkill(int id, String name, int skillPointPerLvl, int maxLvl, int lvlReq, int preReq, int preReqLvlReq, String stacksWith) {
		super();
		this.id = id;
		this.name = name;
		this.skillPointPerLvl = skillPointPerLvl;
		this.maxLvl = maxLvl;
		this.lvlReq = lvlReq;
		this.preReq = preReq;
		this.preReqLvlReq = preReqLvlReq;
		this.stacksWith = stacksWith;
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

	public int getSkillPointPerLvl() {
		return skillPointPerLvl;
	}

	public void setSkillPointPerLvl(int skillPointPerLvl) {
		this.skillPointPerLvl = skillPointPerLvl;
	}

	public int getLvlReq() {
		return lvlReq;
	}

	public void setLvlReq(int lvlReq) {
		this.lvlReq = lvlReq;
	}

	public int getPreReq() {
		return preReq;
	}

	public void setPreReq(int preReq) {
		this.preReq = preReq;
	}

	public int getPreReqLvlReq() {
		return preReqLvlReq;
	}

	public void setPreReqLvlReq(int preReqLvlReq) {
		this.preReqLvlReq = preReqLvlReq;
	}

	public int getMaxLvl() {
		return maxLvl;
	}

	public void setMaxLvl(int maxLvl) {
		this.maxLvl = maxLvl;
	}

	public String getStacksWith() {
		return stacksWith;
	}

	public void setStacksWith(String stacksWith) {
		this.stacksWith = stacksWith;
	}
	
	
	
	

}
