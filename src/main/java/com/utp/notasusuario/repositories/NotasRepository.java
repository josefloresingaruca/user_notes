package com.utp.notasusuario.repositories;

import org.springframework.stereotype.Repository;

import com.utp.notasusuario.entities.Notas;

import org.springframework.data.jpa.repository.JpaRepository; 

@Repository
public interface NotasRepository  extends JpaRepository<Notas, Long>{

}
