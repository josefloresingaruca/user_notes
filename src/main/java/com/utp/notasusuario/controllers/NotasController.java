package com.utp.notasusuario.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utp.notasusuario.dto.NotasCreateDTO;
import com.utp.notasusuario.dto.NotasDTO;
import com.utp.notasusuario.service.INotasService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api
@RestController
@RequestMapping(path = "/api")
public class NotasController {

	
	@Autowired
 	private INotasService notasService;  
	
	@ApiOperation(value="Retorna la lista general de las notas de usuario",notes="Retorna la lista general de las notas de usuario")
	@GetMapping("/notas")
	public ResponseEntity<List<NotasDTO>> listarNotas(){
		return  new ResponseEntity<>(notasService.listarNotas(),HttpStatus.OK);
	}
	
	@ApiOperation(value="Registra la información de la nota de usuario",notes="Registra la información de la nota de usuario")
	@PostMapping("/notas") 
	public  ResponseEntity<?> registrarNotas(@RequestBody NotasCreateDTO notasCreateDTO) {
		return  new ResponseEntity<> ( notasService.registrarNotas(notasCreateDTO),HttpStatus.OK);
	}
}
