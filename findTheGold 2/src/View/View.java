/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.Scanner;

/**
 *
 * @author khaddow
 */
public abstract class View implements ViewInterface {

    @Override
    public void display(String menu) {
        boolean endOfView = false;
        do {
            String inputs = getMenuOption(menu);
            if (inputs.length() < 1 || inputs.toUpperCase().equals("Q")) {
                endOfView = true;
                continue;
            }
            endOfView = doAction(inputs);
        } while (endOfView != true);
    }

    @Override
    public String getMenuOption(String menu) {
        String inputs = "";
        System.out.println(menu);
        boolean valid = false;
        while (valid == false) {
            Scanner scanner = new Scanner(System.in);
            inputs = scanner.nextLine().trim();
            if (inputs.length() < 1) {
                System.out.println("You must enter a non-blank value");
            }
            valid = true;
        }
        return inputs;
    }
}
