/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yungm
 */
public class buyLandTest {
    
    public buyLandTest() {
    }

    /**
     * Test of buyLand method, of class buyLand.
     */
    @Test
    public void testBuyLand() {
        System.out.println("buyLand");
        int acresOwned = 10;
        int landPrice = 20;
        int acresToBuy = 5;
        int population = 10;
        int wheatInStore = 200;
        CropData cropData = null;
        int expResult = 15;
        int result = buyLand.buyLand(acresOwned, landPrice, acresToBuy, population, wheatInStore, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
