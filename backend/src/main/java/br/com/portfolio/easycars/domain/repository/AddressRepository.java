package br.com.portfolio.easycars.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.portfolio.easycars.domain.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
