package 백준_2480;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int m = 0;
        for( int i=0; i<3; i++ ){
            int n = sc.nextInt();
            arr[n-1] += 1;
        }
        for( int i=0; i<arr.length; i++ ){
            if( arr[i] == 3 ){
                m = 10000 + ( (i+1) * 1000 );
                break;
            }
            if( arr[i] == 2 ){
                m = 1000 + ( (i+1) * 100);
                break;
            }
            if( arr[i] == 1 ){
                m = (i+1) * 100;
            }
        }
        System.out.println(m);
    }
}
