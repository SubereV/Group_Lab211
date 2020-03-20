/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0074;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SP0074 {

    private static final Scanner in = new Scanner(System.in);

    

    private static int[][] inputMatrix(int n) {
        System.out.print("Enter Row Matrix: ");
        int row = Validation.checkInputInt();
        System.out.print("Enter Colum Matrix: ");
        int col = Validation.checkInputInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter Matrix " + n + ": [" + "%d" + "]" + "[" + "%d" + "]:", i + 1, j + 1);
                matrix[i][j] = Validation.checkInputInt();
            }
        }
        return matrix;
    }

    private static void displayMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }

    private static void additionMatrix(int[][] matrix1, int[][] matrix2) {
        displayMatrix(matrix1);
        System.out.println("+");
        displayMatrix(matrix2);
        System.out.println("=");
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] sum = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                sum[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print("[" + sum[i][j] + "]");
            }
            System.out.println();
        }
    }

    private static void subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        displayMatrix(matrix1);
        System.out.println("-");
        displayMatrix(matrix2);
        System.out.println("=");
        int row = matrix1.length;
        int col = matrix1[0].length;
        int[][] diff = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                diff[i][j] = (matrix1[i][j] - matrix2[i][j]);
                System.out.print("[" + diff[i][j] + "]");
            }
            System.out.println();
        }
    }

    private static void multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        displayMatrix(matrix1);
        System.out.println("*");
        displayMatrix(matrix2);
        System.out.println("=");
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int row2 = matrix2.length;
        int col2 = matrix2[0].length;
        if (col1 != row2) {
            System.err.println("Can't multiple");
            return;
        }
        int[][] matrixResult = new int[row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                matrixResult[i][j] = 0;
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < col1; k++) {
                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        displayMatrix(matrixResult);
    }

   

    public static void main(String[] args) throws IOException {
        System.out.println("----Enter matrix 1----- ");
        int[][] matrix1 = inputMatrix(1);
        System.out.println("----Enter matrix 2-----");
        int[][] matrix2 = inputMatrix(2);
        while (true) {
            System.out.println("1. Addition Matrix");
            System.out.println("2. Subtraction Matrix");
            System.out.println("3. Multiplication Matrix");
            System.out.println("4. Quit");
            System.out.print("Enter your choice: ");
            int choice = Validation.checkInputIntLimit(1, 4);
            switch (choice) {
                case 1:
                    additionMatrix(matrix1, matrix2);
                    break;
                case 2:
                    subtractionMatrix(matrix1, matrix2);
                    break;
                case 3:
                    multiplicationMatrix(matrix1, matrix2);
                    break;
                case 4:
                    return;
            }
        }
    }

}
