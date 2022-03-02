package com.generation.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.demo.models.ComentariosModel;
import com.generation.demo.repositories.ComentariosRepository;

@Service
public class ComentariosService implements ComentariosServices{
private final ComentariosRepository comentariosRepository;
	
	public ComentariosService(@Autowired ComentariosRepository comentariosRepository) {
		this.comentariosRepository = comentariosRepository;
	}
	
	//@override
	//public User getUser(long id) {
		//Optional<user> user = userRepository.findById(id);
		//return user.orElse(null);
	//}
	
	@Override
	public ArrayList<ComentariosModel> obtenerDatos() {
		return (ArrayList<ComentariosModel>) comentariosRepository.findAll();
	}
	
	@Override
	public ComentariosModel guardarDatos(ComentariosModel comentariosModel) {
		return comentariosRepository.save(comentariosModel);
	}
	
	@Override
	public boolean eliminarDato(Integer id) {
		try {
			comentariosRepository.deleteById(id);
			return true;
		}
		catch(Exception error) {
			return false;
		}
	}

	@Override
	public List<ComentariosModel> findByNombre(String nombre) {
		return comentariosRepository.findByNombreContaining(nombre);
	}
}
