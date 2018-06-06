package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverseRecursive {
    static String reverseString(String input) {
        if (input.equals("")) return "";
        return reverseString(input.substring(1)) + input.charAt(0);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        System.out.println(reverseString(inputString));
    }
}
