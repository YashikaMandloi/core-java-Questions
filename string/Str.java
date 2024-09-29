package string;

public class Str {
	public static void main(String[] args) {
        // Using a string literal
        String str = "Hello, World!";

        // charAt: Get character at a specific index
        char ch = str.charAt(7); // Should return 'W'
        System.out.println("Character at index 7: " + ch);

        // replace: Replace characters in the string
        String replacedStr = str.replace('o', 'a'); // Replace 'o' with 'a'
        System.out.println("String after replacement: " + replacedStr);

        // toUpperCase: Convert the string to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperStr);

        // toLowerCase: Convert the string to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerStr);
    }
}
