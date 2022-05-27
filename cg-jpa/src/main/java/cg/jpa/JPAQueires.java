package cg.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPAQueires {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		//using ?
//		Query qry = manager.createQuery("select e from Employee e where e.empcode >=?1");
//		qry.setParameter(1, 103);
//		List<Employee> emplist = qry.getResultList();
//		for(Employee e : emplist)
//		{
//			System.out.println(e.getEmpname()+" "+e.getEmpcode()+" "+e.getSalary());
//		}
//		//using name
//		Query qry2 = manager.createQuery("select e from Employee e where e.empcode = : name");
//		qry2.setParameter("name", 103);
//		List<Employee> emplist1 = qry2.getResultList();
//		emplist1.forEach(e->System.out.println(e.getEmpcode()+" "+e.getEmpname()+" "+e.getSalary()));
		tran.begin();
		Query qry = manager.createNativeQuery("delete from Employee where empcode =?1");
		qry.setParameter(1, 101);
		
		System.out.println(qry.executeUpdate());
		
		//manager.persist();
		tran.commit();manager.close();
	}

}
