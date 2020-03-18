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
public class J1SP0074 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();

        System.out.println("Enter matrix 1-----------");
        matrix1.enterMatrix();
        System.out.println("Enter matrix 2-----------");
        matrix2.enterMatrix();
        Matrix Sum = new Matrix(matrix1.getNoRows(), matrix1.getNoCols());
        Sum = matrix1.sumMatrix(matrix2);
        System.out.println("Display: ");
        Sum.displayMatrix();

    }

}
