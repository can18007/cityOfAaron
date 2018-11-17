/*
 * GameMenuView class for the City of Aaron Project
 * CIT 260
 * Fall 2018
 * Team Members: McKell Painter, Wladimir Canar; Megan Hendrickson
 * Author: Megan Hendrickson
 */
package view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.*;

public class GameMenuView 
{
     private static Scanner keyboard = new Scanner(System.in);
     private int max;
     private String gameMenu;
    
   // The GameMenuView constructor
   // Purpse: Initialize the game menu data
   // Parameters: none
   // Returns: none
     public GameMenuView() 
   {    
       gameMenu = "\n"+
                "****************************\n"+
                "*CITY OF AARON: GAME MENU*\n"+
                "****************************\n"+
                "1 - View the map\n"+
                "2 - View/ print a list\n"+
                "3 - Move to a new location\n"+
                "4 - Manage the crops\n"+
                "5 - Return to Main Menu\n";
        
        max = 5;
   }    
   
   // The display GameMenuView method
   // Purpose: displays the menu, get the user's input, and does the selected action
   // Parameters: none
   // Returns: none
     public void displayGameMenuView()
   {
        int menuOption;
        do
        {
            // Display the menu
            System.out.println(gameMenu);
             
            // Prompt the user and get the user's 5Minput
            menuOption = getMenuOption();
               
            // Perform the desired action
            doAction(menuOption);
               
        } while (menuOption != max);
    }
     
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
     
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    public void doAction(int option)
    {
        switch(option)
        {
            case 1: // if the option is 1, call viewMap()
                viewMap();
                break;
            case 2: // if the option is 2, call viewList()
                viewList();
                break;
            case 3: // if the option is 3, call moveToNewLocation()
                moveToNewLocation();
                break;
            case 4: // if the option is 4, call manageCrops()
                manageCrops();
                break;
            case 5: // if the option is 5, return to main menu
                return;
        }
    }
     
    public void viewMap()
    {
        System.out.println("\nView map option selected.");
    }
    
    public void viewList()
    {
        //System.out.println("\nView list option selected.");
        
        //display list menu
        ListMenuView lmv = new ListMenuView();
        lmv.displayMenu();
    }
    
    public void moveToNewLocation()
    {
        System.out.println("\nMove to new location option selected.");
    }
    public void manageCrops()
    {
        System.out.println("\nManage crops option selected.");
        CropView.runCropView();
    }
}
