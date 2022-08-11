package com.testany.demo;

import java.util.List;
 
import org.hibernate.Session;

import com.testany.model.*;
import com.util.*;

 
/**
 * Class used to perform CRUD operation on database with Hibernate API's
 * 框架CRUD範例，使不使用自行斟酌
 */
public class TestHibernateCRUD {
 
    @SuppressWarnings("unused")
    public static void main(String[] args) {
 
        TestHibernateCRUD application = new TestHibernateCRUD();
 
        /*
         * Save few objects with hibernate
         */
//        int studentId1 = application.saveStudent("Sam", "Disilva", "Maths");
//        int studentId2 = application.saveStudent("Joshua", "Brill", "Science");
//        int studentId3 = application.saveStudent("Peter", "Pan", "Physics");
//        int studentId4 = application.saveStudent("Bill", "Laurent", "Maths");
// 
        /*
         * Retrieve all saved objects
         */
        List<Emp2> students = application.getAllStudents();
        System.out.println("List of all persisted students >>>");
        for (Emp2 student : students) {
            System.out.println("Persisted Student :" + student);
        }
 
        /*
         * Update an object
         */
//        application.updateStudent(studentId4, "ARTS");
 
        /*
         * Deletes an object
         */
//        application.deleteStudent(studentId2);
 
        /*
         * Retrieve all saved objects
         */
//        List<Student> remaingStudents = application.getAllStudents();
//        System.out.println("List of all remained persisted students >>>");
//        for (Student student : remaingStudents) {
//            System.out.println("Persisted Student :" + student);
//        }
 
    }
 
    /**
     * This method saves a Student object in database
     */
    public int saveStudent(String firstName, String lastName, String section) {
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setSection(section);
 
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        int id = (Integer) session.save(student);
        session.getTransaction().commit();
        session.close();
        return id;
    }
 
    /**
     * This method returns list of all persisted Student objects/tuples from
     * database
     */
    public List<Emp2> getAllStudents() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        @SuppressWarnings("unchecked")
        List<Emp2> students = (List<Emp2>) session.createQuery(
                "FROM Emp2").list();
 
        session.getTransaction().commit();
        session.close();
        return students;
    }
 
    /**
     * This method updates a specific Student object
     */
    public void updateStudent(int id, String section) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        Student student = (Student) session.get(Student.class, id);
        student.setSection(section);
        //session.update(student);//No need to update manually as it will be updated automatically on transaction close.
        session.getTransaction().commit();
        session.close();
    }
 
    /**
     * This method deletes a specific Student object
     */
    public void deleteStudent(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
        Student student = (Student) session.get(Student.class, id);
        session.delete(student);
        session.getTransaction().commit();
        session.close();
    }
}