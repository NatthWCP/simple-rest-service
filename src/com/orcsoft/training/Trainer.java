package com.orcsoft.training;

public class Trainer {
	private Integer id;
	private String name;
	private char gender;
	private Integer huntCount;
	private boolean isProtagonist;
	public Integer getId() {
		return id;
	}
	public Trainer setId(Integer id) {
		this.id = id;
		return this;
	}
	public String getName() {
		return name;
	}
	public Trainer setName(String name) {
		this.name = name;
		return this;
	}
	public char getGender() {
		return gender;
	}
	public Trainer setGender(char gender) {
		this.gender = gender;
		return this;
	}
	public Integer getHuntCount() {
		return huntCount;
	}
	public Trainer setHuntCount(Integer huntCount) {
		this.huntCount = huntCount;
		return this;
	}
	public boolean isProtagonist() {
		return isProtagonist;
	}
	public Trainer setProtagonist(boolean isProtagonist) {
		this.isProtagonist = isProtagonist;
		return this;
	}
	
}
