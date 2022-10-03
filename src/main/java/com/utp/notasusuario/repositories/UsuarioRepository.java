package com.utp.notasusuario.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.utp.notasusuario.entities.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>  {

	public Optional<Usuario> findByEmail(String email);
	
	public Optional<Usuario> findByUsernameOrEmail(String username,String email);
	public Optional<Usuario> findByUsername(String username);
	public Boolean existsByUsername(String username);
	public Boolean existsByEmail(String email);
}
