/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0101;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nam Ast
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        do {
        //Step1 : Display a menu and ask users to select an option 
            DisplayData.DisplayMenu();
            int choice = GetData.GetChoice();
        //Step2 : Do user's option 
            switch (choice) {
        //2.1 Add Employee
                case 1:
                    list = EmployeeManagement.addEmployee(list);
                    break;
        //2.2 Update employees
                case 2:
                    list = EmployeeManagement.updateEmployee(list);
                    break;
        //2.3 Remove employees
                case 3:
                    list = EmployeeManagement.removeEmployee(list);
                    break;
        //2.4 Search employees 
                case 4:
                    EmployeeManagement.searchEmployee(list);
                    break;
        //2.5 Sort employees by salary
                case 5:
                    list = EmployeeManagement.sortEmployeeList(list);
                    break;

            }
        //2.6 Exit
            if (choice == 6) {
                break;
            }
        } while (true);

    }

}
