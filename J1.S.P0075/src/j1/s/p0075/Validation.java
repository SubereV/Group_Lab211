package j1.s.p0075;

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

	public static int checkNumber() {
		int check;
		String a;
		while (true) {
			a = in.nextLine();
			try {
				check = Integer.parseInt(a);
				if (check <= 0) {
					System.err.println("n must be bigger than equal 0");
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
}
