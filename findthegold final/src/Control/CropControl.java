/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Exceptions.CropException;
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

    public static int calcLandPrice() {
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

    public static int sellLand(int landPrice, int acresToSell, CropData theCropData) throws CropException
    {
//if acresToSell < 0, return -1
        if (acresToSell < 0) {
            throw new CropException("A negative value was input.");
        }
        if (landPrice < 0){
            throw new CropException("I don't give away land.");
        }
//if acresToSell > acresOwned, return -1
        int acresOwned = theCropData.getAcresOwned();
        if (acresToSell > acresOwned) {
           throw new CropException("You don't own that many acres.");
        }
//acresOwned = acresOwned - acresToSell
        acresOwned -= acresToSell;
        theCropData.setAcresOwned(acresOwned);
//wheatInStore = wheatInStore + acresToSell * landPrice
        int wheatInStore = theCropData.getWheatInStore();
        wheatInStore -= (acresToSell * landPrice);
        theCropData.setWheatInStore(wheatInStore);
//return acresOwned
        return acresOwned;
    }

    public static int buyLand(int landPrice, int acresToBuy, CropData theCropData) throws CropException {

//if acresToBuy < 0, return -1
        if (acresToBuy < 0) {
            throw new CropException("A negative value was input.");
        }
//if wheatInStore < landPrice * acresToBuy, return -1
        if (theCropData.getWheatInStore() < (landPrice * acresToBuy)) {
            throw new CropException("There is insufficient wheat to buy this land.");
        }
//if population < (acresToBuy + acresOwned) / 10, return -1
        if (theCropData.getPopulation() < (acresToBuy + theCropData.getAcresOwned()) / 10) {
            throw new CropException("There are not enough people to work this land.");
        }
//acresOwned = acresToBuy + acresOwned
        theCropData.setAcresOwned(acresToBuy + theCropData.getAcresOwned());
//wheatInStore = wheatInStore - (acresToBuy * landPrice)
        theCropData.setWheatInStore(theCropData.getWheatInStore() - (acresToBuy * landPrice));
//Return acresOwned
        return theCropData.getAcresOwned();
    }

    public static int wheatForPeople(int wheatForPeople, CropData cropData) throws CropException {
//if wheatInStore < 0, return -1
        if (cropData.getWheatInStore() < 0) {
            throw new CropException("There is no wheat in the storehouse.");
        }
//if wheatInStore < bushelsOfGrain, return -1
        if (cropData.getWheatInStore() < wheatForPeople) {
            throw new CropException("There is not enough wheat to feed the people.");
        }

//wheatInstore = wheatInStore – bushelsOfGrain
        cropData.setWheatInStore((cropData.getWheatInStore() - wheatForPeople));

//Return wheatInStore
        return cropData.getWheatInStore();

    }

    public static int payTithe(int offering, int wheatInStore, int offeringBushel, CropData cropData)  throws CropException {

//if percentTithe <= 0, return -1 
        if (offering <= 0) {
            throw new CropException("A negative value was input.");
        }

//if percentTithe < 100, return -1
        if (offering > 100) {
             throw new CropException("You cannot tithe more than 100%");
        }
        if (offering < 0) {
            return -1;
        }

//if wheatInStore == 0, return -1
        if (wheatInStore == 0) {
             throw new CropException("You have no wheat to tithe.");
        }

//bushelsTithed = (percentTithed/100) x wheatInStore
        offeringBushel = ((offering * wheatInStore) / 100);

//wheatInStore = wheatInStore - bushelsTithed 
        wheatInStore -= offeringBushel;

//Return wheatInStore
        return wheatInStore;

    }
    
    public static int plantCrops(int acresToPlant, CropData cropData) throws CropException{
        // IF acresToPlant < 0, return -1
        if (acresToPlant < 0) {
             throw new CropException("A negative value was input.");
        }
        // IF acresOwned < acresToPlant, return -1
        if (cropData.getAcresOwned() < acresToPlant) {
             throw new CropException("You don't own that many acres.");
        }
        // IF wheatInStore < acresToPlant / 2, return -1
        if (cropData.getWheatInStore() < acresToPlant / 2) {
             throw new CropException("You don't have enough wheat.");
        }
        
        // wheatInStore = wheatInStore – (acresToPlant / 2)
        cropData.setWheatInStore(cropData.getWheatInStore() - acresToPlant / 2);
        // return wheatInStore
        return cropData.getWheatInStore();
    }

}
