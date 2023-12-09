/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p105;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nam Ast
 */
public class Manager {

    static List<Storekeeper> addStorekeeper(List<Storekeeper> list) {
        int id, index = -1;
        //Input and Check duplicate id 
        do {
            id = GetData.getInteger("Enter ID Storekeeper: ", 0, Integer.MAX_VALUE);
            index = SearchData.searchStorekeeper_ID(id, list);
            if (index != -1) {
                System.out.println("Duplicate Id !");
            }
        } while (index != -1);
        //Name : All character begin lowercase to uppercase from a to z .
        String name = GetData.getString("Enter Name Storekeeper:", "[a-zA-Z]+");
        list.add(new Storekeeper(id, name));
        System.out.println("Add Success!");
        DisplayData.displayStorekepperList(list);
        return list;
    }

    static List<Product> addProduct(List<Product> list, List<Storekeeper> listS) {
        int id, index = -1;
        //Input and Check duplicate id 
        do {
            id = GetData.getInteger("Enter ID Product: ", 0, Integer.MAX_VALUE);
            index = SearchData.searchProduct_ID(id, list);
            if (index != -1) {
                System.out.println("Duplicate Id !");
            }
        } while (index != -1);
        //Name : All character begin lowercase to uppercase from a to z .
        String name = GetData.getString("Enter Name Product:", "[a-zA-Z]+");
        //location : all character from a to z ; A to Z and digit in 0 to 9 
        String location = GetData.getString("Enter Location: ", "[0-9a-zA-Z]+(,[.0-9a-zA-Z]+){1,3}");
        //Category: all character from a to z and A to Z
        String Category = GetData.getString("Enter Category: ", "[a-zA-Z]+");
        //Price : all digit from 0.0 to Max of double 
        Double price = GetData.getDouble("Enter Price: ", 0, Double.MAX_VALUE);

        Date DateofManufacture = GetData.getDate("Enter Date of Manufacture:", "dd/MM/yyyy");
        Date Expirydate = null;
        Boolean conditon = true;
        do {
            //Expiry date must after Date of Manufacture : dd/MM/yyyy
            Expirydate = GetData.getDate("Enter Expiry date:", "dd/MM/yyyy");
            conditon = !Expirydate.after(DateofManufacture);
            if (conditon) {
                System.out.println("Expiry date must after Date of Manufacture ");
            }
        } while (conditon);
        //Get Date today 
        Date today = new Date() ;
        Date ReceiptDate = null;
        //
        do {
            //Receipt date must after Date of Manufacture : dd/MM/yyyy
            ReceiptDate = GetData.getDate("Enter Receipt Date:", "dd/MM/yyyy");
            conditon = ((ReceiptDate.before(DateofManufacture))||(ReceiptDate.after(today)));
            //The date of receipt is not after the date of manufacture 
            if (conditon) {
                System.out.println("Expiry date must after Date of Manufacture  and before Today ");
            }
        } while (conditon);

        //add Storekeeper of Product 
        int idS, indexS = -1;
        DisplayData.displayStorekepperList(listS);
        //Input and Check duplicate id 
        do {
            idS = GetData.getInteger("Enter ID Storekeeper of Product: ", 0, Integer.MAX_VALUE);
            indexS = SearchData.searchStorekeeper_ID(idS, listS);
            if (indexS == -1) {
                System.out.println("Id Storekeeper must exist!");
            }
        } while (indexS == -1);

        list.add(new Product(id, name, location, price, DateofManufacture, Category, Expirydate, ReceiptDate, listS.get(indexS)));
        System.out.println("Add Success!");
        DisplayData.displayProductList(list);
        return list;
    }

