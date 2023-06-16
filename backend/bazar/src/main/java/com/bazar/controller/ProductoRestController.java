package com.bazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bazar.model.Producto;
import com.bazar.service.ProductoService;

@RestController
public class ProductoRestController {

    @Autowired
    private ProductoService productoService;
    
    @GetMapping("/productos/traer")
    @ResponseBody
    public List<Producto> getProductos() {
        return productoService.listarProductos();
    }

    //get by id
    @GetMapping("/productos/traer/{id}")
    @ResponseBody
    public Producto getProductoById(@PathVariable long id) {
        return productoService.buscarProducto(id);
    }

    @PostMapping("productos/crear")
    public void crearProducto(@RequestBody Producto producto) {
        productoService.agregarProducto(producto);
    }

    @PutMapping("/productos/edit")
    public void editarProducto(@RequestBody Producto producto){
        productoService.actualizarProducto(producto);
        
    }
}
