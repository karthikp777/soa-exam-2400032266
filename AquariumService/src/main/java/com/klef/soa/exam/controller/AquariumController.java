package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.Aquarium;
import com.klef.soa.exam.service.AquariumService;

@RestController
@RequestMapping("/aquarium")
public class AquariumController {

	@Autowired
	private AquariumService service;

	@GetMapping("/")
	public String test() {
		return "test";
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<Aquarium> saveAquarium(@RequestBody Aquarium request){
		
		return ResponseEntity.ok(service.addAquarium(request));
		
	}
	
	
	@GetMapping("/displayall")
	public ResponseEntity<List<Aquarium>> displayall() {
		
		return ResponseEntity.ok(service.displayAll());
	}
	
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id) {
		service.deleteById(id);
		
		return ResponseEntity.ok("Aquarium deleted successfully");
	}
}
