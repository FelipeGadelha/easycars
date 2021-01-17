package br.com.portfolio.easycars.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Phone {
	
	@Id
	private String phoneNumber;
	@Enumerated(EnumType.STRING)
	private TypePhone typePhone;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name ="Contact_Id")
    private Contact contact;
	
	@Deprecated
	public Phone() { }
	
	public Phone(String phoneNumber, TypePhone typePhone, Contact contact) {
		this.phoneNumber = phoneNumber;
		this.typePhone = typePhone;
		this.contact = contact;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public TypePhone getTypePhone() {
		return typePhone;
	}
	public void setTypePhone(TypePhone typePhone) {
		this.typePhone = typePhone;
	}
	
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + ", typePhone=" + typePhone + ", contact=" + contact + "]";
	}
	
	

}
