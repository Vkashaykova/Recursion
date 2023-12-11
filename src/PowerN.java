import java.util.Scanner;

public class PowerN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(power(b, n));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * power(x, n - 1);
    }
}

