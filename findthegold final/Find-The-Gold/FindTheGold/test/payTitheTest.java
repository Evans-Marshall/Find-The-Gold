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
public class payTitheTest {
    
    public payTitheTest() {
    }

    /**
     * Test of payTithe method, of class payTithe.
     */
    @Test
    public void testPayTithe() {
        System.out.println("payTithe");
        int offering = 10;
        int wheatInStore = 100;
        int offeringBushel = 10;
        CropData cropData = null;
        int expResult = 90;
        int result = payTithe.payTithe(offering, wheatInStore, offeringBushel, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
