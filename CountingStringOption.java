package Modules.Module_1;

import java.util.Scanner;

public class CountingStringOption {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String incoming = in.nextLine().substring(8); //new substring is from 8 index onwards i.e. it cuts first 8 chars
        System.out.println(incoming);
        incoming = incoming.substring(0, incoming.length() - 4);//cuts 0 from the start and then 4 from the end
        //solve(["3"]); -> 3"]); -> 3
        System.out.println(incoming);

    }
}
