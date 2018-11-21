/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.*;
import cityofaaron.CityOfAaron;

/**
 *
 * 
 */
public class GameControl {
    
    //size of the Location array
    private static final int MAX_ROW = 5;
    private static final int MAX_COL = 5;
    
    public static void createNewGame(String _name) {
        
    // Create a new Game object.
    Game game = new Game();
    
    // Create a new Player object
    Player player = new Player();
    player.setName(_name);
    
    //save reference to the player object in the game
    game.setPlayer(player);
    
    //save a reference to it in the Game object
    CropData cropData = new CropData();
    cropData.setYear(0);
    cropData.setPopulation(100);
    cropData.setNewPeople(5);
    cropData.setCropYield(3);
    cropData.setNumberWhoDied(0);
    cropData.setWheatInStore(2700);
    cropData.setAcresOwned(1000);
    cropData.setAcresPlanted(1000);
    cropData.setHarvest(3000);
    cropData.setOfferingBushels(300);
    cropData.setAcresPlanted(1000); 
    game.setCropData(cropData); 

    // Save a reference to the Game object in the static variable
    CityOfAaron.setGame(game);
        
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
        //refert to the Map constructor
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
        
    }
}
