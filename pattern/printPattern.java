package print;

public class printPattern {
public static void printPattern(int n) {
    int i, j;
    // outer loop to handle number of rows
    for (i = 0; i < n; i++) {
        // inner loop to handle number of columns
        for (j = 0; j < n; j++) {
            // star will print only when it is in the first
            // row, last row, first column, or last column
            if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        // move to the next line after each row
        System.out.println();
    }
}
}