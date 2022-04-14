package dev.potatoo.travel.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
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
	
	@PostMapping("/insert/area")
	public ResponseEntity<Object> insertArea(@RequestBody String area){
		
		System.out.println("area : "+area);
		
		try {
			List<String> list = new ArrayList<String>();
			
			JSONParser jsonParse = new JSONParser();
			JSONArray jsonArray = (JSONArray) jsonParse.parse(area);
			
			for (int i=0;i<jsonArray.size();i++){ 
				list.add(jsonArray.get(i).toString());
			}
			
			
			System.out.println("list : " + list);
			return new ResponseEntity<>(travelService.insertArea(list), HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	
}
