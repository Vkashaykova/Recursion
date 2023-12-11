import java.util.Scanner;

public class ChangePi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(changePi(str));
    }

    public static String changePi(String x) {
        if (x.isEmpty() || !x.contains("pi")) {
            return x;
        }
        int index = x.indexOf("pi");
        String updateX = x.substring(0, index) + "3.14" + x.substring(index + 2);
        return changePi(updateX);

    }
}

