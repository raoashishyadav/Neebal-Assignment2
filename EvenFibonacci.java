package test;
public class EvenFibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of even Fibonacci numbers to print
        printEvenFibonacci(n);
    }

    public static void printEvenFibonacci(int n) {
        int first = 0;
        int second = 1;

        for (int i = 0; i < n; ) {
            int next = first + second;
            if (next % 2 == 0) {
                System.out.print(next + " ");
                i++;
            }
            first = second;
            second = next;
        }
    }
}

