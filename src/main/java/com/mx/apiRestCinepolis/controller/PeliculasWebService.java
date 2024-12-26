package com.mx.apiRestCinepolis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.apiRestCinepolis.model.Peliculas;
import com.mx.apiRestCinepolis.service.PeliculasServImp;

//@RestController---Nos permite marcar como controlador de solicitudes y se utiliza para crear web service de tipo rest --JSON
//@RequestMapping---Nos permite asiganar solicitudes web a los entornos de spring---para formar nuestros recursos, uris, endpoind
//@CrossOrigin----Nos sirve para que nuestra aplicacion no sea bloqueado por el navegador, aplicaion segura

@RestController
@RequestMapping(path = "PeliculasWebService")
@CrossOrigin
public class PeliculasWebService {

	// En la web service van las peticiuones
	@Autowired
	PeliculasServImp imp;

	// Peticion get para listar
	// Para probar la peticion debemos formar nuestra URL por que estamos utilizando
	// el protocolo htt
	// Como formar la URL: vaURLservidorLocal/pathClase/PathMetodo

	// URL: https://localhost:9000/PeliculasWebService/listar
	@GetMapping(path = "listar")
	public List<Peliculas> lisatr() {
		return imp.listar();
	}

	// @RequestBoyd---Convierte el Json a objeto para guardar
	// URL: https://localhost:9000/PeliculasWebService/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Peliculas pelicula) {
		imp.guardar(pelicula);
	}
}
