package com.firstPgm;


	import java.util.Scanner;

	
	class Person {
	    String name;
	    int id;
	    String city;

	    public Person(String name, int id, String city) {
	        this.name = name;
	        this.id = id;
	        this.city = city;
	    }

	   
	    public void displayPersonDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("City: " + city);
	    }
	}

	
	class Employee extends Person {
	    double salary;

	    
	    public Employee(String name, int id, String city, double salary) {
	        super(name, id, city);
	        this.salary = salary;
	    }

	   
	    public void displayEmployeeDetails() {
	        displayPersonDetails();
	        System.out.println("Salary: " + salary);
	    }
	}

	
	class Student extends Person {
	    int roll_no;
	    String department;

	   
	    public Student(String name, int id, String city, int roll_no, String department) {
	        super(name, id, city);
	        this.roll_no = roll_no;
	        this.department = department;
	    }

	   
	    public void displayStudentDetails() {
	        displayPersonDetails();
	        System.out.println("Roll No: " + roll_no);
	        System.out.println("Department: " + department);
	    }
	}

	
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        
	        System.out.println("Enter Employee details:");
	        System.out.print("Name: ");
	        String empName = sc.nextLine();
	        System.out.print("ID: ");
	        int empId = sc.nextInt();
	        sc.nextLine(); // Consume the newline character
	        System.out.print("City: ");
	        String empCity = sc.nextLine();
	        System.out.print("Salary: ");
	        double empSalary = sc.nextDouble();

	        
	        Employee employee = new Employee(empName, empId, empCity, empSalary);
	        System.out.println("\nEmployee Details:");
	        employee.displayEmployeeDetails();

	        
	        System.out.println("\nEnter Student details:");
	        sc.nextLine(); 
	        System.out.print("Name: ");
	        String stuName = sc.nextLine();
	        System.out.print("ID: ");
	        int stuId = sc.nextInt();
	        sc.nextLine(); // Consume the newline character
	        System.out.print("City: ");
	        String stuCity = sc.nextLine();
	        System.out.print("Roll No: ");
	        int rollNo = sc.nextInt();
	        sc.nextLine(); // Consume newline character
	        System.out.print("Department: ");
	        String department = sc.nextLine();

	      
	        Student student = new Student(stuName, stuId, stuCity, rollNo, department);
	        System.out.println("\nStudent Details:");
	        student.displayStudentDetails();
	        
	        sc.close();
	    }
}
