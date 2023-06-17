package com.bazar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class ProductoController {

    @Autowired
    private ProductoRestController restController;
    
    @GetMapping("/")
    public String home(){
        return "home/home";
    
    }

    @GetMapping("/productos")
    public String productos(Model model){
        model.addAttribute("productos", restController.getProductos("asc"));


        return "productos/listarProductos";
    }
    
    @GetMapping("/productos/añadir")
    public String añadirProductos(){
        return "productos/añadirProducto";
    }
    
    @GetMapping("/productos/editar/{id}")
    public String editarProductos(@PathVariable long id, Model model){
        model.addAttribute("msg", "editar producto con id="+id);
        model.addAttribute("producto", restController.getProductoById(id));
        return "productos/editarProducto";
    }
}
