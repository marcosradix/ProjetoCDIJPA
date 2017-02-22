package teste;

import java.io.Serializable;
import java.util.ArrayList;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import br.com.homemade.repository.entity.UsuarioEntity;

public class Teste implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	static UsuarioEntity usuarioEntity;
	
	
	public static void main(String[] args) {
		
		
		
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjetoCDIJPA");
		
		EntityManager manager = factory.createEntityManager();
		
		EntityTransaction trx = manager.getTransaction();
		
		trx.begin();
		

		
		usuarioEntity.setUsuario("admin");
		usuarioEntity.setSenha("123456");
		
		ArrayList <UsuarioEntity> login = new ArrayList<>();
		login.add(usuarioEntity);
		
		manager.persist(usuarioEntity);
		trx.commit();
	}
	
}
