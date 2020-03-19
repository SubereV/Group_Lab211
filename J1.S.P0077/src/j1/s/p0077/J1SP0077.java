/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0077;

/**
 *
 * @author khangvo
 */
public class J1SP0077 {

    public static void main(String[] args) {

        String path;
        String word;
        while (true) {
            System.out.println("1. Count Word In File");
            System.out.println("2. Find File By Word");
            System.out.println("3. Exit");
            int choice = Manager.checkinputLimit(1, 3);
            switch (choice) {
                case 1:
                    System.out.print("Enter Path: ");
                    path = Manager.checkinputString();
                    System.out.print("Enter Word: ");
                    word = Manager.checkinputString();
                    int count = Manager.countWordInFile(path, word);
                    System.out.println("Count: " + count);
                    break;
                case 2:
                    System.out.print("Enter Path: ");
                    path = Manager.checkinputString();
                    System.out.print("Enter Word: ");
                    word = Manager.checkinputString();
                    Manager.getFileNameContainsWordInDirectory(path, word);
                    break;
                case 3:
                    return;
            }
        }
    }
}

