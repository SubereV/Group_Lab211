package j1.s.p0075;

import java.util.Scanner;

public class Manager {
	FileManagement fm = new FileManagement();
	
	public int menu() {
		System.out.println(" =========== File management ============");
		System.out.println("| 1. Check path.                         |");
		System.out.println("| 2. List .java extension.               |");
		System.out.println("| 3. List the files have size > n.       |");
		System.out.println("| 4. Insert content to file.             |");
		System.out.println("| 5. Count number of words in the files. |");
		System.out.println("| 6. Exit.                               |");
		System.out.println(" ========================================");
		System.out.print("Enter your choice: ");
		int choice = Validation.checkLimitInput(1, 6);
		return choice;
	}

	Scanner in = new Scanner(System.in);

	public void choice1() {
		System.out.print("Enter the path: ");
		String path = in.nextLine();
		if (!fm.checkExistPath(path)) {
			System.out.println(path + " does not exist!");
			return;
		}
		if (fm.checkDirectoryPath(path)) {
			System.out.println(path + " is directory path.");
		} else if (fm.checkFilePath(path)) {
			System.out.println(path + " is file path.");
		}
	}

	public void choice2() {
		System.out.print("Enter directory path: ");
		String path = in.nextLine();
		if (!fm.checkDirectoryPath(path)) {
			System.out.println(path + " is not a directory path!");
			return;
		}
		fm.listJavaFile(path);
	}

	public void choice3() {
		System.out.print("Enter directory path: ");
		String path = in.nextLine();
		if (!fm.checkDirectoryPath(path)) {
			System.out.println(path + " is not a directory path!");
			return;
		}
		System.out.print("Enter an integer n(KB): ");
		int n = Validation.checkNumber();
		fm.listSizeFile(path, n);
	}

	public void choice4() {
		System.out.print("Enter file path: ");
		String path = in.nextLine();
		if (!fm.checkFilePath(path)) {
			System.out.println(path + " is not a file path!");
			return;
		}
		System.out.print("Enter content to insert: ");
		String content = in.nextLine();
		fm.insertContent(path, content);
	}

	public void choice5() {
		System.out.print("Enter a file txt path: ");
		String path = in.nextLine();
		if (!path.matches(".+(.txt)")) {
			System.err.println(path + " is not a file txt path!");
			return;
		}
		fm.countWords(path);
	}
}
