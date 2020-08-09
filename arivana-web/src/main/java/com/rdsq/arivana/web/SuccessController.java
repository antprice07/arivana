package com.rdsq.arivana.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.rdsq.arivana.business.Success;
import com.rdsq.arivana.db.SuccessRepository;

@CrossOrigin
@RestController
@RequestMapping("/success")
public class SuccessController {
	
	@Autowired
	private SuccessRepository sucRepo;
	
	@PostMapping("/")
	public JsonResponse getSuccessMsg(@RequestBody Success s) {
		int roll = convertRollRow(s.getRoll());
		int skill = convertSkillColumn(s.getColumnName());
		
		Success s2 = sucRepo.findByColumnNameAndRoll(skill, roll);
		if(s2 == null) return JsonResponse.getInstance("Incorrect entry");
		
		return JsonResponse.getInstance(s2);
	}
	
	private int convertSkillColumn(int skill) {
		int col = 0;
		if(skill == 0) col = 1;
		if(skill>=1 && skill <=5) col= 2;
		if(skill>=6 && skill <=10) col= 3;
		if(skill>=11 && skill <=15) col= 4;
		if(skill>=16 && skill <=20) col= 5;
		if(skill>=21 && skill <=25) col= 6;
		if(skill>=26 && skill <=30) col= 7;
		if(skill>=31 && skill <=35) col= 8;
		if(skill>=36 && skill <=40) col= 9;
		if(skill>=41 && skill <=45) col= 10;
		if(skill>=46 && skill <=55) col= 11;
		if(skill>=56 && skill <=65) col= 12;
		if(skill>=66 && skill <=75) col= 13;
		if(skill>=76 && skill <=85) col= 14;
		if(skill>=86 && skill <=90) col= 15;
		if(skill>=91 && skill <=94) col= 16;
		if(skill>=95 && skill <=98) col= 17;
		if(skill>=99 && skill <=100) col= 18;
		if(skill>=101 && skill <=110) col= 19;
		if(skill>=111 && skill <=115) col= 20;
		if(skill>=116 && skill <=120) col= 21;
		
		return col;
	}
	
	private int convertRollRow(int roll) {
		int row = 0;
		if(roll == 1) return roll;
		if(roll>=2 && roll <=5) row= 2;
		if(roll>=6 && roll <=10) row= 3;
		if(roll>=11 && roll <=15) row= 4;
		if(roll>=16 && roll <=20) row= 5;
		if(roll>=21 && roll <=25) row= 6;
		if(roll>=26 && roll <=30) row= 7;
		if(roll>=31 && roll <=35) row= 8;
		if(roll>=36 && roll <=40) row= 9;
		if(roll>=41 && roll <=45) row= 10;
		if(roll>=46 && roll <=50) row= 11;
		if(roll>=51 && roll <=55) row= 12;
		if(roll>=56 && roll <=60) row= 13;
		if(roll>=61 && roll <=65) row= 14;
		if(roll>=66 && roll <=70) row= 15;
		if(roll>=71 && roll <=75) row= 16;
		if(roll>=76 && roll <=80) row= 17;
		if(roll>=81 && roll <=85) row= 18;
		if(roll>=86 && roll <=90) row= 19;
		if(roll>=91 && roll <=94) row= 20;
		if(roll>=95 && roll <=99) row= 21;
		if(roll==100) row= 22;
		
		return row;
	}
	
	

}
