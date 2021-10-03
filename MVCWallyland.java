/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcwallyland;

/**
 *
 * @author mattu
 */
public class MVCWallyland {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        String time = "";
        String desc = "";
        Planner model = new Planner(time, desc);
        PlannerView view = new PlannerView();
        PlannerController controller = new PlannerController(model, view);
        
        view.createEventPrompt();
        
        
        
    }
    
}
