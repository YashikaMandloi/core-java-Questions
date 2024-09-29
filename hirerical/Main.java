package firstpgm;

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

	    public void displayPerson() {
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("City: " + city);
	    }
	}

	class Employee extends Person {
	    double salary;

	    public Employee(String name, int id, String city, double salary) {
	        super(name, id, city); // Calling the parent constructor
	        this.salary = salary;
	    }

	    public void displayEmployee() {
	        super.displayPerson(); // Calling displayPerson from Person class
	        System.out.println("Salary: " + salary);
	    }
	}

	class Student extends Employee {
	    int rollNo;
	    String department;

	    public Student(String name, int id, String city, double salary, int rollNo, String department) {
	        super(name, id, city, salary); // Calling the parent constructor
	        this.rollNo = rollNo;
	        this.department = department;
	    }

	    public void displayStudent() {
	        super.displayEmployee(); // Calling displayEmployee from Employee class
	        System.out.println("Roll No: " + rollNo);
	        System.out.println("Department: " + department);
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input for the Student object
	        System.out.print("Enter name: ");
	        String name = scanner.nextLine();

	        System.out.print("Enter ID: ");
	        int id = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        System.out.print("Enter city: ");
	        String city = scanner.nextLine();

	        System.out.print("Enter salary: ");
	        double salary = scanner.nextDouble();

	        System.out.print("Enter roll number: ");
	        int rollNo = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        System.out.print("Enter department: ");
	        String department = scanner.nextLine();

	        // Creating a Student object
	        Student student = new Student(name, id, city, salary, rollNo, department);
	        
	        student.displayStudent();

	        scanner.close();
	    }
	}


