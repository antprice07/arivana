package com.rdsq.arivana.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdsq.arivana.business.CharSkill;

public interface CharSkillRepository extends JpaRepository<CharSkill, Integer> {
	
	Iterable<CharSkill> findByCharactersId(Integer charId);
	CharSkill findByCharacterIdAndCombatSkillId(Integer charId, Integer combatSkillId);

}
