package Modules.Module_1;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiDimArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger [] [] matrix = new BigInteger[n][n];
//        int [][] matrixTwo = {
//                {1,2,4},
//                {1,3,4}
//        };
        int rowsCount = matrix.length;

        BigInteger sum = BigInteger.valueOf(0);

        for (int i = 0; i < rowsCount; i++) {
            int columnsCount = matrix[i].length;
            for (int j = 0; j < columnsCount; j++) {
              //  BigInteger cell = BigInteger.valueOf(1 << (i+j));
                BigInteger cell = powerOfTwo(i+j);
                matrix[i][j] = cell;
                if (i <= j) {
                    sum = sum.add(cell);
                }
            }
        }

        System.out.println(sum);
       // printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static BigInteger powerOfTwo(int powerOfTwo) {
        BigInteger power = BigInteger.valueOf(1);
        for (int i = 0; i < powerOfTwo ; i++) {
            power = power.multiply(BigInteger.valueOf(2));
        }
        return power;
    }
}
