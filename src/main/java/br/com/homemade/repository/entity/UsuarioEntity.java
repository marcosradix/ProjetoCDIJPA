package br.com.homemade.repository.entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="usuario")
@NamedQuery(name = "UsuarioEntity.findUser", 
query= "SELECT u FROM UsuarioEntity u WHERE u.usuario = :usuario AND u.senha = :senha")
public class UsuarioEntity implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name="codigo")
	private Long id;
	
	private String usuario;
	
	private String senha;
	
	
	
	
	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getUsuario() {
		return usuario;
	}




	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}




	public String getSenha() {
		return senha;
	}




	public void setSenha(String senha) {
		this.senha = senha;
	}




	public UsuarioEntity() {
		super();
	}
   
}
