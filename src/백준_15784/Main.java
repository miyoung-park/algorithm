package 백준_15784;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = sc.nextInt();
        int jRow = sc.nextInt() -1;
        int jColumn = sc.nextInt() -1;
        String[][] total = new String[N][N];
        String result = "HAPPY";

        for( int i=0; i<N; i++ ){
            total[i] = br.readLine().split(" ");
        }
        for( int i=0; i<total.length; i++ ){
            if( i == jRow -1 ){
                for( int k=0; k < total[i].length; k++ ){
                    if( Integer.parseInt(total[jRow][jColumn]) < Integer.parseInt(total[i][k]) ){
                        result = "ANGRY";
                    }
                }
            }
            for( int j=0; j<total[i].length; j++ ){
                if( j == jColumn -1 ){
                    if( Integer.parseInt(total[jRow][jColumn]) < Integer.parseInt(total[i][j]) ){
                        result = "ANGRY";
                    }
                }
            }
        }
        System.out.println(result);
    }
}
