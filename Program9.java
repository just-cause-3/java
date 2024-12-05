

public class Program9 {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;

            if (denominator == 0) {
                // Throw the custom exception if denominator is zero
                throw new DivisionByZeroException("Division by zero is not allowed");
            }

            // Perform the division
            int result = numerator / denominator;

            // This line will not execute due to the exception
            System.out.println("Result: " + result);
        } catch (DivisionByZeroException e) {
            // Catch the custom exception and handle it
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            // The finally block executes whether an exception occurs or not
            System.out.println("Finally block executed");
        }
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message); // Pass the message to the Exception class
    }
}