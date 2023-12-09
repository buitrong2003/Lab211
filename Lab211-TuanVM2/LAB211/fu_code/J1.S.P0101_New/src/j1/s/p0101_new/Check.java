package j1.s.p0101_new;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nam Ast
 */
public class Check {

    static Scanner sc = new Scanner(System.in);

    static int CheckEmployees_ID(String eID, List<employees> list) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Eliminate the case where the list is empty
        if (list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                if (eID.equalsIgnoreCase(list.get(i).getID())) {
                    return i;
                }
            }
        }
        return -1;
    }

    static int checkInputInt(String Mess, int Min, int Max) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int num;
        do {
            System.out.println(Mess);
            try {
                num = Integer.parseInt(sc.nextLine());
                //Kiem tra so nguyen nhap vao thoa man dieu kien
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

    static double checkInputDouble(String Mess, double Min, double Max) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        double num;
        //Yeu cau nhap so thuc cho den khi thoa man dieu kien
        do {
            System.out.println(Mess);
            try {
                num = Double.parseDouble(sc.nextLine());
                //Xac dinh so nhap vao trong khoang dieu khien vao 
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

    static String checkInputString(String Mess, String regex) {
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

    static Date CheckDate(String Mess, String format) {
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
