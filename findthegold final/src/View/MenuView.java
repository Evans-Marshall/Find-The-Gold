/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
* The MenuView class – base abstract class for all menu views * Author: Conan Doyle
* Date last modified: March 2018
*/
package View;
import java.util.Scanner;

        public abstract class MenuView extends View {
        
/**
* MenuView Constructor
* Purpose: Initialize the view object with the menu string * Parameters: the menu string and the max value
* Returns: none
*/
   protected int max; // this int holds the max input value
    // the data members common to all menu views
    protected final static Scanner keyboard = new Scanner(System.in);
    protected String menu; // this string holds the menu string protected int max; // this int holds the max input value
 
public MenuView(String _menu, int _max){

    
    this.menu = _menu;
    this.max = _max; }
        }
/**
* The displayMenu method
* Purpose: displays the menu, gets the user's input, and does the * selected action
* Parameters: none
* Returns: none
Add @Override */
//@Override public void displayMenu(){
//    // execute this loop as long as the selected option is not max int menuOption = 0;
//        do{
//// display the menu 
//   System.out.println(menu);
//// get the user's selection 
//menuOption = getMenuOption();
//// perform the selected action
//doAction(menuOption);
//} 
//while (menuOption != max);
//
//}
///**
//* The getUserInput method
//* Purpose: gets user input, makes sure it is within range * Parameters: none
//* Returns: the user input, between 1 and maxValue
//*/
//@Override public int getMenuOption(){
//int inputValue = 0; do{
//    System.out.format("Please enter an option(1 - %d):", max);
//     
//    inputValue = keyboard.nextInt();
//       if (inputValue < 1 || inputValue > max){
//    System.out.format("Error: input value must be between 1 and %d.", max); }
//     
//    while (inputValue < 1 || inputValue > max);
//    return inputValue; }
//        }
    

/**
 *
 * @author khaddow
 */

    

