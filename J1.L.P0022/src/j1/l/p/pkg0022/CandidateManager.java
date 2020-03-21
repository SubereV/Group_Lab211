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

		clist.add(new Experience(yearExperience, professionalSkill, id, firstName, lastName, birthDate, address, phone,
				email, type));
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
		clist.add(new Fresher(graduationDate, graduationRank, education, candidate.getCandidateId(),
				candidate.getFirstName(), candidate.getLastName(), candidate.getBirthDate(), candidate.getAddress(),
				candidate.getPhone(), candidate.getEmail(), candidate.getCandidateType()));
		System.err.println("Create success.");
	}

	public static void addIntern() {
		int type = 2;
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
		System.out.print("Enter major: ");
		String major = Validation.inputString();
		System.out.print("Enter semester: ");
		String semester = Validation.inputString();
		System.out.print("Enter Name of University: ");
		String uniName = Validation.inputString();
		clist.add(new Internship(major, semester, uniName, id, firstName, lastName, birthDate, address, phone, email,
				type));
		System.out.println("Add Success!!!");
	}

	public void search() {
		System.out.println("============EXPERIENCE CANDIDATE=============");
		for (Candidate experience : clist) {
			if (experience.getCandidateType() == 0) {
				System.out.println(experience.getFirstName() + experience.getLastName());
			}
		}
		System.out.println("==============FRESHER CANDIDATE==============");
		for (Candidate fresher : clist) {
			if (fresher.getCandidateType() == 1) {
				System.out.println(fresher.getFirstName() + fresher.getLastName());
			}
		}
		System.out.println("==============INTERN CANDIDATE===============");
		for (Candidate intern : clist) {
			if (intern.getCandidateType() == 2) {
				System.out.println(intern.getFirstName() +" "+ intern.getLastName());
			}
		}
		System.out.println();
		System.out.print("Input Candidate name (First name or Last name: ");
		String name = Validation.inputString(); 
		System.out.print("Input type of candidate: ");
		int type = input.nextInt(); 
		System.out.println("The candidates found:");
		for(Candidate candidate : clist) {
			String candidateName = candidate.getFirstName() + " "+ candidate.getLastName();
			if (type==candidate.getCandidateType() && candidateName.contains(name)) {
				candidate.display();
			}
		}
	}
}
