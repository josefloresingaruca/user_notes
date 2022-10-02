package com.utp.notasusuario.dto;
 

import com.utp.notasusuario.entities.Usuario;
 
import lombok.Getter; 
import lombok.Setter;

@Getter
@Setter  
public class NotasCreateDTO {
 
	private String notaTitulo; 
	private String notaComentario;
	private Usuario usuario;
}
