package com.example.dog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.dog.domain.Dog;
@Service
public class DogService {
	
	
	private List<Dog> doggo = new ArrayList<>();
	
	//create
	public Dog createDog(Dog d) {
		
		this.doggo.add(d);
		Dog created = this.doggo.get(this.doggo.size() - 1);
		return created;
	}
	
	//read
	public List<Dog> getAllDoggo(){
		return this.doggo;
		
		
	}
	public Dog getDog(Integer id) {
		return this.doggo.get(id);
		
	}
	
	//update 
	public Dog replaceDog(Integer id, Dog newDog) {
		Dog body = this.doggo.set(id, newDog);
		return body;
		
	}
	
	public void removeDog(@PathVariable Integer id) {
		this.doggo.remove(id.intValue());
	}
}
