package cg.jpa.dao;

import java.util.List;

import cg.jpa.entities.Student;

public interface StudentDao {
	int addStudent(Student std);
	List<Student> getAllStudents();
	List<Student> getStudentByRegNo(int regNo);

}
