/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcwallyland;

/**
 * This app simply communicates between the different classes and prints data to the user in its current form. Once the pieces are built together, the planner will be useful for displaying reservation data to the user for rides and restaurants.
 * @author mattu
 */
public class MVCWallyland {

    /** Main method. Uses the model, controller, and view to call a method from the controller to display data to the user.
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Planner model = getData();
        
        PlannerView view = new PlannerView();
        PlannerController controller = new PlannerController(model, view);
        
        controller.displayEvents();
        
    }
    
    /**
     * Method to get data from the other functions in the app to add them to the daily planner
     * @return planner object. 
     */
    private static Planner getData(){
        Planner planner = new Planner("", "");
        planner.setTime("8:00am");
        planner.setDescription("Log Flume");
        return planner;
    }
    
}
