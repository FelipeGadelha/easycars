package br.com.portfolio.easycars.api.dto.request;

import java.util.ArrayList;
import java.util.List;

public class ContactRq {
	
	private String email;
	private List<PhoneRq> phoneRq = new ArrayList<>();
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<PhoneRq> getPhoneRq() {
		return phoneRq;
	}
	public void setPhoneRq(List<PhoneRq> phoneRq) {
		this.phoneRq = phoneRq;
	}
	
	

}
