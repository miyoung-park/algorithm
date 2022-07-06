package 백준_1000_10000.백준_1284;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cm = 0;

        while( true ){
            String[] numArr = sc.next().split("");
            if( numArr.length == 1 && numArr[numArr.length - 1].equals("0") ){
                break;
            }
            cm += ( numArr.length - 1 ) + 2; // 숫자 길이 -1 만큼의 여백
            for( String num : numArr ){
                switch ( num ) {
                    case "0" : cm += 4; break;
                    case "1" : cm += 2; break;
                    default: cm += 3;
                }
            }
            System.out.println(cm);
        }
    }
}
