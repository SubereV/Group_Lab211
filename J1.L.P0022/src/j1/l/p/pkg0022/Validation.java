/*
 * Name: Vo Nhu Khang
 * Class: SE1403
 * MSSV: DE140179
 */
package j1.l.p.pkg0022;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author khangvn
 */
public class Validation {

    private static final Scanner input = new Scanner(System.in);

    public static String inputString() {
        String str = input.nextLine().trim();
        if (str.equalsIgnoreCase("")) {
            System.err.println("Can't be null!");
            System.out.print("Input again: ");
            return inputString();
        }
        return str;
    }

    public static int BirthDate() {
        String in = inputString();
        if (in.matches("\\d+")) {
            int dof = Integer.parseInt(in);
            if (dof < 1900 && dof > Calendar.getInstance().get(Calendar.YEAR)) {
                System.err.println("Invalid year!");
                System.out.print("> Year: ");
                return BirthDate();
            }
            return dof;
        } else {
            System.err.println("Input must be a digit!");
            System.out.print("> Year: ");
            return BirthDate();
        }
    }

    public static int intLimit(int min, int max) {
        String inp = inputString();
        if (!inp.matches("\\d+")) {
            System.err.println("Must input digit!");
            System.out.print("> Input again: ");
            return intLimit(min, max);
        } else if (Integer.parseInt(inp) > max || Integer.parseInt(inp) < min) {
            System.err.println("Enter between " + min + " and " + max);
            System.out.print("> Input again: ");
            return intLimit(min, max);
        }
        return Integer.parseInt(inp);
    }

    public static String Phone() {
        String phone = inputString();
        if (phone.matches("\\d+")) {
            if (phone.matches("\\d{9}+")) {
                return phone;
            } else {
                System.err.println("Phone number must be at least 10 numbers!");
                System.out.print("> Enter again: ");
                return Phone();
            }
        } else {
            System.out.println("Phone must be a digit");
            System.out.print("> Enter again: ");
            return Phone();
        }
    }

    public static String Email() {
        String email = inputString();
        if (email.matches("[a-z][a-z0-9_\\.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}")) {
            return email;
        } else {
            System.err.println("Invalid email!");
            System.out.print("> Email: ");
            return Email();
        }
    }

    public static int Year() {
        String in = inputString();
        if (in.matches("\\d+")) {
            int year = Integer.parseInt(in);
            if (year < 0 && year > 100) {
                System.err.println("Invalid year Exprience!");
                System.out.print("> Input again: ");
                return Year();
            }
            return year;
        } else {
            System.err.println("Input must be a digit!");
            System.out.print("> Input again: ");
            return Year();
        }
    }
    
    public static boolean accept() {
        while (true) {
            String result = inputString().trim();
            if (result.equalsIgnoreCase("Y")) {
                return true;
            } else if (result.equalsIgnoreCase("N")) {
                return false;
            }
            System.out.println("Please input y/Y or n/N!");
            System.out.print("> Enter again: ");
        }
    }
    
    public static String Graduation() {
        while (true) {
            String result = inputString();
            if (result.equalsIgnoreCase("excellence")
                    || result.equalsIgnoreCase("good")
                    || result.equalsIgnoreCase("fair")
                    || result.equalsIgnoreCase("poor")) {
                return result.toUpperCase();
            }
            System.err.println("Please type one of these: Excellence, Good, Fair, Poor");
            System.out.print("> Enter again: ");
            return Graduation();
        }
    }

}
