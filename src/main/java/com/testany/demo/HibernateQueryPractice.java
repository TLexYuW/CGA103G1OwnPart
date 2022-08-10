package com.testany.demo;
import java.util.List;

import org.hibernate.Session;

import com.testany.model.Emp2;
import com.util.*;
/*
 * 測試框架，請暫時勿使用
 */
public class HibernateQueryPractice {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
        HibernateQueryPractice application = new HibernateQueryPractice();
        
        List<Emp2> remaingEmployees = application.getAllEmployees();
        System.out.println("List of all remained persisted employee >>>");
        for (Emp2 employee : remaingEmployees) {
            System.out.println("Persisted Employee :" + employee);
        }

	}
	
	 public List<Emp2> getAllEmployees() {
	        Session session = HibernateUtil.getSessionFactory().openSession();
	        
	        session.beginTransaction();
	 
	        @SuppressWarnings("unchecked")
	        List<Emp2> employees = (List<Emp2>) session.createQuery(
	                "from Emp2").list();
	 
	        session.getTransaction().commit();
	        session.close();
	        return employees;
	    }
}
