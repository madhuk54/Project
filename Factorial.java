package Project;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (N) to generate factorials up to N: ");
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("Factorial Numbers up to " + number + ":");
        for (int i = 0; i <= number; i++) {
            System.out.println(i + "! = " + calculateFactorial(i));
        }
    }

    public static long calculateFactorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
