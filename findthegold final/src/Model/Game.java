/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
import Model.Player;
import java.util.ArrayList;
/**
 *
 * @author khaddow
 */
import java.util.Objects;/**
 *
 * @author khaddow
 */
public class Game implements Serializable{
    private Player thePlayer;
    private CropData cropData = null;
    private Map theMap;
    public static ArrayList<ListItem> animals;
    public static ArrayList<ListItem> tools;
    public static ArrayList<ListItem> provisions;
    public static ArrayList<ListItem> team;

    public Game() {
    }

 
    public Player getThePlayer() {
        return thePlayer;
    }

    public void setPlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }
   

  private CropData theCropData = null;
  
  /**
* the getCrops() method
* Purpose: get a reference to the crop object * Parameters: none
* Returns: a reference to a crop object
*/
public CropData getCropData()
{
return theCropData;
}
/**
* the setCrops() method
* Purpose: store a reference to a crop object * Parameters: a reference to a crop object
* Returns: none
*/
public void setCropData(CropData cropRef)
{
theCropData = cropRef;
}
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.thePlayer);
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "thePlayer=" + thePlayer + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.thePlayer, other.thePlayer)) {
            return false;
        }
        return true;
    }

    public ArrayList<ListItem> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<ListItem> animals) {
        this.animals = animals;
    }

    public ArrayList<ListItem> getTools() {
        return tools;
    }

    public void setTools(ArrayList<ListItem> tools) {
        this.tools = tools;
    }

    public ArrayList<ListItem> getProvisions() {
        return provisions;
    }

    public void setProvisions(ArrayList<ListItem> provisions) {
        this.provisions = provisions;
    }

    public ArrayList<ListItem> getTeam() {
        return team;
    }

    public void setTeam(ArrayList<ListItem> team) {
        this.team = team;
    }
    
}
