/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0073;

import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Expense> doc = new ArrayList<>();

       int choice; 
       int id=0;
        Manage mana = new Manage();

        while (true) {
            Menu.display();
            choice = Validation.checkInputIntLimit(1, 4);

            switch (choice) {

                case 1:
                    mana.addExpense(doc, ++id);
                    break;
                case 2:
                    mana.displayExpense(doc);
                    break;
                case 3:
                    mana.deleteExpense(doc);
                    break;
                case 4:
                    return;
            }
        }
    }
}
