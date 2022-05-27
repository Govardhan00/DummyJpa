package one2many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class One2ManyInsertion {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		College college = new College();
		college.setCollegeCode("BPS103");
		college.setCollegeName("BPS");
		college.setLocation("Bangalore");
		
		//craete courses
		Courses courses = new Courses();
		courses.setCourseId(111);
		courses.setCourseName("Civil");
		courses.setCapacity(60);
		courses.setCollege(college);//to college
		
		Courses courses2 = new Courses();
		courses2.setCourseId(401);
		courses2.setCourseName("ECE");
		courses2.setCapacity(60);
		courses2.setCollege(college);//to college
		
		//to create courses list of objects
		List<Courses> courseList = new ArrayList<Courses>();
		courseList.add(courses);
		courseList.add(courses2);
		college.setCourses(courseList);
		
		transaction.begin();
		manager.persist(college);
		transaction.commit();
		manager.close();
		
		
 		
	}

}
