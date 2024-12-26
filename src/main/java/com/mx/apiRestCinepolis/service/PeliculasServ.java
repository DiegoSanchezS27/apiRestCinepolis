package com.mx.apiRestCinepolis.service;

import java.util.List;

import com.mx.apiRestCinepolis.model.Peliculas;

public interface PeliculasServ {

	public List<Peliculas> listar();

	public void guardar(Peliculas pelicula);

	public Peliculas buscar(int idPelicula);

	public void editar(Peliculas pelicula);

	public void eliminar(int idPelicula);
}
