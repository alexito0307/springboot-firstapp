package com.anahuac.desarrollo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="libros")
@Table(name="libros")

public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	private int id;
	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
	@Column(name = "autor", nullable = false, length = 100)
	private String autor;
	@Column(name = "editorial", nullable = false, length = 100)
	private String editorial;
	@Column(name = "isbn", nullable = false, length = 100)
	private String isbn;
	
	
	public Libro(int id, String nombre, String autor, String editorial, String isbn) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
		this.isbn = isbn;
	}
	public Libro() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial + ", isbn="
				+ isbn + "]";
	}

}