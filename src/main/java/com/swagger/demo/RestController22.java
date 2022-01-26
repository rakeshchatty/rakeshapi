package com.swagger.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/sample")
public class RestController22 {


	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody LoginRequest request) {
		
		if(request.getUsername() != null && request.getPassword()!=null) {
			Map<String,String> map =new HashMap<>();
			map.put("status", "SUCCESS");
			map.put("statusCode", "200");
			map.put("message", "Successfully logged in");
			return ResponseEntity.ok().body(map);
		}
		return ResponseEntity.badRequest().body("Login Failed!!");
		
	}
	
	@GetMapping
	public ResponseEntity<String> status(){
		return ResponseEntity.ok().body("deployed successfully");
	}
}
