package com.rdsq.arivana.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdsq.arivana.business.CharSurvivalInventory;

public interface CharSurvivalInventoryRepository extends JpaRepository<CharSurvivalInventory, Integer> {
	
	Iterable<CharSurvivalInventory> findByCharactersId(Integer charId);
	CharSurvivalInventory findByCharactersIdAndSurvivalItemId(Integer charId, Integer survivalItemId);

}
