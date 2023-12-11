import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println(countHi(x));
    }

    public static int countHi(String x) {

        if (x.length() < 2) {
            return 0;
        } else if (x.substring(0, 2).equals("hi")) {
            return 1 + countHi(x.substring(2));
        } else {
            return countHi(x.substring(1));
        }
    }
}



