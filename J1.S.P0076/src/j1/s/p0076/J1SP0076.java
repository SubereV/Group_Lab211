/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0076;

import java.util.ArrayList;

/**
 *
 * @author khangvo
 */
public class J1SP0076 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<CSV> ls = new ArrayList<>();
        ls.add(new CSV(1, "dinh phu nghia", "nghia@gmail.com", "0968038714", "bo trach - Quang BINH"));
        ls.add(new CSV(2, "nguyen    van a ", "aaaa@gmail.com", "0984481345", "Thanh khe - Da NaNG"));
        ls.add(new CSV(3, "Nguyen tran c     	", "ccccccc@gmail.com", "0986246814", "Lien chieU     - Da    Nang    "));
        while (true) {
            System.out.println("1. Import CSV");
            System.out.println("2. Format Address");
            System.out.println("3. Format Name");
            System.out.println("4. Export CSV");
            System.out.println("5. Exit");
            System.out.print("Please choice one option:");
            int n = Manager.checkinputLimit(1, 5);
            switch (n) {
                case 1:
                    Manager.importFile(ls);
                    Manager.print(ls);
                    break;
                case 2:
                    Manager.formatAddress(ls);
                    Manager.print(ls);
                    break;
                case 3:
                    Manager.formatName(ls);
                    Manager.print(ls);
                    break;
                case 4:
                    Manager.exportFile(ls);
                    break;
                case 5:
                    return;
            }
        }
    }
    
}
