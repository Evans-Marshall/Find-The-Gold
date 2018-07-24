/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
/**
 *
 * @author khaddow
 */
import java.util.Objects;/**
 *
 * @author khaddow
 */
public class Player implements Serializable{
    private String Player;

    public Player() {
        //this.playerRow = 0;
    }

    
    
    public String getPlayerName() {
        return Player;
    }

    public void setPlayerName(String Player) {
        this.Player = Player;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.Player);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "Player=" + Player + '}';
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
        final Player other = (Player) obj;
        if (!Objects.equals(this.Player, other.Player)) {
            return false;
        }
        return true;
    }
    
   
 //   public static int playerRow = 0{
    
//}

 
    //public static static int playerCol = 2  {
    
//}

//public int getPlayerRow() {
//        return playerRow;
//    }
//
//    public void setPlayerRow(int playerRow) {
//        this.playerRow = playerRow;
//    }
//
//    public int getPlayerCol() {
//        return playerCol;
//    }
//
//    public void setPlayerCol(int playerCol) {
//        this.playerCol = playerCol;
//    }
//    
}



    

   
