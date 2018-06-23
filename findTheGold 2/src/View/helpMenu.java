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
 * @author marhsall Evans
 */
public class helpMenu extends View {
Scanner keyboard = new Scanner(System.in); 
private String helpMenu;
private int max;

public helpMenu()
{
helpMenu= "\n" +
"**********************************\n" +
"* Find The Gold: HELP MENU *\n" +
"**********************************\n" +
" 1 -What are the goals of the game?\n" +
" 2 -Where is the city of Aaron?\n" +
" 3 -How do I view the map?\n" +
" 4 -How do I move to another location?\n" +
" 5 -How do I display a list of animals, provisions and tools in the city storehouse?\n" +
" 6 -Back to the Main Menu\n" ;
max = 6;
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
//    System.out.println(helpMenu);
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
//// ===================================
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
case "1": // display goals of game
System.out.println ("feed the people and grow crops and do a lot of other things");
break;
case "2": // tell them where the city of Aaron is
System.out.println ("within all of our hearts");
break;
case "3": // view map
System.out.println ("read your scriptures to find it");
break;
case "4": // moce to new location
System.out.println ("try walking");
break;
case "5": // list of what you own
System.out.println ("keep a ledger");
break;
case "6": // go back to main menu
    displayMainMenuView();

case "Q": return true;
default: System.out.println ("Correct Option");
}
return false;

}

public void displayMainMenuView()
{
System.out.println("Display Main Menu option selected.");
}

    public Scanner getKeyboard() {
        return keyboard;
    }

    public String getHelpMenu() {
        return helpMenu;
    }

    public int getMax() {
        return max;
    }

    public void setKeyboard(Scanner keyboard) {
        this.keyboard = keyboard;
    }

    public void setHelpMenu(String helpMenu) {
        this.helpMenu = helpMenu;
    }

    public void setMax(int max) {
        this.max = max;
    }



}
