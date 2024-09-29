package string;

class NotALeapYearException extends Exception {
 public NotALeapYearException(String message) {
     super(message);
 }
}

public class Leap {
 // Method to check if a year is a leap year
 public static void checkLeapYear(int year) throws NotALeapYearException {
     if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
         System.out.println(year + " is a leap year.");
     } else {
         throw new NotALeapYearException(year + " is not a leap year.");
     }
 }

 public static void main(String[] args) {
     int year = 2024; // Example year to validate

     try {
         checkLeapYear(year);
     } catch (NotALeapYearException e) {
         System.out.println(e.getMessage());
     }
 }
}
