package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class Skill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int skillPointPerLvl;
	private int lvlReq;
	private int maxLvl;
	private String preReq;
	private int preReqLvlReq;
	private String description;
	private boolean preReqIsStat;
	
	

	public Skill(int id, String name, int skillPointPerLvl, int lvlReq, int maxLvl, String preReq, int preReqLvlReq,
			boolean preReqIsStat, String description) {
		super();
		this.id = id;
		this.name = name;
		this.skillPointPerLvl = skillPointPerLvl;
		this.lvlReq = lvlReq;
		this.maxLvl = maxLvl;
		this.preReq = preReq;
		this.preReqLvlReq = preReqLvlReq;
		this.preReqIsStat = preReqIsStat;
		this.description = description;
	}

	public Skill() {}

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

	public int getMaxLvl() {
		return maxLvl;
	}

	public void setMaxLvl(int maxLvl) {
		this.maxLvl = maxLvl;
	}

	public String getPreReq() {
		return preReq;
	}

	public void setPreReq(String preReq) {
		this.preReq = preReq;
	}

	public int getPreReqLvlReq() {
		return preReqLvlReq;
	}

	public void setPreReqLvlReq(int preReqLvlReq) {
		this.preReqLvlReq = preReqLvlReq;
	}

	public boolean isPreReqIsStat() {
		return preReqIsStat;
	}

	public void setPreReqIsStat(boolean preReqIsStat) {
		this.preReqIsStat = preReqIsStat;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
