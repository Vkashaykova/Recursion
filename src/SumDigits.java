import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        if (n >= 1000 & n <= 9999) {
            System.out.println(sumDigits(n));
        }
    }

    private static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return n % 10 + sumDigits(n / 10);

    }

}

