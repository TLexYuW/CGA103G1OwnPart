package com.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.testany.model.Employee;
import com.testany.model.Student;
import com.testany.model.Emp2;
 
/*
 * 測試框架，請暫時勿使用
 */
public class HibernateUtil {
     
    private static final SessionFactory sessionFactory;
     
    static{
        try{
            sessionFactory = new Configuration().addPackage("testany.model")
    				.addAnnotatedClass(Student.class)
    				.addAnnotatedClass(Employee.class)
    				.addAnnotatedClass(Emp2.class)
    				.configure()
    				.buildSessionFactory();
 
        }catch (Throwable ex) {
            System.err.println("Session Factory could not be created." + ex);
            throw new ExceptionInInitializerError(ex);
        }   
    }
     
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
     
}