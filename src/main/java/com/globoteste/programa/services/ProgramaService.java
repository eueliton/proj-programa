package com.globoteste.programa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globoteste.programa.domain.Programa;
import com.globoteste.programa.repositories.ProgramaRepository;
import com.globoteste.programa.utils.ReverseString;

@Service
public class ProgramaService {

	@Autowired
	private ProgramaRepository repository;

	public List<Programa> getAllProgramas() {
		List<Programa> programas = new ArrayList<Programa>();
		repository.findAll().forEach(programa1 -> programas.add(programa1));
		return programas;
	}

	public String getReverseNameById(String id) {
		Programa programa = repository.findById(id).orElse(null);
		if (programa != null) {
			return ReverseString.reverse(programa.getNome());
		} else {
			return "ID NÃO ENCONTRADO";
		}

	}

	public Programa getProgramaById(String id) {
		return repository.findById(id).get();
	}

	public void saveOrUpdate(Programa programa) {
		repository.save(programa);
	}

	public void delete(String id) {
		repository.deleteById(id);
	}

	public void update(Programa programa, int id) {
		repository.save(programa);
	}

	public List<String> getAllId() {
		List<String> ids = new ArrayList<String>();
		repository.findAll().forEach(programa1 -> ids.add(programa1.getId()));
		return ids;
	}

}
