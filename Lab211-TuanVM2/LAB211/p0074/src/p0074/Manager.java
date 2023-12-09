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
class Manager {

    public static int[][] additionMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] matrixResult = new int[matrix1.length][matrix1[0].length];
        //Loop to compute each element of the resulting matrix 
        //access from 1st to the last elemnet of row
        for (int i = 0; i < matrix1.length; i++) {
            //access from 1st to the last elemnet of column
            for (int j = 0; j < matrix1[0].length; j++) {

                matrixResult[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return matrixResult;
    }

    public static int[][] subtractionMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] matrixResult = new int[matrix1.length][matrix1[0].length];
        //Loop to compute each element of the resulting matrix
        //access from 1st to the last elemnet of row
        for (int i = 0; i < matrix1.length; i++) {
            //access from 1st to the last elemnet of column
            for (int j = 0; j < matrix1[0].length; j++) {
                matrixResult[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return matrixResult;
    }

    public static int[][] multiplicationMatrix(int[][] matrix1, int[][] matrix2) {
        int[][] matrixResult = new int[matrix1.length][matrix2[0].length];

        //Loop to compute each element of the resulting matrix
        //access from 1st to the last elemnet of row
        for (int i = 0; i < matrix1.length; i++) {
            //access from 1st to the last elemnet of column
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrixResult[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrixResult;
    }
}
