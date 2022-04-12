package com.reetu.beans;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	public void doJob() {
		System.out.println("I am Employee. I do job.");
	}
	public void eat() {
		System.out.println("I am Employee.I do eat");
	}
}
