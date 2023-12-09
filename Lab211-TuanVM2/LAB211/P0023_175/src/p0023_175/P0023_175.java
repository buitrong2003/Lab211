/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0023_175;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 *
 * @author Nam Ast
 */
public class P0023_175 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Fruit> lf = new ArrayList<Fruit>();
        Hashtable<String, ArrayList<Order>> ht = new Hashtable<>();
        while (true) {
            //1. Display Menu            
            displayData.displayMenu();
            //Get user choice digit from 1 to 4 
            int choice = getData.getUserChoice();
            //2. Do user's choice
            //2.1  For Fruit Shop owner 
            switch (choice) {
                //Create a product (Fruit) ( user type : 1 ) 
                case 1:
                    lf = Manager.createFruit(lf);
                    break;
                //View all orders ( user type : 2 ) 
                case 2:
                    Manager.viewOrder(ht);
                    break;
                //2.2 Shopping ( user type : 3 ) 
                case 3:
                    ht = Manager.shopping(lf,ht);
                    break;

            }
            //2.3 Exit system ( user type : 4 ) 
            if (choice == 4) {
                break;
            }
        }
    }

}
