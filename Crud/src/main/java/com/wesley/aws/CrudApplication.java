package com.wesley.aws;

import com.wesley.aws.entity.Empregado;
import com.wesley.aws.repository.EmpregadosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class CrudApplication {

	@Autowired
	private EmpregadosRepositorio repositorio;

	@PostMapping("/saveEmpregado")
	public Empregado salvaEmpregado(@RequestBody Empregado empregado){
		return repositorio.addEmpregado(empregado);
	}

	@GetMapping("/getEmpregados/{empregadosId}")
	public Empregado getEmpregadoId(@PathVariable String empregadosId){
		return repositorio.getEmpregadoId(empregadosId);
	}

	@DeleteMapping("/deletarEmpregado")
	public String deletarEmpregado(@RequestBody Empregado empregado){
		return repositorio.deletarEmpregado(empregado);
	}

	@PutMapping("/editarEmpregado")
	public String editarEmpregado(@RequestBody Empregado empregado){
		return repositorio.editarEmpregado(empregado);
	}


	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}
