package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumerologyRecursive {

    static int formula(int a, int b) {
        return (a + b) * (a ^ b) % 10;
    }
    static int[] counter = new int[10];
    static void numerology(int[] num, int index) {
        int length = num.length;
        System.out.println(formula(num[length - 2], num[length -1]));
        if (index == length - 1) {
            counter[formula(num[length - 2], num[length - 1])] ++ ;
            for (int value :
                    counter) {
                System.out.print(value + " ");
            }
           // return;
        }
        for (int i = index; i < length; i++) {

            int tempSecond = num[index];
            num[index] = formula(num[index - 1], num[index]);
            numerology( num , index ++);
            num[index] = tempSecond;
        }
    }
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String date = br.readLine();
        int [] numnerArry  = new int [date.length()];
        for (int i = 0; i < date.length(); i++) {
            numnerArry[i] = date.charAt(i) - '0';
        }
        for (int pr :
                numnerArry) {
            System.out.print(pr + " ");
        }
        numerology(numnerArry, 1);
        for (int value :
                counter) {
            System.out.print(value + " ");
        }
    }
}
