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
import exceptions.CropException;

/**
 *
 * @author lgn-cunrz-hr
 */
public class CropView
{
    
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
        

        //  Get the user’s input and save it.
        int toBuy;
        boolean paramsNotOkay;
        do
        {
            paramsNotOkay = false;
            System.out.print("\nHow many acres of land do you wish to buy?");
            toBuy = keyboard.nextInt();
            try
            {
                // Call the buyLand( ) method in the control layer to buy the land
                CropControl.buyLand(price, toBuy, cropData);
            }
            catch(CropException e)
            {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            } 
        }while(paramsNotOkay);
            
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
        displayCropsReportView();
        
        //call the feedPeopleView method
        feedPeopleView();
    }
    
     public static void sellLandView()
    {
        // Generate a random number for the price of an acre of land. Make this value between 17 and 27 bushels per acre
        int price = CropControl.calcLandCost();

        // Prompt the user to enter the number of acres to sell
        System.out.format("Land is selling for %d bushels per acre. %n", price);
        

        //  Get the user’s input and save it.
        int toSell;
        boolean paramsNotOkay;
        do
        {
          paramsNotOkay = false;
          System.out.print("\nHow many acres of land do you wish to sell?");
          toSell = keyboard.nextInt();
          try
          {
                // Call the buyLand( ) method in the control layer to buy the land
                CropControl.sellLand(price, toSell, cropData);
          }
          catch(CropException e)
          {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
          }
        }while(paramsNotOkay);
        //output how much land we now own
        System.out.format("You now own %d acres of land", cropData.getAcresOwned());  
    }
     
    // feedPeopleView method - Autohor: wladimir canar
     public static void feedPeopleView()
    {      
        // Prompt the user to enter the number of bushels of wheat to set aside
        
        //  Get the user’s input and save it.
        int feedPeople;
        boolean paramsNotOkay;
        do
        {
            paramsNotOkay = false;
            System.out.print("\nHow many bushels of grain do you want to set aside to feed the people?");
            feedPeople = keyboard.nextInt();
            try
            {
                // Call the feedPeople( ) method in the control layer to feed the people
                CropControl.feedPeople(feedPeople, cropData);
 
            }
            catch(CropException e)
            {
                System.out.println("I am sorry master, I cannot do this.");
                System.out.println(e.getMessage());
                paramsNotOkay = true;
            }
        }while(paramsNotOkay);
        
        
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
    

    public static void displayCropsReportView()
    {
        //Tell the user they are viewing the crop report
        System.out.println("\n Crop Report%n");
        
        //Display the number of acres owned
        System.out.format("You own %d acres%n", cropData.getAcresOwned());
    
        //Display acres planted
        System.out.format("You have %d acres planted%n", cropData.getAcresPlanted());
        
        //Display wheat in store
        System.out.format("You have %d bushel of wheat in store%n", cropData.getWheatInStore());
    
    }
    
}
