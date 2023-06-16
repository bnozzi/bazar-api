package com.bazar.service;

import java.util.List;

import com.bazar.model.Producto;

public interface ProductoInterface {
    
    public List<Producto> listarProductos() ;
    public Producto buscarProducto(long idProducto);
    public void agregarProducto(Producto producto);
    public void actualizarProducto(Producto producto);
    public void eliminarProducto(long idProducto);

        
    
}
