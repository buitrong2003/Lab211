/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0011;

/**
 *
 * @author Nam Ast
 */
public class displayData {

    static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("\t1. Binary");
        System.out.println("\t2. Decimal");
        System.out.println("\t3. Hexadecimal");
        System.out.println("\t4. Exit");
    }

    static void displayResult(String result) {
        System.out.println("Result convert: " + result);
    }
}
