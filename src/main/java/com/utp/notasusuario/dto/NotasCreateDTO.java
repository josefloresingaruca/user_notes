package com.utp.notasusuario.dto;
 

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.utp.notasusuario.entities.Usuario;
 
import lombok.Getter; 
import lombok.Setter;

@Getter
@Setter  
public class NotasCreateDTO {
 
	@NotEmpty
	@Size(min=3, message = "Debe ingresar un título con al menos 3 caracteres")
	private String notaTitulo; 
	@NotEmpty
	@Size(min=3, message = "Debe ingresar un comentario con al menos 3 caracteres")
	private String notaComentario;
	@NotEmpty
	private Usuario usuario;
}
