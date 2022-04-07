package dev.potatoo.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.potatoo.travel.service.CheckAreaService;
import dev.potatoo.travel.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	@Autowired
	private CheckAreaService checkAreaService;
	
	@Autowired
	private UserService userService;

	/* 테스트  */
	@GetMapping("/test")
	public String test(@RequestParam("userid") String userid) {
		return "test";
	}

	
	
	@PostMapping("/check/area")
	public ResponseEntity<CheckAreaService> checkArea() {
		return null;
	}
	
	@PostMapping("/check/user")
	public ResponseEntity<UserService> checkUser(){
		return null;
	}
	
	
}
