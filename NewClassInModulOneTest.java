package Modules.Module_1;

import java.util.Scanner;

public class NewClassInModulOneTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.nextLine();
        int n = 0;
        for (int i = 0 ; i < number.length(); i ++){
            char ch = number.charAt(i);
            if (Character.isDigit(ch)){
                n+= ch - '0';
            }
        }
        //System.out.println(n);
        while(n > 9){
            n = n/10 + n%10;
        }
        System.out.println(n);
        System.out.printf("print again %s %n", n);
    }
}
