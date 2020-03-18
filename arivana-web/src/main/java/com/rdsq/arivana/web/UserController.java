package com.rdsq.arivana.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdsq.arivana.business.User;
import com.rdsq.arivana.db.UserRepository;

@CrossOrigin
@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/")
	public JsonResponse getAll(){
		try {
			return JsonResponse.getInstance(userRepo.findAll());
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@GetMapping("/{id}")
	public JsonResponse get(@PathVariable Integer id) {
		if(id==null) return JsonResponse.getInstance("Invalid id number");
		try {
			Optional<User> user = userRepo.findById(id);
			if(!user.isPresent()) return JsonResponse.getInstance("No user exists with "+id+"!");
			return JsonResponse.getInstance(user.get());
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	private JsonResponse save(User user) {
		try {
			User u = userRepo.saveAndFlush(user);
			return JsonResponse.getInstance(u);
		} catch (IllegalArgumentException ie) {
			ie.printStackTrace();
			return JsonResponse.getInstance(ie);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@PostMapping("/")
	public JsonResponse insert(@RequestBody User user) {
		try {
			User u = userRepo.findByUsername(user.getUsername());
			if(u!=null) {
				return JsonResponse.getInstance("Username is already taken!");
			}
			u = userRepo.findByEmail(user.getEmail());
			if(u!=null) return JsonResponse.getInstance("Email is already in use!");
			return save(user);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@PutMapping("/")
	public JsonResponse update(@RequestBody User user) {
		try {
			Optional<User> u = userRepo.findById(user.getId());
			if(!u.isPresent()) return JsonResponse.getInstance("No such user in database!");
			if(!u.get().getUsername().equalsIgnoreCase(user.getUsername())) {
				return JsonResponse.getInstance("Username already in use!");
			}
			if(!u.get().getEmail().equalsIgnoreCase(user.getEmail())) {
				return JsonResponse.getInstance("Email is already in use!");
			}
			return save(user);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@DeleteMapping("/{id}")
	public JsonResponse deleteUser(@PathVariable Integer id) {
		if(id==null) return JsonResponse.getInstance("ID field cannot be blank!");
		try {
			Optional<User> user = userRepo.findById(id);
			if(!user.isPresent()) return JsonResponse.getInstance("No user found!");
			userRepo.deleteById(id);
			return JsonResponse.getInstance(user.get());
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@PostMapping("/login")
	public JsonResponse userLogin(@RequestBody User u) {
		String username = u.getUsername();
		String password = u.getPassword();
		try {
			User u2 = userRepo.findByUsername(username);
			if(u2 == null) {
				return JsonResponse.getInstance("Username not found");
			}else {
			u2 = userRepo.findByUsernameAndPassword(username, password);
			if (u2 == null)
				return JsonResponse.getInstance("Username and Password combination not found.");
			return JsonResponse.getInstance(u2);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}

}
