    static List<Product> updateProduct(List<Product> list, List<Storekeeper> listS) {
        int id, index = -1;
        //Input and Check duplicate id 
        do {
            id = GetData.getInteger("Enter ID : ", 0, Integer.MAX_VALUE);
            index = SearchData.searchProduct_ID(id, list);
            //id of product must be in list
            if (index == -1) {
                System.out.println("Id Product must exist!!");
            }
        } while (index == -1);
        //update Product by ID
        int indexId = -1;
        do {
            id = GetData.getInteger("Enter ID Product: ", 0, Integer.MAX_VALUE);
            indexId = SearchData.searchProduct_ID(id, list);
            //New id must be not in list Product
            if (indexId != -1) {
                System.out.println("Duplicate Id !");
            }
        } while (indexId != -1);
        //Name : All character begin lowercase to uppercase from a to z .
        String name = GetData.getString("Enter Name Product:", "[a-zA-Z]+");
        //location : all character from a to z ; A to Z and digit in 0 to 9 
        String location = GetData.getString("Enter Location: ", "[0-9a-zA-Z]+(,[.0-9a-zA-Z]+){1,3}");
        //Category: all character from a to z and A to Z
        String Category = GetData.getString("Enter Category: ", "[a-zA-Z]+");
        //Price : all digit from 0.0 to Max of double 
        Double price = GetData.getDouble("Enter Price: ", 0, Double.MAX_VALUE);

        Date DateofManufacture = GetData.getDate("Enter Date of Manufacture:", "dd/MM/yyyy");
        Date Expirydate = null;
        Boolean conditon = true;
        do {
            //Expiry date must after Date of Manufacture : dd/MM/yyyy
            Expirydate = GetData.getDate("Enter Expiry date:", "dd/MM/yyyy");
            conditon = !Expirydate.after(DateofManufacture);
            if (conditon) {
                System.out.println("Expiry date must after Date of Manufacture ");
            }
        } while (conditon);
        //Get Date today 
        Date today = new Date() ; 
        Date ReceiptDate = null;
        do {
            //Receipt date must after Date of Manufacture : dd/MM/yyyy
            ReceiptDate = GetData.getDate("Enter Receipt Date:", "dd/MM/yyyy");
            conditon =  ((ReceiptDate.before(DateofManufacture))||(ReceiptDate.after(today)));
            //The date of receipt is not after the date of manufacture 
            if (conditon) {
                System.out.println("Expiry date must after Date of Manufacture and before Today ");
            }
        } while (conditon);
        //add Storekeeper of Product 
        int idS, indexS = -1;
        DisplayData.displayStorekepperList(listS);
        //Input and Check duplicate id 
        do {
            idS = GetData.getInteger("Enter ID Storekeeper of Product: ", 0, Integer.MAX_VALUE);
            indexS = SearchData.searchStorekeeper_ID(idS, listS);
            if (indexS == -1) {
                System.out.println("Id Storekeeper must exist!");
            }
        } while (indexS == -1);

        list.set(index, new Product(id, name, location, price, DateofManufacture, Category, Expirydate, ReceiptDate, listS.get(indexS)));
        System.out.println("Update Success!");
        //return list have An updated product 
        DisplayData.displayProductList(list);
        return list;
    }

    static void searchProduct(List<Product> list, List<Storekeeper> listS) {
        //Search product by Name, Category, Storekeeper, ReceiptDate
        DisplayData.displaySearchMenu();
        int choice = GetData.getInteger("Select an option:", 1, 4);
        
        switch (choice) {
            case 1:
                SearchData.searchByName(list);
                break;
            case 2:
                SearchData.searchByCategory(list);
                break;
            case 3:
                SearchData.searchByStorekeeper(list);
                break;
            case 4:
                SearchData.searchByReceipDate(list);
                break;
        }
    }

    static void sortProductList(List<Product> list) {
        //Sort product by Expiry date, Date of manufacture\
        DisplayData.displaySortMenu();
      
        int choice = GetData.getInteger("Select an option:", 1, 2);
        
        switch (choice) {
            case 1:
                sortByExpirydate(list);
                break;
            case 2:
                sortByDateofManufacture(list);
                break;
           
        }
    }

    private static void sortByExpirydate(List<Product> list) {
        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getExpirydate().before(o2.getExpirydate()) ? 1 : -1;
            }
        });
        System.out.println("After Sort By Expirydate:");
        DisplayData.displayProductList(list);
    }

    private static void sortByDateofManufacture(List<Product> list) {
         Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getDateofManufacture().before(o2.getDateofManufacture()) ? 1 : -1;
            }
        });
        System.out.println("After Sort By DateOfManufacture:");
        DisplayData.displayProductList(list);
    }

}
