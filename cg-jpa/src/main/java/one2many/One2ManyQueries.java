package one2many;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class One2ManyQueries {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		Query query = manager.createQuery("from College");
		//to get all the records
		List<College> college = query.getResultList();
		for(College cl: college)
		{
			System.out.println(cl.getCollegeCode()+" "+cl.getCollegeName()+" "+cl.getLocation());
			List<Courses> courses = cl.getCourses();
			for (Courses cr : courses)
			{
				System.out.println(cr.getCourseId()+" "+cr.getCourseName()+" "+cr.getCapacity());
			}
		}
		
		
	}

}
