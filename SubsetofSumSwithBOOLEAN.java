package Modules.Module_1;

import java.util.Scanner;

public class SubsetofSumSwithBOOLEAN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sumS = in.nextInt();
        in.nextLine();

        String[] numbers = in.nextLine().split(" ");
        int[] numInt = new int [numbers.length];

        for (int i = 0; i < numbers.length; i++) {
        numInt[i] = Integer.parseInt(numbers[i]);
        }
        if (IsThereSubsetToSumS(numInt, sumS)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

    public static boolean IsThereSubsetToSumS(int[] setOfNumbers, int SumToBeChecked) {
        boolean[][] matrix = new boolean[setOfNumbers.length][SumToBeChecked +1];
        for (int i = 0; i < setOfNumbers.length; i++) {
            for (int j = 0; j < SumToBeChecked + 1 ; j++) {
                if (j == 0) { //all j = 0 are true
                    matrix[i][j] = true;
                    continue;
                }
                if (i == 0 && setOfNumbers[0] == j) { //on first row only this case and j = 0 are true
                    matrix[i][j] = true;
                    continue;
                } else if (i == 0) { //all others are false on first row
                    matrix[i][j] = false;
                    continue;
                }
                if (matrix[i - 1][j] == true) { //if cell above is true so this is
                    matrix[i][j] = true;
                    continue;
                }
                if (setOfNumbers[i] > j) {
                    //get value from top if number from array is larger than current sum number
                    matrix[i][j] = matrix[ i - 1 ][j];
                } else if (setOfNumbers[i] == j) {
                    matrix[i][j] = true; //yes we have subset sum for example 3/3
                } else {
                    //one step up and setofNumbers[i] steps back to see if it is true or false and get it
                    matrix[i][j] = matrix [ i - 1] [ j - setOfNumbers[i]];
                }
            }
        }
        return matrix[setOfNumbers.length - 1][SumToBeChecked];
    }
}
