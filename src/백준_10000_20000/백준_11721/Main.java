package 백준_10000_20000.백준_11721;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.next().split("");
        for( int i = 0; i < strArr.length; i++ ){
            System.out.print(strArr[i]);
            if( ( i + 1 ) % 10 == 0){
                System.out.println("");
            }
        }
    }
}
