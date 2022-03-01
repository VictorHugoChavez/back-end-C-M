package com.generation.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.demo.models.UsuariosModel;
import com.generation.demo.repositories.UsuariosRepository;



@Service
public class UsuariosService {
private final UsuariosRepository usuariosRepository;
	
	public UsuariosService(@Autowired UsuariosRepository usuariosRepository) {
		this.usuariosRepository = usuariosRepository;
	}
	
	
	public ArrayList<UsuariosModel> obtenerDatos() {
		return (ArrayList<UsuariosModel>) usuariosRepository.findAll();
	}
	
	
	public UsuariosModel guardarDatos(UsuariosModel usuariosModel) {
		return usuariosRepository.save(usuariosModel);
	}
	
	
	public boolean eliminarDato(Integer id) {
		try {
			usuariosRepository.deleteById(id);
			return true;
		}
		catch(Exception error) {
			return false;
		}
	}
}
