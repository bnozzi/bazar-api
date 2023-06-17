package com.bazar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bazar.model.Producto;
import com.bazar.repo.ProductRepo;
@Service
public class ProductoService implements ProductoInterface{

    @Autowired
    ProductRepo productRepo;
    @Override
    public List<Producto> listarProductos() {
        return productRepo.findAll();
    }

    @Override
    public Producto buscarProducto(long idProducto) {
        return productRepo.findById(idProducto).orElse(null);
    
    }

    @Override
    public void agregarProducto(Producto producto) {
        productRepo.save(producto);
    }

    @Override
    public void actualizarProducto(Producto producto) {
        productRepo.save(producto);
    }

    @Override
    public void eliminarProducto(long idProducto) {
        productRepo.deleteById(idProducto);
    }

    @Override
    public Producto productoMenorPrecio() {
        return productRepo.findFirstByOrderByPrecioAsc();
    }

    @Override
    public Producto productoMayorPrecio() {
        return productRepo.findFirstByOrderByPrecioDesc();

    }

    @Override
    public List<Producto> productosDeMayorAMenor() {
        return productRepo.findAllByOrderByPrecioAsc();
        
    }

    @Override
    public List<Producto> productosDeMenorAMayor() {
        return productRepo.findAllByOrderByPrecioDesc();
    
    }
    
}
