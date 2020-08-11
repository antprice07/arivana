package com.rdsq.arivana.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdsq.arivana.business.CharCombatSkill;

public interface CharCombatSkillRepository extends JpaRepository<CharCombatSkill, Integer> {
	
	Iterable<CharCombatSkill> findByCharacterId(Integer charId);

}
