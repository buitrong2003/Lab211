/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0074;

import java.util.Scanner;

/**
 *
 * @author Nam Ast
 */
class GetData {

    static int getUserChoice() {
        int choice = getInteger("Your choice: ", 1, 4);
        return choice;
    }

    static int getInteger(String Mess, int Min, int Max) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.print(Mess);
            try {
                num = Integer.parseInt(sc.nextLine());
                //Input number must be greater than Min and less than Max
                if (num >= Min && num <= Max) {
                    break;
                }
                System.out.println("Out of range ! (" + Min + " to " + Max + " )");

            } catch (Exception e) {
                System.out.println("Value of matrix is digit ");
            }
        } while (true);
        return num;
    }

    static int[][] getMatrix1() {

        int row_1, col_1;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        row_1 = getInteger("Enter Row Matrix 1:", 0, Integer.MAX_VALUE);
        col_1 = getInteger("Enter Column Matrix 1:", 0, Integer.MAX_VALUE);
        int[][] matrix = new int[row_1][col_1];
        //access from 1st to the last elemnet of row
        for (int i = 0; i < row_1; i++) {
            //access from 1st to the last elemnet of column
            for (int j = 0; j < col_1; j++) {
                matrix[i][j] = getInteger("Enter Matrix1[" + (i + 1) + "]" + "[" + (j + 1) + "]:", 0, Integer.MAX_VALUE);
            }
        }
        return matrix;
    }

    static int[][] getMatrix2(int[][] matrix1, int choice) {

        int row, col;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (choice == 1 || choice == 2) {
           
            while (true) {
                row = getInteger("Enter Row Matrix 2:", 0, Integer.MAX_VALUE);
                 //Row of matrix 2 must satisfy the condition 
                if (row != matrix1.length) {
                    System.out.println("Row of Matrix 2 must equal  Row of Matrix 1 ");
                } else {
                    break;
                }
            }
            //Column of matrix 2 must satisfy the condition
            while (true) {
                col = getInteger("Enter Column Matrix 2:", 0, Integer.MAX_VALUE);
                if (col != matrix1[0].length) {
                    System.out.println("Column of Matrix 2 must equal  Column of Matrix 1 ");
                } else {
                    break;
                }
            }
        } else {
            //Check Row of matrix 2 must equal Column of matrix 1 
             while (true) {
                row = getInteger("Enter Row Matrix 2:", 0, Integer.MAX_VALUE);
                if (row != matrix1[0].length) {
                    System.out.println("Row of Matrix 2 must equal  Column of Matrix 1");
                } else {
                    break;
                }
            }
            col = getInteger("Enter Column Matrix 2:", 0, Integer.MAX_VALUE);
        }
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = getInteger("Enter Matrix2[" + (i + 1) + "]" + "[" + (j + 1) + "]:", 0, Integer.MAX_VALUE);
            }
        }
        return matrix;
    }
}
