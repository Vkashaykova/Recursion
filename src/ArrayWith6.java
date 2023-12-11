import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayWith6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numberArr = Arrays
                .stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .toArray();
        List<Integer> numberList = Arrays
                        .stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        int index = Integer.parseInt(scanner.nextLine());
        System.out.println(arrayWith6(numberArr, index));

    }

    private static boolean arrayWith6(int[] numberArr, int index) {
        if (index >= numberArr.length) {
            return false;
        } else if (numberArr[index] == 6) {
            return true;
        } else {
            return arrayWith6(numberArr, index + 1);
        }

    }
}
