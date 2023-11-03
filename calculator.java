import java.util.InputMismatchException;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new ArithmeticException("Cannot calculate the square root of a negative number.");
            }

            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is: " + squareRoot);
        } catch (InputMismatchException e) {
            System.out.println("Input error: Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Calculation error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

