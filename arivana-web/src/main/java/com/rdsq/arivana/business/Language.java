package com.rdsq.arivana.business;

import javax.persistence.*;

@Entity
public class Language {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String skillName;
	private int skillPointPer;
	private int intelligenceMin;
	
	

	public Language(int id, String skillName, int skillPointPer, int intelligenceMin) {
		super();
		this.id = id;
		this.skillName = skillName;
		this.skillPointPer = skillPointPer;
		this.intelligenceMin = intelligenceMin;
	}



	public Language() {
		
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getSkillName() {
		return skillName;
	}



	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}



	public int getSkillPointPer() {
		return skillPointPer;
	}



	public void setSkillPointPer(int skillPointPer) {
		this.skillPointPer = skillPointPer;
	}



	public int getIntelligenceMin() {
		return intelligenceMin;
	}



	public void setIntelligenceMin(int intelligenceMin) {
		this.intelligenceMin = intelligenceMin;
	}
	
	

}
