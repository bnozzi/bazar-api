package com.bazar.repo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bazar.model.Producto;

public interface ProductRepo extends JpaRepository< Producto,Long>{

    Producto findFirstByOrderByPrecioAsc();
    Producto findFirstByOrderByPrecioDesc();
    
    @Query("SELECT p FROM Producto p ORDER BY p.precio DESC")
    List<Producto> findAllByOrderByPrecioDesc();

    @Query("SELECT p FROM Producto p ORDER BY p.precio ASC")
    List<Producto> findAllByOrderByPrecioAsc();

    
}
