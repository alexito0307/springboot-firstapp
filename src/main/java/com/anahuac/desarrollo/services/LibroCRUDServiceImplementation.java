package com.anahuac.desarrollo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.anahuac.desarrollo.daos.LibroRepository;
import com.anahuac.desarrollo.entities.Libro;

public class LibroCRUDServiceImplementation implements LibroCRUDService {
  @Autowired
  private LibroRepository libroRepository;

  @Override
  public void modificarLibro(int id, String nombre, String autor, String editorial) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void borrarLibro(String isbn) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public List<Libro> listarLibros() {
    return libroRepository.findAll();
    
  }

  @Override
  public Libro findByIsbn(String isbn) {
    Optional<Libro> libro = libroRepository.findById(Integer.parseInt(isbn));
    return libro.get();
  }

  @Override
  public Libro agregarLibro(String isbn, String nombre, String autor, String editorial) {
    Libro libro = new Libro();
    libro.setIsbn(isbn);
    libro.setNombre(nombre);
    libro.setAutor(autor);
    libro.setEditorial(editorial);
    return libroRepository.save(libro);
  }

  @Override
  public Libro obtenerLibro(int id) {
    Optional<Libro> libro = libroRepository.findById(id);
    return libro.get();
  }
  
}
