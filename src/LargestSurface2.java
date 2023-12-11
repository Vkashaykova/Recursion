import java.util.Scanner;

public class LargestSurface2 {
    private static int[][] matrix;
    private static boolean[][] visited;
    private static int currentSize;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();
        matrix = new int[row][col];
        visited = new boolean[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int maxSize = findLargestSurface();
        System.out.println(maxSize);

    }

    private static int findLargestSurface() {
        int maxSize = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!visited[i][j]) {
                    currentSize = 0;
                    dfs(i, j, matrix[i][j]);
                    maxSize = Math.max(maxSize, currentSize);
                }

            }
        }
        return maxSize;
    }

    private static void dfs(int row, int col, int value) {
        if ((isOutOfSurface(row, col)) || visited[row][col] || matrix[row][col] != value) {
            return;
        }

        visited[row][col] = true;
        currentSize++;

        dfs(row, col + 1, value); //right
        dfs(row - 1, col, value); //up
        dfs(row + 1, col, value); //down
        dfs(row, col - 1, value); //left
    }

    private static boolean isOutOfSurface(int row, int col) {
        return row >= matrix.length
                || row < 0
                || col >= matrix[0].length
                || col < 0;
    }


}
