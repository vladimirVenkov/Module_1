package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JorotheRabbitRe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] incInp = br.readLine().split(", ");
        int length = incInp.length;
        int[] positionValues = new int[length];
        for (int i = 0; i < length; i++) {
            positionValues[i] = Integer.parseInt(incInp[i]);
        }
        int maxJumpLength = 1;
        int step;
        for (int i=0;i<length;i++){
            for (int j =0; j<length;j++){
                if (i==j) continue;
                else if (positionValues[j] > positionValues[i]) {
                     step = j - i;
                    if (step < 0) step += length;
                    int jumps = maxjumps(step, i, positionValues,1, maxJumpLength);
                    if(jumps > maxJumpLength) maxJumpLength = jumps;
                }
                if(maxJumpLength == length)break;
            }
            if(maxJumpLength == length)break;
        }
        System.out.println(maxJumpLength);
    }
    private static int maxjumps(int step, int pos, int[]positionValues, int jump, int maxJ){
        if (jump == positionValues.length) return jump;
        if (jump > maxJ) maxJ = jump;

        int newPos = (pos + step) % positionValues.length;

        if (positionValues[newPos] > positionValues[pos]) return maxjumps(step, newPos, positionValues, ++jump, maxJ);
        else return maxJ;
    }
}
