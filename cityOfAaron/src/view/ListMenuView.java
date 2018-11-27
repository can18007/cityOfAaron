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
                "1 - List Animalas\n"+
                "2 - List Tools\n"+
                "3 - List Provisions \n"+
                "4 - List Team \n"+
                "5 - Return to Game menu\n", 5);
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
            case 2: // if the option is 2, call listTools()
                listTools();
                break;
            case 3: // if the option is 3, call Provisions()
                listProvisions();
                break;
            case 4: // if the option is 4, call listTeam()
                listTeam();
                break;
            case 5: // if the option is 5, return to the game menu
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
    
    public static void listTeam() {
         System.out.println("\nDisplay listTeam selected.");
    }
}
