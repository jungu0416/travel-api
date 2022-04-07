package dev.potatoo.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.potatoo.travel.service.CheckAreaService;

@RestController
@RequestMapping("/api")
public class MainController {
	@Autowired
	private CheckAreaService checkAreaService;
	
	
	@PostMapping("/check/area")
	public ResponseEntity<CheckAreaService> checkArea() {
		
		checkAreaService.checkArea();
		
		
		return null;
	}
	
	
	
}
