import java.util.Arrays;
import java.util.Scanner;

public class Variations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Z = Integer.parseInt(scanner.nextLine());
        String[] symbols = scanner.nextLine().split(" ");
        Arrays.sort(symbols);
//        String[] newSymbols = {symbols[1], symbols[0]};

        generateVariations(symbols, Z, new StringBuilder());

    }

    private static void generateVariations(String[] symbols, int Z, StringBuilder current) {
        if (current.length() == Z) {
            System.out.println(current);
            return;
        }
        for (String symbol : symbols) {
            current.append(symbol);
            generateVariations(symbols, Z, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}




