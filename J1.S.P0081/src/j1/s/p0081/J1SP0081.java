/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0081;

/**
 *
 * @author khangvo
 */
public class J1SP0081 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Worker worker = new Worker();
        worker.creatBeeList();
        worker.damage();
        System.out.println("----------------");
        Queen queen = new Queen();
        queen.creatBeeList();
        queen.damage();
        System.out.println("----------------");
        Drone drone = new Drone();
        drone.creatBeeList();
        drone.damage();
    }
    
}
