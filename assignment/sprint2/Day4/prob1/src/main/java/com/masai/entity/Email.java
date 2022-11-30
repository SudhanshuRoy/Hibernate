package com.masai.entity;



import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Email {
	@Id
	private String mail_Id;
	private LocalDate created_date;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER,mappedBy="email")
	private User user;
	
	
	public String getMail_Id() {
		return mail_Id;
	}
	public void setMail_Id(String mail_Id) {
		this.mail_Id = mail_Id;
	}
	
	public LocalDate getCreated_date() {
		return created_date;
	}
	public void setCreated_date(LocalDate created_date) {
		this.created_date = created_date;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
