package com.rdsq.arivana.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdsq.arivana.business.CharMiscInventory;

public interface CharMiscInventoryRepository extends JpaRepository<CharMiscInventory, Integer> {
	
	Iterable<CharMiscInventory> findByCharactersId(Integer charId);
	CharMiscInventory findByCharactersIdAndMiscItemId(Integer charId, Integer miscItemId);

}
