package br.com.portfolio.easycars.api.dto.request;

public class UserRq {
	
	private String name;
	private String cpf;
	private AddressRq addressRq;
	private ContactRq contactRq;
	
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
	public AddressRq getAddressRq() {
		return addressRq;
	}
	public void setAddressRq(AddressRq addressRq) {
		this.addressRq = addressRq;
	}
	public ContactRq getContactRq() {
		return contactRq;
	}
	public void setContactRq(ContactRq contactRq) {
		this.contactRq = contactRq;
	}
	
	
	
	

}
