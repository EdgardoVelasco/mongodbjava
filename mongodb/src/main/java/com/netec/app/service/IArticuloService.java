package com.netec.app.service;

import java.util.List;

import com.netec.app.entities.Articulo;

public interface IArticuloService {
	
	Articulo  save(Articulo art);
	List<Articulo> findAll();
	void deleteById(String id);
	Articulo findById(String id);

}
