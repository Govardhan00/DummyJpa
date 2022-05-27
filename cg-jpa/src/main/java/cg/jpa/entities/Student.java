package cg.jpa.entities;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "student")
@NamedQueries({@NamedQuery (name="findall",query = "from Student"),
	@NamedQuery(name = "findbyId",query = "select std from Student std where std.regno = ?1")})

public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int regno;
	@Column(name = "studentName",length = 30)
	private String studentName;
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
