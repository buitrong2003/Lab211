/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p105;

import java.util.List;

/**
 *
 * @author Nam Ast
 */
public class DisplayData {

    static void displayMenu() {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Main menu: ");
        System.out.println("\t1. Add Storekeeper");
        System.out.println("\t2. Add product");
        System.out.println("\t3. Update product");
        System.out.println("\t4. Search product by Name, Category, Storekeeper, ReceiptDate");
        System.out.println("\t5. Sort product by Expiry date, Date of manufacture");
    }

    static void displayStorekepperList(List<Storekeeper> listS) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("List of Storekepper:");
        System.out.println("ID\tName");
        for (Storekeeper i : listS) {
            System.out.println(i.getId() + "\t" + i.getName());
        }

    }

    static void displayProductList(List<Product> list) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("List of Product:");
        System.out.println("id\tName\tLocation\tCategory\tPrice\tExpirydate\tDateofManufacture\tReceiptDate\tStorekeeper ");
        for (Product i : list) {
            System.out.println(i.toString());
        }

    }

    static void displaySearchMenu() {
        //Search product by Name, Category, Storekeeper, ReceiptDate
        System.out.println("Search Product by: ");
        System.out.println("\t1. By Name.");
        System.out.println("\t2. By Category.");
        System.out.println("\t3. By Storekeeper.");
        System.out.println("\t4. By ReceiptDate.");
    }

    static void displaySortMenu() {
        System.out.println("Sort Product List by: ");
        System.out.println("\t1.Expiry date");
        System.out.println("\t2.Date of manufacture");
    }

}
