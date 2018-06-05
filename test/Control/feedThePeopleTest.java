/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yungm
 */
public class feedThePeopleTest {
    
    public feedThePeopleTest() {
    }

    /**
     * Test of wheatForPeople method, of class feedThePeople.
     */
    @Test
    public void testWheatForPeople() {
        System.out.println("wheatForPeople");
        int wheatInStore = 25;
        int wheatForPeople = 20;
        int expResult = 5;
        int result = feedThePeople.wheatForPeople(wheatInStore, wheatForPeople);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
