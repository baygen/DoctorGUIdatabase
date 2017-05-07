/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fordoctor.sqlimpl;

import com.forDoctors.entity.Seanse;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Buy
 */
public class HibernateUtil 
//        implements WorkWithSQL_Doctor
{

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
            ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            
            sessionFactory = configuration.buildSessionFactory(registry);
        } catch (HibernateException ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    
//    @Override
    public void addSeanse(Object seanse) {
        Session ses = getSessionFactory().openSession();
        try{
            Transaction tr = ses.beginTransaction();
            ses.save(seanse);
            tr.commit();
            ses.close();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
        }
    }
    
//    @Override
//    public int updateObj(Object obj) {
//        Session ses =getSessionFactory().openSession();
//        ses.createQuery("");
//        
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }


    public static List<?> getListBy_Date(Date date) {
        
        Session ses =getSessionFactory().openSession();
        ses.beginTransaction();
        Query query = ses.createQuery("SELECT s FROM Seanse s WHERE s.seanseDate = :seanseDate");
//        getNamedQuery("com.forDoctors.entity.Seanse.findBySeanseDate");
        query.setDate("seanseDate", date);
        List<Seanse> res=query.list();
        
        ses.getTransaction().commit();
        ses.flush();
            try{
                ses.close();
            }catch(HibernateException he){
                JOptionPane.showMessageDialog(null, he.getMessage());
            }
    
        return res;        
    }

    public List<?> getListByName(String name) {
        
        Session ses =getSessionFactory().openSession();
        ses.beginTransaction();
        
        Query query = ses.getNamedQuery("Seanse.findByPacienName");
        query.setString("pacienName", name);
        List<Seanse> res = query.list();
        ses.getTransaction().commit();
        try{
            ses.close();
        }catch(HibernateException he){
            
        }
        return res;
    }

    public List<?> getAllSeanse() {
        Session session=getSessionFactory().openSession();
        session.beginTransaction();
        Query query;
        query = session.createSQLQuery("SELECT * FROM seanse");
//        getNamedQuery("Seanse.findAll");
        List<Seanse> res = query.list();
        session.getTransaction().commit();
        try{
            session.close();
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null, he.getMessage());
        }
        return res;
    }

    public int remove(Seanse seanse) {
        Session session = getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.delete(seanse);
        session.getTransaction().commit();
        session.close();
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return seanse.getId();
    }


    
}
