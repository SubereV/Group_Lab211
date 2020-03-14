/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0071;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author khangvo
 */
public class J1SP0071 {

    public static final Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        do {
            TaskManager tasks = new TaskManager();
            System.out.println("======= Task program =======");
            System.out.println("\t1. Add task");
            System.out.println("\t2. Delete task");
            System.out.println("\t3. Display task");
            System.out.println("\t4. Exit");
            System.out.print("> Choice: ");
            int choice = inputLimit(1, 4);
            switch (choice) {
                case 1:
                    System.out.println("------ Add Task ------");
                    System.out.print("Requirement Name: ");
                    String name = validateRequired();
                    System.out.print("Task Type: ");
                    int taskType = inputLimit(1, 4);
                    System.out.print("Date: ");
                    Date date = validateDate();
                    System.out.print("From: ");
                    float from = validPlan();
                    System.out.print("To: ");
                    float to = validPlan();
                    System.out.print("Assignee: ");
                    String ass = input.next();
                    System.out.print("Reviewer: ");
                    String reviewer = input.next();
                    tasks.addTask(taskType, name, date, from, to, ass, reviewer);
                    break;
                case 2:
                    System.out.println("------- Delete Task -------");
                    System.out.print("ID: ");
                    int id = input.nextInt();
                    tasks.delete(id);
                    break;
                case 3:
                    tasks.showTask();
                    break;
                case 4:
                    return;
            }
        } while (true);
    }

    public static int inputLimit(int min, int max) {
        String inp = input.nextLine();
        if (!inp.matches("\\d+")) {
            System.err.println("Must input digit!");
            System.out.print("Input again: ");
            return inputLimit(min, max);
        } else if (Integer.parseInt(inp) > max || Integer.parseInt(inp) < min) {
            System.err.println("Enter between " + min + " and " + max);
            System.out.print("Input again: ");
            return inputLimit(min, max);
        }
        return Integer.parseInt(inp);
    }

    public static String validateRequired() {
        String inp = input.nextLine();
        if (inp.equalsIgnoreCase("")) {
            System.err.println("Can't be null");
            System.out.print("Input again: ");
            return validateRequired();
        }
        return inp;
    }

    public static Date validateDate() throws ParseException {
        String inDate = input.nextLine().trim();
        if (inDate.matches("\\d{2}-\\d{2}-\\d{4}")) {
            try {
                Date date = new SimpleDateFormat("dd-MM-yyyy").parse(inDate);
                return date;
            } catch (Exception e) {
                System.err.println("Invalid Date!");
                System.out.print("Input Date: ");
                return validateDate();
            }
        } else {
            System.err.println("Wrong format Input (dd-mm-yyyy)");
            System.out.print("Input again: ");
            return validateDate();
        }

    }

    public static float validPlan() {
        float plan = input.nextFloat();
        if (plan < 8 || plan > 17.5) {
            System.out.println("Invalid Plan from 8 to 17.5");
            System.out.print("Input again: ");
            return validPlan();
        }
        return plan;
    }
}
