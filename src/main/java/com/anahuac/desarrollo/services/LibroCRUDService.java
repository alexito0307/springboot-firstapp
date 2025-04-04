package com.anahuac.desarrollo.services;

import java.util.List;

import com.anahuac.desarrollo.entities.Libro;

public interface LibroCRUDService {
  Libro agregarLibro(String isbn, String nombre, String autor, String editorial);
  Libro obtenerLibro(int id);
  void modificarLibro(int id, String nombre, String autor, String editorial);
  void borrarLibro(String isbn);
  List<Libro> listarLibros();
  Libro findByIsbn(String isbn);
}
