package abstraction;

	// Abstract class Shape
	abstract class Shape {
	    String con;  // A property to hold additional info
	    String msg;  // A property for a message

	    // Constructor for Shape
	    public Shape(String con, String msg) {
	        this.con = con;
	        this.msg = msg;
	    }

	    // Abstract method for area calculation
	    abstract double area();

	    // Method to display a message
	    public void displayMessage() {
	        System.out.println(msg);
	    }
	}

	// Circle class inheriting from Shape
	class Circle extends Shape {
	    double radius;

	    // Constructor for Circle
	    public Circle(String con, String msg, double radius) {
	        super(con, msg);  // Calling the constructor of the Shape class
	        this.radius = radius;
	    }

	    // Implement the area() method
	    @Override
	    double area() {
	        return Math.PI * radius * radius;
	    }
	}

	// Main class to test the implementation
	public class Main {
	    public static void main(String[] args) {
	        // Create a Circle object
	        Circle circle = new Circle("2D Shape", "This is a circle", 5.0);

	        // Display message and area
	        circle.displayMessage();
	        System.out.println("The area of the circle is: " + circle.area());
	    }
	}


