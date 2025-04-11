package com.anahuac.desarrollo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.anahuac.desarrollo.entities.Libro;
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
  @RequestMapping(value="libro/new")
  public String newLibro(Model modelo) {
    modelo.addAttribute("libro", new Libro());
    return "add-libro";
  }

  @RequestMapping(value="addlibro", method=RequestMethod.POST)
  public String saveLibro(Libro libro) {
    libroService.crearLibro(libro);
    System.out.println(">>>Save Libro");;
    return "redirect:/index";
  }

  @RequestMapping(value="/edit/{id}")
  public String editLibro(@PathVariable Integer id, Model modelo) {
    modelo.addAttribute("libro", libroService.obtenerLibro(id));
    return "edit-libro";
  }
  @RequestMapping(value="updatelibro", method=RequestMethod.POST)
  public String updateLibro(Libro libro) {
    libroService.cambiarLibro(libro);
    System.out.println(">>>Update Libro");;
    return "redirect:/index";
  }

  @RequestMapping(value="/delete/{id}")
  public String deleteLibro(@PathVariable Integer id) {
    libroService.borrarLibro(id);
    return "redirect:/index";
  }
}
