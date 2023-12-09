/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author Nam Ast
 */
public class EmployeeManagement {

    static ArrayList<Employee> addEmployee(ArrayList<Employee> list) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        String ID;
        //Input and Check data 
        do {
            ID = GetData.getString("Enter ID Employees: ", "[0-9]+"); //ID : all digits in 0 to 9
            if (CheckEmployees_ID(ID, list) != -1) System.out.println("Duplicated ID!");
        } while (CheckEmployees_ID(ID, list) != -1);
        //Name : All character begin lowercase to uppercase from a to z .
        String Firstname = GetData.getString("Enter FristName: ", "[a-zA-Z]+");
        String Lastname = GetData.getString("Enter LastName: ", "[a-zA-Z]+");
        //Phone number has only number . 
        String Phone = GetData.getString("Enter PhoneNumber: ", "[0-9]+");
        //Email : A@B.C.D or A@B.C
        //A {all character begin lowercase to uppercase from a to z and digit in  0 to 9 }
        //B,C,D {begin lowercase to uppercase from a to z , 0 to 9  in set from 2 to 6 times}
        //*: check all previous token unlimited times
        //$: point the end of line
        String Email = GetData.getString("Enter employee's email: ",
                "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+){1,3}$");
        //Address : all character from a to z ; A to Z and digit in 0 to 9 
        String Address = GetData.getString("Enter Address: ", "[0-9a-zA-Z]+(,[.0-9a-zA-Z]+){1,3}");

        Date DOB;//DOB : Date of Birth 
        do {
            //DOB (Date of birth)  fomatDate dd/mm/yyyy 
            DOB = GetData.getDate("Enter employee birthday: ", "dd/MM/yyyy");
            Date now = new Date();// today
            // DOB (Date of birth) before Today(now) ;
            if (DOB.before(now)) {
                break;
            } else {
                System.out.println("Birthday must before today!");
                continue;
            }
        } while (true);

        //Male : M / Female : F
        String Sex = GetData.getString("Enter Sex (M/F): ", "[M|F|m|f]").toUpperCase();
        //salary from 0.0 to max of double.
        double Salary = GetData.getDouble("Enter Salary: ", 0.0, Double.MAX_VALUE);
        // Agency : all character from a to z ; A to Z and digit in 0 to 9 
        String Agency = GetData.getString("Enter Agency: ", "[0-9a-zA-Z]+");

        list.add(new Employee(ID, Firstname, Lastname, Phone, Email, Address, DOB, Sex, Salary, Agency));
        System.out.println("Add Employee complete !");
        DisplayData.displayList(list);
        // Return list result have a new Employee
        return list;
    }

    //Option 2: Update employee by ID
    static ArrayList<Employee> updateEmployee(ArrayList<Employee> list) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String ID;
        int indexE = -1,index;
        //Input ID and Check id exist      
        do {
            ID = GetData.getString("Enter ID Employees: ", "[0-9]+");
            //Test Id exist in list
            indexE = CheckEmployees_ID(ID, list);
            //Request user type id exist 
            if (indexE == -1) {
                System.out.println("Id Employees don't exist ! ");
            }
        } while (indexE == -1);
        
         //Input New ID and Check id exist      
        do {
            ID = GetData.getString("Enter New ID Employees: ", "[0-9]+");
            //Test Id exist in list
              index = CheckEmployees_ID(ID, list);
            //Request user type id exist 
            if (index != -1) {
                System.out.println("Employee's new id must not be in the List!");
            }
        } while (index != -1);
        //Input and check information of Employee 
        String Firstname = GetData.getString("Enter New FristName: ", "[a-zA-Z]+");
        String Lastname = GetData.getString("Enter New LastName: ", "[a-zA-Z]+");
        //Phone number has only number . 
        String Phone = GetData.getString("Enter New PhoneNumber: ", "[0-9]+");
        //Email : A@B.C.D or A@B.C 
        //A {all character begin lowercase to uppercase from a to z and digit in  0 to 9 }
        //B,C,D {begin lowercase to uppercase from a to z , 0 to 9  in set from 2 to 6 times}
        // *: check all previous token unlimited times
        //$: point the end of line
        String Email = GetData.getString("Enter New employee's email: ",
                "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+){1,3}$");
        //Address : all character from a to z ; A to Z and digit in 0 to 9 
        String Address = GetData.getString("Enter New Address: ", "[0-9a-zA-Z]+(,[.0-9a-zA-Z]+){1,3}");

        Date DOB;
        do {
            //DOB (Date of birth)  : Date dd/mm/yyyy 
            DOB = GetData.getDate("Enter New employee birthday: ", "dd/MM/yyyy");
            Date now = new Date();// today
            // DOB (Date of birth) < Today ;
            if (DOB.before(now)) {
                break;
            } else {
                System.out.println("Birthday must before today!");
                continue;
            }
        } while (true);

        //Male : M / Female : F
        String Sex = GetData.getString("Enter Sex: ", "[M|F|m|f]").toUpperCase();
        //salary from 0.0 to max of double.
        double Salary = GetData.getDouble("Enter New Salary: ", 0.0, Double.MAX_VALUE);
        // Agency : all character from a to z ; A to Z and digit in 0 to 9 
        String Agency = GetData.getString("Enter New Agency: ", "[0-9a-zA-Z]+");

        //Update information of the Employee having same id 
        list.set(indexE, new Employee(ID, Firstname, Lastname, Phone, Email, Address, DOB, Sex, Salary, Agency));
        System.out.println("Update complete !");
        // Return list have a updated Employee       
        DisplayData.displayList(list);
        return list;
    }

    static ArrayList<Employee> removeEmployee(ArrayList<Employee> list) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String ID;
        int index = -1;
        //Input and check id.
        do {
            ID = GetData.getString("Enter ID Employees : ", "[0-9]+");
            index = CheckEmployees_ID(ID, list);
            //ID Employee don't exist ! Request user type again . 
            if (index == -1) {
                System.out.println("Id Employees don't exist ! ");
            }
        } while (index == -1);

        //Display and Remove result index Employee
        System.out.println("Employees: ");
        System.out.println(list.get(index).toString());
        list.remove(index);
        System.out.println("Removed complete !");

        //Return list have a removed Employee    
        DisplayData.displayList(list);
        return list;
    }

    static void searchEmployee(ArrayList<Employee> list) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String nameS = GetData.getString("Enter Name: ", "[a-zA-Z]+");
        ArrayList<Employee> listS = new ArrayList<Employee>();
        //Search by a apart of name 
        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);
            String name = e.getFirstName() + e.getLastName();
            // Don't distinguish between uppercase and lowercase letters
            if (name.toLowerCase().contains(nameS.toLowerCase())) {
                listS.add(e);
            }
        }
        if (listS.isEmpty()) {  System.out.println("Not found !");}
        else
        DisplayData.displayList(listS);

    }

    static ArrayList<Employee> sortEmployeeList(ArrayList<Employee> list) {
        //System.out.println("List of employees before being sorted : ");
        //DisplayData.displayList(listS);
        Collections.sort(list);
        System.out.println("List of employees after being sorted : ");
        DisplayData.displayList(list);
        return list;
    }

    static int CheckEmployees_ID(String eID, ArrayList<Employee> list) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //Eliminate the case where the list is empty
        if (list.size() != 0) {
            for (int i = 0; i < list.size(); i++) {
                if (eID.equalsIgnoreCase(list.get(i).getId())) {
                    return i;
                }
            }
        }
        return -1;
    }

}
