package com.example.jwt.repository;

import org.springframework.data.repository.CrudRepository;
import com.example.jwt.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String>{

	Usuario findByLogin(String login);
}
