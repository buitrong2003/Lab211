/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0023;

import java.util.ArrayList;

/**
 *
 * @author Nam Ast
 */
public class displayData {

    static void displayFruit(ArrayList<Fruit> FruitList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("List of Fruit: ");        
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |");
        for(Fruit i : FruitList)
        {
            System.out.println(i.toString());
        }
    }
    static void displayFruitOrder(ArrayList<Fruit> FruitList) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("List of Fruit: ");        
        System.out.println("Product | Quantity | Price | Amount");
        Double sum = 0.0 ;
        for(Fruit i : FruitList)
        {
            System.out.println(i.getId()+"\t"+i.getQuantity()+"\t"+i.getPrice()+"$\t"+i.getQuantity()*i.getPrice());
            sum += i.getQuantity()*i.getPrice() ;
        }
        System.out.println("Total: "+sum+"$");
    }
    
}
