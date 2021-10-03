/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcwallyland;

import java.util.Scanner;

/**
 *
 * @author mattu
 */
public class PlannerView {
    /**
     * UI Controls
     */
    private PlannerController cntl;

//    public PlannerView(PlannerController cntl) {
//        this.cntl = cntl;
//    }
//    

    public void createEventPrompt(){
        System.out.println("Create an event for today:");
        System.out.println("Option 1: 8:00am, Log Flume");
        System.out.println("Option 2: 8:45am, Merry-Go-Round");
        System.out.println("Option 3: 9:00am, Raging Rapids");
        
        System.out.println("");
        System.out.println("Please input a selection using numbers:");
        Scanner s = new Scanner(System.in);
        int choice = Integer.parseInt(s.nextLine());
        this.cntl.createEventPrompt(choice);
        s.close();

    }
}
