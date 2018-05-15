package com.example.pruebaT.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pruebaT.api.model.PruebaModel;
import com.example.pruebaT.api.repository.PruebaRepository;

@RestController
@RequestMapping("/prueba")
public class PruebaRest {

	PruebaRepository repository;
	
	@Autowired
	public PruebaRest(PruebaRepository repo) {
		// TODO Auto-generated constructor stub
		this.repository = repo;
	}
	
	@CrossOrigin
	@GetMapping
	public List<PruebaModel> obtenerPruebas(){
		return repository.findAll();
	}
	
}
