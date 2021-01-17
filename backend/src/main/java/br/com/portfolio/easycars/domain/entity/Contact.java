package br.com.portfolio.easycars.domain.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Contact {
	
	@Id
	private String email;
	@OneToMany(mappedBy="contact", targetEntity = Phone.class, cascade = CascadeType.ALL)
	private List<Phone> phone = new ArrayList<>();
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Phone> getPhone() {
		return phone;
	}
	
	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Contact [email=" + email + ", phone=" + phone + "]";
	}
	
	

}
