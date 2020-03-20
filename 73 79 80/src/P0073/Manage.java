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
public class Manage {

    public void addExpense(ArrayList<Expense> ex, int id) {
        System.out.print("Enter Date : ");
        String date = Validation.checkInputDate();
        System.out.print("Enter Amout : ");
        double amount = Validation.checkInputDouble();
        System.out.print("Enter Content : ");
        String content = Validation.checkInputString();
        ex.add(new Expense(id, date, amount, content));
    }

    public void displayExpense(ArrayList<Expense> le) {
        if (le.size() == 0) {
            System.err.println("List Expenses empty");
            return;
        }
        double total = 0;
        System.out.printf("%-7s%-20s%-20s%-20s\n", "ID", "Date", "Amount of money", "Content");
        for (int i = 0; i < le.size(); i++) {
            System.out.printf("%-7d%-20s%-20.0f%-20s\n", le.get(i).getId(), le.get(i).getDate(),
                    le.get(i).getNumber(), le.get(i).getContent());
            total += le.get(i).getNumber();
        }
        System.out.printf("Total: %-20.0f\n", total);
    }

    public int checkIdExist(ArrayList<Expense> le, int id) {
        for (int i = 0; i < le.size(); i++) {
            if (le.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void deleteExpense(ArrayList<Expense> le) {
        System.out.print("Enter id: ");
        int id = Validation.checkInputInt();
        int checkIdExist = checkIdExist(le, id);
        if (checkIdExist != -1) {
            le.remove(checkIdExist);
            System.out.println("Delete an expense successful");
            for (int i = id - 1; i < le.size(); i++) {
                le.get(i).setId(le.get(i).getId() - 1);
            }
        } else {
            System.err.println("Delete an expense fail");
        }
    }

}
