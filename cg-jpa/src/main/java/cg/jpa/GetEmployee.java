package cg.jpa;

import java.util.List;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetEmployee {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		Employee emp = manager.find(Employee.class, 101);
		System.out.println(emp.getEmpcode()+emp.getEmpname()+emp.getSalary());
		//to fetch all data
		javax.persistence.Query qry = manager.createQuery("from Employee");
		List<Employee> emplist = qry.getResultList();
		emplist.forEach((e)->System.out.println(e.getEmpcode()+e.getEmpname()));
	}

}
