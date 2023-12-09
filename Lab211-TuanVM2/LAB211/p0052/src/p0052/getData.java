/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0052;

import java.util.Scanner;

/**
 *
 * @author Nam Ast
 */
public class getData {
    private static Scanner sc = new Scanner ( System.in) ;

    static int getInteger(String Mess, int Min, int Max) {
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
                System.out.println("Invalid Input ,accept integer number only , plz try again! ");
            }
        } while (true);
        return num;
    }
    static double getDouble(String Mess, double Min, double Max) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double num;
        do {
            System.out.print(Mess);
            try {
                num = Double.parseDouble(sc.nextLine());
                if (num >= Min && num <= Max) {
                    break;
                }
                System.out.println("Out of range , plz enter in range " + Min + " to " + Max);

            } catch (Exception e) {
                System.out.println("Invalid Input ,accept integer number only , plz try again ! ");
            }
        } while (true);
        return num;
    }
     public static String getString() {
        //loop until user input correct
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
     
}
