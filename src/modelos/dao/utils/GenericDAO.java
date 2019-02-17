package modelos.dao.utils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public abstract class GenericDAO {
	
	private Sesion sesion;
	
	public GenericDAO() {
		this.sesion = Sesion.getInstancia();
	}

	public List queryAll(Class class1) {
		Session session = this.sesion.openSession();
		List<Object> data = new ArrayList<Object>();
        try {  	
        	data = session.createCriteria(class1).list();             
        } 
        catch (Exception e) {                    
        	e.printStackTrace();
        } 
        finally {  
          session.close();  
        }        
        return data;
	}

	public Object get(Class class1, Serializable id) {
		Session session = this.sesion.openSession();  
        Object object = null;        
        try{
            object = session.get(class1,  id);
        } 
        catch (Exception e) {  
        	e.printStackTrace();        
        }  
        finally {  
            session.close();  
        }             
	    return object;
	}

	public void save(Object object) {
		Session session = this.sesion.openSession();  
		Transaction transaction = null;  
		try {    
        	 transaction = session.beginTransaction();
        	 session.save(object);   
        	 transaction.commit();  
        } 
		catch (Exception e) {  
             transaction.rollback();            
             e.printStackTrace();
        } 
		finally {  
             session.close();  
        }
	}

	public void update(Object object) {
		Session session = this.sesion.openSession();  
        Transaction transaction = null;  
        try {    
        	 transaction = session.beginTransaction();
             session.update(object);   
             transaction.commit();  
        } 
        catch (Exception e) {  
             transaction.rollback();            
             e.printStackTrace();          
        } 
        finally {  
             session.close();  
        }
	}

	public void saveOrUpdate(Object object) {
		Session session = this.sesion.openSession();  
        Transaction transaction = null;  
        try {    
        	 transaction = session.beginTransaction();
             session.saveOrUpdate(object);   
             transaction.commit();  
        } 
        catch (Exception e) {  
             transaction.rollback();            
             e.printStackTrace();          
        } 
        finally {  
             session.close();  
        }
	}

	public void delete(Object object) {
		Session session = this.sesion.openSession();  
        Transaction transaction = null;  
        try {  
            transaction = session.beginTransaction();  
            session.delete(object);  
            transaction.commit();  
           
        } 
        catch (Exception e) {  
           transaction.rollback();             
        } 
        finally {  
           session.close();  
        }
	}
	
	public Object getByField(Class class1, String field, Serializable value) {
		Session session = this.sesion.openSession();  
        Object object = null;        
        try{
            Criteria criteria = session.createCriteria(class1);
            object = criteria.add(Restrictions.eq(""+field+"", value))
                                         .uniqueResult();
        } 
        catch (Exception e) {  
        	e.printStackTrace();        
        }  
        finally {  
            session.close();  
        }             
	    return object;
	}
	
	public List queryAllByField(Class class1, String field, Serializable value) {
		Session session = this.sesion.openSession();
		List<Object> data = new ArrayList<Object>();
        try {  	
        	Criteria criteria = session.createCriteria(class1);
        	data = criteria.add(Restrictions.eq(""+field+"", value)).list();             
        } 
        catch (Exception e) {                    
        	e.printStackTrace();
        } 
        finally {  
          session.close();  
        }        
        return data;
	}

}
