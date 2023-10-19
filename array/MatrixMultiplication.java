// Matrix multiplication in java
import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] a, b, result;
        int n, m, p, q;

        System.out.println("Enter the number of rows and columns for matrix A:");
        n = in.nextInt();
        m = in.nextInt();

        System.out.println("Enter the number of rows and columns for matrix B:");
        p = in.nextInt();
        q = in.nextInt();

        if (m != p) {
            System.out.println("Matrix multiplication is not possible. The number of columns in A must be equal to the number of rows in B.");
            return;
        }

        a = new int[n][m];
        b = new int[p][q];

        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }

        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                b[i][j] = in.nextInt();
            }
        }

        result = multiplyMatrices(a, b);

        System.out.println("Result of matrix multiplication:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int numRowsA = matrixA.length;
        int numColsA = matrixA[0].length;
        int numColsB = matrixB[0].length;

        int[][] result = new int[numRowsA][numColsB];

        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsB; j++) {
                int sum = 0;
                for (int k = 0; k < numColsA; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }
}
