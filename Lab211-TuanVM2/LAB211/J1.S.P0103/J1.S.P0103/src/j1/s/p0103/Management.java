
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0103;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author 1234
 */
class Management {


      public String inputDate(String str) {
        System.out.print(str);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);
        //Loop until enter the correct format date
        while (true) {
            try {
                String datString = checkInputString();
                Date date = dateFormat.parse(datString);
                //date to string 
                return new SimpleDateFormat("dd/MM/yyyy").format(date);
            } catch (Exception e) {
                System.err.println("Wrong format or Date isn't Exist  ! Please enter the correct format dd/MM/yyyy! ");
            }
        }

    }
    public void compareAndDisplayDate(String firstDate, String secondDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = dateFormat.parse(firstDate);
        Date date2 = dateFormat.parse(secondDate);
                //compare two date
        if (date1.after(date2)) {
            System.out.println("Date1 is after Date2");
        }
        else if (date1.before(date2)) {
            System.out.println("Date1 is before Date2");
        }
        else {
            System.out.println("Date1 is equal Date2");
        }
    }

    public String checkInputString() {
        Scanner sc = new Scanner(System.in);
        //Loop until enter a non-empty string
        while (true) {
            String string = sc.nextLine();
            //compare the length of string to 0
            if (string.length() == 0) {
                System.err.println("Empty !");
            } else {
                return string;
            }
        }
    }
}
