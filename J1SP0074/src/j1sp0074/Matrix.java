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
    int row, col;

    public Matrix() {
    }

    public Matrix(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void enterMatrix() {
        System.out.print("Enter no of rows: ");
        row=Validation.checkInputIntLimit();
        System.out.print("Enter no of columns: ");
        col=Validation.checkInputIntLimit();
        matrix=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Validation.input.nextInt();
            }
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
//    public int[][] addMatrix(int[][] m1, int[][] m2){
//       m1=new int[row][col];
//    }
}
