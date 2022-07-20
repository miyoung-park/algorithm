package 백준_10000_20000.백준_11024;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt( br.readLine() );
        for( int i=0 ; i<c; i++ ){
            int sum = 0;
            String[] arr = br.readLine().split(" ");
            for( int j=0; j< arr.length; j++ ){
                sum += Integer.parseInt(arr[j]);
            }
            System.out.println(sum);
        }
    }
}
