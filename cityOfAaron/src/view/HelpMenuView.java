/*
 * HelpMenuView class for the City of Aaron Project
 * CIT 260
 * Fall 2018
 * Team Members: McKell Painter, Wladimir Canar; Megan Hendrickson
 * Author: McKell Painter
 */
package view;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.*;
        
public class HelpMenuView extends MenuView
{
  
   // The HelpMenuView constructor
   // Purpse: Initialize the help menu data
   // Parameters: none
   // Returns: none
   public HelpMenuView() 
   {    
       super("\n"+
                "******************************\n"+
                "*CITY OF AARON: HELP MENU *\n"+
                "******************************\n"+
                "1 - What are the goals of the game? \n"+
                "2 - Where is the city of Aaron? \n"+
                "3 - How do I view the map? \n"+
                "4 - How do I move to another location? \n"+
                "5 - How do I display the list of animals, provisions and tools in the city storehouse? \n"+
                "6 - Back to the Main Menu. \n",
        
        6);
   }
    
   // The doActoin method
   // Purpose: performs the selected action
   // Parameters: none
   // Returns: none
   // =====================================
    @Override public void doAction(int option)
    {
        switch(option)
        {
            case 1: // view goals
            viewGoals();
            break;
            
            case 2: // view map help
            viewMapHelp();
            break;
            
            
            case 3: // view map help
            viewMapHelp();
            break;
            
            case 4: // view move help
            viewMoveHelp();
            break;
            
            case 5: // view list help
            viewListHelp();
            
            case 6: // return to main menu
                return;
        }
    }
    
    // The viewGoals method
    // Purpose: view the goals for the game
    // Parameters: none
    // Returns: none
    public void viewGoals()
    {
    System.out.println("\n As ruler of the City of Aaron, you now have responsibilities to buy and sell land, determine how much wheat to plant each year, and how much to set aside to feed your people.");
    System.out.println("\n If you fail to provide enought wheat for the people, people will starve, some will die, and your workforce will be diminished.");
    System.out.println("\n Plan carefully to keep your people alive, and remain in office.");
    }
    
    // The viewMapHelp method
    // Purpose: help on how to view the game map
    // Parameters: none
    // Returns: none
    public void viewMapHelp()
    { 
        System.out.println("\n View map help option selected.");
    }
    
    //The vewMoveHelp method
    //Purpose: help on how to move in the game
    //Parameters: none
    //Returns: none
    public void viewMoveHelp()
    {
        System.out.println("\n View move help option selected.");
    }
    
    //The viewListHelp method
    // Purpose: help with game lists
    //Parameters: none
    //Returns: none
    public void viewListHelp()
    {
       System.out.println("\n View list help option selected.");
    }
}
