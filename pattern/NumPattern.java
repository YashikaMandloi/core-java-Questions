package pattern;

public class NumPattern {
	 public static void main(String[] args) {
	        int n = 5; 
	        
	        for (int i = 1; i <= n; i++) { 
	        	 for (int space = n; space > i; space--) {
	                 System.out.print("  "); // Two spaces for alignment
	             }

	            for (int j = 1; j <= i; j++) { 
	                System.out.print(i + " "); 
	            }
	            
	            for (int j = 1; j < i; j++) {
	                System.out.print(i + " ");
	            }

	            System.out.println(); // Move to the next line after each row
	        }
	    }
}
