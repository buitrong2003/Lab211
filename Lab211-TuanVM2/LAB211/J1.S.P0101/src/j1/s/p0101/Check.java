 
package j1.s.p0101;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Nam Ast
 */
public class Check {
    static Scanner sc = new Scanner(System.in) ;
    //Check employees by ID 
    static int CheckEmployees_ID(String eID,List <employees> list)
    {
        //Loai bo truong hop list rong 
        if (list.size() != 0 ) 
        for(int i = 0 ; i < list.size() ; i++)
            if (eID.equalsIgnoreCase(list.get(i).getID()) )
                return i ;
        return -1 ;
    }
    
    // Check input min < Double < max
    static double checkInputDouble(String Mess,double Min,double Max)
    {
        double num ;
        //Yeu cau nhap so thuc cho den khi thoa man dieu kien
        do
        {
            System.out.println(Mess);
            try
            {
               num = Double.parseDouble(sc.nextLine()) ; 
               //Xac dinh so nhap vao trong khoang dieu khien vao 
               if(num >= Min && num <= Max )
                break;
                System.out.println("Out of range , plz enter in range "+Min +" to "+Max  );
                             
            }
            catch(Exception e)
            {
                System.out.println("Invalid Input ,accept integer number only , plz try again " );
            }
        }while(true) ; 
        return num ;                 
    }
    //heck Input Integer ;   min < int < max 
     static int checkInputInt(String Mess,int Min,int Max)
    {
        int num ;
        do
        {
            System.out.println(Mess);
            try
            {
               num= Integer.parseInt(sc.nextLine()) ; 
               //Kiem tra so nguyen nhap vao thoa man dieu kien
               if(num >= Min && num <= Max )
               break;
                System.out.println("Out of range , plz enter in range "+Min +" to "+Max  );
                             
            }
            catch(Exception e)
            {
                System.out.println("Invalid Input ,accept integer number only , plz try again " );
            }
        }while(true) ; 
        return num ; 
                 
    }
     //Check input String by regex
      static String checkInputString(String Mess,String regex)
    {
        String txt ; 
        
        do
        {
            System.out.print(Mess);
            txt = sc.nextLine() ; 
            //Check input fomat regex
            if (txt.matches(regex))
                break ;
            else 
            {
                System.out.println("Invalid Input , plz try again ( format: '" + regex + "' )");
            }
        }while(true) ;
        return txt ; 
    }
     //Check Input Date
       static Date CheckDate(String Mess,String format) 
    {
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
}
