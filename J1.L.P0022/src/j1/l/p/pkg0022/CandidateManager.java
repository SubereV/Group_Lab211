/*
 * Name: Vo Nhu Khang
 * Class: SE1403
 * MSSV: DE140179
 */
package j1.l.p.pkg0022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author khangvn
 */
public class CandidateManager {

    private static final List<Candidate> clist = new ArrayList<>();
    private static final Scanner input = new Scanner(System.in);

    public static void addExperience() {

        int type = 0;
        System.out.print("Enter id: ");
        String id = Validation.inputString();
        System.out.print("Enter first name: ");
        String firstName = Validation.inputString();
        System.out.print("Enter last name: ");
        String lastName = Validation.inputString();
        System.out.print("Enter birth date: ");
        int birthDate = Validation.BirthDate();
        System.out.print("Enter address: ");
        String address = Validation.inputString();
        System.out.print("Enter phone: ");
        String phone = Validation.Phone();
        System.out.print("Enter email: ");
        String email = Validation.Email();
        System.out.print("Enter year of experience: ");
        int yearExperience = Validation.checkInputExprience(birthDate);
        System.out.print("Enter professional skill: ");
        String professionalSkill = Validation.inputString();
        
        clist.add(new Experience(yearExperience, professionalSkill, id, firstName, lastName,
                birthDate, address, phone, email, type));
        System.err.println("Create success.");
    }

}
