import java.util.Scanner;

public class BunnyEars2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(factorial(n));
    } private static long factorial(long n) {
        if (n == 0) {
            return 0;
        }if(n%2==0){
            return 3 + factorial(n - 1);
        }else{
            return 2 + factorial(n - 1);
        }



    }
}
