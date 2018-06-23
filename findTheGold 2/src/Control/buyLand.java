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
 * @author khaddow / mEvans
 */
public class buyLand {


public static int buyLand(int landPrice, int acresToBuy, CropData cropData) 
{
  
//if acresToBuy < 0, return -1
    if (acresToBuy < 0) return -1;
//if wheatInStore < landPrice * acresToBuy, return -1
    if (cropData.getWheatInStore() < (landPrice * acresToBuy)) return -1;
//if population < (acresToBuy + acresOwned) / 10, return -1
    if (cropData.getPopulation()< (acresToBuy + cropData.getAcresOwned())/ 10) return -1;
//acresOwned = acresToBuy + acresOwned
   cropData.setAcresOwned(acresToBuy + cropData.getAcresOwned());
//wheatInStore = wheatInStore - (acresToBuy * landPrice)
    cropData.setWheatInStore(cropData.getWheatInStore()  - (acresToBuy * landPrice));
//Return acresOwned
    return cropData.getAcresOwned();
}

}
