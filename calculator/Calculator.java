package cal;

public class Calculator {
	

	   
	    public int add(int a, int b) {
	        return a + b;
	    }

	  
	    public double add(double a, double b) {
	        return a + b;
	    }

	    
	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    
	    public double subtract(double a, double b) {
	        return a - b;
	    }

	   
	    public int multiply(int a, int b) {
	        return a * b;
	    }

	   
	    public double multiply(double a, double b) {
	        return a * b;
	    }

	 
	    public int divide(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("Cannot divide by zero");
	        }
	        return a / b;
	    }

	    
	    public double divide(double a, double b) {
	        if (b == 0) {
	            throw new ArithmeticException("Cannot divide by zero");
	        }
	        return a / b;
	    }

	    public static void main(String[] args) {
	        Calculator calc = new Calculator();

	      
	        System.out.println("Addition of two integers: " + calc.add(10, 5));
	        System.out.println("Addition of two doubles: " + calc.add(10.5, 5.5));

	        
	        System.out.println("Subtraction of two integers: " + calc.subtract(10, 5));
	        System.out.println("Subtraction of two doubles: " + calc.subtract(10.5, 5.5));

	       
	        System.out.println("Multiplication of two integers: " + calc.multiply(10, 5));
	        System.out.println("Multiplication of two doubles: " + calc.multiply(10.5, 5.5));

	        
	        System.out.println("Division of two integers: " + calc.divide(10, 5));
	        System.out.println("Division of two doubles: " + calc.divide(10.5, 5.5));
	    }
	}


