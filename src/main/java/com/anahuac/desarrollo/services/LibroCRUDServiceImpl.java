package com.anahuac.desarrollo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anahuac.desarrollo.daos.LibroRepository;
import com.anahuac.desarrollo.entities.Libro;

@Service
public class LibroCRUDServiceImpl implements LibroCRUDService{

    @Autowired
    private LibroRepository libroRepository;

    @Override
    public Libro agregarLibro(String isbn, String nombre, String autor, String editorial) {
        Libro libro = new Libro(isbn, nombre, autor, editorial);
        return libroRepository.save(libro);
    }

    @Override
    public void cambiarLibro(Libro libro) {
        libroRepository.save(libro);
    }

    @Override
    public Libro obtenerLibro(int id) {
        Optional<Libro> libro = libroRepository.findById(id);
        return libro.get();
    }

    @Override
    public Libro buscarLibroPorId(int id) {
        Optional<Libro> libro = libroRepository.findById(id);
        return libro.get();
    }

    @Override
    public void borrarLibroByIsbn(String isbn) {
        libroRepository.deleteByIsbn(isbn);
    }

    @Override
    public void borrarLibro(int id) {
        libroRepository.deleteById(id);
    }

    @Override
    public List<Libro> obtenerTodosLosLibros() {
        return libroRepository.findAll();
    }

    @Override
    public Libro buscarLibroPorIsbn(String isbn) {
        return libroRepository.findByIsbn(isbn);
    }
    @Override
    public void crearLibro(Libro libro) {
        libroRepository.save(libro);
    }
}