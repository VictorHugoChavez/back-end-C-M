package com.generation.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.generation.demo.models.ProductosModel;


@Repository
public interface ProductosRepository extends JpaRepository<ProductosModel, Integer> {
	ProductosModel findByIdContainingNombre_producto(String Producto);
}
