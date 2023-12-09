/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0001;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nam Ast
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Step1 : Input size ar.
        int size = CheckinputSize("Enter number of ar:\n",0);
    //Step2 : Create a random ar.
        int[] ar = CreateArray(size) ;
       DisplayArray("Unsorted ar: [",ar);
    //Step3 : Sort ar.
        boolean test = false;
        Bubblesort(ar,test) ;
    //Step4 : DisplayArray ar.
       DisplayArray("Sorted ar: [",ar);
    }
    private static int CheckinputSize(String mess,int min) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       int num ;
       Scanner sc = new Scanner(System.in) ;
        do
        {
            System.out.println(mess);
            try
            {
               num= Integer.parseInt(sc.nextLine()) ; 
               if(num >= min )break;
                System.out.println("Plz enter a positive number !" );
                             
            }
            catch(Exception e)
            {
                System.out.println("Invalid Input ,accept integer number only , plz try again " );
            }
        }while(true) ; 
        return num ;  
    }
     private static int[] CreateArray(int size) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int[] ar = new int[size];
        Random rd = new Random();
        //Random each element of ar
        for (int i = 0; i < size; i++) {
            ar[i] = rd.nextInt(size);
        }
        return ar;
     }
    //Draft
    private static void Bubblesort(int[] ar, boolean test) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //
         /*Loop use to accessed from the first to last element of ar, 
        after each loop, one element is sorted*/
        for (int i = 0; i < ar.length; i++) {
            /*Loop use to accessed first unsorted element to the element 
            stand before the last unsorted element*/
            for (int j = 0; j < ar.length - i - 1; j++) {
                //compare each pair adjacent elements
                if (ar[j] > ar[j + 1]) {
                    //DisplayArray each step in sorting process in test case
                    if (test == true) {
                        DisplayArray("",ar );
                        System.out.println("    " + ar[j] + ">" + ar[j + 1] + ", " + "swap");//test algorithm
                    }
                    int temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                } else if (test == true) { //DisplayArray each step in sorting process in test case
                    DisplayArray("",ar);//testalgorithm
                    System.out.println("    " + ar[j] + "<" + ar[j + 1] + ", " + "ok");
                }
            }
        }
    }

    private static void DisplayArray(String mess, int[] ar) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.print(mess);
        for(int i = 0 ; i < ar.length ;i++)
        {
            System.out.print(ar[i]);
            if(i < ar.length-1) 
                System.out.println(", ");
            else
                System.out.println("]\n");
        }
    }

  

   
}
