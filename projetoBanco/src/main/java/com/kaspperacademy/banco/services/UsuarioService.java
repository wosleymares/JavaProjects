package com.kaspperacademy.banco.services;

import java.util.List;

import com.kaspperacademy.banco.models.Usuario;

public interface UsuarioService {

	//Create
	Usuario salvar (Usuario usuario);
	
	//Update
	Usuario atualizar(Usuario usuario);
	
	// Listar 
	List<Usuario> listarUsuarios();
	
	Usuario listarUsuario(Long id);
	
	// Delete
	void remover (Long id);
}
