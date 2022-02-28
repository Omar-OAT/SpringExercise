package com.example.dog.domain;

public class Dog {
	private Integer id;
	
	private String name;
	
	private Integer age;
	
	private String breed;
	
	

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", age=" + age + ", breed=" + breed + "]";
	}

	public Dog() {
		super();
	}

	public Dog(Integer id, String name, Integer age, String breed) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	
	
}
