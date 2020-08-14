package com.rdsq.arivana.web;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rdsq.arivana.business.CombatSkill;
import com.rdsq.arivana.db.CombatSkillRepository;

@CrossOrigin
@RestController
@RequestMapping("/combatskills")
public class CombatSkillController {
	
	@Autowired
	private CombatSkillRepository comRepo;
	
	@GetMapping("/")
	public JsonResponse getAll() {
		try {
			Iterable<CombatSkill> combatSkills = comRepo.findAll();
			return JsonResponse.getInstance(combatSkills);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@GetMapping("{id}")
	public JsonResponse getById(@PathVariable Integer id) {
		if(id==null) return JsonResponse.getInstance("ID must be a valid number");
		try {
			Optional<CombatSkill> combatSkill = comRepo.findById(id);
			if(!combatSkill.isPresent()) return JsonResponse.getInstance("No combat skill found with that ID!");
			return JsonResponse.getInstance(combatSkill);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	private JsonResponse save(CombatSkill combatSkill) {
		try {
			CombatSkill cs = comRepo.saveAndFlush(combatSkill);
			return JsonResponse.getInstance(cs);
		} catch (IllegalArgumentException ie) {
			ie.printStackTrace();
			return JsonResponse.getInstance(ie);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@PostMapping("/")
	public JsonResponse addCombatSkill(@RequestBody CombatSkill combatSkill) {
		try {
			CombatSkill cs = comRepo.findByName(combatSkill.getName());
			if(cs!=null) return JsonResponse.getInstance("Combat skill already exists!");
			return save(combatSkill);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@PutMapping("/")
	public JsonResponse update(@RequestBody CombatSkill combatSkill) {
		try {
			Optional<CombatSkill> cs = comRepo.findById(combatSkill.getId());
			if(!cs.isPresent()) return JsonResponse.getInstance("Combat skill with that ID can't be found!");
			return save(combatSkill);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@DeleteMapping("/{id}")
	public JsonResponse deleteCombatSkill(@PathVariable Integer id) {
		if(id==null) return JsonResponse.getInstance("ID field cannot be blank!");
		try {
			Optional<CombatSkill> cs = comRepo.findById(id);
			if(!cs.isPresent()) return JsonResponse.getInstance("No combat skill with that ID can be found");
			comRepo.deleteById(id);
			return JsonResponse.getInstance(cs.get().getName() + " deleted");
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}

}
















































