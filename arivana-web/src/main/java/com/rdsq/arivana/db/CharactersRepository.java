package com.rdsq.arivana.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdsq.arivana.business.Characters;

public interface CharactersRepository extends JpaRepository<Characters, Integer> {

}
