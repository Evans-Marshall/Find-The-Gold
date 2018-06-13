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
public class helpMenu {
    Scanner keyboard = new Scanner(System.in); 
    private String helpMenu;
private int max;

public helpMenu()
{
helpMenu= "\n" +
"**********************************\n" +
"* Find The Gold: GAME MENU *\n" +
"**********************************\n" +
" 1 -What are the goals of the game?\n" +
" 2 -Where is the city of Aaron?\n" +
" 3 -How do I view the map?\n" +
" 4 -How do I move to another location?\n" +
" 5 -How do I display a list of animals, provisions and tools in the city storehouse?\n" +
" 6 -Back to the Main Menu\n" ;
max = 6;
}
}
