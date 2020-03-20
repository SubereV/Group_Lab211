/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0073;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validation {

    private static final Scanner in = new Scanner(System.in);
    private static final String DATE_VALID = "^\\d{1}|[0-3]{1}\\d{1}-[a-zA-Z]{3}-\\d{4}$";

    public static int checkInputIntLimit(int min, int max) {
        while (true) {
            int result = Integer.parseInt(in.nextLine().trim());
            if (result >= min && result <= max) {
                return result;
            } else {
                System.err.println("Please input number in range [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkInputDate() {
        while (true) {
            try {
                String result = in.nextLine().trim();
                if (result.matches(DATE_VALID)) {
                    return result;
                } else {
                    System.err.println("Re-input");
                }
            } catch (NumberFormatException ex) {
                System.err.println("Re-input");
            }
        }
    }

    public static double checkInputDouble() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be digit");
                System.out.print("Enter again: ");
            }

        }
    }

    public static String checkInputString() {
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Can not be emty!");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine());
                return result;
            } catch (NumberFormatException ex) {
                System.err.println("Can not be emty!");
                System.out.print("Enter again: ");
            }
        }
    }
}
