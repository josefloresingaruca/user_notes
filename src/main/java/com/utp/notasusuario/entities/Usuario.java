package com.utp.notasusuario.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

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
	private long id;
	
	@Column(name="username", length = 50, nullable = false)	
	private String username;
	
	@Column(name="password", length = 150, nullable = false)	
	private String password;
	
	@Column(name="email", length = 50, nullable = false)
	private String email;
	
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "usuarios_roles", joinColumns = @JoinColumn(name = "id_usuario", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_rol", referencedColumnName = "id"))
	private Set<Rol> roles = new HashSet<>();
	
	
	
}
