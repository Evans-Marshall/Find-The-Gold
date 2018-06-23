/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.CropData;
import java.util.Scanner;
import cityOfAaron.FindTheGold;
import Model.Player;
import Model.Game;
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
" 3 -Move to a new location\n" +
" 4 -Manage the Crops\n" +
" 5 -Return to Main Menu\n";
max = 5;
}
  /**
* The displayMenuViewmethod
* Purpose: displays the menu, gets the user's input, and does the
* selected action
* Parameters: none
* Returns: none
*/
//public void displayMenuView()
//{
//int menuOption;
//do
//{
//// Display the menu
//    System.out.println(GameMenu);
//// Prompt the user and get the user’s input
//    menuOption= getMenuOption();
//// Perform the desired 
//    doAction(menuOption);
//// Determine and display the next view
//} while (menuOption!= max);
//}
///**
//* The getMenuOptionmethod
//* Purpose: gets the user's input
//* Parameters: none
//* Returns: integer -the option selected
//*/
// ===================================
//public int getMenuOption()
//{
//// declare a variable to hold user’s input
//    int userInput;
//// begin loop
//do
//{
//// get user input from the keyboard
//    userInput= keyboard.nextInt();
//// if it is not a valid value, output an error message
//    if (userInput< 1 || userInput> max)
//{
//    System.out.println("Option must be between 1 and " + max);
//}
//// loop back to the top if input was not valid
//}while(userInput< 1 || userInput> max);
//// return the value input by the user
//return userInput;
//}

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
System.out.println("this will display a map");
break;
case "2": // Print List
System.out.println("this will give you a list of your items");
break;
case "3": // move to a new location
System.out.println("this will move you to a new location");
break;
case "4": // manage crops
System.out.println("this will help you manage your crops.");
break;
case "5":// return to main menu
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

}

