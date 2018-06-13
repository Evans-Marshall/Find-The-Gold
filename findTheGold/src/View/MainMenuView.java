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

// The MainMenuViewclass -part of the view layer
// Object of this class manages the main menu
// @author Marshall Evans, Kelsey Haddow
// Date last modified: May 2018

public class MainMenuView {
    
Scanner keyboard = new Scanner(System.in); 
private String theMenu;
private int max;

public MainMenuView()
{
theMenu= "\n" +
"**********************************\n" +
"* Find The Gold: MAIN GAME MENU *\n" +
"**********************************\n" +
" 1 -Start new game\n" +
" 2 -Get and start a saved game\n" +
" 3 -Get help on playing the game\n" +
" 4 -Save game\n" +
" 5 -Quit\n";
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
// Display the menu
    System.out.println(theMenu);
// Prompt the user and get the user’s input
    menuOption= getMenuOption();
// Perform the desired 
    doAction(menuOption);
// Determine and display the next view
} while (menuOption!= max);
}
/**
* The getMenuOptionmethod
* Purpose: gets the user's input
* Parameters: none
* Returns: integer -the option selected
*/
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
public void doAction(int option)
{
switch (option)
{
case 1: // create and start a new game
startNewGame();
break;
case 2: // get and start a saved game
startSavedGame();
break;
case 3: // get help menu
displayHelpMenuView();
break;
case 4: // save game
displaySaveGameView();
break;
case 5:
System.out.println("Thanks for playing ... goodbye.");
}
}

/**
* The startNewGamemethod
* Purpose: creates game object and starts the game
* Parameters: none
* Returns: none
*/
// ===================================
public void startNewGame()
{
//Create a new Game object.
Game theGame= new Game();
// Save a reference to it in the GameProjectclass.
FindTheGold.setTheGame(theGame);
// Display the Banner Page.
System.out.println("Welcome to the city of Aaron.");
// Create a new Player object
Player thePlayer= new Player();
// Prompt for and get the user’s name.
String name;
System.out.println("Please type in your first name: ");
name = keyboard.next();
// Save the user’s name in the Player object
thePlayer.setPlayer(name);
// Save a reference to the player object in the Game object
theGame.setThePlayer(thePlayer);
// Display a welcome message
System.out.println("Welcome " + name + "1"
        + " have fun!");
// Display the Game menu
// Create a CropData object,
CropData CropData = new CropData();
// initialize it
CropData.setYear(0); 
CropData.setPopulation(100); 
CropData.setNewPeople(5); 
CropData.setCropYield(3); 
CropData.setNumberWhoDied(0); 
CropData.setOffering(10); 
CropData.setWheatInStore(2700); 
CropData.setAcresOwned(1000); 
CropData.setAcresPlanted(1000);
CropData.setHarvest(3000); 
CropData.setOfferingBushels(300); 
CropData.setAcresPlanted(1000);
// save a reference to it in the Game
theGame.setCropData(CropData);
}

public void startSavedGame()
{
System.out.println("Load saved game option selected.");
}

public void displayHelpMenuView()
{
System.out.println("Display Help Menu option selected.");
}

public void displayOtherMenusView()
{
System.out.println("Display Other Menus option selected");
}
public void displaySaveGameView()
{
System.out.println("Display Save Game View option selected.");
}


}
