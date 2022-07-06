package 백준_1000_10000.백준_2566;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int max = 0;
        String maxLocation = "";
        for( int i=0; i<81; i++ ){
            int num = sc.nextInt();
            if( max <= num ){
                max = num;
                maxLocation = (i/9+1) + " " + (i%9+1);
            }
        }
        System.out.println(max+ "\n" + maxLocation);
    }
}
