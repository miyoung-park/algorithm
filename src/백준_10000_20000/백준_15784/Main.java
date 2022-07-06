package 백준_10000_20000.백준_15784;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int jRow = Integer.parseInt(input[1]);
        int jColumn = Integer.parseInt(input[2]);
        String[][] total = new String[N][N];
        String result = "HAPPY";

        for( int i=0; i<N; i++ ){
            total[i] = br.readLine().split(" ");
        }
        for( int i=0; i<N; i++ ){
            int tempA = Integer.parseInt( total[i][jColumn-1] );
            int tempB = Integer.parseInt( total[jRow-1][i] );
            if( Integer.parseInt(total[jRow-1][jColumn-1]) < tempA || Integer.parseInt(total[jRow-1][jColumn-1]) < tempB ){
                result = "ANGRY";
            }
        }
        System.out.println(result);
    }
}
