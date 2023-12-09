/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p105;

import p105.Storekeeper;
import java.util.Date;

/**
 *
 * @author Nam Ast
 */
public class Product  {
    
     private int  id ; 
     private String Name, Location,   Category;      
     private Double Price;
     private Date Expirydate,DateofManufacture , ReceiptDate;
     private Storekeeper storekeeper ;

    public Product() {
    }

    public Product(int id, String Name, String Location, Double Price, Date DateofManufacture, String Category, Date Expirydate, Date ReceiptDate, Storekeeper storekeeper) {
        this.id = id;
        this.Name = Name;
        this.Location = Location;
        this.Price = Price;
        this.DateofManufacture = DateofManufacture;
        this.Category = Category;
        this.Expirydate = Expirydate;
        this.ReceiptDate = ReceiptDate;
        this.storekeeper = storekeeper;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public Date getDateofManufacture() {
        return DateofManufacture;
    }

    public void setDateofManufacture(Date DateofManufacture) {
        this.DateofManufacture = DateofManufacture;
    }

    

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public Date getExpirydate() {
        return Expirydate;
    }

    public void setExpirydate(Date Expirydate) {
        this.Expirydate = Expirydate;
    }

    public Date getReceiptDate() {
        return ReceiptDate;
    }

    public void setReceiptDate(Date ReceiptDate) {
        this.ReceiptDate = ReceiptDate;
    }

    public Storekeeper getStorekeeper() {
        return storekeeper;
    }

    public void setStorekeeper(Storekeeper storekeeper) {
        this.storekeeper = storekeeper;
    }

  

    @Override
    public String toString() {
        return  id + "\t" + Name + "\t" + Location + "\t" + Category + "\t" + Price + "\t" + Expirydate + "\t" +DateofManufacture + "\t" +ReceiptDate + "\t" +storekeeper.getName() ;
    }
     
}
