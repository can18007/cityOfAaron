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
    
    public static void listAnimals() {
         System.out.println("\nDisplay List Animals elected.");
    }
    
    public static void listTools() {
         System.out.println("\nDisplay listTools selected.");
    }
    
    public static void listProvisions() {
         System.out.println("\nDisplay listProvisions selected.");
    }
    
    public static void listTeam() {
         System.out.println("\nDisplay listTeam selected.");
    }
}
