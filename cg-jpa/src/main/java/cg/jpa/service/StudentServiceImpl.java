package cg.jpa.service;

import java.util.List;

import cg.jpa.dao.StudentDao;
import cg.jpa.dao.StudentDaoImpl;
import cg.jpa.entities.Student;

public class StudentServiceImpl implements StudentService {
	StudentDao dao = new StudentDaoImpl();
	
	@Override
	public int addStudent(Student std) {
		return dao.addStudent(std);
	}

	@Override
	public List<Student> getAllStudent() {
		return dao.getAllStudents();
	}

	@Override
	public List<Student> getStudentByRegNo(int regNo) {
		return dao.getStudentByRegNo(regNo);
	}

}
