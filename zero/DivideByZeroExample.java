package zero;

public class DivideByZeroExample {
	
	    public static void main(String[] args) {
	        int number = 10; // You can change this to any number

	        try {
	            int result = number / 0; // This will cause an ArithmeticException
	            System.out.println("The result is: " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: Cannot divide " + number + " by zero.");
	        }
	    }
	}


