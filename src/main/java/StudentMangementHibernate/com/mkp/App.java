package StudentMangementHibernate.com.mkp;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import StudentMangementHibernate.com.mkp.controller.Controller;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		
		// create configuration
//		Configuration configuration = new Configuration();
//		configuration.configure("hibernate.cfg.xml");
//		configuration.addAnnotatedClass(Student.class);
		
//		// create session factory
//		SessionFactory sessionFactory = configuration.buildSessionFactory();
//		
//		// initialize the session object
//		Session session = sessionFactory.openSession();
//		
//		session.beginTransaction();
//		Student student = new Student("sixth","878878","banglore");
		
		
//	session.save(student);
//	session.getTransaction().commit();
		
		
		System.out.println("welcome to student mangement app");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// controller
		Controller controller = new Controller();
		
		while(true) {
			System.out.println("Press 1 to ADD Student");
			System.out.println("Press 2 to DELETE Student");
			System.out.println("Press 3 to DISPLAY Student");
			System.out.println("Press 4 to ShOW ALL Student");
			System.out.println("Press 5 to EXIT Student");
			int c = Integer.parseInt(br.readLine());
			
			
			if(c==1) {
				
				System.out.println("Enter User Name : ");
				String name = br.readLine();
				System.out.println("Enter User Phone : ");
				String phone = br.readLine();
				System.out.println("Enter User City  : ");
				String city = br.readLine();
				
				Student st = new Student(name,phone,city);
				Boolean ansBoolean = controller.addStudent(st);
			
				
				
			}else if(c==2) {
				System.out.println("Enter Student ID");
				Integer idInteger = Integer.parseInt(br.readLine());
				Boolean ansBoolean = controller.deleteStudent(idInteger);
				
			}else if(c==3) {
				System.out.println("Enter Student ID");
				Integer idInteger = Integer.parseInt(br.readLine());
				Student student = controller.getStudent(idInteger);
				System.out.println(student);
			}else if(c==4) {
				List<Student> sList = controller.getAllStudents();
				for(int i = 0; i < sList.size() ; i++) {
					System.out.println(sList.get(i));
				}
				
			}else if(c == 5){
				System.out.println("Exit..");
			}else {
				System.out.println("Please Enter valid input ");
			}
			
		}
	}
}
