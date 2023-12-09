/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0074;

/**
 *
 * @author Nam Ast
 */
class Display {

    static void displayMenu() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("=======Calculator program======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix ");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
    }

    static void displayMatrix(int[][] matrix) {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println("");
        }
    }

    static void displayResult(int[][] matrix1, int[][] matrix2, String string, int[][] matrixResult) {
        System.out.println("-------- Result --------");
        Display.displayMatrix(matrix1);
        System.out.println(string);
        Display.displayMatrix(matrix2);
        System.out.println("=");
        Display.displayMatrix(matrixResult);
    }

    static void displayCaculator(String title) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println(title);
    }

}
