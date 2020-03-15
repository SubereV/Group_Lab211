package j1.l.p.pkg0022;

public class Manager {
	public static int mainMenu() {
		System.out.println(" === CANDIDATE MANAGEMENT SYSTEM ===");
		System.out.println("| 	1. Expericence.                 |");
		System.out.println("| 	2. Fresher.                     |");
		System.out.println("| 	3. Internship.                  |");
		System.out.println("| 	4. Searching.                   |");
		System.out.println("| 	5. Exit.                        |");
		System.out.println(" ===================================");
		int choice = Validation.checkLimitInput(1, 5); 
		return choice; 
	}
}
