package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);

}
