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
 * @author khaddow/,arshall evans
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
}
