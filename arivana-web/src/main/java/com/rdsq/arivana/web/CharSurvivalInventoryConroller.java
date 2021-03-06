package com.rdsq.arivana.web;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rdsq.arivana.business.CharSurvivalInventory;
import com.rdsq.arivana.business.Characters;
import com.rdsq.arivana.db.CharSurvivalInventoryRepository;
import com.rdsq.arivana.db.CharactersRepository;

@CrossOrigin
@RestController
@RequestMapping("/charsurvinv")
public class CharSurvivalInventoryConroller {
	
	@Autowired
	private CharSurvivalInventoryRepository itemRepo;
	@Autowired
	private CharactersRepository charRepo;
	
	@GetMapping("/{charId}")
	public JsonResponse getByChar(@PathVariable Integer charId) {
		if(charId==null) return JsonResponse.getInstance("ID must be a valid number");
		try {
			Optional<Characters> character = charRepo.findById(charId);
			if(!character.isPresent()) return JsonResponse.getInstance("No such character exists!");
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
		try {
			Iterable<CharSurvivalInventory> survInv = itemRepo.findByCharactersId(charId);
			if(survInv==null) return JsonResponse.getInstance("Character has no survival items");
			return JsonResponse.getInstance(survInv);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	private JsonResponse save(CharSurvivalInventory survItem) {
		try {
			CharSurvivalInventory csi = itemRepo.saveAndFlush(survItem);
			return JsonResponse.getInstance(csi);
		} catch (IllegalArgumentException ie) {
			ie.printStackTrace();
			return JsonResponse.getInstance(ie);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@PostMapping("/")
	public JsonResponse addSurvivalItem(@RequestBody CharSurvivalInventory survItem) {
		try {
			CharSurvivalInventory csi = itemRepo.findByCharactersIdAndSurvivalItemId(survItem.getCharacter().getId(), survItem.getSurvivalItem().getId());
			if(csi!=null) {
				survItem.setQuantity(survItem.getQuantity()+csi.getQuantity());
				return save(survItem);
			}
			return save(survItem);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@PutMapping("/")
	public JsonResponse update(@RequestBody CharSurvivalInventory survItem) {
		try {
			Optional<CharSurvivalInventory> csi = itemRepo.findById(survItem.getId());
			if(csi==null) return JsonResponse.getInstance("Item with that ID does not exist in inventory!");
			return save(survItem);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@DeleteMapping("/{id}")
	public JsonResponse deleteCharSurvItem(@PathVariable Integer id) {
		if(id==null) return JsonResponse.getInstance("Invalid item ID!");
		try {
			Optional<CharSurvivalInventory> csi = itemRepo.findById(id);
			if(!csi.isPresent()) return JsonResponse.getInstance("No such item can be found");
			itemRepo.deleteById(id);
			return JsonResponse.getInstance(csi.get());
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}

}




























































