import java.util.Scanner;

public class ScroogeMcDuck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] labyrinth = new int[row][col];
        int currentRow = 0;
        int currentCol = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                labyrinth[i][j] = scanner.nextInt();

            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (labyrinth[i][j] == 0) {
                    currentRow = i;
                    currentCol = j;
                    break;
                }
            }

        }

        scroogeMcDuc(labyrinth, currentRow, currentCol);
    }

    private static int counter = 0;

    private static void scroogeMcDuc(int[][] labyrinth, int row, int col) {
        if (labyrinth[row][col] < 0) {

            System.out.println(counter - 1);
            return;
        }
        int currentRow = row;
        int currentCol = col;

        int maxNum = 0;
        //left
        if (col - 1 >= 0 && labyrinth[row][col - 1] > maxNum) {
            maxNum = labyrinth[row][col - 1];
            currentCol = col - 1;
        }
        //right
        if (col + 1 < labyrinth[0].length && maxNum < labyrinth[row][col + 1]) {
            maxNum = labyrinth[row][col + 1];
            currentCol = col + 1;
        }
        //up
        if (row - 1 >= 0 && maxNum < labyrinth[row - 1][col]) {
            maxNum = labyrinth[row - 1][col];
            currentRow = row - 1;
            currentCol = col;
        }
        //down
        if (row + 1 < labyrinth.length && maxNum < labyrinth[row + 1][col]) {
            maxNum = labyrinth[row + 1][col];
            currentRow = row + 1;
            currentCol = col;
        }
        labyrinth[currentRow][currentCol] = maxNum - 1;
        counter++;
        scroogeMcDuc(labyrinth, currentRow, currentCol);
    }

}
