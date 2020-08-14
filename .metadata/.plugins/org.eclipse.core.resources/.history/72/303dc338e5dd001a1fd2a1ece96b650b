package com.rdsq.arivana.web;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rdsq.arivana.business.CharWeaponInventory;
import com.rdsq.arivana.business.Characters;
import com.rdsq.arivana.db.CharWeaponInventoryRepository;
import com.rdsq.arivana.db.CharactersRepository;

@CrossOrigin
@RestController
@RequestMapping("/charweaponinv")
public class CharWeaponInventoryController {

	@Autowired
	private CharWeaponInventoryRepository charWeaponRepo;
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
			Iterable<CharWeaponInventory> charWeapons = charWeaponRepo.findByCharactersId(charId);
			if(charWeapons==null) return JsonResponse.getInstance("Character has no weapons!");
			return JsonResponse.getInstance(charWeapons);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	private JsonResponse save(CharWeaponInventory charWeapon) {
		try {
			CharWeaponInventory cwi = charWeaponRepo.saveAndFlush(charWeapon);
			return JsonResponse.getInstance(cwi);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@PostMapping("/")
	public JsonResponse addCharWeapon(@RequestBody CharWeaponInventory charWeapon) {
		try {
			CharWeaponInventory cwi = charWeaponRepo.findByCharactersIdAndWeaponId(charWeapon.getCharacter().getId(), charWeapon.getWeapon().getId());
			if(cwi!=null) {
				charWeapon.setQuantity(charWeapon.getQuantity()+cwi.getQuantity());
				return save(charWeapon);
			}
			return save(charWeapon);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@PutMapping("/")
	public JsonResponse update(@RequestBody CharWeaponInventory charWeapon) {
		try {
			Optional<CharWeaponInventory> cwi = charWeaponRepo.findById(charWeapon.getId());
			if(!cwi.isPresent()) return JsonResponse.getInstance("Item with that ID does not exist in inventory");
			return save(charWeapon);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
	@DeleteMapping("{id}")
	public JsonResponse deleteWeaponItem(@PathVariable Integer id) {
		if(id==null) return JsonResponse.getInstance("Invalid item ID!");
		try {
			Optional<CharWeaponInventory> cwi = charWeaponRepo.findById(id);
			if(cwi==null) return JsonResponse.getInstance("Item with that ID cannot be found!");
			charWeaponRepo.deleteById(id);
			return JsonResponse.getInstance(cwi.get());
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}
	
}


















































