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
public class GameMenu {
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
}