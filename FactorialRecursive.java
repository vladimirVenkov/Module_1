package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialRecursive {

    static int factorlRecursive(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorlRecursive(number - 1);
    }

    static int factoarialIterative(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        System.out.println(factorlRecursive(number));
        System.out.println(factoarialIterative(number));
    }
}
