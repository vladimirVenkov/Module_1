package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimesToNwithMethods {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        printPrimesNumberToN(Integer.parseInt(br.readLine()));

    }

    public static boolean isPrime(int number) {
        //int maxDivider = (int)Math.sqrt(number);
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimesNumberToN(int number) {
        for (int i = 1; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
