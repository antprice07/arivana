package com.rdsq.arivana.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdsq.arivana.business.CharWeaponInventory;

public interface CharWeaponInventoryRepository extends JpaRepository<CharWeaponInventory, Integer> {
	
	Iterable<CharWeaponInventory> findByCharactersId(Integer charId);
	CharWeaponInventory findByCharactersIdAndWeaponId(Integer charId, Integer weaponId);

}
