/*
 * The MainMenuView class - part of the view layer
 * Object of this class manages the main menue
 * CIT-260
 * Fall 2018
 * Team Members: Megan Hendrickson, Wladimir Canar, McKell Painter
 */
package view;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.*;
        
public class MainMenuView extends MenuView
{  
   // The MainMenuView constructor
   // Purpse: Initialize the menu data
   // Parameters: none
   // Returns: none
   public MainMenuView() 
   {    
       super("\n" +
                "******************************\n"+
                "*CITY OF AARON: MAIN GAME MENU *\n"+
                "******************************\n"+
                "1 - Start new game\n"+
                "2 - Get and start a saved game\n"+
                "3 - Get help on playing the game \n"+
                "4 - Save game \n"+
                "5 - Quit\n",
            5);
   }    
   
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    @Override public void doAction(int option)
    {
        switch(option)
        {
            case 1: // if the option is 1, call startNewGame()
                startNewGame();
                break;
            case 2: // if the option is 2, call startExistingGame()
                startSavedGame();
                break;
            case 3: // if the option is 3, call displayHelpMenu()
                displayHelpMenuView();
                break;
            case 4: // if the option is 4, call displaySaveGame()
                displaySaveGameView();
                break;
            case 5: // if the option is 5, display a goodbye message
                System.out.println("Thanks for playing City of Aaron! Goodbye.");
        }
    }
    
    // The startNewGame method
    // Purpose: creates game object and starts the game
    // Parameters: none
    // Returns: none
    public void startNewGame()
    {
        //Display the Banner Page.
        System.out.println("\nWelcome to the wonderful game of city of Aaron.");
        
        //Prompt for and get the user´s name.
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();
                
        //Call end createNewGame() method in the GameControl class
        GameControl.createNewGame(name);
        
        //Display a welcome message
        System.out.println("Welcome " + name + " have fun!!!");
              
       //Display the Game menu
       GameMenuView gmv = new GameMenuView();
       gmv.displayMenu();
       
       //test for list menu
       //ListMenuView lmv = new ListMenuView();
       //lmv.displayMenuView();
        
    }

    // The startSavedGame method
    // Purpose: loads a saved game object from disk and start the game
    // Parameters: none
    // Returns: none
    // =========================
    public void startSavedGame()
    {  
        //get rid of nl character left in the stream
        String filepath = keyboard.next();
        
        //prompt user and get a file path
        System.out.println("\nPlease enter the file path for your saved game.");
        
        //call the getSavedGame() method in the GameControl class to load the game
        GameControl.getSavedGame(filepath);
                
        //display the game menu for the loaded game
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();
    }

    
    // The displayHelpMenuView method
    // Purpose: displays the help menu
    // Parameters: none
    // Returns: none
    public void displayHelpMenuView()
    {
        System.out.println("\nDisplay help menu option selected.");
        
        HelpMenuView hmv = new HelpMenuView(); 
        hmv.displayMenu();
    }
    
    // The displaySaveGame method
    // Purpose: displays the save game view
    // Parameters: none
    // Returns: none
    public void displaySaveGameView()
    {
        System.out.println("\nDisplay save game view option selected.");
    }
}
