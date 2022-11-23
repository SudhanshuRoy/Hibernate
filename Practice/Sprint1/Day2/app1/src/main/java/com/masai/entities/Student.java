package com.masai.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
//@Table(name="mystudent")
public class Student {
	@Id
//	@Column(name="sroll")
	@GeneratedValue(strategy=GenerationType.AUTO)
private int roll;
//	@Column(name="sname")
private String name;
//	@Transient
private int marks;
public Student() {
	super();
	 
}
public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
}


}
