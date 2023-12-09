/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0102;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nam Ast
 */
public class P0102 {

    public static void main(String[] args) throws ParseException {
        while (true) {
        //1.User enter date with [dd/mm/yyyy] format 
            String date = Manager.getDate("Please enter date with format [dd/mm/yyyy]:");
        //2. Check user input date exits
            if (Manager.checkDateExist(date)) {
        //3. Determine day of week with input date
                Manager.displayDayOfWeek(date);
                break;
            }
        }

    }

}
