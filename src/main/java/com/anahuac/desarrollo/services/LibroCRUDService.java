package com.anahuac.desarrollo.services;

import java.util.List;

import com.anahuac.desarrollo.entities.Libro;

public interface LibroCRUDService {
    public Libro agregarLibro(String isbn, String nombre, String autor, String editorial);
    public void cambiarLibro(String isbn, String nombre, String autor, String editorial);
    public Libro obtenerLibro(int id);
    public Libro buscarLibroPorId(int id); 
    public void borrarLibro(String isbn);
    public List<Libro> obtenerTodosLosLibros();
    public Libro buscarLibroPorIsbn(String isbn);
}