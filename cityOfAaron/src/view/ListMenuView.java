/*
 * ListMenuView class for the City of Aaron Project
 * CIT 260
 * Fall 2018
 * Team Members: McKell Painter, Wladimir Canar; Megan Hendrickson
 * Author: Wladimir Canar
 */
package view;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.*;
import java.util.ArrayList;
import model.*;


/**
 *
 * @author wcanar
 */
public class ListMenuView extends MenuView{
    
    public ListMenuView() 
    {    
       super("\n"+
                "******************************\n"+
                "*CITY OF AARON: LIST MENU    *\n"+
                "******************************\n"+
                "1 - List Animals\n"+
                "2 - Save Animals\n"+
                "3 - List Tools\n"+
                "4 - Save Tools\n"+
                "5 - List Provisions \n"+
                "6 - Save Provisions \n"+
                "7 - List Team \n"+
                "8 - Return to Game menu\n", 8);
   }    
     
    //The doAction method 
    //Purpose: performs the selected action
    //Parameters: noce
    //Returns: none
    
    @Override public void doAction(int option)
    {
        switch(option)
        {
            case 1: // if the option is 1, call listAnimals()
                listAnimals();
                break;
            case 2: // if the option is 2, call saveAnimals()
                saveAnimals();
                break;
            case 3: // if the option is 3, call listTools()
                listTools();
                break;
            case 4: // if the option is 4, call saveTools()
                saveTools();
            case 5: // if the option is 5, call Provisions()
                listProvisions();
                break;
            case 6: // if the option is 6, call saveProvisions()
                saveProvisions();
                break;
            case 7: // if the option is 7, call listTeam()
                listTeam();
                break;
            case 8: // if the option is 8, return to the game menu       
                return;
       

        }
    }
     
    //The listTools Method
    //Purpose: display list of tools in storehouse
    //Parameters: none
    //Return: none
    //Author: Megan Hendrickson
    public static void listTools() {
         //Call Game class and assign to theGame variable
         Game theGame = CityOfAaron.getGame();
         
         //get values from tools list
         ArrayList<ListItem> tools = theGame.getTools();
         
         //print header
        System.out.format("%-16s%-24s\n", "Tools", "Quantity");
 
        //print list
        for(ListItem tool : tools) { 
            System.out.format("%-16s%-24s\n", tool.getName(), tool.getNumber());
        }
         
    }
    
    //The saveTools method
    //Purpose: write tool list to disk
    //Parameters: none
    //Returns: none
    //Author: Megan Hendrickson
    public static void saveTools() {
        Game theGame = CityOfAaron.getGame();
        ArrayList<ListItem> tools = theGame.getTools();
        
        //prompt user the path and file name to save the list
        System.out.println("\nPlease enter the path and file name to save your list.");
        String filepath = keyboard.next();
        
        //call the getAnimals() method in the GameControl class to load the game
        GameControl.saveToolsList(filepath, tools);
        
        //display the game menu for the loaded game
        System.out.println("\nThe Tool List was saved successfully.");
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();
    }
    
    //The listAnimals method
    //Purpose: list the animals in the game
    //Parameters: none
    //Returns: none
    //Author: McKell Painter
    public static void listAnimals() {
        
        //get the arraylist from the Game object
        Game theGame = CityOfAaron.getGame();
        
        //get the ListItem out of the ArrayList
        ArrayList<ListItem> animals = theGame.getAnimals();
        
        //display the name of the item and the number of items
        for (ListItem animal :animals) {
            System.out.println(animal.getName() + '\t' + animal.getNumber());
        }
    }
    
    //The saveAnimals method
    //Purpose: save the game's animal list to file
    //Parameters: none
    //Returns: none
    //Author: McKell Painter
    public static void saveAnimals() {
        Game theGame = CityOfAaron.getGame();
        ArrayList<ListItem> animals = theGame.getAnimals();
        
        //prompt user the path and file name to save the list
        System.out.println("\nPlease enter the path and file name to save your list.");
        String filepath = keyboard.next();
        
        //call the getAnimals() method in the GameControl class to load the game
        GameControl.saveAnimalList(filepath, animals);
        
        //display the game menu for the loaded game
        System.out.println("\nThe Animal List was saved successfully.");
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();
    }
    
    //The listProvisions method 
    //Purpose: list provision of the game
    //Parameters: none
    //Returns: none
    //author: wcanar
    public static void listProvisions() {
         
        // Call the game Class and assign to theGame variable class
        Game theGame = CityOfAaron.getGame();
        
        //assign values from provisions and assing to the provisions array
        ArrayList<ListItem> provisions = theGame.getProvisions();
   
        //print header
        System.out.format("%-16s%-24s\n", "Provisions", "Quantity");
 
        //print list
        for(ListItem provision : provisions) { 
            System.out.format("%-16s%-24s\n", provision.getName(), provision.getNumber());
        }
       

    }
    
    //The saveProvisions method 
    //Purpose: save provision of the game
    //Parameters: none
    //Returns: none
    //author: wcanar
      public static void saveProvisions() {
                
        Game theGame = CityOfAaron.getGame();
        ArrayList<ListItem> provisions = theGame.getProvisions();
        
        //prompt user the path and file name to save the list
        System.out.println("\nPlease enter the path and file name to save your list.");
        String filepath = keyboard.next();
        
        //call methodo to save the list in a file
        GameControl.saveList(filepath, provisions);
        
        //display the game menu for the loaded game
        GameMenuView gmv = new GameMenuView();
        gmv.displayMenu();
      
    }
    
    public static void listTeam() {
         System.out.println("\nDisplay listTeam selected.");
    }
}
