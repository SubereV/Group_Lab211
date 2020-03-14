/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0012;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author khangvo
 */
public class J1SP0012 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        //Variables:
        FuMemoryCached memoryCache = new FuMemoryCached();

        File file = new File("student.txt");
        FileReader f = new FileReader(file);
        BufferedReader buffer = new BufferedReader(f);
        String line;

        //read data in file and add to cache
        while ((line = buffer.readLine()) != null) {
            String[] li = line.split(";");
            memoryCache.putObject(li[0], new Student(li[1], li[2]), 30);//change default date expired
        }
        buffer.close();
        f.close();

        //Test case:
        Student st = (Student) memoryCache.getObject("ds02");
        System.out.println("Student has id ds02: " + st.toString());
        Student st1 = (Student) memoryCache.getObject("ds12");
        System.out.println("Student has id ds12: " + st1.toString());

        //Test clean:
        System.out.println("================================");
        memoryCache.clean("ds02");
        try {
            st = (Student) memoryCache.getObject("ds02");
            System.out.println("Student has id ds02: " + st.toString());
        } catch (NullPointerException e) {
            System.out.println("List dont't have that key!");
        }
        st1 = (Student) memoryCache.getObject("ds12");
        System.out.println("Student has id ds12: " + st1.toString());

        //clean all
        System.out.println();
        if (memoryCache.cleanAll()) {
            System.out.println("Clean all sucess!");
        }

    }

}
