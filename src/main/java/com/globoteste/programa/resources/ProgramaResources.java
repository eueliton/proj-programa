package com.globoteste.programa.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globoteste.programa.domain.Programa;
import com.globoteste.programa.services.ProgramaService;

@RestController
@RequestMapping(path = "/programa")
public class ProgramaResources {

	@Autowired
	ProgramaService programaService;

	@GetMapping("/reverse_name/{id}")
	private String getReverseName(@PathVariable("id") String id) {
		return programaService.getReverseNameById(id);
	}

	@GetMapping("/all")
	private List<Programa> getAllProgramas() {
		return programaService.getAllProgramas();
	}

	@GetMapping("/view/{id}")
	private Programa getPrograma(@PathVariable("id") String id) {
		return programaService.getProgramaById(id);
	}

	@DeleteMapping("/delete/{id}")
	private void deletePrograma(@PathVariable("id") String id) {
		programaService.delete(id);
	}

	@PostMapping("/")
	private String savePrograma(@RequestBody Programa programa) {
		programaService.saveOrUpdate(programa);
		return programa.getId();
	}

	@PutMapping("/programa")
	private Programa update(@RequestBody Programa programa) {
		programaService.saveOrUpdate(programa);
		return programa;
	}

}
