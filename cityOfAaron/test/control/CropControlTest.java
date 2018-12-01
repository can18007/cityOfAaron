/*
 * The Crop Control Test 
 * CIT-260
 * Fall 2018
 * Megan Hendrickson, Wladimir Canar, McKell Painter
 */
package control;

import model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author HP
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of calcLandCost method, of class CropControl.
     */
    @Test
   public void testCalcLandCost() {
        System.out.println("calcLandCost");
        int expResult = 20;
        int result = CropControl.calcLandCost();
        System.out.println(result);
        assertEquals(expResult, result);
   }

    /**
     * Test of sellLand method, of class CropControl.
     */
    @Test
    public void testSellLand() {
        System.out.println("sellLand");
        int landPrice = 20;
        int acresToSell = 10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(2800);
        int expResult = 2790;
        try {
            CropControl.sellLand(landPrice,acresToSell, cropData);
            assertEquals(expResult, cropData.getAcresOwned()); 
        } catch (Exception e){
            fail("Unexpected exception: + e.getMessage()");
        }
              
    }
    
     /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand1() {
        System.out.println("buyLand");
        int landPrice = 20;
        int acresToBuy = 10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(600);
        cropData.setWheatInStore(600);
        int expResult = 610;
        try {
            CropControl.buyLand(landPrice, acresToBuy, cropData);
            assertEquals(expResult, cropData.getAcresOwned());
        } catch (Exception e){
            fail("Unexpected exception: + e.getMessage()");
        }
    }
    
     /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand2() {
        System.out.println("buyLand");
        int landPrice = 50;
        int acresToBuy = -10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(600);
        cropData.setWheatInStore(600);
        int expResult = -1;
        try {
            CropControl.buyLand(landPrice, acresToBuy, cropData);
            fail("Exception was expected");
        } catch (Exception e){
            fail("Unexpected exception: + e.getMessage()");
        }
    }
    
     /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand3() {
        System.out.println("buyLand");
        int landPrice = 60;
        int acresToBuy = 10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(600);
        cropData.setWheatInStore(60);
        int expResult = -1;
        try {
            CropControl.buyLand(landPrice, acresToBuy, cropData);
            assertEquals(expResult, cropData.getAcresOwned());
        } catch (Exception e){
            fail("Unexpected exception: + e.getMessage()");
        }
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand4() {
        System.out.println("buyLand");
        int landPrice = 50;
        int acresToBuy = 10;
        CropData cropData = new CropData();
        cropData.setAcresOwned(600);
        cropData.setWheatInStore(600);
        int expResult = 610;
        try {
            CropControl.buyLand(landPrice, acresToBuy, cropData);
            assertEquals(expResult, cropData.getAcresOwned());
        } catch (Exception e){
            fail("Unexpected exception: + e.getMessage()");
        }
    }
    
        /**
     * Test of buyLand method, of class CropControl.
     */
    @Test
    public void testBuyLand5() {
        System.out.println("buyLand");
        int landPrice = 50;
        int acresToBuy = 0;
        CropData cropData = new CropData();
        cropData.setAcresOwned(600);
        cropData.setWheatInStore(600);
        int expResult = 600;
        try {
            CropControl.buyLand(landPrice, acresToBuy, cropData);
            assertEquals(expResult, cropData.getAcresOwned());
        } catch (Exception e){
            fail("Unexpected exception: + e.getMessage()");
        }
    }
    
    /**
    * Test of buyLand method, of class CropControl.
    */
    @Test
    public void testPlantCrops1() {
        System.out.println("PlanCrops - Test1**Valid**");
        int landPlant = 30;
        CropData cropData = new CropData();
        cropData.setAcresOwned(45);
        cropData.setPopulation(5);
        cropData.setWheatInStore(20);
        int expResult = 30;
        int result = CropControl.plantCrops(landPlant, cropData);
        assertEquals(expResult, result);
    }
    
     /**
    * Test of buyLand method, of class CropControl.
    */
    @Test
    public void testPlantCrops2() {
        System.out.println("PlanCrops - Test1**Invalid**");
        int landPlant = 0;
        CropData cropData = new CropData();
        cropData.setAcresOwned(45);
        cropData.setPopulation(5);
        cropData.setWheatInStore(20);
        int expResult = -1;
        int result = CropControl.plantCrops(landPlant, cropData);
        assertEquals(expResult, result);
    }
    
       /**
    * Test of buyLand method, of class CropControl.
    */
    @Test
    public void testPlantCrops3() {
        System.out.println("PlanCrops - Test1**Invalid 2**");
        int landPlant = 50;
        CropData cropData = new CropData();
        cropData.setAcresOwned(45);
        cropData.setPopulation(5);
        cropData.setWheatInStore(20);
        int expResult = -1;
        int result = CropControl.plantCrops(landPlant, cropData);
        assertEquals(expResult, result);
    }
    
        /**
    * Test of buyLand method, of class CropControl.
    */
    @Test
    public void testPlantCrops4() {
        System.out.println("PlanCrops - Test1**Invalid 3**");
        int landPlant = 30;
        CropData cropData = new CropData();
        cropData.setAcresOwned(45);
        cropData.setPopulation(5);
        cropData.setWheatInStore(14);
        int expResult = -1;
        int result = CropControl.plantCrops(landPlant, cropData);
        assertEquals(expResult, result);
    }
    
          /**
    * Test of buyLand method, of class CropControl.
    */
    @Test
    public void testPlantCrops5() {
        System.out.println("PlanCrops - Test1**Boundary**");
        int landPlant = 0;
        CropData cropData = new CropData();
        cropData.setAcresOwned(45);
        cropData.setPopulation(2);
        cropData.setWheatInStore(20);
        int expResult = -1;
        int result = CropControl.plantCrops(landPlant, cropData);
        assertEquals(expResult, result);
    }

  
    /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering1() {
        System.out.println("Set Offering - Test 1");
        CropData cropData = new CropData();
        cropData.setHarvest(5);
        
        int harvestOffering = 10;
        int expResult = 10;
        int result = CropControl.setOffering(harvestOffering, cropData);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering2() {
        System.out.println("Set Offering - Test 2");
        CropData cropData = new CropData();
        cropData.setHarvest(-10);
        
        int harvestOffering = 10;
        int expResult = -1;
        int result = CropControl.setOffering(harvestOffering, cropData);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering3() {
        System.out.println("Set Offering - Test 3");
        CropData cropData = new CropData();
        cropData.setHarvest(5);
        
        int harvestOffering= -10;
        int expResult = -1;
        int result = CropControl.setOffering(harvestOffering, cropData);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering4() {
        System.out.println("Set Offering - Test 4");
        CropData cropData = new CropData();
        cropData.setHarvest(5);
        
        int harvestOffering = 0;
        int expResult = 0;
        int result = CropControl.setOffering(harvestOffering, cropData);
        assertEquals(expResult, result);
    }
    
         /**
     * Test of setOffering method, of class CropControl.
     */
    @Test
    public void testSetOffering5() {
        System.out.println("Set Offering - Test 5");
        CropData cropData = new CropData();
        cropData.setHarvest(5);
        
        int harvestOffering = 100;
        int expResult = 100;
        int result = CropControl.setOffering(harvestOffering, cropData);
        assertEquals(expResult, result);
    }

    /**
     * Test of feedPeople method, of class CropControl.
     *  Test Case 1
     */
    @Test
    public void testFeedPeopleCase1() 
    {
        System.out.println("feedPeople - Test Case 1");
        int feedPeople = 10;
        CropData cropData = new CropData();
        cropData.setWheatInStore(20);
        int expResult = 10;
        int result = CropControl.feedPeople(feedPeople, cropData);
        assertEquals(expResult, result);
    }

     /**
     * Test of feedPeople method, of class CropControl.
     *  Test Case 2
     */
    @Test
    public void testFeedPeopleCase2() 
    {
        System.out.println("feedPeople - Test Case 2");
        int feedPeople = -5;
        CropData cropData = new CropData();
        cropData.setWheatInStore(20);
        int expResult = -1;
        int result = CropControl.feedPeople(feedPeople, cropData);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of feedPeople method, of class CropControl.
     *  Test Case 3
     */
    @Test
    public void testFeedPeopleCase3() 
    {
        System.out.println("feedPeople - Test Case 3");
        int feedPeople = 20;
        CropData cropData = new CropData();
        cropData.setWheatInStore(10);
        int expResult = -1;
        int result = CropControl.feedPeople(feedPeople, cropData);
        assertEquals(expResult, result);
    }
    
     /**
     * Test of feedPeople method, of class CropControl.
     *  Test Case 4
     */
    @Test
    public void testFeedPeopleCase4() 
    {
        System.out.println("feedPeople - Test Case 4");
        int feedPeople = 0;
        CropData cropData = new CropData();
        cropData.setWheatInStore(50);
        int expResult = 50;
        int result = CropControl.feedPeople(feedPeople, cropData);
        assertEquals(expResult, result);  
    }
    
     /**
     * Test of feedPeople method, of class CropControl.
     *  Test Case 5
     */
    @Test
    public void testFeedPeopleCase5() 
    {
        System.out.println("feedPeople - Test Case 5");
        int feedPeople = 50;
        CropData cropData = new CropData();
        cropData.setWheatInStore(50);
        int expResult = 0;
        int result = CropControl.feedPeople(feedPeople, cropData);
        assertEquals(expResult, result);
    }
}

