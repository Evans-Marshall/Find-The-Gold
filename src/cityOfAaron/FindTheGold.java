/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
/*
* The main() class file for the cityOfAaron project * CIT-260
* Spring 2018
* Team members: Marshall Evanas, Kelsey Haddow */
package cityOfAaron; 
import View.*;
import Model.Game;


/**
 *
 * @author khaddow
 */
public class FindTheGold {

    // variable for keeping a reference to the Game object
    private static Game theGame= null;
    // main function -entry point for the program
    // runs the main menu
    public static void main(String[] args) 
    {
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();
    }

    public static Game getTheGame() {
        return theGame;
    }

    public static void setTheGame(Game theGame) 
    {
        FindTheGold.theGame = theGame;
    }   
}
