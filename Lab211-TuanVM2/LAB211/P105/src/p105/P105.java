/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p105;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nam Ast
 */
public class P105 {

    public static void main(String[] args) {
        List<Storekeeper> listS = new ArrayList<Storekeeper>();
        List<Product> listP = new ArrayList<Product>();
        do {
            //1. DisplayData a menu and ask users to select an option 
            DisplayData.displayMenu();
            //Get user option 
            int choice = GetData.getUserChoice();
            //2. Do user option 
            switch (choice) {
                //2.1 Add Storekeeper: Storekeeper Name
                case 1:
                    listS = Manager.addStorekeeper(listS);
                    break;
                //2.2 Add product: all property are required (Check duplicate Id)
                case 2:
                    listP = Manager.addProduct(listP, listS);
                    break;
                //2.3 Update product in ListProduct : Find product by Id
                case 3:
                    listP = Manager.updateProduct(listP, listS);
                    break;
            //2.4 Search product by Name, Category, Storekeeper: 
                //Prompt users input to select: Name(string), Category(string), Storekeeper(string) or ReceiptDate(Date)
                //Users input search value
                //Display result
                case 4:
                    Manager.searchProduct(listP, listS);
                    break;
                //2.5 Sort product by Expiry date, Date of manufacture
                case 5:
                    Manager.sortProductList(listP);
                    break;

            }
        } while (true);
    }

}
