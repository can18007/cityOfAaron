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
        
public class HelpMenuView 
{
    private String helpMenu;
    private int max;
    Scanner keyboard = new Scanner(System.in);
    
   // The HelpMenuView constructor
   // Purpse: Initialize the help menu data
   // Parameters: none
   // Returns: none
   public HelpMenuView() 
   {    
       helpMenu = "\n"+
                "******************************\n"+
                "*CITY OF AARON: HELP MENU *\n"+
                "******************************\n"+
                "1 - What are the goals of the game? \n"+
                "2 - Where is the city of Aaron? \n"+
                "3 - How do I view the map? \n"+
                "4 - How do I move to another location? \n"+
                "5 - How do I display the list of animals, provisions and tools in the city storehouse? \n"+
                "6 - Back to the Main Menu. \n";
        
        max = 6;
   }

   // The displayMenuView method
   // Purpose: displays the menu, get the user's input, and does the selected action
   // Parameters: none
   // Returns: none
    public void displayMenuView()
    {
        // execute this loop as long as the selected option is not 6
        int menuOption = 0;
        do
        {
            //display the help menu
            System.out.println(helpMenu);
            
            //get the user's selection
            menuOption = getMenuOption();
            
            //perform the selected action
            doAction(menuOption);
            
        }while (menuOption != max);  
        
    }//end of displayHelpMenu method
    
    
    
// The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    public int getMenuOption()
    {
        // declare a variable to hold user's input
        int userInput = 0;
        final int MAX = 6;
        //begin loop
        do
        {
            // get user input from keyboard
            userInput = keyboard.nextInt();
            //if it is not a valid value, output an error message
            if(userInput < 1 || userInput > MAX)
                System.out.println("Error: you must select 1, 2, 3, 4, 5, or 6");
            //loop back to the top of the loop if input was not valid
            // end loop
        } while (userInput < 1 || userInput > MAX);
        return userInput;
    }
    
    
    public void doAction(int option)
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
