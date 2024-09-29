package string;

public class join {

	public static void main(String[] args) {
        String[] words = {"Java", "is", "fun"};

        // Joining the words with a space separator
        String joinedString = String.join(" ", words);
        System.out.println("Joined String: " + joinedString);
        // Joining the words with a comma separator
        String joinedStringWithComma = String.join(", ", words);
        System.out.println("Joined String with Comma: " + joinedStringWithComma); 
    }
}
