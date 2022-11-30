package com.masai.model;
import javax.persistence.*;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rollNo; 
	private String name; 
	private String email; 
	private String mobile;
	@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    private  Course course;
	
	public int getRollNo() {
		return rollNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	
	

}
