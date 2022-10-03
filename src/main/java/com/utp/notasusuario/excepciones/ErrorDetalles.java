package com.utp.notasusuario.excepciones;

import java.util.Date;
 

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDetalles {

	private Date fechaError;
	private String mensaje;
	private String detalles;
	
}
