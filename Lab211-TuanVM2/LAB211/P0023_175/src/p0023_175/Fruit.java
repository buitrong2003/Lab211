/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0023_175;

/**
 *
 * @author Nam Ast
 */
public class Fruit {
    private int Id ;
    private String Name ;
    private Double Price ;
    private int Quantity ;
    private String Origin ; 

    public Fruit() {
    }


    public Fruit(int Id, String Name, Double Price, int Quantity, String Origin) {
        this.Id = Id;
        this.Name = Name;
        this.Price = Price;
        this.Quantity = Quantity;
        this.Origin = Origin;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    public Double getPrice() {
        return Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getOrigin() {
        return Origin;
    }


    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    @Override
    public String toString() {
        return  Id + "\t" + Name + "\t" + Price + "\t" + Quantity + "\t" + Origin ;
    }
    
    
}
