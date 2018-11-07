/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;
import cityofaaron.CityOfAaron;
import control.*;

/**
 *
 * @author wcanar
 */
public class ListMenuView {
    private String listMenu;
    private int max;
    Scanner keyboard = new Scanner(System.in);
    
    public ListMenuView() 
    {    
       listMenu = "\n"+
                "******************************\n"+
                "*CITY OF AARON: LIST MENU    *\n"+
                "******************************\n"+
                "1 - List Animalas\n"+
                "2 - List Tools\n"+
                "3 - List Provisions \n"+
                "4 - List Team \n"+
                "5 - Return to Game menu\n";
        
        max = 5;
   }    
     
     public void displayMenuView()
   {
        int menuOption;
        do
        {
            // Display the menu
            System.out.println(listMenu);
             
            // Prompt the user and get the user's input
            menuOption = getMenuOption();
               
            // Perform the desired action
            doAction(menuOption);
               
        } while (menuOption != max);
    }
     
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
        
    }
    
    public static void listTools() {
        
    }
    
    public static void listProvisions() {
        
    }
    
    public static void listTeam() {
        
    }
}
