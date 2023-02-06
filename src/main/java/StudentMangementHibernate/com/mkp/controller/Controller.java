package StudentMangementHibernate.com.mkp.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.List;


import StudentMangementHibernate.com.mkp.Student;

public class Controller {
	
	private Configuration configure;
	private SessionFactory sessionFactory;
	
	public Controller() {
		configure = new Configuration();
		configure.configure("hibernate.cfg.xml");
		configure.addAnnotatedClass(Student.class);
		sessionFactory = configure.buildSessionFactory();
	}
	
	public  boolean addStudent(Student st) {
		boolean is = false;
		
		System.out.println(st);
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(st);
		session.getTransaction().commit();
		return is;
	}
	
//	
	public  boolean deleteStudent(int id) {
		boolean is = false;
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student student = session.get(Student.class, id);
		
		session.delete(student);
		transaction.commit();
		session.close();
		return is;
	}
//	
	public  Student getStudent(int id) {
		boolean is = false;
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student student = session.get(Student.class, id);
		transaction.commit();
		session.close();
		return student;
	}
	
	public  List<Student> getAllStudents() {
		java.util.List<Student> sList;
		
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		sList = session.createCriteria(Student.class).list();
		transaction.commit();
		session.close();
		return sList;
	}
}
