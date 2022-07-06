package 백준_1000_10000.백준_2577;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        String[] arr = String.valueOf(f * s * t).split("");
        int[] reArr = new int[10];
        for( int i=0; i< arr.length; i++ ){
            reArr[Integer.parseInt(arr[i])] += 1;
        }
        for ( int num : reArr) {
            System.out.println(num);
        }
    }
}
