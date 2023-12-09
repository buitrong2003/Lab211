/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p105;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nam Ast
 */
public class SearchData {
    
    static int searchStorekeeper_ID(int eID, List<Storekeeper> list) {
        //Eliminate the case where the list is empty
        if (list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                if (eID == list.get(i).getId()) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    static int searchProduct_ID(int eID, List<Product> list) {
        //Eliminate the case where the list is empty
        if (list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                if (eID == list.get(i).getId()) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    static void searchByName(List<Product> list) {
        //name : all character from a to z and A to Z ;
        String name = GetData.getString("Enter Name: ", "[a-zA-Z]+");
        List<Product> listResult = new ArrayList<Product>();
        for (Product i : list) {
            if (i.getName().equalsIgnoreCase(name)) {
                listResult.add(i);
            }
        }
        if (listResult.isEmpty()) {
            System.out.println("Empty!");
        } else {
            DisplayData.displayProductList(listResult);
        }
        
    }
    
    static void searchByCategory(List<Product> list) {
        //Category: all character from a to z and A to Z
        String Category = GetData.getString("Enter Category: ", "[a-zA-Z]+");
        List<Product> listResult = new ArrayList<Product>();
        for (Product i : list) {
            if (i.getCategory().equalsIgnoreCase(Category)) {
                listResult.add(i);
            }
        }
        if (listResult.isEmpty()) {
            System.out.println("Empty!");
        } else {
            DisplayData.displayProductList(listResult);
        }
    }
    
    static void searchByStorekeeper(List<Product> list) {
        //NameStorekeeper : All character begin lowercase to uppercase from a to z .
        String nameS = GetData.getString("Enter Name Storekeeper:", "[a-zA-Z]+");
        List<Product> listResult = new ArrayList<Product>();
        for (Product i : list) {
            if (i.getStorekeeper().getName().equalsIgnoreCase(nameS)) {
                listResult.add(i);
            }
        }
        if (listResult.isEmpty()) {
            System.out.println("Empty!");
        } else {
            DisplayData.displayProductList(listResult);
        }
        
    }
    
    static void searchByReceipDate(List<Product> list) {
        //Receipt date must after Date of Manufacture : dd/MM/yyyy
        Date ReceiptDate = GetData.getDate("Enter Receip Date:", "dd/MM/yyyy");
        List<Product> listResult = new ArrayList<Product>();
        for (Product i : list) {
            if (i.getReceiptDate().equals(ReceiptDate)) {
                listResult.add(i);
            }
        }
        if (listResult.isEmpty()) {
            System.out.println("Empty!");
        } else {
            DisplayData.displayProductList(listResult);
        }
    }
}
