
package j1.s.p0101;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nam Ast
 */
public class Main {

   
    public static void main(String[] args) {
//  Step 1: Display a menu and ask users to select an option 
        Manager manager = new Manager() ;
        Display display = new Display();
        Check check = new Check() ; 
        List <employees> list = new ArrayList <employees>();//List of employees       
        List <employees> listR = new ArrayList <employees>();//List Result 
        
        int choice ;  
      do{
       
        display.DisplayMenu();
        //Get user's choice
        choice = check.checkInputInt("Choose 1 to 6 :", 1,6) ;
        //Do user'choice
        switch (choice)
        {
//  Step 2: Add employees
            case 1 : //Add employees
                listR = manager.addEmployees(list);
                break;
//  Step 3:  Update by ID           
            case 2 : 
                 listR = manager.updateEmployees( list );
                break;
//  Step 4: Remove by ID
            case 3 : 
                listR = manager.RemoveEmployees( list);
                break;
//  Step 5: Search by a part of name                 
            case 4 : 
                listR = manager.searchEmployees(list);
                break;
//  Step 6: Sort by salary                  
            case 5 : 
                listR = manager.sortEmployees(list);                
                break;
            
        }
//  Step 7:   Display Result.
         display.DisplayList(listR);
        }
        while (choice < 5) ;// exit :  option =  5 
    }
    
}
