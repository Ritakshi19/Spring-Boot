package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	
@Override
public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}


@Override
public Student saveStudent(Student student) {
	return studentRepository.save(student);
}



}
