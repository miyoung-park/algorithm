package 백준_1000_10000.백준_2985;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if( a+b == c ){
            System.out.printf("%d+%d=%d",a,b,c);
        }else if( a-b == c ){
            System.out.printf("%d-%d=%d",a,b,c);
        }else if( a*b == c ){
            System.out.printf("%d*%d=%d",a,b,c);
        }else if( a/b == c){
            System.out.printf("%d/%d=%d",a,b,c);
        }else if( a == b+c){
            System.out.printf("%d=%d+%d",a,b,c);
        }else if( a == b-c){
            System.out.printf("%d=%d-%d",a,b,c);
        }else if( a == b*c){
            System.out.printf("%d=%d*%d",a,b,c);
        }else if( a == b/c){
            System.out.printf("%d=%d/%d",a,b,c);
        }
    }
}
