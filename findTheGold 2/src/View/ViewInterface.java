/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author khaddow
 */
public interface ViewInterface {
    public void display(String menu); 
    public String getMenuOption(String menu); 
    public boolean doAction(String menu);
    
}
