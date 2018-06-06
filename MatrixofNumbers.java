package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixofNumbers {
    static void printLine(int start, int size) {
        for (int i = 0; i < size - 1 ; i++) {
            System.out.print((i + start) + " ");
        }
        System.out.print(size + start - 1);
        System.out.println();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        for (int i = 1; i <= size; i++) {
            printLine(i,size);
        }
    }
}
