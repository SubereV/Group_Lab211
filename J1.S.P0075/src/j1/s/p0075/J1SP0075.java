
package j1.s.p0075;

public class J1SP0075 {

	public static void main(String[] args) {
		Manager m = new Manager();
		while (true) {
			int choice = m.menu();
			switch (choice) {
			case 1:
				m.choice1();
				break;
			case 2:
				m.choice2();
				break;
			case 3:
				m.choice3();
				break;
			case 4:
				m.choice4();
				break;
			case 5:
				m.choice5();
				break;
			case 6:
				System.out.println("Exit!");
				return;
			}
		}
	}

}
