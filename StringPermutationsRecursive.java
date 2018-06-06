package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class StringPermutationsRecursive {
    static Set<String> uniqueBrackets = new HashSet<>();

    static void swapChars(char[] chArry, int fIndex, int sIndex) {
        char temp = chArry[fIndex];
        chArry[fIndex] = chArry[sIndex];
        chArry[sIndex] = temp;
    }

    static void permutations(char[] ch, int crntIndex) {
        if (crntIndex == ch.length - 1 && isCorrectBracket(ch)) {
            uniqueBrackets.add(String.valueOf(ch));
           // System.out.println(String.valueOf(ch));
        }
        for (int i = crntIndex; i < ch.length; i++) {
            swapChars(ch , crntIndex , i );
            permutations(ch, crntIndex + 1);
            swapChars(ch, crntIndex , i );
        }
    }

    static boolean isCorrectBracket(char[] chars) {
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                ++counter;
            } else {
                --counter;
            }
            if (counter < 0) return  false;
        }
        return true;
    }

    static char[] generateBracketLine(int count) {
        char[] ch = new char [count];
        for (int i = 0; i < count; i += 2) {
            ch[i] = '(';
        }
        for (int i = 1; i < count; i += 2) {
            ch[i] = ')';
        }
        return ch;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] brackets = generateBracketLine(Integer.parseInt(br.readLine()));
        permutations(brackets, 0);

        for (String temp:uniqueBrackets) {
            System.out.println(temp);
        }
        System.out.println(uniqueBrackets.size());

    }
}
