package com.utp.notasusuario.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usuario")
	private long id;
	
	@Column(name="nombre_usuario", length = 50, nullable = false)	
	private String nombreUsuario;
	
	@Column(name="password", length = 50, nullable = false)	
	private String password;
	
	@Column(name="email", length = 50, nullable = false)
	private String email;
	
	
	
	
	
}
