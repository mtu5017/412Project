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
public class PlannerController {
    private Planner model;
    private PlannerView view;

    
    /**
     * Constructor in the controller class
     * @param model
     * @param view 
     */
    public PlannerController(Planner model, PlannerView view){
        this.model = model;
        this.view = view;
    }

    /**
     * Set time method
     * @param time 
     */
     public void setTime(String time){
         model.setTime(time);
     }
     
     /**
      * Get time method
      * @return 
      */
     public String getTime(){
         return model.getTime();
     }
     
     /**
      * Set description method
      * @param description 
      */
     public void setDescription(String description){
         model.setDescription(description);
     }
     
     /**
      * Get description method
      * @return 
      */
     public String getDescription(){
         return model.getDescription();
     }
     
     /**
      * Simple method to confirm a user's choice and display a confirmation message.
      * @param choice 
      */    
     public void createEventPrompt(int choice){
        if(choice == 1){
            System.out.println("You're confirmed for the Log Flume at 8:00am.");
        }
        else if(choice == 2){
            System.out.println("You're confirmed for the Merry-Go-Round at 8:45am.");
        }
       else if(choice == 3){
            System.out.println("You're confirmed for the Raging Rapids at 9:00am.");
       }
       else{
            System.out.println("Sorry, we couldn't confirm your event.");
       }

    }
     
    
    
}
