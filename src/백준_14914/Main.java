package 백준_14914;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int k = sc.nextInt();
        int num = 1;
        int result = 0;

        while( a + (num - 1) * d <= k ){
            if( a + (num - 1) * d == k ) {
                result += num;
                break;
            }
            num++;
        }
        if( result == 0 ){
            System.out.println("X");
            return;
        }
        System.out.println(result);
    }
}
