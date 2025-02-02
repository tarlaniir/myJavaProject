package school.lesson7;

public class MatrixFiller {
    public static void fillDiagonal(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1; // Заполняем главную диагональ
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
