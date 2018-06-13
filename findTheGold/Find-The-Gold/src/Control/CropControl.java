/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.CropData;
import java.util.Random;


/**
 *
 * @author Marshall Evans, Kelsey Carreon
 */
public class CropControl {
    // random number generator
private static final int LAND_BASE = 17;
private static final int LAND_RANGE = 11;
private static Random random = new Random();
public static int calcLandPrice()
{
int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
return landPrice;
}
// The sellLand method
// Purpose: To sell land
// Parameters: the price of land, the number of acres to sell, and
// a reference to a CropData object
// Returns: the number of acres owned after the sale
// Pre-conditions: acres to sell must be positive
// and <= acresOwned
public static int sellLand(int landPrice, int acresToSell, CropData CropData)           
{
//if acresToSell < 0, return -1
    if (acresToSell < 0)
return -1;
//if acresToSell > acresOwned, return -1
int acresOwned = CropData.getAcresOwned();
if (acresToSell > acresOwned)
return -1;
//acresOwned = acresOwned - acresToSell
acresOwned -= acresToSell;
CropData.setAcresOwned(acresOwned);
//wheatInStore = wheatInStore + acresToSell * landPrice
int wheatInStore = CropData.getWheatInStore();
wheatInStore -= (acresToSell * landPrice);
CropData.setWheatInStore(wheatInStore);
//return acresOwned
return acresOwned;
}
    
}
