/*
 * The MainMenuView class - part of the view layer
 * Object of this class manages the main menue
 * CIT-260
 * Fall 2018
 * Team Members: Megan Hendrickson, Wladimir Canar, McKell Painter
 */
package view;

import java.util.Scanner;
        
public class MainMenuView 
{
    Scanner keyboard = new Scanner(System.in);
    // The MainMenuView constructor
    // Purpse: Initialize the menu data
    // Parameters: none
    //Returns: none
    
    // The displayMenuView method
    // Purpose: displays the menu, get the user's input, and does the selected action
    // Parameters: none
    // Returns: none
    public MainMenuView() 
    {    
        theMenu = "\n"+
                "******************************\n"+
                "*CITY OF AARON: MAIN GAME MENU *\n"+
                "******************************\n"+
                "1 - Start new game\n"+
                "2 - Get and start a saved game\n"+
                "3 - Get help on playing the game \n"+
                "4 - Save game \n"+
                "5 - Quit\n";
        
        max = 5;
        
        public void displayMenuView()
        {
            int menuOption;
            do
            {
                // Display the menu
                System.out.println(theMenu);
                
                // Prompt the user and get the user's input
                menuOption = getMenuOption();
                
                // Perform the desired action
                doAction(menuOption);
                
            } while (menuOption != max);
        }
        
        private String theMenu;
        private int max;
    }

        // The getMenuOption method
        // Purpose: gets the user's input
        // Parameters: none
        // Returns: integer - the option selected
        public int getMenuOption()
        {
            ...

        }

        // The doAction method
        // Purpose: performs the selected action
        // Parameters: none
        public void doAction(int option)
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
                    displayHelpMenu();
                    break;
                case 4: // if the option is 4, call displaySaveGame()
                    displaySaveGameView();
                    break;
                case 5: // if the option is 5, display a goodbye message
                    System.out.println("Thanks for playing City of Aaron! Goodbye.")
            }
        }

        // The startNewGame method
        // Purpose: creates game object and starts the game
        // Parameters: none
        // Returns: none
        public void startNewGame()
        {
            System.out.println("\nStart new game option selected.");
        }

        // The startSavedGame method
        // Purpose: saves the game
        // Parameters: none
        // Returns: none
        public void saveGame()
        {
            System.out.println("\nSave game option selected.");
        }

        // The displayHelpMenuView method
        // Purpose: displays the help menu
        // Parameters: none
        // Returns: none
        public void displayHelpMenuView()
        {
            System.out.println("\nDisplay help menu option selected.");
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
