/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0074;

/**
 *
 * @author Admin
 */
public class Matrix {

    int[][] matrix;
    int rows, cols;

    public Matrix() {
    }

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        matrix = new int[rows][cols];
    }

    public int getNoRows() {  // returns the total number of rows
        return rows;
    }

    public int getNoCols() { // returns the total number of cols
        return cols;
    }

    public int getValue(int row, int col) {
        return matrix[row][col];
    }

    public void setValue(int row, int col, int value) {
        matrix[row][col] = value;
    }

    public Matrix enterMatrix() {
        System.out.print("Enter no of rows: ");
        rows = Validation.checkInputIntLimit();
        System.out.print("Enter no of columns: ");
        cols = Validation.checkInputIntLimit();
        Matrix mt = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Enter " + '[' + "%d" + ']' + '[' + "%d" + ']' + ":", i + 1, j + 1);
                mt.setValue(i, j, Validation.checkInputIntLimit());
            }
        }
        return mt;
    }

    public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(this.getValue(i, j) + " ");
            }
            System.out.println();
        }
    }

    public Matrix sumMatrix(Matrix m2) {
        int row1 = getNoRows();
        int col1 = getNoCols();
        Matrix sum = new Matrix(row1, col1);
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                sum.setValue(i, j, (getValue(i, j) + m2.getValue(i, j)));
            }
        }
        return sum;
    }
}
