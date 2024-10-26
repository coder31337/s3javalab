import java.util.Scanner;

public class P3MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nMatrix 1");
        System.out.print("Enter number of rows: ");
        int r1 = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int c1 = scanner.nextInt();
        System.out.println("Enter the values:");
        int[][] mat1 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                mat1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nMatrix 2");
        System.out.print("Enter number of rows: ");
        int r2 = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int c2 = scanner.nextInt();
        System.out.println("Enter the values:");
        int[][] mat2 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++)
                mat2[i][j] = scanner.nextInt();
        }

        if (c1 != r2) {
            System.out.println("\nEntered matrices cannot be multiplied");
        } else {
            int[][] product = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        product[i][j] += mat1[i][k] * mat2[k][j];
                    }
                }
            }

            System.out.println("\nProduct matrix is");
            for (int[] row : product) {
                for (int column : row) {
                    System.out.print(column + "\t");
                }
                System.out.println();
            }
        }
    }
}
