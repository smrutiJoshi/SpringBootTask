package com.enigma.userproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.enigma.userproject.exception.AgeLimitException;
import com.enigma.userproject.exception.UserExistsException;
import com.enigma.userproject.exception.UserNotFountException;
import com.enigma.userproject.model.Users;
import com.enigma.userproject.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/user")
	public String addUser(@RequestBody Users user) {
		int userage = user.getAge();
		String message = "";
		boolean invalid = false ;
		if(!(userage<120 && userage>0)) {
			message = "Age is not between 0-120";
			invalid = true;
			throw new AgeLimitException(message);
			
		}
		
		Users user1 = userService.findByUsername(user.getUsername());
		if(user1 != null) {
			invalid = true;
			message = "Username already exist";
			throw new UserExistsException(message);
		}
			
		  if(!invalid) {
			  userService.addUserDetail(user);
			  message = "User Added successfully";
		  }
			
		return message;
	}
	// Get All Users.
		@RequestMapping(method = RequestMethod.GET, value = "/getusers")
		public List<Users> getAllUsers() {
			
			List<Users> getUsersFromdb = userService.getAllUserDetails();
			return getUsersFromdb;
		}
		
		@RequestMapping(method= RequestMethod.DELETE,value="/deleteuser/{username}")
		public String deleteByUsername(@PathVariable String username){
			Users user1 = userService.findByUsername(username);
			String message="";
			if(user1== null) {
				message = "User Not Found";
				throw new UserNotFountException(message);
			}
			 userService.deleteByUsername(username);
			 message ="User Deleted ";
			 return message;
		}	

}
