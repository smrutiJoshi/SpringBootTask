package com.enigma.userproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enigma.userproject.model.Users;
import com.enigma.userproject.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	
	// Get List of All Users
	public List<Users> getAllUserDetails() {
		// TODO Auto-generated method stub
		List<Users> getUsersFromdb = new ArrayList();
		repository.findAll().forEach(getUsersFromdb::add);
		
		return getUsersFromdb;
	}


	public void addUserDetail(Users user) {
		// TODO Auto-generated method stub
		
		repository.save(user);
	}

	@Transactional
	public void deleteByUsername(String username) {
		System.out.println(username);
		repository.deleteByUsername(username);
		//return "deleted successfully";

	}


	public Users findByUsername(String username) {
		// TODO Auto-generated method stub
		return repository.findByUsername(username);
	}


	
	
	

}
