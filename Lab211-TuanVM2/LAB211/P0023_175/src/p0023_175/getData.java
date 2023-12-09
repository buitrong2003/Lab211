/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0023_175;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nam Ast
 */
public class getData {

    private static final Scanner sc = new Scanner(System.in);

    static String getString(String Mess, String regex) {
        String txt;

        do {
            System.out.print(Mess);
            txt = sc.nextLine();
            if (txt.matches(regex)) {
                break;
            } else {
                System.out.println("Invalid Input , plz try again ( format: '" + regex + "' )");
            }
        } while (true);
        return txt;
    }

    static double getDouble(String Mess, double Min, double Max) {
        double num;
        do {
            System.out.println(Mess);
            try {
                num = Double.parseDouble(sc.nextLine());
                if (num >= Min && num <= Max) {
                    break;
                }
                System.out.println("Out of range , plz enter in range " + Min + " to " + Max);

            } catch (Exception e) {
                System.out.println("Invalid Input ,accept integer number only , plz try again ");
            }
        } while (true);
        return num;

    }

    static int getInt(String Mess, int Min, int Max) {
        int num;
        do {
            System.out.print(Mess);
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num >= Min && num <= Max) {
                    break;
                }
                System.out.println("Out of range , plz enter in range " + Min + " to " + Max);

            } catch (Exception e) {
                System.out.println("Integer number only , plz try again ");
            }
        } while (true);
        return num;

    }

    static int getUserChoice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int choice = getData.getInt("(Please choose 1 to create product, 2 to view order, 3 for shopping, 4 to Exit program). ", 1, 4);
        return choice;
    }
    //get fruint user want to by
    static Fruit getFruitByItem(ArrayList<Fruit> lf, int item) {
        int countItem = 1;
        for (Fruit fruit : lf) {
            //check shop have item or not 
            if (fruit.getQuantity() != 0) {
                countItem++;
            }
            if (countItem - 1 == item) {
                return fruit;
            }
        }
        return null;
    }

    //check id exist
    public static int getIdList(ArrayList<Fruit> lf, int id) {
        for (Fruit fruit : lf) {
            if (id == fruit.getId()) {
                return fruit.getId();
            }
        }
        return -1;
    }

    //check item exist or not
    public static int getItem(ArrayList<Order> lo, int id) {
        for (Order order : lo) {
            if (order.getFruitId() == id) {
                return order.getFruitId();
            }
        }
        return -1;
    }
}
