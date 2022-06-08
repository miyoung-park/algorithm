package 백준_1157;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int[] numberArr = new int[26];

        for( int i = 0; i < str.length(); i++ ){
            numberArr[(byte)str.charAt(i) - 65] += 1;
        }
    }
}
