import java.util.Arrays;
import java.util.Scanner;

public class ArraysContaining11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays
                .stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println(arrayWith11(numberArr, index));

    }

    private static int arrayWith11(int[] numberArr, int index) {

        if (index >= numberArr.length) {
            return 0;
        } else if (numberArr[index] == 11) {
            return 1 + arrayWith11(numberArr, index + 1);
        } else {
            return arrayWith11(numberArr, index + 1);
        }

    }
}

