/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0023;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author Nam Ast
 */
public class P0023 {
    public static Hashtable<String , List<Fruit>>  listOrder = new Hashtable<String , List<Fruit>>  () ;
    public static List<Fruit> FruitList  = new ArrayList<Fruit> () ;
    
    public static void main(String[] args) {
     
        while (true)
        {
    //1. Display Menu            
          Manager.displayMenu();
          //Get user choice digit from 1 to 4 
          int op = getData.getUserChoice() ;
    //2. Do user's choice
        //2.1  For Fruit Shop owner 
        switch (op)
        {
            //Create a product (Fruit) ( user type : 1 ) 
            case 1: 
                 Manager.addNewFruit() ;           
                break;
            //View all orders ( user type : 2 ) 
            case 2: 
                Manager.viewOrders();
                break;
        //2.2 Shopping ( user type : 3 ) 
            case 3: 
                Manager.Shopping();
                break;

        }
        //2.3 Exit system ( user type : 4 ) 
        if (op == 4 ) break ; 
        }
    }
    
}
