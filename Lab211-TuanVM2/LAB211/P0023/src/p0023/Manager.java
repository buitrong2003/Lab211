/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0023;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import p0023.Fruit ;
import static p0023.P0023.FruitList;
import static p0023.P0023.listOrder;

/**
 *
 * @author Nam Ast
 */
public class Manager {
   
    public static void displayMenu()
    {
        int x ; 
        System.out.println("FRUIT SHOP SYSTEM ");
        System.out.println("1. Create Fruit");
        System.out.println("2. View orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
    }
    public static void addNewFruit( )
    {
        int  id; String name, origin;Double price ;int quantity ; 
        //Check list Fruit empty or not ---> get final id of Object in list 
            if(FruitList.isEmpty()){
                id = 1 ;
            }else
            {
                id = FruitList.get(FruitList.size()-1).getId() + 1 ;
            }
        //
        while (true)
        {           
            name = getData.getString("Enter Fruit Name:","[a-zA-Z]+");
            price = getData.getDouble("Enter Fruit Price:",0.1,Double.MAX_VALUE);
            quantity = getData.getInt("Enter Fruit Quantity:", 1, Integer.MAX_VALUE);
            origin = getData.getString("Enter Fruit Origin:", "[a-zA-Z]+");
            FruitList.add(new Fruit(id,name,price,quantity,origin)) ;
            String choose = getData.getString("Do you want to continue (Y/N)?","[Y|N]") ;
            if (choose.equalsIgnoreCase("N")) break ;
            Fruit f = new Fruit(id, name,  price, quantity,  origin);
            FruitList.add(f) ;
        }
    }
    public static void view(List<Fruit> list )
    {
        double a = 0.0 ;
        Fruit  f = new Fruit();
        System.out.println("Product\t|\tQuantity\t|\tPrice\t|\tAmount");
        for(int i = 0 ; i < list.size() ; i++)
        {
            f = list.get(i) ;
            System.out.println( (i+1)+"\t" +f.getName()+"\t"+ f.getQuantity() +"$" +"\t"+ f.getPrice()+"$" +"\t"+ f.getPrice()*f.getQuantity());
            a += f.getPrice()*f.getQuantity() ;
        }
        System.out.println("Total : " +a+"$");
    }
    public static void viewOrders( )
    {
        for (String i : listOrder.keySet())
        {
            String[] nameCustomer = i.split("@");
            System.out.println("Customer: "+nameCustomer[0]);
            view(listOrder.get(i)) ;
        }
    }
    //Sopping 
    //-----------print list ---
     public static Fruit chooseItems()
     {
        HashMap<Integer,Fruit> list= new HashMap<Integer,Fruit>() ;
        int k =1 ; 
        System.out.println("List of Fruit:"  );
        System.out.println("|+    Item    +||+ Fruit Name +||+   Origin   +||+    Price  +|"  );
        int i = 0 ;
        while (i < FruitList.size())
        {
            if (FruitList.get(i).getQuantity() > 0 )     
            {                  
               System.out.format("%14d%14s%14s%14.2f$\n",k,FruitList.get(i).getName(),FruitList.get(i).getOrigin(),FruitList.get(i).getPrice() );
               list.put(k,FruitList.get(i)) ;
               k += 1 ;
            }
            i+= 1 ;
        }
        if (k==1 ) return null ; 
        int choice = getData.getInt("Choose a item ",1, k-1) ;
        return list.get(choice); 
     }
    public static void Shopping()
    {  
        List<Fruit> listO = new ArrayList<Fruit>() ;
         String s  ;int id = 0 ;   
        do
        {
            //--------shopping----
            Fruit i = chooseItems();
            if (i == null ) break ; // het hang thi dua order now 
            System.out.println("You selected : " + i.getName() );
            int Quantity = getData.getInt("Please input quantity: ",0,i.getQuantity()) ;
            //-----------------Update order list 
            i.setQuantity(Quantity);
            int indexF = searchFruit(i,listO) ;
            if (indexF == -1 )
            listO.add(i) ;  else listO.get(indexF).setQuantity(listO.get(indexF).getQuantity()+Quantity);
            
            //----------------Decrease  quantity
            int index = searchFruit(i,FruitList) ;      
            FruitList.get(index).setQuantity(FruitList.get(index).getQuantity() - Quantity );
            //----order now ? 
            s= getData.getString(" Do you want to order now (Y/N)","Y|N") ;
        }
        while(s.compareTo("Y") != 0 ) ;
        String name = getData.getString("Input your name:","[a-zA-Z]+") ;
        name += "@"+listOrder.size() ;
        //---------add order list by ID ------
        listOrder.put(name, listO);   // add customer
        //--------list order
        System.out.println("Order Success!");
    }

    private static int searchFruit(Fruit i, List<Fruit> list) {
       
        for(int index = 0 ; index < list.size() ; index ++ )
            {
                if (list.get(index).getId() == i.getId() ) return index ;
            }
        return -1 ;
    }
}
