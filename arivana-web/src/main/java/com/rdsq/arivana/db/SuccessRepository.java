package com.rdsq.arivana.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdsq.arivana.business.Success;

public interface SuccessRepository extends JpaRepository<Success, Integer> {
	
	Success findByColumnNameAndRoll(int skill, int roll);

}
