class InvalidAgeException extends RuntimeException {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class ElectionBooth {
    void checkEligibility(int age) {
        if (age < 18) {
            throw new InvalidAgeException("Underage voters not allowed.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}

public class AgeValidator {
    public static void main(String[] args) {
        ElectionBooth booth = new ElectionBooth();

        booth.checkEligibility(20);
        booth.checkEligibility(16);
    }
}

/*
OUTPUT
Case 1 (age = 20)
You are eligible to vote.
Case 2 (age = 16)
Exception in thread "main" InvalidAgeException: Underage voters not allowed.
    at ElectionBooth.checkEligibility(AgeValidator.java:6)
    at AgeValidator.main(AgeValidator.java:15)
*/