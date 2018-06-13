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
public class feedThePeople {


public static int wheatForPeople(int wheatInStore, int wheatForPeople) 
{



//if wheatInStore < 0, return -1
if (wheatInStore <0) return -1;
//if wheatInStore < bushelsOfGrain, return -1
if (wheatInStore < wheatForPeople) return -1;

//wheatInstore = wheatInStore – bushelsOfGrain
wheatInStore = (wheatInStore - wheatForPeople);

//Return wheatInStore
return wheatInStore;

}
}