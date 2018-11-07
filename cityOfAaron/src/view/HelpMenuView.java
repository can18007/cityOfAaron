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
                "1 - Goals of the Game\n"+
                "2 - Map Help \n"+
                "3 - Help Moving \n"+
                "4 - Help with Lists \n"+
                "5 - Return to Main Menu \n";
        
        max = 5;
   }

   // The displayMenuView method
   // Purpose: displays the menu, get the user's input, and does the selected action
   // Parameters: none
   // Returns: none
    public void displayMenuView()
    {
        // execute this loop as long as the selected option is not 5
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
        final int MAX = 5;
        //begin loop
        do
        {
            // get user input from keyboard
            userInput = keyboard.nextInt();
            //if it is not a valid value, output an error message
            if(userInput < 1 || userInput > MAX)
                System.out.println("Error: you must select 1, 2, 3, 4, or 5");
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
            
            case 3: // view move help
            viewMoveHelp();
            break;
            
            case 4: // view list help
            viewListHelp();
            
            case 5: // return to main menu
                return;
        }
    }
    
    // The viewGoals method
    // Purpose: view the goals fo the game
    // Parameters: none
    // Returns: none
    public void viewGoals()
    {
    
    
    }
    
    // The viewMapHelp method
    // Purpose: help on how to view the game map
    // Paramters: none
    // Returns: none
    public void viewMapHelp()
    { 
    
    }
    
    //The vewMoveHelp method
    //Purpose: help on how to move in the game
    //Parameters: none
    //Returns: none
    public void viewMoveHelp()
    {
        
    }
    
    //The viewListHelp method
    // Purpose: help with game lists
    //Parameters: none
    //Returns: none
    public void viewListHelp()
    {
       
    }
}
