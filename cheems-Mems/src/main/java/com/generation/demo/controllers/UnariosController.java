package com.generation.demo.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.demo.models.UsuariosModel;
import com.generation.demo.services.UsuariosService;

@RestController
public class UnariosController {
	private final UsuariosService usuariosService;

	public UnariosController(@Autowired UsuariosService usuariosService) {
		this.usuariosService = usuariosService;
	}
	
	@GetMapping("/usuarios")
	public ArrayList<UsuariosModel> obtenerDatos() {
		return usuariosService.obtenerDatos();
	}
	
	//Guardar & editar datos en la tabla usuarios
	@PostMapping("/usuarios")
	public UsuariosModel guardarDatos(@RequestBody UsuariosModel usuariosModel) {
		return usuariosService.guardarDatos(usuariosModel);
	}
	
	//Eliminar datos va a borrar elementos utilizando un identificador
	@DeleteMapping(path = "/usuarios/{id}") 
	public boolean eliminarDato(@PathVariable("id") Integer id) {
		return usuariosService.eliminarDato(id);
	}
}
