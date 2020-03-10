
package j1.s.p0011;

public class J1SP0011 {

	public static void main(String[] args) {
		Converting cv = new Converting();
		boolean check = true;
		while (check) {
			System.out.print("Choose the base number input(1 is binary, 2 is decimal, 3 is hexadecimal): ");
			int choice1 = Validation.checkLimitInput(1, 3);
			System.out.print("Choose the base number output(1 is binary, 2 is decimal, 3 is hexadecimal): ");
			int choice2 = Validation.checkLimitInput(1, 3);
			System.out.print("Enter the input value: ");
			switch (choice1) {
			case 1:
				cv.convertBinary(choice2);
				break;
			case 2:
				cv.convertDecimal(choice2);
				break;
			case 3:
				cv.convertHexa(choice2);
				break;
			}
			check = Validation.checkYN();
		}
	}
}
