package generics;

class Box<T> {
    private T value;

    // Constructor
    public Box(T value) {
        this.value = value;
    }

    // Getter method
    public T getValue() {
        return value;
    }

    // Setter method
    public void setValue(T value) {
        this.value = value;
    }

    // Display value type
    public void displayType() {
        System.out.println("Type of T is " + value.getClass().getName());
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Box for Integer
        Box<Integer> intBox = new Box<>(123);
        intBox.displayType();  // Output: Type of T is java.lang.Integer
        System.out.println("Value: " + intBox.getValue());

        // Create a Box for String
        Box<String> strBox = new Box<>("Hello");
        strBox.displayType();  // Output: Type of T is java.lang.String
        System.out.println("Value: " + strBox.getValue());
    }
}