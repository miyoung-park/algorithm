package 백준_3041;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] puzzleArr = new String[4][4];
        String[] puzzle;
        for( int i = 0; i < 4; i++ ){
            puzzle = br.readLine().split("");
            puzzleArr[i] = puzzle;
        }
       for( int i =0 ;i < puzzleArr.length; i++ ){
           for( int j = 0; j < puzzleArr[i].length; j++ ){
               if( puzzleArr[i][j].equals(".") ){
                   System.out.println( ( ( puzzleArr.length - 1 ) - i)  +  ( ( puzzleArr[i].length - 1) -j) );
               }
           }
       }
    }
}
