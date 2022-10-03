package com.utp.notasusuario.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends RuntimeException{

	 
	private static final long serialVersionUID = 1L;
	
	private String recurso;
	private String campo;
	private long valorCampo;
	
	public ResourceNotFoundException(String recurso, String campo, long valorCampo) {
		super(String.format("% no encontrada con : % : '%s'", recurso,campo,valorCampo));
        this.recurso=recurso;
        this.campo=campo;
        this.valorCampo=valorCampo;
		
	}
	
}
