package com.generation.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.demo.models.ComentariosModel;

@Repository
public interface ComentariosRepository extends JpaRepository<ComentariosModel, Integer> {
	List<ComentariosModel> findByNombreContaining(String nombre);
}
