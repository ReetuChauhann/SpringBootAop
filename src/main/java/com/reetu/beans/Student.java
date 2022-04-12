package com.reetu.beans;

import org.springframework.stereotype.Component;

@Component
public class Student {
	public void doStudy() {
		System.out.println("I am Student. I do study.");
	}
	public void eat() {
		System.out.println("I am Student.I do eat");
	}
	public void walk() {
		System.out.println("I am Student walk. I do walk");
	}
}
