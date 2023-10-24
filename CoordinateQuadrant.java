package test;
import java.util.Scanner;

public class CoordinateQuadrant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        int x = scanner.nextInt();

        System.out.print("Enter the value of y: ");
        int y = scanner.nextInt();

        determineQuadrant(x, y);
    }

    public static void determineQuadrant(int x, int y) {
        if (x == 0 && y == 0) {
            System.out.println("Origin");
        } else if (x == 0) {
            System.out.println("Y-axis");
        } else if (y == 0) {
            System.out.println("X-axis");
        } else if (x > 0 && y > 0) {
            System.out.println("1st Quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("2nd Quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("3rd Quadrant");
        } else {
            System.out.println("4th Quadrant");
        }
    }
}

