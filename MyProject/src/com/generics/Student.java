package com.generics;

public class Student implements Comparable<Student> {
	
	String id;
	String name;
	Double cgpa;
	
	public Student(String studentId, String studentName, Double studentCGPA){
		id = studentId;
		name = studentName;
		cgpa = studentCGPA;
	}
	
	@Override
	public String toString(){
		return " \n " + id + " \t " + name + " \t " + cgpa;
	}
    
	@Override
	public int compareTo(Student that){
		return this.id.compareTo(that.id);
	}
}
