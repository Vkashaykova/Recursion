import java.util.Scanner;

public class CountX {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        System.out.println(countX(x));
    }

    public static int countX(String x) {

        if (x.length() == 0) {
            return 0;
        }else if (x.charAt(0) == 'x') {
            return 1 + countX(x.substring(1));
        } else {
            return countX(x.substring(1));
        }
    }

}
