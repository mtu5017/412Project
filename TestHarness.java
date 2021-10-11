/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcwallyland;

import java.util.ArrayList;

/**
 *
 * @author mattu
 */
public class TestHarness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Running planner tests...");
        addSuccessfulEventTest();
        addInvalidEventTest();
    }
    
    public static void addSuccessfulEventTest(){
        Planner model = getData("", "");
        PlannerView view = new PlannerView();
        PlannerController controller = new PlannerController(model, view);
        
        System.out.println("");
        System.out.println("Trying to add log flume for 8:00am:");
        model.setTime("8:00am");
        model.setDescription("Log Flume");
        controller.displayEvents();
        
        System.out.println("");
        System.out.println("Trying to add roller coaster for 4:00pm:");
        model.setTime("4:00pm");
        model.setDescription("Roller Coaster");
        controller.displayEvents();
        
    }
    
    public static void addInvalidEventTest(){
        Planner model = getData("", "");
        PlannerView view = new PlannerView();
        PlannerController controller = new PlannerController(model, view);
        
        System.out.println("");
        System.out.println("Trying to add Merry-go-round (invalid ride at the park) for 4:00am (invalid time at the park):");
        model.setTime("4:00am");
        model.setDescription("Merry-go-round");
        controller.displayEvents();
    }
    
    private static Planner getData(String time, String description){
        Planner planner = new Planner("", "");
        planner.setTime(time);
        planner.setDescription(description);
        return planner;
    }
    
    
}
