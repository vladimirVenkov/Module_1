package Modules.Module_1;

import java.util.Scanner;

public class JaggedArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isNewLine = false;

        while (!isNewLine) {
            int  temp = in.nextInt();
//            if (temp.equals("//n")) {
//                isNewLine = true;
//                break;
//            }
            System.out.println(temp);
        }
        int [][] jagged = {
                {1,2,3,4,5,6},
                {3,4,5,6}
        };

    }
}
