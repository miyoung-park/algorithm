package 백준_1000_10000.백준_1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int[] numberArr = new int[26];
        int max = 0;
        int idx = 0;
        int maxCount = 0;

        for( int i = 0; i < str.length(); i++ ){
            numberArr[(byte)str.charAt(i) - 65] += 1;
        }
        for( int i = 0; i < numberArr.length; i++ ){
            if( max == numberArr[i]){
                maxCount++;
            }
            if( max < numberArr[i] ){
                max = numberArr[i];
                idx = i;
                maxCount = 0;
            }
        }
        if( maxCount > 0 ){
            System.out.println("?");
            return;
        }
        System.out.println((char)(idx + 65));
    }
}
