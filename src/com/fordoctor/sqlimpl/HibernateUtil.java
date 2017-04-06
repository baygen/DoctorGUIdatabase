/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fordoctor.sqlimpl;

import com.forDoctors.entity.Seanse;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Buy
 */
public class HibernateUtil 
//        implements WorkWithSQL_Doctor
{

    private static final SessionFactory sesFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sesFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sesFactory;
    }

    
//    @Override
    public void addSeanse(Object seanse) {
        Session ses = getSessionFactory().openSession();
        try{
            ses.beginTransaction();
            ses.saveOrUpdate(seanse);
            ses.getTransaction().commit();
            ses.close();
        }catch(HibernateException e){
            System.out.println(e.getMessage());
            System.out.println("com.fordoctor.sqlimpl.HibernateUtil.addSeanse()");
        }
    }
    
//    @Override
//    public int updateObj(Object obj) {
//        Session ses =getSessionFactory().openSession();
//        ses.createQuery("");
//        
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }

//    @Override
    public static List<?> getListBy_Date(String date) {
        
        Session ses =getSessionFactory().openSession();
//        ses.createQuery("Seanse.findBysDate",date);
        ses.beginTransaction();
        Query query = ses.getNamedQuery("Seanse.findBySDate");
        query.setString("sDate", date);
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

//    @Override
    public List<?> getListByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

//    @Override
    public List<?> getAllSeanse() {
        Session session=getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.getNamedQuery("Seanse.findAll");
        List<Seanse> res = query.list();
        session.getTransaction().commit();
        try{
            session.close();
        }catch(HibernateException he){
            JOptionPane.showMessageDialog(null, he.getMessage());
        }
        return res;
    }

//    @Override
    public int remove(String date, String time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
