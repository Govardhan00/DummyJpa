package cg.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cg.jpa.entities.Student;

public class StudentDaoImpl implements StudentDao  {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("cgjpa");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction tran = manager.getTransaction();
	

	@Override
	public int addStudent(Student std) {
		tran.begin();
		manager.persist(std);
		tran.commit();
		return std.getRegno();
	}

	@Override
	public List<Student> getAllStudents() {
		Query qry = manager.createNamedQuery("findall");
		return qry.getResultList();
	}

	@Override
	public List<Student> getStudentByRegNo(int regNo) {
		Query qry = manager.createNamedQuery("findbyId");
		qry.setParameter(1, 2);
		return qry.getResultList();
	}

}
