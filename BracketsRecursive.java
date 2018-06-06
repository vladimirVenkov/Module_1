package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BracketsRecursive {
    static Set<String> uniqueBrackets = new HashSet<>();
    static HashSet<String> brackets = new HashSet<>();

    static HashSet<String> generateExp(String exp, int n) {
        HashSet<String> brackets = new HashSet<>();
        if (exp.length() >= n ) {
            brackets.add((exp));
            return brackets;
        }
        HashSet<String> currentBrackets = generateExp(exp + "()", n);
        brackets.addAll(currentBrackets);

        currentBrackets = generateExp("(" + exp + ")", n);
        brackets.addAll(currentBrackets);

        currentBrackets = generateExp("()" + exp, n);
        brackets.addAll(currentBrackets);

        return brackets;
    }

//    static void genBrackets(ArrayList<Character> brackets, int length, int position) {
//        if (brackets.size() == length) {
//            uniqueBrackets.add(brackets.toString());
//            brackets.removeAll();
//        }
//        for (int i = 0; i < length / 2; i++) {
//            if (i == 0) {
//                brackets.add(')');
//                brackets.add(0, '(');
//                genBrackets(brackets, length, i);
//            }
//            if (i == 1) {
//                brackets.add('(');
//                brackets.add(')');
//                genBrackets(brackets, length, i);
//            }if (i == 2) {
//                brackets.add(0, ')');
//                brackets.add(0, '(');
//                genBrackets(brackets, length, i);
//            }
//        }
//
//    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //char[] brackets = generateBracketLine(Integer.parseInt(br.readLine()));
        //ArrayList<Character> brackets = new ArrayList<>();
        HashSet<String> expre = generateExp("" , 6);
        for (String text :
                expre) {
            System.out.println(text);
        }
    }
}
