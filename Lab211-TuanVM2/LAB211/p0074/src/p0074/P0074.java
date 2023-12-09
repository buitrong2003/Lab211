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
public class P0074 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matrix1 = null;
        int[][] matrix2 = null, matrixResult = null;
        while (true) {
        //1 Display a menu and ask users to select an option.
            //Users run the program. The program prompts users to select an option.
            Display.displayMenu();
            //Users select an option, perform Function 2.
            int choice = GetData.getUserChoice();

        //2 Perform function based on the selected option.
            switch (choice) {
            //2.1 Addition matrixes
                case 1:
                    // Display caculator :  Addition 
                    Display.displayCaculator("-------- Addition --------");
                    //Get data of Matrix 1 
                    matrix1 = GetData.getMatrix1();
                    //Get data of Matrix 2 
                    matrix2 = GetData.getMatrix2(matrix1, choice);

                    //Implement  function: public int[][] additionMatrix (int[][] matrix1, int[][]matrix2)
                    //Intput : matrix1: The first matrix. &&   matrix2: The second matrix.
                    //Output : Return values: The result.
                    matrixResult = Manager.additionMatrix(matrix1, matrix2);

                    //display result Matrix1 + Matrix 2                   
                    Display.displayResult(matrix1, matrix2, "+", matrixResult);
                    break;
            //2.2  Subtraction matrixes  
                case 2:
                    //Display caculator :  Subtraction
                    Display.displayCaculator("-------- Subtraction --------");
                    //Get data of Matrix 1 
                    matrix1 = GetData.getMatrix1();
                    //Get data of Matrix 2 
                    matrix2 = GetData.getMatrix2(matrix1, choice);

                    //Implement  function: public int[][] subtractionMatrix (int[][] matrix1, int[][]matrix2)
                    //Intput : matrix1: The first matrix. &&   matrix2: The second matrix.
                    //Output : Return values: The result.
                    matrixResult = Manager.subtractionMatrix(matrix1, matrix2);

                    //display result Matrix1 - Matrix 2 
                    Display.displayResult(matrix1, matrix2, "-", matrixResult);
                    break;
            //2.3  Multiplication matrixes
                case 3:
                    //Display caculator :  Multiplication
                    Display.displayCaculator("-------- Multiplication --------");
                    //Get data of Matrix 1 
                    matrix1 = GetData.getMatrix1();
                    //Get data of Matrix 2 
                    matrix2 = GetData.getMatrix2(matrix1, choice);

                    //Implement  function: public int[][] multiplicationMatrix(int[][] matrix1, int[][]matrix2)
                    //Intput : matrix1: The first matrix. &&   matrix2: The second matrix.
                    //Output : Return values: The result.
                    matrixResult = Manager.multiplicationMatrix(matrix1, matrix2);

                    //display result of  Matrix 1 * Matrix 2 
                    Display.displayResult(matrix1, matrix2, "*", matrixResult);
                    break;

            }
        }
    }

}
