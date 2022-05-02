package 백준_2750;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] numArr = new int[N];
        int temp = 0;

        for( int i = 0; i < N; i++ ){
            numArr[i] = sc.nextInt();
        }

        for( int j = 0; j < N; j++ ){
           for( int z = 0; z < N; z++ ){
               if( numArr[j] < numArr[z] ){
                   temp = numArr[j];
                   numArr[j] = numArr[z];
                   numArr[z] = temp;
               }
           }
        }

        for( int num : numArr ){
            System.out.println(num);
        }
    }
}
