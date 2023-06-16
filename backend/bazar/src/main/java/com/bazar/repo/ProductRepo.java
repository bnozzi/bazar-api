package com.bazar.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bazar.model.Producto;

public interface ProductRepo extends JpaRepository< Producto,Long>{
    
}
