/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1sp0074;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {

    public static final Scanner input = new Scanner(System.in);

    public static int checkInputIntLimit() {
        while (true) {
            try {
                int result = Integer.parseInt(Validation.input.nextLine().trim());

                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input digit");
                System.out.println("Enter agian");
            }
        }
    }
}
