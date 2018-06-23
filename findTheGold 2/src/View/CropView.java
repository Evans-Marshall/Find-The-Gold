/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Control.CropControl;
import Model.CropData;
import Model.*;
import Control.*;
import Control.feedThePeople;
import java.util.Scanner;
import cityOfAaron.FindTheGold;
/**
 *
 * @author khaddow/Marshall Evans
 */
public class CropView {
    // Create a Scanner object
private static Scanner keyboard = new Scanner(System.in);
private static Game theGame = FindTheGold.getTheGame();
private static CropData CropData = theGame.getCropData();
private static CropControl CropControl = new CropControl();
private static buyLand buyLand = new buyLand();
private static feedThePeople feedThePeople = new feedThePeople();
// Get references to the Game object and the CropData object
/**
* The runCropsView method()
* Purpose: runs the Hamurabi game * Parameters: none
* Returns: none
*/
public static void runCropsView()
{
}

//* The buyLandView method
//* Purpose: interface with the user input for buying land * Parameters: none
//* Returns: none

public static void buyLandView()
{ // Get the cost of land for this round.*/
    int price = CropControl.calcLandCost();
// Prompt the user to enter the number of acres to buy
System.out.format("Land is selling for %d bushels per acre.%n",price); System.out.print("How many acres of land do you wish to buy?");
// Get the user’s input and save it.
int toBuy;
toBuy = keyboard.nextInt();
// Call the buyLand( ) method in the control layer to buy the land
int acresOwned = buyLand.buyLand( price,toBuy, CropData);
System.out.println("You now own " + acresOwned + " acres.");
}
// call the buyLandView( ) method

// add calls to the other crop view methods
// as they are written
//public static void sellLandView ()

    //int price = CropControl.calcLandCost();
    
    //System.out.format ("Market value for land is %d bushels per acre.%n", price);  System.out.print ("How many acres of new land do you want sell?");
    
    //int toSell;
    
    //toSell = keyboard.nextInt();
    
    //sellLand (toSell, price, CropControl);


public static void feedPeopleView () { 
        
      
      
        
        System.out.format ("Population= ",+ CropData.population); System.out.print ("How many people do you want to feed?");
        System.out.format ("%d bushels to feed %d people"); System.out.print ("How many bushels will you use to feed the people?");
        
        int wheatForPeople;
        
        wheatForPeople = keyboard.nextInt ();
        
        int peopleFed = feedThePeople.wheatForPeople (wheatForPeople, CropData);
        
        
      }
       
        }