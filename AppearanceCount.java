package Modules.Module_1;

import java.util.Scanner;

public class AppearanceCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String[] array = in.nextLine().split(" ");
        int number = in.nextInt();
        int countNum = 0;
        for (int i = 0; i < n; i++) {
            if (number == Integer.parseInt(array[i])) {
                countNum ++;
            }
        }
        System.out.println(countNum);
    }
}
