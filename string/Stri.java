package string;


public class Stri {
    public static void main(String[] args) {
        // Using a string literal
        String str = "JavaProgramming";

        // charAt: Get the character at a specific index
        char ch = str.charAt(4); // Should return 'P'
        System.out.println("Character at index 4: " + ch);

        // replace: Replace a character in the string
        String replacedStr = str.replace('a', 'x'); // Replaces 'a' with 'x'
        System.out.println("String after replacement: " + replacedStr);

        // toUpperCase: Convert the string to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperStr);

        // toLowerCase: Convert the string to lowercase
        String lowerStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerStr);
    }
}


