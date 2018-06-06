package Modules.Module_1;

import java.util.ArrayList;
import java.util.Scanner;

public class IndicesSecond {
    public  static  void  main (String[] args) {

        //not working properly
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        input.nextLine();
        int[] indexToGo = new int [size];
        for (int i = 0; i < size; i++) {
            indexToGo[i] = input.nextInt();
        }
        //String[] indexToGo = input.nextLine().split( " ");
        ArrayList<Integer> result  = new ArrayList<>();
        int currentPlace = indexToGo[0];
        result.add(0);
        indexToGo[0] = -1;

        for (int i = 0; i < indexToGo.length; i++) {
            if (indexToGo[currentPlace] == -1) {
                //some debilitating formatting
                for (int j = 0; j < currentPlace - 1; j++) {
                    System.out.print(result.get(j) + " ");
                }
                System.out.print(result.get(currentPlace - 1) + "(");
                for (int j = currentPlace; j < result.size() - 1; j++) {
                    System.out.print(result.get(j) + " ");
                }
                System.out.print(result.get(result.size() - 1) + ")");
                break;
            }
            if (currentPlace < indexToGo.length && currentPlace > -1) {

                result.add(currentPlace);
                int temp = indexToGo[currentPlace];
                indexToGo[currentPlace] =  -1;
                currentPlace = temp;

            }
            if (currentPlace > indexToGo.length || currentPlace < 0)
                {
                for (int j = 0; j < result.size() - 1; j++) {
                    System.out.print(result.get(j) + " ");
                }
                System.out.print(result.get(result.size() - 1));
                break;
            }
        }
    }
}
