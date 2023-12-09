/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p105;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nam Ast
 */
public class GetData {

    static int getUserChoice() {
        int choice = getInteger("Select an option: ", 1, 5);
        return choice;
    }

    static int getInteger(String Mess, int Min, int Max) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print(Mess);
            try {
                num = Integer.parseInt(sc.nextLine());
                //Input number must be greater than Min and less than Max
                if (num >= Min && num <= Max) {
                    break;
                }
                System.out.println("Only from +" + Min + " to " + Max);

            } catch (Exception e) {
                System.out.println("Value isn't digit ");
            }
        } while (true);
        return num;
    }

    static String getString(String Mess, String regex) {
        String txt;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(Mess);
            txt = sc.nextLine();
            //Check input fomat regex
            if (txt.matches(regex)) {
                break;
            } else {
                System.out.println("Invalid Input , plz try again ( format: '" + regex + "' )");
            }
        } while (true);
        return txt;
    }

    static Date getDate(String Mess, String format) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        Date date;
        SimpleDateFormat SD = new SimpleDateFormat(format);
        SD.setLenient(false);
        do {
            System.out.print(Mess);
            try {
                date = SD.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid date input , plz follow by '" + format + "'");
            }
        } while (true);
        return date;
    }
    
    static double getDouble(String Mess, double Min, double Max) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double num;
        Scanner sc = new Scanner(System.in);
    
        do {
            System.out.print(Mess);
            try {
                num = Double.parseDouble(sc.nextLine());
              
                if (num >= Min && num <= Max) {
                    break;
                }
                System.out.println("Out of range , plz enter in range " + Min + " to " + Max);

            } catch (Exception e) {
                System.out.println("Only Double number ! ");
            }
        } while (true);
        return num;
    }
}
