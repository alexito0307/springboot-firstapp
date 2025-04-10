package com.anahuac.desarrollo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.anahuac.desarrollo.services.LibroCRUDService;

@Controller
public class LibroController {
  @Autowired
  public LibroCRUDService libroService;
  @GetMapping("/index")
  public String showLibroList(Model modelo) {
    modelo.addAttribute("libros", libroService.obtenerTodosLosLibros());
    return "index";
  }
}
