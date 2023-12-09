/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0102;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nam Ast
 */
public class Manager {

    public static String getDate(String mess) {
        Scanner sc = new Scanner(System.in);
        // check the format of input : dd/mm/yyyy
        while (true) {
            System.out.print(mess);
            String string = sc.nextLine();
            if (string.length() == 0) {
                System.out.println("Empty !");
            } else // Date have format dd/mm/yyy
            //  Day , month, year are special character : "\\"
            // d{1,2} : day have 1 or 2 digits 
            // M{1,2} : month have 1 or 2 digits
            // y{4} : year must have 4 digits
            if (string.matches("\\d{1,2}/\\d{1,2}/\\d{4}")) {
                return string;
            } else {
                System.out.println("Wrong format !  ");
            }
        }
    }

    static boolean checkDateExist(String date) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dateFormat.setLenient(false);
            dateFormat.parse(date);
            return true;
        } catch (Exception e) {
            System.out.println("Date isn't Exist  !");
            return false;
        }
    }

    public static void displayDayOfWeek(String d) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse(d);
        SimpleDateFormat SDF = new SimpleDateFormat("EEEE");
        System.out.println("Your day is " + SDF.format(date));
    }

}
