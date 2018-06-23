/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
import Model.Player;
/**
 *
 * @author khaddow
 */
import java.util.Objects;/**
 *
 * @author khaddow
 */
public class Game {
 private Player thePlayer;

    public Game() {
    }

 
    public Player getThePlayer() {
        return thePlayer;
    }

    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }

  private CropData CropData = null;
  
  /**
* the getCrops() method
* Purpose: get a reference to the crop object * Parameters: none
* Returns: a reference to a crop object
*/
public CropData getCropData()
{
return CropData;
}
/**
* the setCrops() method
* Purpose: store a reference to a crop object * Parameters: a reference to a crop object
* Returns: none
*/
public void setCropData(CropData cropRef)
{
CropData = cropRef;
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
}
