package com.rdsq.arivana.web;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rdsq.arivana.business.Characters;
import com.rdsq.arivana.db.CharactersRepository;

@CrossOrigin
@RestController
@RequestMapping("/characters")
public class CharactersController {
	
	@Autowired
	private CharactersRepository charRepo;

	@GetMapping("/")
	public JsonResponse getAll() {
		try {
			return JsonResponse.getInstance(charRepo.findAll());
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@GetMapping("/{id}")
	public JsonResponse get(@PathVariable Integer id) {
		if(id == null) return JsonResponse.getInstance("Invalid entry");
		try {
			Optional<Characters> character = charRepo.findById(id);
			if(!character.isPresent()) return JsonResponse.getInstance("No such character exists");
			return JsonResponse.getInstance(character.get());
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	private JsonResponse save(Characters character) {
		try {
			Characters c = charRepo.saveAndFlush(character);
			return JsonResponse.getInstance(c);
		} catch (IllegalArgumentException ie) {
			ie.printStackTrace();
			return JsonResponse.getInstance(ie);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@PostMapping("/")
	public JsonResponse addCharacter(@RequestBody Characters character) {
		try {
			return save(character);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@PutMapping("/")
	public JsonResponse update(@RequestBody Characters character) {
		try {
			Optional<Characters> c = charRepo.findById(character.getId());
			if(!c.isPresent()) return JsonResponse.getInstance("No character found for update");
			return save(character);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@DeleteMapping("/{id}")
	public JsonResponse deleteCharacter(@PathVariable Integer id) {
		if(id==null) return JsonResponse.getInstance("ID field cannot be blank");
		try {
			Optional<Characters> c = charRepo.findById(id);
			if(!c.isPresent()) return JsonResponse.getInstance("No character found!");
			charRepo.deleteById(id);
			return JsonResponse.getInstance(c.get().getName() + " was deleted");
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	
}














































