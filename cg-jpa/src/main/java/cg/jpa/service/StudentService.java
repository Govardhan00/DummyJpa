package cg.jpa.service;

import java.util.List;

import cg.jpa.dao.StudentDao;
import cg.jpa.dao.StudentDaoImpl;
import cg.jpa.entities.Student;

public interface StudentService {
	int addStudent(Student std);
	List<Student> getAllStudent();
	List<Student> getStudentByRegNo(int regno);
	

}
