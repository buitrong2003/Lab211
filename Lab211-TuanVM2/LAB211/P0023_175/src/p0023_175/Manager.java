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
public class Manager {
//     static ArrayList<Fruit> FruitList = new ArrayList<>();
    //display menu
    //allow user create fruit
    static ArrayList<Fruit>  createFruit(ArrayList<Fruit> FruitList) {
        int id;
        String name, origin;
        Double price;
        int quantity;
        //Check list Fruit empty or not ---> get final id of Object in list 
        if (FruitList.isEmpty()) {
            id = 1;
        } else {
            id = FruitList.get(FruitList.size() - 1).getId() + 1;
        }
        //
        while (true) {
            //Fruit Name : all character from a-zA-Z
            name = getData.getString("Enter Fruit Name:", "[a-zA-Z]+");
            //Price : double number from 0.0 to Max value of double 
            price = getData.getDouble("Enter Fruit Price:", 0.1, Double.MAX_VALUE);
            //Quantity must larger 0 
            quantity = getData.getInt("Enter Fruit Quantity:", 1, Integer.MAX_VALUE);
            origin = getData.getString("Enter Fruit Origin:", "[a-zA-Z]+");
            FruitList.add(new Fruit(id, name, price, quantity, origin));
            String choose = getData.getString("Do you want to continue (Y/N)?", "[Y|N]");
            if (choose.equalsIgnoreCase("N")) {
                break;
            }
           
        }
        return FruitList;
    }

    //allow user show view order
    static void viewOrder(Hashtable<String, ArrayList<Order>> ht) {
        for (String name : ht.keySet()) {
            //Name have 3 parts : name + @ + Digit
            String[] nameCustomer = name.split("@");
            System.out.println("Customer: " + nameCustomer[0]);
            ArrayList<Order> lo = ht.get(name);
            displayListOrder(lo);
        }
    }

    //allow user buy items
    static Hashtable<String, ArrayList<Order>> shopping(ArrayList<Fruit> FruitList, Hashtable<String, ArrayList<Order>> ht) {

        //loop until user don't want to buy continue
        ArrayList<Order> lo = new ArrayList<>();
        while (true) {
            //check list empty user can't buy
            if (FruitList.isEmpty()) {
                System.err.println("No have item.");
                return ht ;
            }
            displayData.displayListFruit(FruitList);
            int item = getData.getInt("Choose a item ", 1, FruitList.size());
            Fruit fruit = getData.getFruitByItem(FruitList, item);
            if (fruit != null )
            {
            System.out.println("You selected : " + fruit.getName() );
            int quantity = getData.getInt("Enter quantity: ", 1, fruit.getQuantity());
            fruit.setQuantity(fruit.getQuantity() - quantity);
            //check item exist or not
            if (getData.getItem(lo, fruit.getId()) != -1) {
                updateOrder(lo, fruit.getId(), quantity);
            } else {
                lo.add(new Order(fruit.getId(), fruit.getName(),
                        quantity, fruit.getPrice()));
            }
            } else System.out.println("Don't have item.");
            String choose = getData.getString("Do you want to order now (Y/N)", "[Y|N]");
            if (choose.equalsIgnoreCase("Y")) {
                break;
            }
        }
        displayListOrder(lo);
        //Name : all character from a-z,A-Z
        String name = getData.getString("Input your name:", "[a-zA-Z]+");
        //All name of customer have 3 part : Name + @ +  digit of Order 
        name += "@" + lo.size();
        ht.put(name, lo);
        System.err.println("Add successfull");
        return ht ;
    }

    //display list order
    static void displayListOrder(ArrayList<Order> lo) {
        double total = 0;
        System.out.println("List of Fruit:"  );
        System.out.println("|+    Item    +||+ Fruit Name +||+   Origin   +||+    Price  +|"  );
        for (Order order : lo) {
            System.out.printf("%15s%15d%15.0f$%15.0f$\n", order.getFruitName(),
                    order.getQuantity(), order.getPrice(),
                    order.getPrice() * order.getQuantity());
            total += order.getPrice() * order.getQuantity();
        }
        System.out.println("Total: " + total);
    }

    //if order exist then update order
    static void updateOrder(ArrayList<Order> lo, int id, int quantity) {
        for (Order order : lo) {
            if (order.getFruitId() == id) {
                order.setQuantity(order.getQuantity() + quantity);
                return;
            }
        }
    }

}
