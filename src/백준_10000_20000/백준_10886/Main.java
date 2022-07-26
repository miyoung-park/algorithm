package 백준_10000_20000.백준_10886;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int yes = 0;
        int no = 0;
        for( int i=0; i<c; i++ ){
            int n = sc.nextInt();
            if( n == 1 ) {
                yes++;
                continue;
            }
            no++;
        }
        System.out.println(  yes > no ? "Junhee is cute!" : "Junhee is not cute!");
    }
}
