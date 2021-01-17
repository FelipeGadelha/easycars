package br.com.portfolio.easycars.api.dto.request;

import br.com.portfolio.easycars.domain.entity.TypePhone;

public class PhoneRq {
	
	private String phoneNumber;
	private TypePhone typePhone;
	private String contactId;
	
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
	public String getContactId() {
		return contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}

}
