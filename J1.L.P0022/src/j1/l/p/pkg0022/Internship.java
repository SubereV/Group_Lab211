/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.l.p.pkg0022;

/**
 *
 * @author Duong
 */
public class Internship extends  Candidate{
    private String majors;
    private String semeter;
    private String universityName;

    public Internship() {
    super();
    }

    public Internship(String majors, String semeter, String universityName) {
        this.majors = majors;
        this.semeter = semeter;
        this.universityName = universityName;
    }

    public Internship(String majors, String semeter, String universityName, String candidateId, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.majors = majors;
        this.semeter = semeter;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemeter() {
        return semeter;
    }

    public void setSemeter(String semeter) {
        this.semeter = semeter;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Major: "+majors+" |Semeter: "+semeter+" |University: "+universityName; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
