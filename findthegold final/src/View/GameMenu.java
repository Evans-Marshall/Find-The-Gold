/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.CropData;
import java.util.Scanner;
import cityOfAaron.FindTheGold;
import Model.*;
import Control.*;
import Exceptions.*;

/**
 *
 * @author khaddow
 */
public class GameMenu extends View{
    Scanner keyboard = new Scanner(System.in); 
    private String GameMenu;
private int max;

public GameMenu()
{
GameMenu= "\n" +
"**********************************\n" +
"* Find The Gold: GAME MENU *\n" +
"**********************************\n" +
" 1 -View the Map\n" +
" 2 -View/Print a list\n" +
" 3 -Sell Land\n" + // Move to a new location
" 4 -Manage the Crops\n" +
" 5 -Move Location\n" +
" 6 -Return to Main Menu\n";
max = 5;
}
  /**
* The displayMenuViewmethod
* Purpose: displays the menu, gets the user's input, and does the
* selected action
* Parameters: none
* Returns: none
*/
public void displayMenuView()
{
int menuOption;
do
{
 //Display the menu
    System.out.println(GameMenu);
 //Prompt the user and get the user’s input
    menuOption= getMenuOption();
// Perform the desired 
    doAction(Integer.toString(menuOption));
//// Determine and display the next view
} while (menuOption!= max);
}
///**
//* The getMenuOptionmethod
//* Purpose: gets the user's input
//* Parameters: none
//* Returns: integer -the option selected
//*/
// ===================================
public int getMenuOption()
{
// declare a variable to hold user’s input
    int userInput;
// begin loop
do
{
// get user input from the keyboard
    userInput= keyboard.nextInt();
// if it is not a valid value, output an error message
    if (userInput< 1 || userInput> max)
{
    System.out.println("Option must be between 1 and " + max);
}
// loop back to the top if input was not valid
}while(userInput< 1 || userInput> max);
// return the value input by the user
return userInput;
}

/**
*The doActionmethod
* Purpose: performs the selected action
* Parameters: none 
* Returns: none
*/
// ===================================
public boolean doAction(String option)
{
switch (option)
{
case "1": // View Map
    displayMap(); 
break;
case "2": // Print List
    displaylistMenuView();
break;
case "3": // Sell Land
    try {
        CropData theCropData = FindTheGold.getTheGame().getCropData();
        CropControl.sellLand(10, -1, theCropData);
    }
    catch (CropException ce){
        System.out.println(ce.getMessage());         
    }
break;
case "4": // Crop Report 
        System.out.println (" hey check out your crops");
         CropView cropView = new CropView();
         cropView.cropManagementView();
         
 break;
case "5": //move to new location
     
displayMap();
        
   
break;
case "6":// return to main menu
    displayMainMenuView();

case "Q": return true;
default: System.out.println ("Correct Option");
}
return false;

}

public void displayMainMenuView()
{
System.out.println("Load saved game option selected.");
}

    public Scanner getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public String getGameMenu() {
        return GameMenu;
    }

    public void setGameMenu(String GameMenu) {
        this.GameMenu = GameMenu;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public void displayMap(){
       Map theMap = Control.GameControl.createMap();
       int MAX_ROW = 5; 
       int MAX_COL = 5;
       String output="";
       
        for(int i = 0; i < MAX_ROW; i++){
            for(int x = 0; x < MAX_COL; x++){
                Location printLoc = theMap.getLocation(i, x);
                if(x == 4){
                   output += "\t" + printLoc.getSymbol() + "\n";
                }
                else{
                    output += "\t" + printLoc.getSymbol();
                }
            }
        }
        System.out.println(output);
        System.out.println("Key:\n"
                + "<> = Rulers Court\n"
                + "!! = Granary\n"
                + "@@ = Village\n"
                + "tt = Desert\n"
                + "oo = Undeveloped Land\n"
                + "| = Border with Lamanites\n"
                + "! = Wheat Field\n"
                + "~~ = River");

    }


    public void displaylistMenuView(){
    listMenuView lmv = new listMenuView();
lmv.display (lmv.getListMenuView());
}
   


}
