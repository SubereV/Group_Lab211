/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0070;

/**
 *
 * @author Duong
 */
import java.util.Scanner;

/**
 *
 * @author Duong
 */
public class Validation {
    public static Scanner sc = new Scanner(System.in);

    public static String checkInputString() {
        String text;
        while (true) {
            text = sc.nextLine();
            if (text.isEmpty()) {
                System.err.println("String not empty");
                System.err.println("Pls enter again");
            } else {
                return text;
            }
        }
    }

    public static int checkInputLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (Exception e) {
                System.err.println("Please input number in rage [" + min + "-" + max + "]");
                System.err.println("Please enter again: ");
            }
        }
    }

    public int checkInputChoice() {
        String number = "";
        while (true) {
            number = sc.nextLine();
            //sc.next();
            if (number.matches("\\d+")) { // "\d+" Biểu thức số bất kỳ
                break;
            } else {
                System.err.println("Only accept number");
                System.err.println("Pls enter again!");
            }
        }
        return Integer.parseInt(number); // "Parse" được sử dụng để nhận kiểu dữ liệu gốc của một String cụ thể
    }

    public static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (Exception e) {
                System.err.println("List can not <=0 & must be a Integer Number");
                System.err.print("Please enter again: ");
            }
        }
    }

    public int checkInputIndex(int data) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 0 || result == data) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (Exception e) {
                System.err.println("can not negative number and can not delet");
                System.err.print("Please enter again: ");
            }
        }
    }

    public int checkInputIndex() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (Exception e) {
                System.err.println("can not negative number");
                System.err.print("Please enter again: ");
            }
        }
    }

    public int checkInputValue() {
        while (true) {
            int result = Integer.parseInt(sc.nextLine().trim());
            return result;
        }
    }

}
