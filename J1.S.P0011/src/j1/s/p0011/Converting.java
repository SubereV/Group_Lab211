package j1.s.p0011;

import java.util.Scanner;

public class Converting {
	final Scanner in = new Scanner(System.in); 
	
	public void convertDecimal(int choice) {
		while (true) {
			try {
				String check = in.nextLine(); 
				int decimalNum = Integer.parseInt(check); 
				System.out.print("Output value: ");
				switch (choice) {
				case 1:
					System.out.println(Integer.toBinaryString(decimalNum));
					return; 
				case 2:
					System.out.println(decimalNum);
					return; 
				case 3:
					System.out.println(Integer.toHexString(decimalNum));
					return; 
				}
			} catch (NumberFormatException e) {
				System.err.println("You have to input a decimal number");
				System.out.print("Enter the input value: ");
			}
		}
	}
	
	public void convertBinary(int choice) {
		while(true) {
			try {
				String check = in.nextLine(); 
				int decimal = Integer.parseInt(check, 2); 
				System.out.print("Output value: ");
				switch (choice) {
				case 1:
					System.out.println(check);
					return; 
				case 2:
					System.out.println(decimal);
					return;  
				case 3:
					System.out.println(Integer.toHexString(decimal));
					return; 
				}
			} catch (NumberFormatException e) {
				System.err.println("Binary number just contain 0 and 1.");
				System.out.print("Enter the input value: ");
			}
		}
	}
	
	public void convertHexa(int choice) {
		while (true) {
			try {
				String check = in.nextLine(); 
				int decimal = Integer.parseInt(check, 16); 
				System.out.print("Output value: ");
				switch (choice) {
				case 1:
					System.out.println(Integer.toBinaryString(decimal));
					return;
				case 2:
					System.out.println(decimal);
					return; 
				case 3:
					System.out.println(check);
					return; 
				}
			} catch (NumberFormatException e) {
				System.err.print("Hexadecimal number must contain characters: 'A-F' and '0-9'");
				System.out.print("Enter the input value: ");
			}
		}
	}
}
