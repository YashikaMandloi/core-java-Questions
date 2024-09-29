package string;

public class Contains {
	public class ContainsExample {
	    public static void main(String[] args) {
	        String str = "Java programming is fun";

	        // Check if the string contains "Java"
	        boolean containsJava = str.contains("Java");
	        System.out.println("Contains 'Java': " + containsJava); // Output: true

	        // Check if the string contains "Python"
	        boolean containsPython = str.contains("Python");
	        System.out.println("Contains 'Python': " + containsPython); // Output: false
	    }
	}

}
