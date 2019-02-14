package modelos.dao.utils;

import org.hibernate.*;
import org.hibernate.cfg.*;

import modelos.dao.UsersDAO;

public class Sesion {

	private SessionFactory sessionFactory;
	
	private static Sesion instancia;
	public static Sesion getInstancia() {
		if (instancia == null) {
			instancia = new Sesion();
		}
		return instancia;
	}
	
	private Sesion() {
		//AnnotationConfiguration configuration = new AnnotationConfiguration();
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			//this.sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		} 
		catch (Throwable ex) {
			ex.printStackTrace();
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public Session openSession() throws HibernateException {
		return sessionFactory.openSession();
	}
}
