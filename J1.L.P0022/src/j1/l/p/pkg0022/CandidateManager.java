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
        Candidate candidate = new Candidate(id, firstName, lastName,
                birthDate, address, phone, email, type);

        System.out.print("Enter year of experience: ");
        int yearExperience = Validation.checkInputExprience(candidate.getBirthDate());
        System.out.print("Enter professional skill: ");
        String professionalSkill = Validation.inputString();
        clist.add(new Experience(yearExperience, professionalSkill,
                candidate.getCandidateId(), candidate.getFirstName(), candidate.getLastName(),
                candidate.getBirthDate(), candidate.getAddress(),
                candidate.getPhone(), candidate.getEmail(), candidate.getCandidateType()));
        System.err.println("Create success.");
    }

    public static void createFresher() {
        int type = 1;

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
        Candidate candidate = new Candidate(id, firstName, lastName, birthDate, address, phone, email, type);
        System.out.print("Enter graduation date: ");
        String graduationDate = Validation.inputString();
        System.out.print("Enter graduation rank: ");
        String graduationRank = Validation.Graduation();
        System.out.print("Enter university: ");
        String education = Validation.inputString();
        clist.add(new Fresher(graduationDate, graduationRank, education, candidate.getCandidateId(), candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(),
                candidate.getAddress(), candidate.getPhone(), candidate.getEmail(), candidate.getCandidateType()));
        System.err.println("Create success.");
    }
}
