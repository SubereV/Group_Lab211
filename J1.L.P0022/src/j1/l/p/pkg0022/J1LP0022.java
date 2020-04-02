/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.l.p.pkg0022;

/**
 *
 * @author khangvo
 */
public class J1LP0022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CandidateManager candidate = new CandidateManager();
        do {
            System.out.println("CANDIDATE MANAGEMENT SYSTEM");
            System.out.println("1. Experience");
            System.out.println("2. Fresher");
            System.out.println("3. Internship");
            System.out.println("4. Searching");
            System.out.println("5. Exit");
            System.out.print("> Choice: ");
            int choice = Validation.intLimit(1, 5);
            switch (choice) {
                case 1:
                    candidate.createExperience();
                    System.out.print("Do you to continue? Y/N: ");
                    break;
                case 2:
                    candidate.createFresher();
                    System.out.print("Do you to continue? Y/N: ");
                    break;
                case 3:
                    candidate.createIntern();
                    System.out.print("Do you to continue? Y/N: ");
                    break;
                case 4:
                    candidate.search();
                    break;
                case 5:
                    return;
            }

        } while (true);

    }
}
