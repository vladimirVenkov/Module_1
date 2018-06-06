package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JorotheRabbit {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner in = new Scanner(System.in);
//        String[] incInp = in.nextLine().split(", ");
        String[] incInp = br.readLine().split(", ");
        int length = incInp.length;
        int[] positionValues = new int [length];

        for (int i = 0; i < length; i++) {
            positionValues[i] = Integer.parseInt(incInp[i]);
        }

        int maxJumpLength = 1;

        for (int i = 0; i < length; i++) { //starting positions; maybe first try all position with min step? and break if ...

            int step = 0;
            int crntJumps = 1;
            while (step < length -1) {//all different steps possible for i-th position
                int crntPos = i;
               // boolean[] isVisited = new boolean[length];
                if (crntJumps > maxJumpLength) maxJumpLength = crntJumps;
               // isVisited[i] = true;
                 crntJumps = 1;
                step++;
                while (positionValues[crntPos] >= positionValues[(crntPos + step) % length]) {//jumping good isGoodJump(isVisited, positionValues, crntPos, step)
                   crntJumps ++;
                    crntPos = (crntPos + step) % length;
                    System.out.println(crntJumps + " " + crntPos + " " + step + "<step");

                }
                maxJumpLength = Math.max(maxJumpLength, crntJumps);
                //if (maxJumpLength == length) break;
            }
            //if (maxJumpLength == length) break;
        }
        System.out.println(maxJumpLength);
    }

//    public static boolean isGoodJump(boolean[] isVisited, int[] positionArray, int crntPos, int jumpStep) {
//        int nextPosition = (crntPos + jumpStep) % positionArray.length ;
//        if (isVisited[nextPosition] || positionArray[crntPos] >= positionArray[nextPosition]) {
//            return false;
//        }
//        return true;
   // }
}
