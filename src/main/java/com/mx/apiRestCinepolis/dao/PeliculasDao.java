package com.mx.apiRestCinepolis.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.apiRestCinepolis.model.Peliculas;

//Dao--- es un intermediario entre la aplicacion y la bd
//Spring data --- vamos a ocupar los repositorios---JpaRepository y CrudRepository
//Estos ya contienen los metodos del CRUD
public interface PeliculasDao extends JpaRepository<Peliculas, Integer> {

}
