package com.example.dog.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dog.domain.Dog;
import com.example.dog.service.DogService;

@RestController
public class DogController {

	
	// response entity extention of hhtp entity that represents an http response
	// including status headers and body
	private DogService service;
	@Autowired
	public DogController(DogService service) {
		super();
		this.service=service;
	}
	

	@PostMapping("/create")
	public ResponseEntity<Dog> createDog(@RequestBody Dog d) {

		Dog created = this.service.createDog(d);
		ResponseEntity<Dog> response = new ResponseEntity<Dog>(created, HttpStatus.CREATED);
		return response;
	}
	@GetMapping("/getAll")
	public ResponseEntity<List<Dog>> getAllDoggo(){
		return ResponseEntity.ok(this.service.getAllDoggo());
	}
	@GetMapping("/get/{id}") //200	
	public Dog getDog(@PathVariable Integer id) {
		
		return this.service.getDog(id);
	}
	
	@PutMapping("/replace/{id}")
	public ResponseEntity<Dog> replaceDog(@PathVariable Integer id, @RequestBody Dog newDog ){
		Dog body = this.service.replaceDog(id, newDog);
		ResponseEntity<Dog> response = new ResponseEntity<Dog>(body, HttpStatus.ACCEPTED);
		return response;
	}
	@DeleteMapping("/remove/{id}") 
	public ResponseEntity<?> deleteDog(@PathVariable Integer id){
		this.service.removeDog(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		
		
	}
}
