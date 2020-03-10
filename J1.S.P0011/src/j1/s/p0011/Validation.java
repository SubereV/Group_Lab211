package j1.s.p0011;

import java.util.Scanner;

public class Validation {
	static Scanner in = new Scanner(System.in); 
	
	public static int checkLimitInput(int min, int max) {
		String num; 
		while (true) {
			try {
				num = in.nextLine(); 
				int check = Integer.parseInt(num); 
				if (check > max || check < min) {
					System.err.println("You have to input a number in range [ " + min + ", " + max + "]");
					System.out.print("Enter again: ");
				} else {
					return check;
				}
			} catch (NumberFormatException e) {
				System.err.println("You must input a number!");
				System.out.print("Enter again: ");
			}
		}
	}
	
	public static boolean checkYN() {
		String check; 
		while(true) {
			System.out.print("Do you want to continue?(Y/N): ");
			check = in.nextLine(); 
			if (check.equalsIgnoreCase("Y")) {
				return true; 
			}else if (check.equalsIgnoreCase("N")) {
				return false; 
			}else {
				System.err.println("You just input \"Y\" or \"N\"");
				System.out.print("Enter again: ");
			}
		}
	}
}
