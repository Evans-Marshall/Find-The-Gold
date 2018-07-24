/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;
import Control.*;


/**
 *
 * @author yungm
 */
public class ListItem implements Serializable{
    
     private String name;
     private int number;

    public ListItem(String cows, int par) {
        name = cows;
        number = par;
        
    }
     
     

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + this.number;
        return hash;
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
        final ListItem other = (ListItem) obj;
        if (this.number != other.number) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

     public static void createAnimalList()
{
        ArrayList<ListItem> animals = new ArrayList<ListItem>();
        animals.add(new ListItem("cows", 12));
        animals.add(new ListItem("horses", 3));
        animals.add(new ListItem("pigs", 7));
        animals.add(new ListItem("goats", 4));
// Save the animals in the game
        Control.GameControl.theGame.setAnimals(animals);
    }
    @Override
    public String toString() {
        return "ListItem{" + "name=" + name + ", number=" + number + '}';
    }
    
    
    
    
     
     
    
}
