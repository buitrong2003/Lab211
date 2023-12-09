/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0052;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nam Ast
 */
public class ManageEastAsiaCountries {

    void displayMenu() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("                                  MENU");
        System.out.println("========================================================================");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending");
        System.out.println("5. Exit");
        System.out.println("========================================================================");
        
    }
     //allow user input infomation of contries
    public static ArrayList<Country> getDataOfCountries(ArrayList<Country> lc) {
        if (lc.size() > 11 )
        {
            System.out.println("Only 11 countries in Southeast Asia.");
            return lc;
        }
        System.out.print("Enter code of contry: ");
        String countryCode = getData.getString();
        //check code contry exist or not
        if (!checkCountryExist(lc, countryCode)) {
            System.err.println("Country exist.");
            return null;
        }
        System.out.print("Enter name of contry: ");
        String countryName = getData.getString();
        double countryArea = getData.getDouble("Enter total area: ", 0.0, Double.MAX_VALUE);
        //Terrain : All character : a to Z, A-Z
        System.out.print("Enter terrain of contry: ");
        String countryTerrain = getData.getString();
        lc.add(new Country(countryTerrain, countryCode, countryName, countryArea));
        System.err.println("Add successful.");
        return lc ;
    }

    //display infomation of country
    public static void displayCountry(ArrayList<Country> lc) {
        System.out.printf("%-10s%-25s%-20s%-25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    //display infomation sort name in ascending
    public static void displayCountrySorted(ArrayList<Country> lc) {
        Collections.sort(lc);
        System.out.printf("%10s%25s%20s%25s\n", "ID", "Name", "Total Area",
                "Terrain");
        for (Country country : lc) {
            country.display();
        }
    }

    //allow user search infomation contry by name
    public static void searchByName(ArrayList<Country> lc) {
        System.out.print("Enter the name you want to search for: ");
        String countryName = getData.getString();
        ArrayList<Country> list = new ArrayList<Country> () ;
       
        for (Country country : lc) {
            if (country.getCountryName().equalsIgnoreCase(countryName)) {
                list.add(country) ;
            }
        }
        if (list.isEmpty()) {
            System.out.println("Empty!");
        }
        else
        {
            System.out.printf("%10s%25s%20s%25s\n", "ID", "Name", "Total Area",
                "Terrain");
            for (Country country : list) {
                country.display(); ;
            }
        }
    }

    //check country exist by code
    public static boolean checkCountryExist(ArrayList<Country> lc, String countryCode) {
        for (Country country : lc) {
            if (country.getCountryCode().equalsIgnoreCase(countryCode)) {
                return false;
            }
        }
        return true;
    }

    
}
