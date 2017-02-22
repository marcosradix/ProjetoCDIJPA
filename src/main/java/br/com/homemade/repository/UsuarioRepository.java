package br.com.homemade.repository;

import java.io.Serializable;

import javax.persistence.Query;

import br.com.homemade.model.UsuarioModel;
import br.com.homemade.repository.entity.UsuarioEntity;
import br.com.homemade.uteis.Uteis;

public class UsuarioRepository implements Serializable{

	private static final long serialVersionUID = 1L;

	public UsuarioEntity validaUsuario(UsuarioModel usuarioModel){
		
		try{
			
			Query query  = Uteis.JpaEntityManager().createNamedQuery("UsuarioEntity.findUser");
			
		
			query.setParameter("usuario", usuarioModel.getUsuario());
			query.setParameter("senha", usuarioModel.getSenha());
 
			
			return (UsuarioEntity)query.getSingleResult();
			
		}catch(Exception e){
			e.printStackTrace();
			
			
		}
		return null;
		
		
	}
	
	
	
	
}
