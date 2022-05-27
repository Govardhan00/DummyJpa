package cg.jpa.main;

import cg.jpa.entities.Student;
import cg.jpa.service.StudentService;
import cg.jpa.service.StudentServiceImpl;

public class AddStudent {

	public static void main(String[] args) {
		StudentService ss = new StudentServiceImpl();
		Student std = new Student();
		std.setStudentName("vipul");
		int id = ss.addStudent(std);
		System.out.println(id);

	}

}
