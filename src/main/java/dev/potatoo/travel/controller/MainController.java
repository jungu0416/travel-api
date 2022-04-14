package dev.potatoo.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.potatoo.travel.model.Location;
import dev.potatoo.travel.service.TravelService;

@RestController
@RequestMapping("/api")
public class MainController {
	@Autowired
	private TravelService travelService;
	
	@PostMapping("/check/area")
	public ResponseEntity<Object> checkArea() {
		return new ResponseEntity<>(travelService.checkArea(),HttpStatus.OK);
	}
	
	@PostMapping("/update/area")
	public ResponseEntity<Object> updateArea(@RequestBody Location location){
		return new ResponseEntity<>(travelService.updateArea(location), HttpStatus.OK);
	}
	

	
}
