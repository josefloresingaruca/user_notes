package com.utp.notasusuario.entities;
  
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="notas")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notas {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_nota")
	private long id;
	
	@Column(name="nota_titulo", length = 100, nullable = false)
	private String notaTitulo;
	
	@Column(name="nota_comentario", length = 500, nullable = false)
	private String notaComentario;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="id")
	 private Usuario usuario;
}
