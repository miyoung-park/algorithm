package 백준_2167;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader( System.in ));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        String[][] arr = new String[N][M];
        for( int i=0; i<N; i++ ){
            arr[i] = br.readLine().split(" ");
        }
        String sumNum = br.readLine();
        for( int i=0; i<Integer.parseInt(sumNum); i++ ){
            String[] inputNum = br.readLine().split(" ");
            int I = Integer.parseInt(inputNum[0]) -1;
            int J = Integer.parseInt(inputNum[1]) -1;
            int X = Integer.parseInt(inputNum[2]) -1;
            int Y = Integer.parseInt(inputNum[3]) -1;
            int SUM = 0;
            for( int j=0; j< arr.length; j++ ){
                if( j == I ){
                    for( int k=0; k<arr[j].length; k++ ){
                        if( k >= J){
                            System.out.println("arr " + j + "," + k + ":: " + arr[j][k]);
                            SUM += Integer.parseInt(arr[j][k]);
                        }
                    }
                }
                if( I < j && j <= X ){
                    for( int z=0; z<arr[j].length; z++ ){
                        if( z <= Y){
                            System.out.println("arr " + j + "," + z + ":: " + arr[j][z]);
                            SUM += Integer.parseInt(arr[j][z]);
                        }
                    }
                }
            }

            System.out.println(SUM);

        }
    }
}
