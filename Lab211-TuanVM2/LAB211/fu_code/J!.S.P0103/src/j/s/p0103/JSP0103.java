/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j.s.p0103;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Nam Ast
 */
public class JSP0103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Step1 : Input and check date1,date2 format dd/mm/yyyy
        Date date1 = CheckDate("Please enter the first date: ","dd/mm/yy");
        Date date2 = CheckDate("Please enter the second date: ","dd/mm/yy") ;
        //Step2 : Compare two date 
        ComparetwoDate(date1,date2);
    }
     ///Date 
    static Date CheckDate(String Mess,String format) 
    {   Scanner sc = new Scanner(System.in ) ;
        Date date ;
        SimpleDateFormat SD = new SimpleDateFormat(format) ;
        SD.setLenient(false);
        do
        {
            System.out.print(Mess);
            try
            {
                date = SD.parse(sc.nextLine()) ;
                break ; 
            }
            catch (Exception e )
            {
                System.out.println("Invalid date input , plz follow by '" + format + "'");  
            }
        }
        while (true ) ;
        return date ; 
    }

    private static void ComparetwoDate(Date date1, Date date2) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         if(date1.before(date2)){
            System.out.println("Date1 is before Date2");
        }else if(date1.after(date2)){
            System.out.println("Date1 is after Date2");
        }else{
            System.out.println("Date1 is equal Date2");
        }
    }
    
}
