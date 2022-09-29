package com.netec.app.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netec.app.dao.IArticuloDAO;
import com.netec.app.entities.Articulo;

@Service
public class ArticuloServiceImpl implements IArticuloService{
	private final Logger logger=LoggerFactory.getLogger(ArticuloServiceImpl.class);
	
	@Autowired
	private IArticuloDAO dao;

	@Override
	public Articulo save(Articulo art) {
		
		return dao.save(art);
	}

	@Override
	public List<Articulo> findAll() {
		return dao.findAll();
	}

	@Override
	public void deleteById(String id) {
		try {
		    dao.deleteById(id);	
			
		}catch(Exception ex) {
			logger.info("ERROR: "+ex);
			
		}
		
	}

	@Override
	public Articulo findById(String id) {

		return dao.findById(id).orElseThrow(()->new RuntimeException("No existe el documento con id: "+id));
	}

}
