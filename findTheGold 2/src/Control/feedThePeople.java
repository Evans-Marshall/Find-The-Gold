/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.CropData;

/**
 *
 * @author MEvans
 * 
 */
public class feedThePeople {


public static int wheatForPeople(int wheatForPeople, CropData cropData) 
{
//if wheatInStore < 0, return -1
if (cropData.getWheatInStore() <0) return -1;
//if wheatInStore < bushelsOfGrain, return -1
if (cropData.getWheatInStore() < wheatForPeople) return -1;

//wheatInstore = wheatInStore – bushelsOfGrain
cropData.setWheatInStore((cropData.getWheatInStore() - wheatForPeople));

//Return wheatInStore
return cropData.getWheatInStore();

}
}