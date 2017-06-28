package br.com.excursaja.admin.repository;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import br.com.excursaja.admin.entity.Cliente;

@Repository
public class ClienteRepoImpl implements ClienteRepo {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	@Bean
	public SessionFactory getSessionFactory() {
	    if (entityManagerFactory.unwrap(SessionFactory.class) == null) {
	        throw new NullPointerException("factory is not a hibernate factory");
	    }
	    return entityManagerFactory.unwrap(SessionFactory.class);
	}
	
	private Session getSession() {
		return (getSessionFactory().getCurrentSession() == null) 
				? getSessionFactory().openSession()
						: getSessionFactory().getCurrentSession();
		
	}
	
	@Override
	public List<Cliente> list() {
		return getSessionFactory().openSession().createCriteria(Cliente.class).list();
	}

	@Override
	public void delete(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
