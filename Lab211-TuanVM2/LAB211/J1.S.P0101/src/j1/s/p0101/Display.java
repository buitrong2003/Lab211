/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0101;

import java.util.List;

/**
 *
 * @author Nam Ast
 */
public class Display {
    void DisplayMenu()
    {
        System.out.println("Main menu:");
        System.out.println("\t1. Add employees");
        System.out.println("\t2. Update employees");
        System.out.println("\t3. Remove employees");
        System.out.println("\t4. Search employees");
        System.out.println("\t5. Sort employees by salary");
        System.out.println("\t6. Exit");
    }
    static void DisplayList(List <employees> list)
    {
        System.out.println("List employees : ");
       
        for(int i = 0 ; i < list.size(); i++)
        {
            System.out.println(list.get(i).toString());
        }
    }
}
