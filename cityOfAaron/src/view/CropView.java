/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.*;
import control.*;
import java.util.Scanner;
import cityofaaron.CityOfAaron;

/**
 *
 * @author lgn-cunrz-hr
 */
public class CropView
{
    private String cropReport;
    private int max;
    
    //Create a Scanner object
    private static Scanner keyboard = new Scanner(System.in);
    
    //Get references to the Game object and the CropData object
    static private Game game = CityOfAaron.getGame();
    static private CropData cropData = game.getCropData();
    
    
    
    // The buyLandView method
    // Purpose: interface with the user input for buying land
    // Parameters: none
    // Returns: none
    public static void buyLandView() {
        // Get the cost of land for this round.
        int price = CropControl.calcLandCost();

        // Prompt the user to enter the number of acres to buy
        System.out.format("Land is selling for %d bushels per acre. %n", price);
        System.out.print("\nHow many acres of land do you wish to buy?");

        //  Get the user’s input and save it.
        int toBuy;
        toBuy = keyboard.nextInt();

        // Call the buyLand( ) method in the control layer to buy the land
        CropControl.buyLand(price, toBuy, cropData);

        //output how much land we now own
        System.out.format("You now own %d acres of land", cropData.getAcresOwned());
    }
    
    // The runCropView method()
    // Purpose: runs the methods to manage the crops game
    // Parameters: none
    // Returns: none
    public static void runCropView()
    {
        // call the buyLandView( ) method
        buyLandView( );
        
        // call the sellLandView( ) method
        sellLandView( );
        
        // call the plantCropsVew
        plantCropsView();
        
        // add calls to the other crop view methods
        // as they are written
    }
    
     public static void sellLandView()
    {
        // Generate a random number for the price of an acre of land. Make this value between 17 and 27 bushels per acre
        int price = CropControl.calcLandCost();

        // Prompt the user to enter the number of acres to sell
        System.out.format("Land is selling for %d bushels per acre. %n", price);
        System.out.print("\nHow many acres of land do you wish to sell?");

        //  Get the user’s input and save it.
        int toSell;
        toSell = keyboard.nextInt();

        // Call the buyLand( ) method in the control layer to buy the land
        CropControl.sellLand(price, toSell, cropData);

        //output how much land we now own
        System.out.format("You now own %d acres of land", cropData.getAcresOwned());  
    }
     
    // feedPeopleView method - Autohor: Megan Hendrickson
     public static void feedPeopleView()
    {      
        // Prompt the user to enter the number of bushels of wheat to set aside
        System.out.print("\nHow many bushels of grain do you want to set aside to feed the people?");
        
        //  Get the user’s input and save it.
        int feedPeople;
        feedPeople = keyboard.nextInt();
        
        //call feedPeople() method in the Control Layer 
        CropControl.feedPeople(feedPeople, cropData);
        
        //Display the number of acres of wheat that have been planted and the amount of wheat left in storage.
        System.out.format("You have set aside %d bushells of grain to feed people.", cropData.getWheatForFood());
        System.out.format("\nYou now have %d bushels of grain left in storage", cropData.getWheatInStore());
    }
    
    public static void plantCropsView()
    {
       //Ask the user “How many acres of land do you want to plant”
       //User enters a value.
       System.out.format("\nHow many of acres of land do you want to plant?");

        //  Get the user’s input and save it.
        int toPlant;
        toPlant = keyboard.nextInt();
        
        //call plantCrops() method in the Control Layer 
        CropControl.plantCrops(toPlant, cropData);
        
        //Display the number of acres of wheat that have been planted and the amount of wheat left in storage.
        System.out.format("You have planted %d of acres of wheat", cropData.getAcresPlanted());
        System.out.format("\nYou now have %d wheat left in storage", cropData.getWheatInStore()); 
    }
    

    
   // The CropsReportView constructor
   // Purpse: Initialize the crop report
   // Parameters: none
   // Returns: none
   public CropView()
   {    
       cropReport = "\n"+
                "******************************\n"+
                "*CITY OF AARON: CROP REPORT *\n"+
                "******************************\n"+
                "1 - List or view the animals in the storehouse.\n"+
                "2 - List or view the tools in the storehouse \n"+
                "3 - List or view the provisions in the storehouse \n"+
                "4 - List or view the developers of this game \n"+
                "5 - Return to Menu \n";
        max = 5 ;
   }

    public void displayCropsReportView()
    {
        // execute this loop as long as the selected option is > 0 and <6
        int reportOption = 0;
        do
        {
            //display the help menu
            System.out.println(cropReport);
            
            //get the user's selection
            reportOption = getReportOption();
            
            //perform the selected action
            doAction(reportOption);
            
        }while (reportOption != max);
        
    }//end of displayHelpMenu method
    
    
    // The getReportOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    public int getReportOption()
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
                System.out.println("Error: you must select 1, 2, 3, 4 or 5");
            //loop back to the top of the loop if input was not valid
            // end loop
        } while (userInput < 1 || userInput > MAX);
        return userInput;
    }
    
    
    public void doAction(int option)
    {
        switch(option)
        {
            case 1: //List or view the animals in the storehouse
            viewAnimals();
            break;
            
            case 2: //List or view the tools in the storehouse
            viewTools();
            break;
            
            
            case 3: //List or view the provisions in the storehouse
            viewProvisions();
            break;
            
            case 4: //List or view the developers of this game
            viewDevelopers();
            break;
            
            case 5: //Return to Menu
            System.out.println("Navigate to Main Menu");
        }
    }
    
    // The viewAnimals method
    // Purpose: view the animals in the storehouse
    // Parameters: none
    // Returns: none
    public void viewAnimals()
    {
    
    
    }
    
    // The viewTools method
    // Purpose: view the tools in the storehouse
    // Parameters: none
    // Returns: none
    public void viewTools()
    { 
    
    }
    
    //The viewProvisions method
    //Purpose: view provisions in the storehouse
    //Parameters: none
    //Returns: none
    public void viewProvisions()
    {
        
    }
    
    //The viewDevelopers method
    //Purpose: view the developers of the game
    //Parameters: none
    //Returns: none
    public void viewDevelopers()
    {
       
    }
    

}
