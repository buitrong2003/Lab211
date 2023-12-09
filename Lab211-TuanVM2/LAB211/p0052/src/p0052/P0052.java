/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0052;

import java.util.ArrayList;

/**
 *
 * @author Nam Ast
 */
public class P0052 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ManageEastAsiaCountries Manager = new ManageEastAsiaCountries();
          ArrayList<Country> list = new ArrayList<>();
        while (true) {
//1. Display a menu and ask users to select an option.
            //display Menu 
            Manager.displayMenu();
            //get user's option 
            int option = getData.getInteger("Enter your choice: ", 1, 5);
            //2. Perform function based on the selected option.
            switch (option) {
                //2.1 Input the information of 11 countries in East Asia
                case 1:
                    list = Manager.getDataOfCountries(list);
                    break;
                //2.2  Display information of countries you’ve just input
                case 2:
                    Manager.displayCountry(list);
                    break;
                //2.3  Search information of countries by user-entered name
                case 3:
                    Manager.searchByName(list);
                    break;
                //2.4   Display The information of countries sorted name in ascending order
                case 4:
                    Manager.displayCountrySorted(list);
                    break;
                //2.5 Exit 
            }
            if (option == 5) {
                break;
            }
        }

    }
}
