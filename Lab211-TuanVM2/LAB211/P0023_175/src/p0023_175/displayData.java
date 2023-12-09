/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0023_175;

import java.util.ArrayList;

/**
 *
 * @author Nam Ast
 */
public class displayData {
     
    public static void displayMenu()
    {
        int x ; 
        System.out.println("FRUIT SHOP SYSTEM ");
        System.out.println("1. Create Fruit");
        System.out.println("2. View orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
    }
     //display list fruit in shop
    static void displayListFruit(ArrayList<Fruit> lf) {
        int countItem = 1;
        System.out.printf("%-10s%-20s%-20s%-15s\n", "Item", "Fruit name", "Origin", "Price");
        for (Fruit fruit : lf) {
            //check shop have item or not 
            if (fruit.getQuantity() != 0) {
                System.out.printf("%-10d%-20s%-20s%-15.0f$\n", countItem++,
                        fruit.getName(), fruit.getOrigin(), fruit.getPrice());
            }
        }
    }
}
