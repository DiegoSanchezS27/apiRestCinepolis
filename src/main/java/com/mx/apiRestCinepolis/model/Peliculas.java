package com.mx.apiRestCinepolis.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*CREATE TABLE PELICULAS_API(
ID_PELICULA NUMBER PRIMARY KEY,
NOMBRE VARCHAR2(70) NOT NULL,
GENERO VARCHAR2(80) NOT NULL,
PRECIO FLOAT NOT NULL
);*/

//Estereotipos o anotaciones, Indicar que esta clase va a pertenecer a una tabla
@Entity
@Table(name = "PELICULAS_API")
@NoArgsConstructor // Es para no poner el constructor vacio
@AllArgsConstructor // Es para no poner el constructor con parametros
@Data // Para no poner toString, getters y setters
public class Peliculas {

	// Los campos de la tabla
	@Id // Poner este estereotipo o anotacion---llave primary, identificador unico
	@Column(name = "ID_PELICULA", columnDefinition = "NUMBER", nullable = false)
	private Integer idPelicula;

	@Column(name = "NOMBRE", columnDefinition = "VARCHAR2(70)", nullable = false)
	private String nombre;

	@Column(name = "GENERO", columnDefinition = "VARCHAR2(80)", nullable = false)
	private String genero;

	@Column(name = "PRECIO", columnDefinition = "FLOAT", nullable = false)
	private Float precio;
}
