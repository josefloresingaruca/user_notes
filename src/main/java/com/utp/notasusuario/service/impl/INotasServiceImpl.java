package com.utp.notasusuario.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utp.notasusuario.dto.NotasCreateDTO;
import com.utp.notasusuario.dto.NotasDTO;
import com.utp.notasusuario.entities.Notas;
import com.utp.notasusuario.mappers.NotasMapper;
import com.utp.notasusuario.repositories.NotasRepository;
import com.utp.notasusuario.service.INotasService;

@Service
public class INotasServiceImpl  implements INotasService{
	@Autowired
	private NotasRepository notasRepository;

	@Override
	public List<NotasDTO> listarNotas() {
		// TODO Auto-generated method stub
		return NotasMapper.INSTANCE.notasListToNotasDTOList( notasRepository.findAll()) ;
	}

	@Override
	public String registrarNotas(NotasCreateDTO notasCreateDTO) {
		// TODO Auto-generated method stub
		Notas notas=  NotasMapper.INSTANCE.notasCreateDTOToNotas(notasCreateDTO);
		Notas notaEntity=notasRepository.save(notas);
		long resultado = notaEntity.getId();
		return "valor :"+resultado;
	}


 
 
}
