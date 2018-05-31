package Modules.Module_1;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ModulOneArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // int [] numbers = new int [8];
//        int [] numbersTwo = {1,2,3};
        String input = "123456";

        for (int i = 0; i <= (input.length() - 1) / 2 ; i++) {
            input = swapTwoCharInString(input,i,input.length()-i-1);
        }
        System.out.println(input);
//        String[] array = in.nextLine().split(" ");
//        for (int i = array.length - 1; i >= 1; i--) {
//            System.out.print(array[i] + ", ");
//        }
//        System.out.println(array[0]);

    }
    static String swapTwoCharInString(String inputString, int firstCharIndex, int secondCharIndex) {
        char[] charArrayFromString = inputString.toCharArray();
        char temp = charArrayFromString[firstCharIndex];
        charArrayFromString[firstCharIndex] = charArrayFromString[secondCharIndex];
        charArrayFromString[secondCharIndex] = temp;
        return  new String(charArrayFromString);
    }
    static void fakeInput () {
        String test = "4\n"+
                "5\n" +
                "4";
        System.setIn(new ByteArrayInputStream(test.getBytes()));
    }
}
