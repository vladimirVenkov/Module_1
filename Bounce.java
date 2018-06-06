package Modules.Module_1;

import java.util.Scanner;

public class Bounce {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        long [] powrsTwo = new long [n + m -1];
        powrsTwo[0] = 1;
        for (int i = 1; i < n + m - 1; i++) {
            powrsTwo[i] = powrsTwo[i - 1] * 2 ;
        }
        int currentR = 0;
        int currentC = 0;
        int horizontal = 1;
        int vertical = 1;
        long result = 1 ;
        while (true) {
            int nextR = currentR + vertical;
            int nextC = currentC + horizontal;
            if (nextR < 0 || n <= nextR) {
                vertical *= -1;
            }
            if (nextC < 0 || m <= nextC) {
                horizontal *= -1;
            }
            currentR += vertical;
            currentC += horizontal;
            if ( currentR < 0 || currentR >= n ||  currentC < 0 || currentC >= m) {
                break;
            }
            result += powrsTwo[currentR + currentC];
                if (currentR == 0 && currentC == 0) {
                    break;
                } else if (currentR == 0 && currentC == m - 1) {
                    break;
                } else if (currentR == n - 1 && currentC == 0) {
                    break;
                } else if (currentR == n - 1 && currentC == m - 1) {
                    break;
                }


        }
        System.out.println(result);
    }
}
