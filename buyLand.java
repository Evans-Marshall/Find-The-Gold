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
 * @author yungm
 */
public class buyLand {


public static int buyLand(int acresOwned, int landPrice, int acresToBuy, int population, int wheatInStore, CropData cropData) 
{
  
//if acresToBuy < 0, return -1
    if (acresToBuy < 0) return -1;
//if wheatInStore < landPrice * acresToBuy, return -1
    if (wheatInStore < (landPrice * acresToBuy)) return -1;
//if population < (acresToBuy + acresOwned) / 10, return -1
    if (population < (acresToBuy + acresOwned) / 10) return -1;
//acresOwned = acresToBuy + acresOwned
    acresOwned = acresToBuy + acresOwned;
//wheatInStore = wheatInStore - (acresToBuy * landPrice)
    wheatInStore = wheatInStore - (acresToBuy * landPrice);
//Return acresOwned
    return acresOwned;
}

}
