package com.globoteste.programa.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.globoteste.programa.domain.Programa;

public interface ProgramaRepository extends CrudRepository<Programa, Long> {

	Optional<Programa> findById(String id);

	void deleteById(String id);

	  
	
}