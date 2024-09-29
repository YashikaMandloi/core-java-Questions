package data;

public class Student {
	
	
	    String name;
	    String dept;
	    String loc;
	    int grade;

	    // Constructor to initialize name, dept, loc, and grade
	    public Student(String name, String dept, String loc, int grade) {
	        this.name = name;
	        this.dept = dept;
	        this.loc = loc;
	        this.grade = grade;
	    }

	    // Overloaded Print_Info method: No parameters - prints all details
	    public void Print_Info() {
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + dept);
	        System.out.println("Location: " + loc);
	        System.out.println("Grade: " + grade);
	    }

	    // Overloaded Print_Info method: Takes a boolean to include or exclude grade
	    public void Print_Info(boolean includeGrade) {
	        System.out.println("Name: " + name);
	        System.out.println("Department: " + dept);
	        System.out.println("Location: " + loc);
	        if (includeGrade) {
	            System.out.println("Grade: " + grade);
	        }
	    }

	    // Overloaded Print_Info method: Takes a level of detail (1-3)
	    public void Print_Info(int detailLevel) {
	        if (detailLevel >= 1) {
	            System.out.println("Name: " + name);
	        }
	        if (detailLevel >= 2) {
	            System.out.println("Department: " + dept);
	            System.out.println("Location: " + loc);
	        }
	        if (detailLevel >= 3) {
	            System.out.println("Grade: " + grade);
	        }
	    }

	    public static void main(String[] args) {
	        // Example usage
	        Student student = new Student("Yashika", "Computer Science", "Bhopal", 95);

	        // Print all information
	        System.out.println("Full Information:");
	        student.Print_Info();

	        System.out.println("\nInformation without Grade:");
	        // Print information without grade
	        student.Print_Info(false);

	        System.out.println("\nPartial Information (Level 1):");
	        // Print name only (detail level 1)
	        student.Print_Info(1);

	        System.out.println("\nPartial Information (Level 2):");
	        // Print name, dept, and loc (detail level 2)
	        student.Print_Info(2);

	        System.out.println("\nPartial Information (Level 3):");
	       
	        student.Print_Info(3);
	    }
}

	    