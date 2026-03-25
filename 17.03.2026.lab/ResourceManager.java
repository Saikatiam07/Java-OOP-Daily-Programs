import java.util.Scanner;
import java.util.InputMismatchException;

public class ResourceManager {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n, sum = 0;

        try {
            System.out.print("How many numbers? ");
            n = scanner.nextInt();

            System.out.println("Enter numbers:");

            for (int i = 1; i <= n; i++) {
                int num = scanner.nextInt();
                sum += num;
            }

            double avg = (double) sum / n;
            System.out.println("Average = " + avg);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter only numbers.");
        } finally {
            System.out.println("Scanner resource released");
            scanner.close();
        }
    }
}

/*
OUTPUT

Case 1 (valid input)
How many numbers? 3
Enter numbers:
10
20
30
Average = 20.0
Scanner resource released

Case 2 (invalid input)
How many numbers? 3
Enter numbers:
10
abc
Error: Please enter only numbers.
Scanner resource released
*/
