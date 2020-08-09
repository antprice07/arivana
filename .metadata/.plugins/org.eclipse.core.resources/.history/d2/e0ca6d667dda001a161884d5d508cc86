package com.rdsq.arivana.web;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rdsq.arivana.business.Armor;
import com.rdsq.arivana.db.ArmorRepository;

@CrossOrigin
@RestController
@RequestMapping("/armor")
public class ArmorController {

	@Autowired
	private ArmorRepository armorRepo;
	
	@GetMapping("/")
	public JsonResponse getAll() {
		try {
			return JsonResponse.getInstance(armorRepo.findAll());
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@GetMapping("/{id}")
	public JsonResponse get(@PathVariable Integer id) {
		if(id==null)return JsonResponse.getInstance("Invalid entry");
		try {
			Optional<Armor> armor = armorRepo.findById(id);
			if(!armor.isPresent()) return JsonResponse.getInstance("No user exists with id " +id+"!");
			return JsonResponse.getInstance(armor.get());
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	
	
}
