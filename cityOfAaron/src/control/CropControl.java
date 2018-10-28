/*
 * The CropControl class - part of the control layer for the 
City of Aaron Project
 * class contains all of the calculation methods for managing 
the crops
 * CIT-260
 * Spring 2018
 * Team members: Megan Hendrickson, McKell Painter, Wladimir 
Canar
 */

package control;

import java.util.Random;
import model.CropData;

public class CropControl
{
    //constants
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    
    //random number generator
    private static Random random = new Random();
    
    //calCost() method
    //Purpose: Calculate a random land cost between 17 and 26 bushels/acre
    //Parameters: none
    //Returns: The land cost
    public static int calcLandCost(){
        int landPrice = random.nextInt(LAND_RANGE)+LAND_BASE;
        return landPrice;
    }
            
    //power point documentation
    /* The sellLand method
     * Purpose: To sell land
    * Parameters: the price of land, the number of acres to sell, and 
    *  a reference to a cropData object
    * Retruns: the nubmer of acres owned after the sale
    * Pre-conditions: acres to sell must be positive
    * and<= acresOwned
    */
    public static int sellLand(int landPrice, int acresToSell, CropData cropData)
    {
        // if acresToSell < 0, return -1
        if(acresToSell < 0)
            return -1;
        
        // if acresToSell > acresOwned, return -1
        int owned = cropData.getAcresOwned();
        if(acresToSell > owned)
            return -1;
        
        // acresOwned = acresOwned - acresToSell
        owned -= acresToSell;
        cropData.setAcresOwned(owned);
                
        // wheatInStore = wheatInStore + acresToSell * landPrice
        int wheat = cropData.getWheatInStore();
        wheat += (acresToSell*landPrice);
        cropData.setWheatInStore(wheat);
        
        // return acresOwned
        return owned;
    }
    
/**
* The buyLand method
* Purpose: To buy land
* @param the price of land
* @param the number of acres to buy
* @param a reference to a CropData object
* @ return the number of acres of land now owned
* Pre-conditions: acres to be bought must be positive
* and the amount of wheat owned >= the cost to buy the land
* author 
*/

    public static int buyLand(int landPrice, int acresToBuy, CropData cropData)
    {
        // if acresToBuy < 0, return -1
        if(acresToBuy < 0)
            return -1;
        
        // if acresToBay*landPrice > wheatInStore, return -1
        int wheatInStore = cropData.getWheatInStore();
        if(acresToBuy*landPrice > wheatInStore)
            return -1;
        
        // acresOwned = acresOwned + acresToBuy
        int acresOwned = cropData.getAcresOwned();
        acresOwned += acresToBuy;
        cropData.setAcresOwned(acresOwned);
                
        //wheatInStore = wheatInStore â€“ (acresToBuy * landPrice)
        int wheat = cropData.getWheatInStore();
        wheat -= (acresToBuy*landPrice);
        cropData.setWheatInStore(wheat);
        
        // return acresOwned
        return acresOwned;
    }

/**
* The Plant Crops method
* Purpose: Determine how much wheat to set aside to feed the people
* @param number of acres to plant
* @param a reference to a CropData object
* @ return number of acres of what in storage
* Pre-conditions: acres of land to plant must be positive. City has this much land. City has enough people * to tend the land. City has enough wheat in storage to plant 
* author wladimir canar
*/


    public static int plantCrops(int landPlant, CropData cropData)
    {
        // if landPlant <= 0 return -1
        if(landPlant <= 0){
            return -1;
        }
        
        // if acresOwned < landPlant, return -1
        int acresOwned = cropData.getAcresOwned();
        if(acresOwned < landPlant) {
            return -1;
        }
        
        //If enoughPeople*10 < landPlant, return -1
        int population = cropData.getPopulation();
        if (population*10 < landPlant){
            return -1;
        }
        
        //If enoughWheat*2 < landPlant, return -1
        int wheatInStore = cropData.getWheatInStore();
        if (wheatInStore * 2 < landPlant) {
            return -1;
        } else {
            wheatInStore = wheatInStore - (landPlant/2);
            cropData.setWheatInStore(wheatInStore);
            cropData.setAcresPlanted(landPlant);
            return landPlant;
        }
    }   
    
    /**
    * The setOffering method
    * Purpose: To set offering
    * @param the percent of harvest to offer
    * @param a reference to a CropData object
    * Pre-conditions: percent of acres to offer must be between 0 and * 100
    * and the amount of harvest must be greater than 0 
    * author: McKell Painter
    */
    
    public static int setOffering(int harvestOffering, CropData cropData)
    { 
    //If harvesttOffering < 0 or >100, return -1
    if (harvestOffering < 0 || harvestOffering > 100){
        return -1;
    } 
         
    //If harvest < 0, return -1
    int harvest = cropData.getHarvest();
    if (harvest < 0)
        return -1;
    
    return harvestOffering;
    }

}


