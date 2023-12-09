/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0103;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author 1234
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Management date = new Management();        
        //step1: Enter the first date
        String firstDate = date.inputDate("Please enter the first date: ");
        //step2: Enter the second date
        String secondDate = date.inputDate("Please enter the second date: ");
        //step3: Compare two date and display
        date.compareAndDisplayDate(firstDate,secondDate);
    }    
}
