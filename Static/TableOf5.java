package stack;

public class TableOf5 {

    // Static variable to store the number 5
    static int num = 5;

    // Static method to print the table
    public static void printTable() {
        System.out.println("Table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    // Main method
    public static void main(String[] args) {
        // Call the static method
        printTable();
    }
}

