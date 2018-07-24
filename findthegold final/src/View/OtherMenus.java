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
 * @author khaddow/,Marshall evans
 */
public class OtherMenus {
    Scanner keyboard = new Scanner(System.in); 
    private String OtherMenus;
private int max;

public OtherMenus()
{
OtherMenus= "\n" +
"**********************************\n" +
"* Find The Gold: GAME MENU *\n" +
"**********************************\n" +
" 1 -Crop Managment?\n" +
" 2 -Buy Land\n" +
" 3 -Sell Land\n" +
" 4 -Tithes\n" +
" 5 -Animals\n" +
" 6 -Back to the Main Menu\n" ;
max = 6;
}
public boolean doAction(String option)
{
switch (option)
{
case "1": // crop management
plantCrops();
break;
case "2": // buy land
buyLand();
break;
case "3": // sell land
sellLand();
break;
case "4": // tithes
payTithe();
break;
case "5": //animals
 listAnimals();   
case "6"://back to main menu
displayMainMenuView(); 
    

System.out.println("Thanks for playing ... goodbye.");
case "Q": return true;
default: System.out.println ("Correct Option");
}
return false;
}

    private void plantCrops() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void buyLand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void sellLand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void payTithe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void displayMainMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void listAnimals() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
