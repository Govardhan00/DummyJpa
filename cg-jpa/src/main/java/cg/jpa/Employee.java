package cg.jpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@SequenceGenerator(name = "emp_seq", initialValue = 100,
	sequenceName = "emp_code_gen", allocationSize = 2)
	private int empcode;
	@Column(name = "empname", length = 30)
	private String empname;
	@Column(name = "salary")
	private double salary;
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
