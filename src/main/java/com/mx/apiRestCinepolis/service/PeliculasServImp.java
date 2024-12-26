package com.mx.apiRestCinepolis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.apiRestCinepolis.dao.PeliculasDao;
import com.mx.apiRestCinepolis.model.Peliculas;
@Service
public class PeliculasServImp implements PeliculasServ {

	// Se utiliza la inyeccion de dependencias
	// @Autowired
	// Nos permite tener un mejor control de los objetos que se inicializan

	@Autowired
	PeliculasDao dao;

	@Transactional(readOnly = true)
	@Override
	public List<Peliculas> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Transactional
	@Override
	public void guardar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		dao.save(pelicula);
	}

	@Transactional
	@Override
	public Peliculas buscar(int idPelicula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Peliculas pelicula) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(int idPelicula) {
		// TODO Auto-generated method stub

	}

}
