package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumbersTriangle {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        printTriangle(number);
    }

    public static void printLineofNumbers(int number) {
        for (int i = 1; i < number; i++) {
            System.out.print (i + " ");
        }
        System.out.println(number);
        System.out.println();
    }

    public static void printTriangle(int number) {
        for (int i = 1; i <= number; i++) {
            printLineofNumbers(i);
        }
        for (int i = number -1 ; i >= 1 ; i--) {
            printLineofNumbers(i);
        }
    }
}
