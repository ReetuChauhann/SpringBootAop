package com.reetu.beans;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class MyAspect {
	//advice
	@Before("execution(public void eat())") //pointcut expression
	public void xyz() {
		System.out.println("Hi eat");
	}
	
	@Before("execution(public void com.reetu.beans.Student.eat())") //pointcut expression
	public void xyz2() {
		System.out.println("Hello eat");
	}
	
	@After("execution(public void do*())") //pointcut expression
	public void abc() {
		System.out.println("Task end!");
	}
	
	
	
	
	@Pointcut("execution(public void walk())")
	public void myPointCut() {}
	
	@Before("myPointCut()")
	public void advice1() {
		System.out.println("Goodmorning");
	}
	@After("myPointCut()")
	public void advice2() {
		System.out.println("Goodevening");
	}
}
