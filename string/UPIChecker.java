package string;

class InvalidUPIException extends Exception {
    public InvalidUPIException(String message) {
        super(message);
    }
}

public class UPIChecker {
    // Method to validate UPI ID
    public static void validateUPI(String upiId) throws InvalidUPIException {
        // Basic check for UPI format: 'username@bankname'
        if (upiId == null || !upiId.contains("@")) {
            throw new InvalidUPIException("Invalid UPI ID: " + upiId);
        }
    }

    public static void main(String[] args) {
        String upiId = "user123@bank"; 

        try {
            validateUPI(upiId);
            System.out.println("UPI ID is valid.");
        } catch (InvalidUPIException e) {
            System.out.println(e.getMessage());
        }
    }
}
