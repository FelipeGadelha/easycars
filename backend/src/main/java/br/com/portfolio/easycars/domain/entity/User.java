package br.com.portfolio.easycars.domain.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String cpf;
	@ManyToOne(cascade = CascadeType.ALL)
	private Address address;
	@ManyToOne
	private Contact contact;
	
	@Deprecated
	public User() { }
	
	public User(Long id, String name, String cpf, Address address, Contact contact) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.address = address;
		this.contact = contact;
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", cpf=" + cpf + ", address=" + address + ", contact=" + contact
				+ "]";
	}
	
	
	
	
	

}
