package cg.jpa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import cg.jpa.entities.Student;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		System.out.println("Enter the no of students");
		int a =sc.nextInt();
		Student st = new Student();
		System.out.println("Enter the studentName Skills");
		while(a>0)
		{
			st.setStudentName(sc.next());
			List<String> list = new ArrayList<String>();
			while(sc.hasNext())
			{
				String s = sc.next();
				list.add(s);
				System.out.println(list);
				
				
			}
			//sst.setSkills(list);
			a--;
			System.out.println(a);
			transaction.begin();
			manager.persist(st);
			transaction.commit();
			manager.close();
			sc.close();
		}
		
	}

}
