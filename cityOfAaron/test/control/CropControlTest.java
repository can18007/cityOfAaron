/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

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
     * Test of the sellLand method, of class CropData Control
     * Test Case 1
     */
    @Test
    public void testSellLand() 
    {
        System.out.println("sellLand - Test Case 1");
        CropData theCrops = null;
        int toSell = 10;
        int landCost = 20;
        int expResult = 2790;
        int result = CropDataControl.sellLand(theCrops, toSell, landCost);
        assertEquals(expResult, result); 
    }
    
}
