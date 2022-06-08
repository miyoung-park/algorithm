package 백준_10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase(); // 대문자로 변환
        int[] numberArr = new int[26];
        for( int i = 0; i < 26; i++ ){
            numberArr[i] = -1; // 모든 숫자 -1 세팅
        }

        for( int i = 0; i < str.length(); i++ ){
            if(  numberArr[ (byte)str.charAt(i) - 65 ] == -1 ){
                numberArr[ (byte)str.charAt(i) - 65 ] = i;
            }
        }
        for( int i = 0; i < numberArr.length; i++ ){
            System.out.print(numberArr[i] + " ");
        }
    }
}
