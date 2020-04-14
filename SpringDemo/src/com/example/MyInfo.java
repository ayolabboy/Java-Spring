package com.example;

import java.util.ArrayList;

public class MyInfo {
	private String name;
	private double height;
	private double weight;
	private ArrayList<String> hobby;
	private BmiCalculator bmiCalculator;

	public void setBmiCalculator(BmiCalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHobby(ArrayList<String> hobby) {
		this.hobby = hobby;
	}

	public void getInfo() {
		System.out.println("Name : " + this.name);
		System.out.println("Height : " + this.height);
		System.out.println("Weight : " + this.weight);
		System.out.println("Hobby : " + this.hobby);
		this.bmiCalcu();
	}

	public void bmiCalcu() {
		this.bmiCalculator.bmiCalcu(this.weight, this.height);
	}
}
