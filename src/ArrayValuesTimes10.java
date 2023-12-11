import java.util.Arrays;
import java.util.Scanner;

public class ArrayValuesTimes10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays
                .stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println(arrayValueTime10(numberArr, index));

    }

    private static boolean arrayValueTime10(int[] numberArr, int index) {

        if (index >= numberArr.length - 1) {
            return false;
        } else if (numberArr[index] * 10 == numberArr[index + 1]) {
            return true;
        } else {
            return arrayValueTime10(numberArr, index + 1);
        }

    }
}
