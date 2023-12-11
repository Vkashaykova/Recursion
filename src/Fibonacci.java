import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 0) {
            long[] fibonacciNumbers = new long[n + 1];
            System.out.println(fibonacci(n,fibonacciNumbers));
        }

    }

    private static long fibonacci(int n,long[]fibonacciNumbers) {
        if (fibonacciNumbers[n] == 0) {
            if (n == 0){
                return 0;
            }else if(n==1){
                return 1;
            } else {
                fibonacciNumbers[n] =
                        fibonacci(n - 1, fibonacciNumbers)
                                + fibonacci(n - 2, fibonacciNumbers);
            }
        }
        return fibonacciNumbers[n];
    }
}
