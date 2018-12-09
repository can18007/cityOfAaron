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

public class GameMenuView extends MenuView
{    
   // The GameMenuView constructor
   // Purpse: Initialize the game menu data
   // Parameters: none
   // Returns: none
     public GameMenuView() 
   {    
       super("\n"+
                "****************************\n"+
                "*CITY OF AARON: GAME MENU*\n"+
                "****************************\n"+
                "1 - View the map\n"+
                "2 - View/ print a list\n"+
                "3 - Move to a new location\n"+
                "4 - Manage the crops\n"+
                "5 - Return to Main Menu\n",
       5);
   }    
   

    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    @Override public void doAction(int option)
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
