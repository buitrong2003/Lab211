/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Nam Ast
 */
public class Manager {
    //Them 1 doi tuong employee vao list
    static List <employees> addEmployees(List <employees> list)
    {
        //ID :  all digit in 0 to 9
        String ID;
        do{
         ID =  Check.checkInputString("Enter ID Employees: ", "[0-9]+"); 
        }
        while(Check.CheckEmployees_ID(ID,list) != -1 ) ;
        //Name : All character begin lowercase to uppercase from a to z .
        String Firstname = Check.checkInputString("Enter FristName: ", "[a-zA-Z]+");
        String Lastname = Check.checkInputString("Enter LastName: ", "[a-zA-Z]+");
        //Phone number has only number . 
        String Phone = Check.checkInputString("Enter PhoneNumber: ", "[0-9]+");
        //Email : A@B.C.D or A@B.C
        //A {all character begin lowercase to uppercase from a to z and digit in  0 to 9 }
        //B,C,D {begin lowercase to uppercase from a to z , 0 to 9  in set from 2 to 6 times}
        //*: check all previous token unlimited times
        //$: point the end of line
        String Email = Check.checkInputString("Enter employee's email: ",
                "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+){1,3}$");
        //Address : all character from a to z ; A to Z and digit in 0 to 9 
        String Address = Check.checkInputString("Enter Address: ", "[0-9a-zA-Z]+(,[0-9a-zA-Z]+){1,3}");
       
        Date DOB;//DOB : Date of Birth 
        do{
            //DOB (Date of birth)  fomatDate dd/mm/yyyy 
              DOB = Check.CheckDate("Enter employee birthday: ","dd/MM/yyyy");
            Date now = new Date();// today
            // DOB (Date of birth) before Today(now) ;
            if (DOB.before(now)) {
                break;
            } else {
                System.out.println("Birthday must before today!");
                continue;
            }
        }while(true) ;
      
        //Male : M / Female : F
        String Sex = Check.checkInputString("Enter Sex (M/F): ", "[M|F|m|f]"); 
        //salary from 0.0 to max of double.
        double Salary = Check.checkInputDouble("Enter Salary: ",0.0,Double.MAX_VALUE);
        //
        String Agency = Check.checkInputString("Enter Agency: ", "[0-9a-zA-Z]+");
        list.add(new employees(ID,Firstname,Lastname,Phone,Email,Address,DOB,Sex,Salary,Agency));
        return list ;
        
    }
    //update employee by ID
    static List <employees>  updateEmployees(List <employees> list)
    {
        String  ID ; int index = -1;
        do{
         //input ID_Employee update 
         ID =  Check.checkInputString("Enter ID Employees: ", "[0-9]+"); 
         //Test Id exist in list
         index = Check.CheckEmployees_ID(ID,list);
          if (index == -1 ) 
            System.out.println("Id Employees don't exist ! ");
        }
        while(index == -1 ) ;
        String Firstname = Check.checkInputString("Enter FristName: ", "[a-zA-Z]+");
        String Lastname = Check.checkInputString("Enter LastName: ", "[a-zA-Z]+");
        //Phone number has only number . 
        String Phone = Check.checkInputString("Enter PhoneNumber: ", "[0-9]+");
        //Email : A@B.C.D or A@B.C
        //A {all character begin lowercase to uppercase from a to z and digit in  0 to 9 }
        //B,C,D {begin lowercase to uppercase from a to z , 0 to 9  in set from 2 to 6 times}
        // *: check all previous token unlimited times
        //$: point the end of line
        String Email = Check.checkInputString("Enter employee's email: ",
                "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+){1,3}$");
        //Address : all character from a to z ; A to Z and digit in 0 to 9 
        String Address = Check.checkInputString("Enter Address: ", "[0-9a-zA-Z]+");
          
        Date DOB;
        do{
            //DOB (Date of birth)  : Date dd/mm/yyyy 
              DOB = Check.CheckDate("Enter employee birthday: ","dd/MM/yyyy" );
            Date now = new Date();// today
            // DOB (Date of birth) < Today ;
            if (DOB.before(now)) {
                break;
            } else {
                System.out.println("Birthday must before today!");
                continue;
            }
        }while(true) ;
        
        //Male : M / Female : F
        String Sex = Check.checkInputString("Enter Sex", "[M|F|m|f]"); 
        //salary from 0.0 to max of double.
        double Salary = Check.checkInputDouble("Enter Salary: ",0.0,Double.MAX_VALUE);
        // Agency : all character from a to z ; A to Z and digit in 0 to 9 
        String Agency = Check.checkInputString("Enter Agency: ", "[0-9a-zA-Z]+");
        
        list.add(new employees(ID,Firstname,Lastname,Phone,Email,Address,DOB,Sex,Salary,Agency));
        return list ;
    }
    static List <employees> RemoveEmployees(List <employees> list)
    {
         String  ID ; int index = -1;
         do{
         //input ID_Employee find 
         ID =  Check.checkInputString("Enter ID Employees : ", "[0-9]+"); 
         //Test Id exist in list
         index = Check.CheckEmployees_ID(ID,list);
         if (index == -1 ) 
                 System.out.println("Id Employees don't exist ! ");
        }
        while(index != -1 ) ;
        //Display and Remove
        System.out.println("Employees: ");
        System.out.println(list.get(index).toString());
        list.remove(index) ;
        System.out.println("Removed complete !");
        return list;       
    }

    //Find employees by ID_employees
    static List <employees>  searchEmployees(List <employees> list)
    {
        // input name/a_part_of_name search 
        String nameS = Check.checkInputString("Enter LastName: ", "[a-zA-Z]+");
        
        List <employees> listS = new ArrayList <employees> ();
        //Search by name/a_apart_of_name
        for (int i = 0 ; i < list.size();i++)
        {
            employees e = list.get(i);
            String name = e.getFirstname() + e.getLastname() ;
            // Don't distinguish between uppercase and lowercase letters
            if(name.toLowerCase().contains(nameS.toLowerCase()))
            { listS.add(e) ; }
        }
        
        return listS;
    }
    //Sort list employees by Salary
    static List <employees> sortEmployees(List <employees> list)
    {
        Collections.sort(list);
        return list ;
    }
}
