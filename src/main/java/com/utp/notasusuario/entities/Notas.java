package com.utp.notasusuario.entities;
 
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="notas")
public class Notas {
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_nota")
	private long id;
	
	@Column(name="nota_titulo", length = 100, nullable = false)
	private String notaTitulo;
	
	@Column(name="nota_comentario", length = 500, nullable = false)
	private String notaComentario;
	
	
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="id_usuario")
	 private Usuario usuario;
}
