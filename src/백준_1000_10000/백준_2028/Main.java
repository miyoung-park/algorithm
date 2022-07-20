package 백준_1000_10000.백준_2028;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        for( int i=0; i<c; i++ ){
            int num = sc.nextInt();
            int dNum = num * num;
            String dNumStr = String.valueOf(dNum);
            String result = dNumStr.substring(dNumStr.length()/2 , dNumStr.length() );
            System.out.println( String.valueOf(num).equals(result) ? "YES" :  "NO" );
        }
    }
}