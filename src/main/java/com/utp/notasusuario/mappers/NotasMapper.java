package com.utp.notasusuario.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.utp.notasusuario.dto.NotasCreateDTO;
import com.utp.notasusuario.dto.NotasDTO;
import com.utp.notasusuario.entities.Notas;

@Mapper
public interface NotasMapper {

	NotasMapper INSTANCE = Mappers.getMapper(NotasMapper.class);

	List<NotasDTO> notasListToNotasDTOList(List<Notas> listaNotas);

	Notas notasCreateDTOToNotas(NotasCreateDTO notasCreateDTO);
	
}
