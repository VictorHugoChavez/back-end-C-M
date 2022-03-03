package com.generation.demo.services;

import static java.util.Collections.emptyList;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.generation.demo.models.UsuariosModel;
import com.generation.demo.repositories.UsuariosRepository;



@Service
public class UsuariosService implements UserDetailsService {
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
	
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsuariosModel user = usuariosRepository.findByUsuario(username);

        if(user == null) {
            throw new UsernameNotFoundException(username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsuario(), user.getContrasenia(), emptyList());
    }
}
