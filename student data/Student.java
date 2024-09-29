package com.data;

public class Student {
	
	    String name;
	    String dept;
	    String loc;
	    int grade;

	    
	    public Student(String name, String dept, String loc, int grade) {
	        this.name = name;
	        this.dept = dept;
	        this.loc = loc;
	        this.grade = grade;
	    }

	    
	    public void Print_Info() {
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + dept);
	        System.out.println("Location: " + loc);
	        System.out.println("Grade: " + grade);
	    }

	    public static void main(String[] args) {
	        
	        Student student = new Student("Yashika", "Computer Science", "bhopal", 95);
	        student.Print_Info();
	    }
	}


