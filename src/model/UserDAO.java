package model;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import util.Hibernate;

public class UserDAO {

	
	
	public void cadastrar(User u) {
		Session s = Hibernate.getSessionFactory().openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();
		s.close();
	}	
	public void excluir(User u) {
		Session s = Hibernate.getSessionFactory().openSession();
		s.beginTransaction();
		s.delete(u);
		s.getTransaction().commit();
		s.close();
	}
	
	public void excluir(int id) {
		User c = consultar(id);
		if( c != null )
			excluir(c);
	}
	
	public void alterar(User u) {
		System.out.println(u.toString());
		Session s = Hibernate.getSessionFactory().openSession();
		s.beginTransaction();
		s.update(u);
		s.getTransaction().commit();
		s.close();
	}
	
	public User consultar(int id) {
		Session s = Hibernate.getSessionFactory().openSession();
		
		
		SQLQuery query = s.createSQLQuery("select * from tb_user1 where id = :id");
		query.addEntity(User.class);
		
		
		query.setParameter("id", id);
		User c = (User) query.uniqueResult();
		s.close();
		return c;
	}

	public List<User> consultar() {
		Session s = Hibernate.getSessionFactory().openSession();	
		SQLQuery query = s.createSQLQuery("select * from tb_user1");
		query.addEntity(User.class);
		List<User> lista = query.list();
		s.close();
		return lista;
	}
}
