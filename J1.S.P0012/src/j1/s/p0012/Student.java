/*
 * Name: Vo Nhu Khang
 * Class: SE1403
 * MSSV: DE140179
 */
package j1.s.p0012;

/**
 *
 * @author khangvn
 */
public class Student {

    private String name;
    private String classs;

    public Student() {
    }

    public Student(String name, String classs) {
        this.name = name;
        this.classs = classs;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", classs=" + classs + '}';
    }
    
}
