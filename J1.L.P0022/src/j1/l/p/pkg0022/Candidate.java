
/*
 * Name: Vo Nhu Khang
 * Class: SE1403
 * MSSV: DE140179
 */
package j1.l.p.pkg0022;

/**
 *
 * @author khangvn
 */
public class Candidate {

    protected String candidateId;
    protected String firstName;
    protected String lastName;
    protected int birthDate;
    protected String address;
    protected String phone;
    protected String email;
    protected int candidateType;

    public Candidate() {
    }

    public Candidate(String candidateId, String firstName, String lastName, int birthDate, String address, String phone,
            String email, int candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

//    @Override
//    public String toString() {
//        return "Candidate{" + "candidateId=" + candidateId + ", firstName=" + firstName + ", lastName=" + lastName
//                + ", birthDate=" + birthDate + ", address=" + address + ", phone=" + phone + ", email=" + email
//                + ", candidateType=" + candidateType + '}';
//    }

    public void display() {
        String name = firstName + " " + lastName;
        System.out.printf("%-20s|%-5d|%-15s|%-15s|%-15s|%-2d\n", name, birthDate, address, phone, email, candidateType);
    }
}
