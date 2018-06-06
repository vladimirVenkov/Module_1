package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSumofSubsequenceDYNAMIC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] set = new int[n];
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            set[i] = Integer.parseInt(br.readLine());
            maxSum += set[i];
        }
        boolean[][] matrix = new boolean[n][maxSum]; //first column is allways true
        for (int i = 0; i < n; i++) {
            matrix [i][0] = true;
        }

        for (int i = 1; i < maxSum; i++) { //in first row only zero element and the one if any which equls sum and set[i] are true
            if (set[i] == i) {
                matrix[0][i] = true;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < maxSum; j++) {
                if (set[i] > j) {
                    matrix[i][j] = matrix[i - 1][j];
                } else {
                    //this will actually work for non negative set ...
                }
            }
        }
    }
    }
