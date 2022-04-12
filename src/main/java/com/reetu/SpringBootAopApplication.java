package com.reetu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.reetu.beans.Employee;
import com.reetu.beans.Student;

@SpringBootApplication
public class SpringBootAopApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootAopApplication.class, args);
		
		Student s=ctx.getBean(Student.class);
		s.eat();
		s.doStudy();
		s.walk();
		Employee e=ctx.getBean(Employee.class);
		e.eat();
		e.doJob();
	}

}

