package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

	@Entity
	public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(nullable = false)
		private String name;
		@Column(nullable = false)
		private String course;
		@Column(nullable = false)
		private String email;
		@Column(nullable = false)
		private int mobileNo;
		
		
		
		public Student() {
			
		}
		public Student(String name, String course, String email, int mobileNo) {
			super();
			this.name = name;
			this.course = course;
			this.email = email;
			this.mobileNo = mobileNo;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(int mobileNo) {
			this.mobileNo = mobileNo;
		}


	}



