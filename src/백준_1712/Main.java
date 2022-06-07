package 백준_1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numArr = br.readLine().split(" ");
        long fc = Integer.parseInt(numArr[0]);
        long vc = Integer.parseInt(numArr[1]);
        long sc = Integer.parseInt(numArr[2]);
        long num = 1;

        while( true ){
            long bfeBreakPoint = fc + ( vc * num ) - sc * num ;
            if( bfeBreakPoint < 0){
                break;
            }
            num++;
            long afrBreakPoint = fc + ( vc * num ) - sc * num;
            if( bfeBreakPoint < afrBreakPoint ){
                num = -1;
                break;
            }
        }
         System.out.println( num );
    }
}
