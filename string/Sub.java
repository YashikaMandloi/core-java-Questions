package string;

public class Sub {
	public static void main(String[] args) {
        String str = "Hello, World!";
        
        // Get substring from index 7 to the end
        String substring1 = str.substring(7);
        System.out.println("Substring1: " + substring1); // Output: "World!"
        
        // Get substring from index 0 to 5 (exclusive)
        String substring2 = str.substring(0, 5);
        System.out.println("Substring2: " + substring2); // Output: "Hello"
    }
}
