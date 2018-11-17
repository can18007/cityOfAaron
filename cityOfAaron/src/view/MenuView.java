/*
 * The MenuView class - base abstract class for all menu views
 * CIT 260
 * Fall 2018
 * Team Members: Megan Henrickson, McKell Painter, Wladimir Canar
 */
package view;
        
import java.util.Scanner;

public abstract class MenuView implements ViewInterface 
{
    // the data members common to all menu vies
    protected final static Scanner keyboard = new Scanner(System.in);
    
    protected String menu; // this string holds the menu string
    protected int max; // this int holds the max input value
        
    // MenuView Constructor
    // Purpose: Initialize the view object with the menu string
    // Parameters: the menu string and the max value
    // Returns: none
    public MenuView(String _menu, int _max)
    {
        menu = _menu;
        max = _max;
    }
      
   // The displayMenuView method
   // Purpose: displays the menu, get the user's input, and does the selected action
   // Parameters: none
   // Returns: none
   // ==============================
   @Override public void displayMenu()
   {
     //execute this loop as long as the selected option is not max
     int menuOption = 0;
     do
     {
         //display the menu
         System.out.println(menu);
         
         //get the user's selection
         menuOption = getMenuOption();
         
         //perform the selected action
         doAction(menuOption);
     } while(menuOption != max);
   }
   
   //The getUserInput method
   //Purpose: gets user input, makes sure it is within range
   //Parameters: none
   //Returns: te user input, between 1 and maxValue
   @Override public int getMenuOption()
   {
       int inputValue = 0;
       do
       {
           System.out.format("\nPlease enter an option(1-%d):",max);
           inputValue = keyboard.nextInt();
           if(inputValue < 1 || inputValue > max)
           {
               System.out.format("\nEroor: input value must be between 1 and %d.", max);
           }
       }while(inputValue < 1 || inputValue > max);
       
       return inputValue;
   }
}
