/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.CropData;

/**
 *
 * @author yungm
 */
public class payTithe {
 

public static int payTithe(int offering, int wheatInStore, int offeringBushel, CropData cropData) 
{



//if percentTithe <= 0, return -1 
if ( offering <= 0 ) return -1;

//if percentTithe < 100, return -1
if (offering > 100) return -1;
if (offering < 0 ) return -1;

//if wheatInStore == 0, return -1
if (wheatInStore == 0) return -1;

//bushelsTithed = (percentTithed/100) x wheatInStore
offeringBushel = ((offering*wheatInStore)/100);

//wheatInStore = wheatInStore - bushelsTithed 
wheatInStore -= offeringBushel;


//Return wheatInStore
return wheatInStore;

}
}