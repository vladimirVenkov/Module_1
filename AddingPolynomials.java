package Modules.Module_1;

import java.util.Scanner;

public class AddingPolynomials {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        int[] poly = new int[n];
        for (int i = 0; i < n; i++) {
            poly[i] = in.nextInt();
        }
        in.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print((poly[i] + in.nextInt()) + " ");
        }
    }
}
