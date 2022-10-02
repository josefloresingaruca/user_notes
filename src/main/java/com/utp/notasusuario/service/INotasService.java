package com.utp.notasusuario.service;

import java.util.List;

import com.utp.notasusuario.dto.NotasCreateDTO;
import com.utp.notasusuario.dto.NotasDTO; 

public interface INotasService {

	public  List<NotasDTO> listarNotas();
	public  String registrarNotas(NotasCreateDTO notasCreateDTO);
	  
	
}
