package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class StudentmanagementsystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public void run(String... args) throws Exception {
	/*	Student student1=new Student("Ramesh","MCA","ramesh12@gmail.com",1234567890);
		studentRepository.save(student1);
		
		Student student2=new Student("Ram","CS","ram@gmail.com",1452369870);
		studentRepository.save(student2);
		*/
	}
	

}
