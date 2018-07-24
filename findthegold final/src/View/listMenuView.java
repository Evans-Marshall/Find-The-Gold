/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.util.Scanner;
import cityOfAaron.FindTheGold;
import Model.*;
import Control.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
/**
 *
 * @author khaddow
 */
public class listMenuView extends View{
    Scanner keyboard = new Scanner(System.in); 
    private String listMenuView;
private int max;
public listMenuView()
{
listMenuView= "\n" +
"**********************************\n" +
"* Find The Gold: LIST MENU *\n" +
"**********************************\n" +
" 1 -List or view the animals in the storehouse\n" +
" 2 -List or view the tools in the storehouse\n" +
" 3 -Print or view the provisions in the storehouse\n" +
" 4 -List or view the authors of this game\n"+
" 5 -Return to Game Menu\n";
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
//    System.out.println("Option must be between 1 and " + m
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
listAnimals();
break;
case "2": // Print List
listTools();
break;
case "3": // View provisions
listProvisions();
break;
case "4": // View team
listTeam();
break;
case "5":// return to main menu
displayMainMenuView();
case "Q": return true;
default: System.out.println ("Correct Option");
}
return false;
}



public void listAnimals(){
    
    for ( int i = 0; i < Game.animals.size(); i++)
        System.out.println(Game.animals.get(i).getName() + " " + Game.animals.get(i).getNumber());
}

public void listTools(){
    
    for ( int i = 0; i < Game.tools.size(); i++)
        System.out.println(Game.tools.get(i).getName() + " " + Game.tools.get(i).getNumber());
}



//This is in ListMenuView

public void listProvisions() {
        GameControl theGameControl = new GameControl();
        
        keyboard.nextLine();
        System.out.println("Would you like to display or save the list");
        System.out.println("Enter 1 to display the list or enter any key to save the list");
        String saveOrDisplay = keyboard.next();
        
        if (saveOrDisplay.equals("1")) {
            for ( int i = 0; i < Game.provisions.size(); i++)
        System.out.println(Game.provisions.get(i).getName() + " " + Game.provisions.get(i).getNumber());
        } else {
            System.out.println("Please enter the file path.");
            keyboard.nextLine();
            String filePath = keyboard.nextLine();
            theGameControl.saveProvisionList(filePath);
        }
    }


public void listTeam(){
    
    for ( int i = 0; i < Game.team.size(); i++)
        System.out.println(Game.team.get(i).getName());
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
    public String getListMenuView() {
        return listMenuView;
    }
    public void setListMenuView(String listMenuView) {
        this.listMenuView = listMenuView;
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }
}





