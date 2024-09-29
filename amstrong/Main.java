package amstrong;

	class NumberChecker {
	    public boolean isArmstrong(int number) {
	        int originalNumber = number;
	        int sum = 0;
	        int digit;

	        while (number != 0) {
	            digit = number % 10;
	            sum += digit * digit * digit; // cube of the digit
	            number /= 10;
	        }

	        return sum == originalNumber; // returns true if Armstrong
	    }
	}

	class CustomNumberChecker extends NumberChecker {
	    @Override
	    public boolean isArmstrong(int number) {
	        System.out.println("Checking Armstrong number in CustomNumberChecker...");
	        return super.isArmstrong(number); // calls the parent method
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        int number = 153; // Example Armstrong number

	        NumberChecker checker = new CustomNumberChecker(); // Upcasting
	        if (checker.isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
	}


