/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Model.*;
import java.util.Scanner;
import cityOfAaron.FindTheGold;
import Control.*;
import java.io.*;


// The MainMenuViewclass -part of the view layer
// Object of this class manages the main menu
// @author Marshall Evans, Kelsey Haddow
// Date last modified: May 2018

public class MainMenuView extends View{
    
Scanner keyboard = new Scanner(System.in); 
private String theMenu;
private int max;
public String menu= "+\n" +
"\"********************************** +\n" +
"\"* Find The Gold: MAIN GAME MENU * +\n" +
"\"********************************** +\n" +
"\" 1 -Start new game +\n" +
"\" 2 -Get and start a saved game +\n" +
"\" 3 -Get help on playing the game +\n" +
"\" 4 -Save game+\n" +
"\" 5 -Quit\n" ;

public MainMenuView(){
 
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
//    System.out.println(theMenu);
//// Prompt the user and get the user’s input
//    menuOption= getMenuOption();
//// Perform the desired 
//    doAction(menuOption);
//// Determine and display the next view
//} while (menuOption!= max);
//}
/**
* The getMenuOptionmethod
* Purpose: gets the user's input
* Parameters: none
* Returns: integer -the option selected
*/
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
@Override public boolean doAction(String option)
{
switch (option)
{
case "1": // create and start a new game
startNewGame();
break;
case "2": // get and start a saved game
startSavedGame();
break;
case "3": // get help menu
displayHelpMenuView();
break;
case "4": // save game
displaySaveGameView();
break;
case "5":

System.out.println("Thanks for playing ... goodbye.");
case "Q": return true;
default: System.out.println ("Correct Option");
}
return false;
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
// Show banner page 
System.out.println(
"********************************************************\n" + 
"* Welcome to the City of Aaron. You have been summoned *\n" +
"* by the High Priest to assume your role as ruler of *\n" +
"* the city. Your responsibility is to buy land, sell *\n" +
"* land, determine how much wheat to plant each year, *\n" + 
"* and how much to set aside to feed the people. You *\n" + 
"* will also be required to pay an annual tithe on the *\n" +
"* that is harvested. If you fail to provide *\n" +
"* enough wheat for the people to eat, people will die *\n" +
"* and your workforce will be diminished. Plan very *\n" +
"* carefully or you may find yourself in trouble with *\n" +
"* the people. And oh, watch out for plagues and rats! *\n" + 
"********************************************************\n");

 // Get player name, create player object, and save it in the Game
String name;
System.out.println("Please type in your first name: "); name = keyboard.next();
// welcome message
System.out.println("Welcome " + name + ", have fun playing.");
// call the createNewGame( ) method. Pass the name as a parameter
GameControl.createNewGame(name);
//show the game menu
GameMenu gmv = new GameMenu();
gmv.displayMenuView();
}


////Create a new Game object.
//Game theGame= new Game();
//// Save a reference to it in the GameProjectclass.
//FindTheGold.setTheGame(theGame);
//// Display the Banner Page.
//System.out.println("Welcome to the city of Aaron.");
//// Create a new Player object
//Player thePlayer= new Player();
//// Prompt for and get the user’s name.
//String name;
//System.out.println("Please type in your first name: ");
//name = keyboard.next();
//// Save the user’s name in the Player object
//thePlayer.setPlayer(name);
//// Save a reference to the player object in the Game object
//theGame.setThePlayer(thePlayer);
//// Display a welcome message
//System.out.println("Welcome " + name + "1"
//        + " have fun!");
//// Display the Game menu
//// Create a CropData object,
//CropData CropData = new CropData();
//// initialize it
//CropData.setYear(0); 
//CropData.setPopulation(100); 
//CropData.setNewPeople(5); 
//CropData.setCropYield(3); 
//CropData.setNumberWhoDied(0); 
//CropData.setOffering(10); 
//CropData.setWheatInStore(2700); 
//CropData.setAcresOwned(1000); 
//CropData.setAcresPlanted(1000);
//CropData.setHarvest(3000); 
//CropData.setOfferingBushels(300); 
//CropData.setAcresPlanted(1000);
//// save a reference to it in the Game
//theGame.setCropData(CropData);
//}

public void startSavedGame()
{
    // dummy nextLine() read \n character left in the stream
  keyboard.nextLine();
  String filePath;
  System.out.println("Enter your save game file name: ");
  filePath= keyboard.next();
  GameControl.getSavedGame(filePath);
  displayGameMenuView();
}

public void displaySaveGameView()
{
  GameControl.saveGame();
  System.out.println("Note the name of your character, it will be your save game file name!");
}

public void displayHelpMenuView(){
  helpMenu hmv = new helpMenu();
   hmv.display(hmv.getHelpMenu());}



public void displayGameMenuView(){
        GameMenu gmv = new GameMenu();
   gmv.display(gmv.getGameMenu());}

public void displaylistMenuView(){
    listMenuView lmv = new listMenuView();
lmv.display (lmv.getListMenuView());
}

}
