/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.*;
import cityofaaron.CityOfAaron;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * 
 */
public class GameControl {
    
    //size of the Location array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    private static Game theGame = new Game();
    
    
    public static void getSavedGame(String filePath){
    
        Game theGame = null;
  
        try (FileInputStream fips = new FileInputStream(filePath))
        {
            ObjectInputStream input = new ObjectInputStream(fips);
            theGame = (Game)  input.readObject();
            CityOfAaron.setGame(theGame);
        }
        catch(Exception e)
        {
            System.out.println("\nThere was an error reading the saved game file");
        }    
    }
    
    public static void SavedGame(Game theGame, String filePath){
     
  
        try (FileOutputStream fips = new FileOutputStream(filePath))
        {
            ObjectOutputStream output = new ObjectOutputStream(fips);
            output.writeObject(theGame);
            CityOfAaron.setGame(theGame);
        }
        catch(Exception e)
        {
            System.out.println("\nThere was an error reading the saved game file");
        }    
        
        
    }
    
    
    public static void createNewGame(String pName) {
       
              
        // Create a new Player object
        Player thePlayer = new Player();
        thePlayer.setPlayerName(pName);

        //save reference to the player object in the game
        theGame.setPlayer(thePlayer);

        //save a reference to it in the Game object
        CropData cropData = new CropData();
      
        //CreateCropDataObject
        createCropDataObject();
        
        //Create Map 
        createMap();
        
        //Create Animal List
        createAnimalList();
        
        //Create prvision list
        createProvisionsList();
        
        //Create tools list
        createToolsList();


        // Save a reference to the Game object in the static variable
        CityOfAaron.setGame(theGame);
        
        
    }
    
    public static void createCropDataObject()
    {
        CropData theCrops = new CropData();
               
        theCrops.setYear(0);
        theCrops.setPopulation(100);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumberWhoDied(0);
        theCrops.setOffering(10);
        theCrops.setWheatInStore(2700);
        theCrops.setAcresOwned(1000);
        theCrops.setAcresPlanted(1000);
        theCrops.setHarvest(3000);
        theCrops.setOfferingBushels(300);
        theCrops.setAcresPlanted(1000);
        theGame.setCropData(theCrops);
    }
    
    //The createMap method
    //Purpose: creates the location objects and the map
    //Parameters: none
    //Returns: none
    public static void createMap()
    {
        //create the Map object, it is 5 x 5
        //refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
        
        //create a string that will go in the Location objects that contain the river
        String river = "\nYou are on the River. The river is the source" +
                       "\nof life for our city. The river marks the eastern" +
                       "\nboundary of the city - it is wilderness to the East.";
        
        //create a new Location object
        Location loc = new Location();
        
        //use setters in the Location class to set the description and symbol
        loc.setDescription(river);
        loc.setSymbol("~~~");
        
        //set this location object in each cell of the array in column 4
        for(int i=0; i < MAX_ROW; i++)
        {
            theMap.setLocation(i, 4, loc);
        }
        
        //define the string for a farm land location
        String farmland = "\nYou are on the fertile banks of the River." +
                          "\nIn the spring, this low farmland floods and is covered with rich" +
                          "\nnew soil. Wheat is planted as far as you can see.";
        
        //set a farmland location with a hint
        loc = new Location();
        loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
        loc.setSymbol("!!!");
        theMap.setLocation(0, 2, loc);
        
        //set another farmland location
        loc = new Location();
        loc.setDescription(farmland);
        loc.setSymbol("!!!");
        
        //set this location object in each cell of the array in column 4
        for(int i=0; i < MAX_ROW; i++)
        {
            theMap.setLocation(i, 3, loc);
        }
        
        //define the string for a village location
        String village = "\nYou are in the village." +
                         "\nThe village is filled with good and faithful people." +
                         "\nEnjoy your stay.";
        
        //set village location with a hint
        loc = new Location();
        loc.setDescription(village + "It takes 20 bushels of wheat to feed one person.");
        loc.setSymbol("^^^");
        theMap.setLocation(1, 2, loc);
        
        //define the string for a Ruler's Court location
        String court = "\nYou are standing in the Ruler's Court." +
                          "\nThe court is the center of our city";
        
        //set Ruler's Court location
        loc = new Location();
        loc.setDescription(court);
        loc.setSymbol("***");
        theMap.setLocation(2, 2, loc);
        
        //define the string for a Granary & Storehouse location
        String granary = "\nThis is the Granary and Storehouse";
        
        //set Granary & Storehouse location
        loc = new Location();
        loc.setDescription(granary);
        loc.setSymbol("$$$");
        theMap.setLocation(2, 3, loc);
        
        //define the string for Wilderness location
        String wilderness = "\nYou are now standing at the Wilderness edge." +
                            "\nThe wilderness marks the south boundary of our city.";
        
        //set Wilderness location
        loc = new Location();
        loc.setDescription(wilderness);
        loc.setSymbol("###");
        theMap.setLocation(2, 4, loc);
        
         //define the string for Undeveloped land location
        String land = "\nThis land is undeveloped.";
        
         //set undeveloped land location
        loc = new Location();
        loc.setDescription(land);
        loc.setSymbol("+++");
        
        //set this location object in each cell of the array in column 4
        for(int i=0; i < MAX_ROW; i++)
        {
            theMap.setLocation(i, 1, loc);
        }
        
        //define the string for Lamanite Border location
        String border = "\nYou are now standing at the Lamanaite Border." +
                            "\nThe Lamanite border is the West boundary of our city.";
        
         //set Lamanite border location
        loc = new Location();
        loc.setDescription(border);
        loc.setSymbol("===");
        
        //set this location object in each cell of the array in column 4
        for(int i=0; i < MAX_ROW; i++)
        {
            theMap.setLocation(i, 0, loc);
        }
        
        theGame.setMap(theMap);
    }
    
    // the animalList method
    // Purpose: add item to animal list
    // Parameters: none
    // Returns: none
    // Author: McKell Painter
    public static void createAnimalList(){
        ArrayList<ListItem> animals = new ArrayList<>();
        
        animals.add(new ListItem("Cows", 15));
        animals.add(new ListItem("Horses", 20));
        animals.add(new ListItem("Pigs", 8));
        animals.add(new ListItem("Goats", 6));
        animals.add(new ListItem("Sheep", 7));
        
        theGame.setAnimals(animals);
        
    }

    //The createProvisionList method 
    //Purpose: add list to provison on the game
    //Parameters: none
    //Returns: none
    //Author: wcanar
    public static void createProvisionsList(){
        ArrayList<ListItem> provisions = new ArrayList<>();
      
        provisions.add(new ListItem("Tinned Soups",12));
        provisions.add(new ListItem("small packs of Rice",23));
        provisions.add(new ListItem("Cuppoa Soup",123));
        provisions.add(new ListItem("Jellies",50));
        
        //for (ListItem item:provisions){
        //    System.out.println(provisions);
        //}
     
       
        theGame.setProvisions(provisions);
       
       
    }
 
    //The createToolsList method 
    //Purpose: create a list of tools
    //Parameters: none
    //Returns: none
    //Author: Megan Hendrickson
    public static void createToolsList(){
        ArrayList<ListItem> tools = new ArrayList<>();
        
        tools.add(new ListItem("Hoe", 25));
        tools.add(new ListItem("Sickle", 20));
        tools.add(new ListItem("Hand Plow", 5));
        tools.add(new ListItem("Pitchfork", 15));
        tools.add(new ListItem("Shaduf", 10));
     
        theGame.setTools(tools);
    }
}
