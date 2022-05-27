package cg.jpa.main;

import java.util.List;

import cg.jpa.entities.Student;
import cg.jpa.service.StudentService;
import cg.jpa.service.StudentServiceImpl;

public class GetAllStudents {

	public static void main(String[] args) {
		StudentService ss = new StudentServiceImpl();
		List<Student> stdlist = ss.getAllStudent();
		stdlist.forEach(e->System.out.println(e.getRegno()+" "+e.getStudentName()));

	}

}
