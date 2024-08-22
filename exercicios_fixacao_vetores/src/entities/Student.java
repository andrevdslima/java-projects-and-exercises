package entities;

public class Student {
	
	private String name;
	private double grade;
	private double grade1;
	
	public Student() {
	}
	
	public Student(String name, double grade, double grade1) {
		this.name = name;
		this.grade = grade;
		this.grade1 = grade1;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	public double getGrade1() {
		return grade1;
	}
	
	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}
	
}
