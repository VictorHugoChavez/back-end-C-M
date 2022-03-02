package com.generation.demo.services;

import java.util.ArrayList;
import java.util.List;

import com.generation.demo.models.ComentariosModel;

public interface ComentariosServices {
	
	ArrayList<ComentariosModel> obtenerDatos();
	
	ComentariosModel guardarDatos(ComentariosModel comentariosModel);
	
	boolean eliminarDato(Integer id);
	
	List<ComentariosModel> findByNombre(String nombre);
}
