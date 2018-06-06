package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HorsePath {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int matxSize = Integer.parseInt(br.readLine());
        int topMostOccupied = 0;
        int leftMostOccupied = 0;
        int rowCrnt = 0;
        int colCrnt = 0;
        int jumpN = 1;

        int[][] matrix = new int[matxSize][matxSize];
        matrix[0][0] = jumpN;
        jumpN ++;

        for (int i = 1; i < matxSize * matxSize; i++) {
            //case one
            if (isValidHorseJump(rowCrnt - 2, colCrnt - 1, matxSize)) {
                if (matrix[rowCrnt - 2][colCrnt - 1] == 0) {
                    matrix[rowCrnt - 2][colCrnt - 1] = jumpN;
                    rowCrnt += -2;
                    colCrnt += -1;
                    jumpN ++ ;
                    if (newMoveIsNextTopmostLeftmost(rowCrnt, colCrnt, topMostOccupied, leftMostOccupied, matxSize)) {
                        topMostOccupied = rowCrnt;
                        leftMostOccupied = colCrnt;
                    }

                    continue;
                }
            }
            //case two
            if (isValidHorseJump(rowCrnt - 2, colCrnt + 1, matxSize)) {
                if (matrix[rowCrnt - 2][colCrnt + 1] == 0) {
                    matrix[rowCrnt - 2][colCrnt + 1] = jumpN;
                    rowCrnt += -2;
                    colCrnt += +1;
                    jumpN ++ ;
                    if (newMoveIsNextTopmostLeftmost(rowCrnt, colCrnt, topMostOccupied, leftMostOccupied, matxSize)) {
                        topMostOccupied = rowCrnt;
                        leftMostOccupied = colCrnt;
                    }

                    continue;
                }
            }
            //case 3
            if (isValidHorseJump(rowCrnt - 1, colCrnt - 2, matxSize)) {
                if (matrix[rowCrnt - 1][colCrnt - 2] == 0) {
                    matrix[rowCrnt - 1][colCrnt - 2] = jumpN;
                    rowCrnt += -1;
                    colCrnt += -2;
                    jumpN ++ ;
                    if (newMoveIsNextTopmostLeftmost(rowCrnt, colCrnt, topMostOccupied, leftMostOccupied, matxSize)) {
                        topMostOccupied = rowCrnt;
                        leftMostOccupied = colCrnt;
                    }

                    continue;
                }
            }
            //case 4
            if (isValidHorseJump(rowCrnt - 1, colCrnt + 2, matxSize)) {
                if (matrix[rowCrnt - 1][colCrnt + 2] == 0) {
                    matrix[rowCrnt - 1][colCrnt + 2] = jumpN;
                    rowCrnt += -1;
                    colCrnt += +2;
                    jumpN ++ ;
                    if (newMoveIsNextTopmostLeftmost(rowCrnt, colCrnt, topMostOccupied, leftMostOccupied, matxSize)) {
                        topMostOccupied = rowCrnt;
                        leftMostOccupied = colCrnt;
                    }

                    continue;
                }
            }
            //case 5
            if (isValidHorseJump(rowCrnt + 1, colCrnt - 2, matxSize)) {
                if (matrix[rowCrnt + 1][colCrnt - 2] == 0) {
                    matrix[rowCrnt + 1][colCrnt - 2] = jumpN;
                    rowCrnt += +1;
                    colCrnt += -2;
                    jumpN ++ ;
                    if (newMoveIsNextTopmostLeftmost(rowCrnt, colCrnt, topMostOccupied, leftMostOccupied, matxSize)) {
                        topMostOccupied = rowCrnt;
                        leftMostOccupied = colCrnt;
                    }

                    continue;
                }
            }
            //case 6
            if (isValidHorseJump(rowCrnt + 1, colCrnt + 2, matxSize)) {
                if (matrix[rowCrnt + 1][colCrnt + 2] == 0) {
                    matrix[rowCrnt + 1][colCrnt + 2] = jumpN;
                    rowCrnt += +1;
                    colCrnt += +2;
                    jumpN ++ ;
                    if (newMoveIsNextTopmostLeftmost(rowCrnt, colCrnt, topMostOccupied, leftMostOccupied, matxSize)) {
                        topMostOccupied = rowCrnt;
                        leftMostOccupied = colCrnt;
                    }

                    continue;
                }
            }
            //case 7
            if (isValidHorseJump(rowCrnt + 2, colCrnt - 1, matxSize)) {
                if (matrix[rowCrnt + 2][colCrnt - 1] == 0) {
                    matrix[rowCrnt + 2][colCrnt - 1] = jumpN;
                    rowCrnt += +2;
                    colCrnt += -1;
                    jumpN ++ ;
                    if (newMoveIsNextTopmostLeftmost(rowCrnt, colCrnt, topMostOccupied, leftMostOccupied, matxSize)) {
                        topMostOccupied = rowCrnt;
                        leftMostOccupied = colCrnt;
                    }

                    continue;
                }
            }
            //case 8
            if (isValidHorseJump(rowCrnt + 2, colCrnt + 1, matxSize)) {
                if (matrix[rowCrnt + 2][colCrnt + 1] == 0) {
                    matrix[rowCrnt + 2][colCrnt + 1] = jumpN;
                    rowCrnt += +2;
                    colCrnt += +1;
                    jumpN ++ ;
                    if (newMoveIsNextTopmostLeftmost(rowCrnt, colCrnt, topMostOccupied, leftMostOccupied, matxSize)) {
                        topMostOccupied = rowCrnt;
                        leftMostOccupied = colCrnt;
                    }

                    continue;
                }
            }
            //case reset
            for (int j = topMostOccupied; j < matxSize; j++) {
                boolean secBreak = false;
                for (int k = 0; k < matxSize; k++) {
                    if (matrix[j][k] == 0) {
                        matrix[j][k] = jumpN;
                        rowCrnt = j;
                        colCrnt = k;
                        jumpN ++;
                        topMostOccupied = rowCrnt;
                        leftMostOccupied = colCrnt;

                        secBreak = true;
                        break;
                    }
                }
                if (secBreak) break;
            }

        }
        printMatrix(matxSize, matxSize, matrix);
    }
    //order of moves
    //rowIndx colIndx
    // -2       -1  1
    // -2       +1  2
    //-1        -2  3
    //-1        +2  4
    //+1        -2  5
    //+1        +2  6
    //+2        -1  7
    //+2        +1  8
    //else go topmLeftm 9
    //topmost leftmost free space
    public static boolean isValidHorseJump(int rowIndex, int colIndex, int matrixSize) {
        if (rowIndex >= 0 && rowIndex < matrixSize && colIndex >= 0 && colIndex < matrixSize) {
            return true;
        }
        return false;
    }

    public static boolean newMoveIsNextTopmostLeftmost(int rowCrntInd, int colCrntInd, int rowTopM, int colLftM, int matrxSize) {
        if (rowCrntInd == rowTopM && colCrntInd == colLftM + 1) {
            return  true;
        } else if (rowCrntInd == rowTopM - 1 && colCrntInd == 0 && colLftM == matrxSize - 1) {
            return true;
        }
        return  false;
    }

    public static void printMatrix(int rows, int colls, int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colls; j++) {
                if (matrix[i][j] != 0) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
