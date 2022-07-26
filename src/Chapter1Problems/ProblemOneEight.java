package Chapter1Problems;

import java.util.ArrayList;

public class ProblemOneEight {

    public void runProblem(){
        int m = 12;
        int n = 15;
        int[][] matrix= createMatrix(m, n);
        zeroTheRowsAndColumns(matrix, m, n);
    }

    public static int[][] createMatrix(int m, int n){
        int[][] theMatrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                theMatrix[i][j] = 7;
            }
        }
        theMatrix[2][2] = 0;
        theMatrix[6][8] = 0;
        System.out.println("Original matrix:");
        printMatrix(theMatrix, m, n);
        return theMatrix;
    }

    public static void zeroTheRowsAndColumns(int[][] input, int rows, int cols){
        ArrayList<Integer> zeroesFound = new ArrayList<>();
        int counter = 0;
        int activeRow;
        int activeCol;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (input[i][j] == 0){
                    counter++;
                    zeroesFound.add(i);
                    zeroesFound.add(j);
                }
            }
        }
        for (int i = 0; i < counter; i++) {
            activeRow = zeroesFound.get(0);
            zeroesFound.remove(0);
            activeCol = zeroesFound.get(0);
            zeroesFound.remove(0);
            for (int j = 0; j < cols; j++) {
                input[activeRow][j] = 0;
            }
            for (int j = 0; j < rows; j++) {
                input[j][activeCol] = 0;
            }
        }
        System.out.println("Matrix after setting appropriate columns and rows to zero:");
        printMatrix(input, rows, cols);
    }

    public static void printMatrix(int[][] input, int rows, int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(input[i][j]);
            }
            System.out.println();
        }
    }

}
