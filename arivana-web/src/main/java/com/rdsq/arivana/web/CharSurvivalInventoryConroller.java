package com.rdsq.arivana.web;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
	
	

}
