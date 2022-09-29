package com.netec.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netec.app.entities.Articulo;
import com.netec.app.service.IArticuloService;

@RestController
@RequestMapping("/articulo")
public class ArticuloController {
	@Autowired
	private IArticuloService servicio;
	
	@PostMapping
	public Articulo insert(@RequestBody Articulo art) {
	   return servicio.save(art);	
	}

}
