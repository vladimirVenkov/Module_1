package Modules.Module_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MazeRecursive {
    static boolean findPath(char[][] matrix, int x, int y, char goal) {
        if ( x < 0 || y < 0 || (x >= matrix.length || y >= matrix[0].length) ) return  false;

        if(matrix[x][y] == goal) return true;

        if(matrix [x][y] == 'X' || matrix[x][y] == '#') return false;
        matrix[x][y] = 'v';
        if ( findPath(matrix, x , y + 1, goal)) return true;
        if ( findPath(matrix, x + 1, y , goal)) return true;
        if ( findPath(matrix, x, y - 1 , goal)) return true;
        if ( findPath( matrix, x - 1, y, goal)) return true;
        matrix[x][y] = 'X';
        return false;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] matrixRows = {
                "S...###",
                "#.#...#",
                "#.##.##",
                "..#.###",
                "#...#G#",
                "#.#...#"
        };
        char[][] matrix = new char[matrixRows.length][matrixRows[0].length()];
        for (int i = 0; i < matrixRows.length; i++) {
            matrix[i] = matrixRows[i].toCharArray();
        }
        System.out.println(matrix[0].length + " " + matrix.length);
        System.out.println(matrix[0][6]);
        //System.out.println(findPath(matrix, 0, 0, 'G'));

    }
}
