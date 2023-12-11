import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(countOccurrences(n));

    }

    private static int countOccurrences(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + countOccurrences(n / 10);
        } else {
            return countOccurrences(n / 10);
        }


    }

}
