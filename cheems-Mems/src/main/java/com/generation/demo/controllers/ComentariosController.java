package com.generation.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.demo.models.ComentariosModel;
import com.generation.demo.services.ComentariosService;

@RestController
public class ComentariosController {
	private final ComentariosService comentariosService;
	
	public ComentariosController(@Autowired ComentariosService comentariosService) {
		this.comentariosService = comentariosService;
	}

	
	//mostrar datos de comentarios
	@GetMapping("/comentarios")
	public ArrayList<ComentariosModel> obtenerDatosComent() {
	return comentariosService.obtenerDatos();
	}
					
	//Guardar & editar datos en la tabla usuarios
	@PostMapping("/comentarios")
	public ComentariosModel guardarDatosComent(@RequestBody ComentariosModel comentariosModel) {
	return comentariosService.guardarDatos(comentariosModel);
	}
					
	//Eliminar datos va a borrar elementos utilizando un identificador
	@DeleteMapping(path = "/comentarios/{id}") 
	public boolean eliminarDatosComent(@PathVariable("id") Integer id) {
	return comentariosService.eliminarDato(id);
	}
}
