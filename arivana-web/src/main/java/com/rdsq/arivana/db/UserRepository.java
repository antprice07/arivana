package com.rdsq.arivana.db;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdsq.arivana.business.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);
	User findByUsernameAndPassword(String username,String password);
	User findByEmail(String email);

}
