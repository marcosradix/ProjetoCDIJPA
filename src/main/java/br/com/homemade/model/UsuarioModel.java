package br.com.homemade.model;

import java.io.Serializable;

public class UsuarioModel implements Serializable{

	private static final long serialVersionUID = 1L;

	private Long codigo;
	private String usuario;
	private String senha;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long long1) {
		this.codigo = long1;
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
	
	
	
	
	
	
}
