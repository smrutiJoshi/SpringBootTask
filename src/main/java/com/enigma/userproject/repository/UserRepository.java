package com.enigma.userproject.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.enigma.userproject.model.Users;


public interface UserRepository extends JpaRepository<Users,UUID>{

	void deleteByUsername(String username);

	Users findByUsername(String username);

	//Integer deleteByUserName(String username);

	

}
