package com.netec.app.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.netec.app.entities.Articulo;

public interface IArticuloDAO extends MongoRepository<Articulo, String> {

}
