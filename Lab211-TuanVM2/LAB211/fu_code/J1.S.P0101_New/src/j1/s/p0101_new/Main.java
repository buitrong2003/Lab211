package j1.s.p0101_new;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nam Ast
 */
public class Main {

    public static void main(String[] args) {
        List<employees> list = new ArrayList<employees>();//List of employees              
        int choice;
        do {
//Step1 : Display a menu and ask users to select an option.          
            choice = DisplayMenu();
//Step2 : Do user's choice.
            list = DoOption(choice, list);
//Step3 : Display result.
            DisplayList(list);
        } while (choice < 5);// exit :  option =  5 

    }

    private static int DisplayMenu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Main menu:");
        System.out.println("\t1. Add employees");
        System.out.println("\t2. Update employees");
        System.out.println("\t3. Remove employees");
        System.out.println("\t4. Search employees");
        System.out.println("\t5. Sort employees by salary");
        System.out.println("\t6. Exit");
        int choice = Check.checkInputInt("Choose 1 to 6 :", 1, 6);
        return choice;
    }

    private static List<employees> DoOption(int choice, List<employees> list) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Manager manager = new Manager();  //Create list employees. 
        switch (choice) {
            case 1:
                list = manager.addEmployees(list);
                break;
            case 2:
                list = manager.updateEmployees(list);
                break;
            case 3:
                list = manager.RemoveEmployees(list);
                break;
            case 4:
                manager.searchEmployees(list);
                break;
            case 5:
                list = manager.sortEmployees(list);
                break;

        }
        return list;
    }

    private static void DisplayList(List<employees> list) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("List employees : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}
