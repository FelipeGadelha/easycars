package br.com.portfolio.easycars.api.controller;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.portfolio.easycars.api.convert.Convert;
import br.com.portfolio.easycars.api.dto.request.VehicleRq;
import br.com.portfolio.easycars.domain.entity.Vehicle;


@RestController
@RequestMapping("/v1/vehicle")
public class VehicleController {

	@Autowired
	private EntityManager manager;
	
	@Autowired
	private Convert convert; 
	
	@PostMapping
	@Transactional
	public Long save(@RequestBody VehicleRq vehicleRq) {
		System.out.println(vehicleRq);
		Vehicle vehicle = convert.mapper(vehicleRq, Vehicle.class);
		manager.persist(vehicle);
		return vehicle.getId();
		
	}
	
	
	
	
	
	
	
}
