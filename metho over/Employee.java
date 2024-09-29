package over;

public class Employee {
	
	    // Attributes of an employee
	    private String name;
	    private int id;
	    private double salary;
	    private String designation;

	    // Constructor to initialize the employee object
	    public Employee(String name, int id, double salary, String designation) {
	        this.name = name;
	        this.id = id;
	        this.salary = salary;
	        this.designation = designation;
	    }

	    // Overloaded method to print name and ID
	    public void print(String name, int id) {
	        System.out.println("Name: " + name + ", ID: " + id);
	    }

	    // Overloaded method to print ID and salary
	    public void print(int id, double salary) {
	        System.out.println("ID: " + id + ", Salary: " + salary);
	    }

	    // Overloaded method to print name and designation
	    public void print(String name, String designation) {
	        System.out.println("Name: " + name + ", Designation: " + designation);
	    }

	    public static void main(String[] args) {
	        // Create an Employee object
	        Employee emp = new Employee("Yashika", 101, 55000.0, "Developer");

	        // Call the overloaded print methods
	        emp.print("Yashika", 101);               // Prints name and ID
	        emp.print(101, 55000.0);               // Prints ID and salary
	        emp.print("Yashika", "Developer");       // Prints name and designation
	    }
	}
