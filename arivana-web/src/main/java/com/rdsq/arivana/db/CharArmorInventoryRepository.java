package com.rdsq.arivana.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdsq.arivana.business.CharArmorInventory;

public interface CharArmorInventoryRepository extends JpaRepository<CharArmorInventory, Integer> {
	
	Iterable<CharArmorInventory> findByCharacterId(Integer id);
	CharArmorInventory findByCharacterIdAndArmorId(Integer charId, Integer armorId);
}
