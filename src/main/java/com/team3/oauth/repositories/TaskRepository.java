package com.team3.oauth.repositories;

import org.springframework.data.repository.CrudRepository;

import com.team3.oauth.model.Cliente;

public interface TaskRepository extends CrudRepository<Cliente, Integer> {

}