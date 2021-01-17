package br.com.portfolio.easycars.api.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portfolio.easycars.api.convert.Convert;
import br.com.portfolio.easycars.api.dto.request.AddressRq;
import br.com.portfolio.easycars.api.dto.request.ContactRq;
import br.com.portfolio.easycars.api.dto.request.PhoneRq;
import br.com.portfolio.easycars.api.dto.request.UserRq;
import br.com.portfolio.easycars.domain.entity.Address;
import br.com.portfolio.easycars.domain.entity.Contact;
import br.com.portfolio.easycars.domain.entity.User;
import br.com.portfolio.easycars.domain.repository.ContactRepository;
import br.com.portfolio.easycars.domain.repository.UserRespository;

@RestController
@RequestMapping("/v1/user")
public class UserController {
	
	@Autowired
	private EntityManager manager;
	
	@Autowired
	private Convert convert; 
	
	@Autowired
	private UserRespository userRespository;
	
	@Autowired
	private ContactRepository contactRespository;
	
	
	
	@PostMapping
	@Transactional
	public Long save(@RequestBody UserRq userRq) {
		Address address = convert.mapper(userRq.getAddressRq(), Address.class);
		Contact contact = convert.mapper(userRq.getContactRq(), Contact.class);
		User user = convert.mapper(userRq, User.class);
		System.out.println(user);
		System.out.println(address);
		System.out.println(contact);
		manager.persist(contact);
		contact.getPhone().stream().forEach(System.err::println);
		contact.getPhone().stream().forEach(manager::persist);
		manager.persist(user);
		return user.getId();
	}
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		return ResponseEntity.ok().body(userRespository.findAll()
				.stream()
				.map(e -> {
					AddressRq addressRq = convert.mapper(e.getAddress(), AddressRq.class);
					ContactRq contactRq = convert.mapper(e.getContact(), ContactRq.class);
					System.err.println("---------------------------------");
					System.err.println(e);
					
					Optional<Contact> optional = contactRespository.findById(e.getContact().getEmail());
					System.err.println(optional.get());
					
					List<PhoneRq> list = e.getContact()
							.getPhone()
							.stream()
							.map(t -> {return convert.mapper(t, PhoneRq.class);})
							.collect(Collectors.toList());
					System.err.println(list);
					contactRq.setPhoneRq(list);
					UserRq userRq = convert.mapper(e, UserRq.class);
					userRq.setAddressRq(addressRq);
					userRq.setContactRq(contactRq);
					return userRq;
					}).collect(Collectors.toList()));
	}
	
	

}
