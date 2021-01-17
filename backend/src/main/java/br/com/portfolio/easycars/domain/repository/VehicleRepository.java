package br.com.portfolio.easycars.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.portfolio.easycars.domain.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
