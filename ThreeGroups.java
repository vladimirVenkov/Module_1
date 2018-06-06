package Modules.Module_1;

import java.util.ArrayList;
import java.util.Scanner;

public class ThreeGroups {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> fistLine = new ArrayList<>();
        ArrayList<Integer> secondLine = new ArrayList<>();
        ArrayList<Integer> thirdLine = new ArrayList<>();
        String input = in.nextLine();
        String[]sepStr = input.split(" ");
        for (int i = 0; i < sepStr.length; i++) {
            int temp = Integer.parseInt(sepStr[i]);
            if (temp % 3 == 0) {
                fistLine.add(temp);
            } else if (temp % 3 == 1) {
                secondLine.add(temp);
            } else {
                thirdLine.add(temp);
            }

        }
       // fistLine.forEach(System.out::print);
        fistLine.forEach(x -> System.out.print(x + " "));

        System.out.println();
        secondLine.forEach(x -> System.out.print(x + " "));
        System.out.println();
        thirdLine.forEach(x -> System.out.print(x + " "));
        System.out.println();
//        System.out.println(fistLine);
//        System.out.println(secondLine);
//        System.out.println(thirdLine);
    }
}
