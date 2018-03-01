package com.team3.oauth.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.team3.oauth.model.Cliente;

@Repository("ClienteRepository")
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
	
	@Query(value = "{call generaCliente}", nativeQuery = true)
	public List<Cliente> findAll();

}
