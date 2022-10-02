package com.utp.notasusuario.dto;

import com.utp.notasusuario.entities.Usuario;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@AllArgsConstructor
@NoArgsConstructor
public class NotasDTO {

	private long id;
	private String notaTitulo; 
	private String notaComentario;
	private Usuario usuario;
}
