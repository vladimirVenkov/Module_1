package Modules.Module_1;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Indices{
        private static void InputMethod() {
            String input = "6\n" +
                    "1 2 3 4 5 7 8";
            System.setIn(new ByteArrayInputStream(input.getBytes()));
        }
        public static void main(String[] args) {
            //InputMethod();
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();

            int[] numbers = new int [n];
            for (int i = 0; i < n; i++) {
                numbers [i] = in.nextInt();
            }

            ArrayList<Integer> result = new ArrayList<>();

            boolean[] used = new boolean[n];
            for (int i = 0; i < n; i++) {
                used[i] = false;
            }
            int cycleStartIndex = -1;
            int currentIndex = 0;
            while (currentIndex > -1 && currentIndex < n - 1) {
                if (used[currentIndex]) {
                    cycleStartIndex = currentIndex;
                    break;
                }
                used[currentIndex] = true;
                result.add(currentIndex);
                currentIndex = numbers[currentIndex];
            }
            StringBuilder output = new StringBuilder();
            for (int x : result
                    ) {
                if (cycleStartIndex != -1 && x == cycleStartIndex) {
                    output.append("(");
                }
                output.append(x);
                output.append(" ");
            }
            if (cycleStartIndex != -1) {
                output.append(")");
            }
            String outputString = output.toString();
            outputString = outputString.replace(" (", "(");
            outputString = outputString.replace( " )", ")" );
            outputString = outputString.trim();

            System.out.println(outputString);
        }
}
