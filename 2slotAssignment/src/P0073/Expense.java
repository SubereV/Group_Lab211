/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P0073;

/**
 *
 * @author ADMIN
 */
public class Expense {
    private int id;
    private String date;
    private double number;
    private String content;

    public Expense() {
    }

    public Expense(int id, String date, double number, String content) {
        this.id = id;
        this.date = date;
        this.number = number;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String data) {
        this.date = data;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    public void display(){
        
    }
    
}
