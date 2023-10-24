package test;
import java.util.Scanner;

public class FibonacciWithinBounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.print("Enter the upper bound: ");
        int upperBound = scanner.nextInt();

        printFibonacciWithinBounds(lowerBound, upperBound);
    }

    public static void printFibonacciWithinBounds(int lowerBound, int upperBound) {
        int first = 0, second = 1, next = 0;

        while (next <= upperBound) {
            if (next >= lowerBound) {
                System.out.print(next + " ");
            }
            first = second;
            second = next;
            next = first + second;
        }
    }
}
