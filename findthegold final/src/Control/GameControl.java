/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import cityOfAaron.FindTheGold;
import Model.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author khaddow
 */
public class GameControl {
    // size of the Locations array

    public static final int MAX_ROW = 5;
    public static final int MAX_COL = 5;
// reference to a Game object
    public static Game theGame;

    public static void createNewGame(String name) {
// Created the game object. 
        //Create the Game object, save it in the main driver file
        theGame = new Game();
        FindTheGold.setCurrentGame(theGame);

// create the player object. Save it in the game object
// create the CropData object
// create the player object. Save it in the game object
        Player thePlayer = new Player();
        thePlayer.setPlayerName(name);
        theGame.setPlayer(thePlayer);
        createCropDataObject();
        createMap();
        createAnimalList();
        createToolList();
        createProvisionList();
        createTeamList();
    }

// create the list of animals 
// create the list of tools 
//create the list of provisions
// create the Locations and the Map object
    public static void createCropDataObject() {
        CropData theCrops = new CropData();
        theCrops.setYear(200);
        theCrops.setPopulation(100);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumberWhoDied(0);
        theCrops.setOffering(10);
        theCrops.setWheatInStore(2700);
        theCrops.setAcresOwned(1000);
        theCrops.setAcresPlanted(1000);
        theCrops.setHarvest(3000);
        theCrops.setOfferingBushels(300);
        theCrops.setAcresPlanted(1000);
// Save the cropData in the Game object
        theGame.setCropData(theCrops);
    }

//    public static void createAnimalList() 
//    {
//        ArrayList<ListItem> animals = new ArrayList<ListItem>();
//        animals.add(new ListItem("cows", 12));
//        animals.add(new ListItem("horses", 3));
//        animals.add(new ListItem("pigs", 7));
//        animals.add(new ListItem("goats", 4));
//// Save the animals in the game
//        theGame.setAnimals(animals);
//    }
//createToolList(); 
//createProvisionList();
    public static Map createMap() {
        // create the Map object,
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);

// define the string for the Ruler's Court location
        // set a court location with a hint
        // create a new Location object
        Location loc02 = new Location();
        // define the string for the Ruler's Court location
        loc02.setDescription("\nThis is where I get to sit.");
        loc02.setSymbol("<>");
        theMap.setLocation(0, 2, loc02);
        // Create granary location
        Location loc12 = new Location();
        loc12.setDescription("\nKeep grain here. Watch out for rats.");
        loc12.setSymbol("!!");
        theMap.setLocation(1, 2, loc12);
        // Create village location
        Location loc22 = new Location();
        loc22.setDescription("\nWe all live here.");
        loc22.setSymbol("@@");
        theMap.setLocation(2, 2, loc22);

        Location loc32 = new Location();
        loc32.setDescription("\nNeeds irrigation.");
        loc32.setSymbol("tt");
        theMap.setLocation(3, 2, loc32);

        Location loc42 = new Location();
        loc42.setDescription("\nNeeds irrigation.");
        loc42.setSymbol("tt");
        theMap.setLocation(4, 2, loc42);

        for (int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location locUn = new Location();
            // define the string for the Ruler's Court location
            locUn.setDescription("\nUndeveloped land.");
            locUn.setSymbol("oo");
            theMap.setLocation(i, 1, locUn);
        }

        for (int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location locBorder = new Location();
            // define the string for the Ruler's Court location
            locBorder.setDescription("\nLamanaites ahead. Keep out.");
            locBorder.setSymbol("|");
            theMap.setLocation(i, 0, locBorder);
        }

        for (int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location locWheat = new Location();
            // define the string for the Ruler's Court location
            locWheat.setDescription("\nGrow food here.");
            locWheat.setSymbol("!");
            theMap.setLocation(i, 3, locWheat);
        }

        for (int i = 0; i < MAX_ROW; i++) {
            // create a new Location object
            Location locRiver = new Location();
            // define the string for the Ruler's Court location
            locRiver.setDescription("\nNo swimming. Pihrannas.");
            locRiver.setSymbol("~~");
            theMap.setLocation(i, 4, locRiver);
        }
        return theMap;
    }

    public static void createToolList() {
        ArrayList<ListItem> tools = new ArrayList<ListItem>();

        tools.add(new ListItem("seed bag", 2));
        tools.add(new ListItem("plow" , 3));
        tools.add(new ListItem("rake", 4 ));
        tools.add(new ListItem("sickle", 6));
// Save the tools in the game
        theGame.setTools(tools);
    }

    public static void createAnimalList() {
        ArrayList<ListItem> animals = new ArrayList<ListItem>();
        animals.add(new ListItem("cows", 12));
        animals.add(new ListItem("horses", 3));
        animals.add(new ListItem("pigs", 7));
        animals.add(new ListItem("goats", 4));
// Save the animals in the game
        theGame.setAnimals(animals);
    }

    public static void createProvisionList() {
        ArrayList<ListItem> provisions = new ArrayList<ListItem>();
        provisions.add(new ListItem("water", 20));
        provisions.add(new ListItem("food", 20));
        provisions.add(new ListItem("knife", 5));
        provisions.add(new ListItem("bedroll", 5));
// Save the animals in the game
        theGame.setProvisions(provisions);
    }
    


public void displayProvisionList() {
        for (ListItem provision : theGame.getProvisions()) {
             {
                System.out.println(provision.getName() + ": " + provision.getNumber());
            }   
        }  
    }

public void saveProvisionList(String filePath) {
        try (PrintWriter out = new PrintWriter(filePath)) {
                out.println("\n\n Provision List Report");
                out.printf("%n%-20s%10s", "Provision Type", "Quantity");
                out.printf("%n%-20s%10s", "___________", "________");
                
            // Print provision type and quantity    
            for (ListItem provision: theGame.getProvisions()) {
                out.printf("%n%-20s%7d",provision.getName(), provision.getNumber());
        }
            }
            catch(Exception e) {
                System.out.println("There was an error saving the list\n");
            }
    } 

    public static void createTeamList() {
        ArrayList<ListItem> team = new ArrayList<ListItem>();
        team.add(new ListItem("Kelsey Haddow", 1));
        team.add(new ListItem("Marshall Evans", 1));
// Save the animals in the game
        theGame.setTeam(team);
    }
    
 public static void getSavedGame(String filePath){
    Game theGame = null;
try (FileInputStream fips = new FileInputStream(filePath))
{
ObjectInputStream input = new ObjectInputStream(fips);
theGame = (Game) input.readObject();
FindTheGold.setCurrentGame(theGame);
}
catch(Exception e)
{
System.out.println("There was an error reading the saved game file\n");
}
}

 public static void saveGame()
 {
        try {
            FileOutputStream fops = new FileOutputStream(theGame.getThePlayer().getPlayerName());
            ObjectOutputStream objectOut = new ObjectOutputStream(fops);
            objectOut.writeObject(theGame);
        } catch (FileNotFoundException ex) {
            System.out.println("There was an error saving the game file.\n");
        } catch (IOException ex) {
            System.out.println("There was an error saving the game file.\n");
        }
 }
}
