package 백준_10000_20000.백준_14914;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int idx = 0;
        while(true){
            ++idx;
            if( idx > a || idx > b ){
                break;
            }
            if( a%idx == 0 && b%idx == 0 ){
                System.out.printf("%d %d %d \n", idx,a/idx,b/idx);
            }
        }
    }
}
