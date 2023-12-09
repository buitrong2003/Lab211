/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0101;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nam Ast
 */
public class GetData {
    private static Scanner sc = new Scanner ( System.in) ;
    static int GetChoice() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print("Please choose from 1 to 6 : ");
            try {
                     num = Integer.parseInt(sc.nextLine());
       
                if (num >= 1 && num <= 6) {
                    break;
                }
                System.out.println("Out of range , plz enter in range 1 to 6 !");
                
            } catch (Exception e) {
                System.out.println("Is not Integer number !  plz try again! ");
            }
        } while (true);
        return num;
    }
    
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

    static String getString(String Mess, String regex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String txt;

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
}
