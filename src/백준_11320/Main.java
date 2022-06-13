package 백준_11320;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        for( int i=0; i<cycle; i++ ){
            double A = sc.nextInt();
            double B = sc.nextInt();
            int result = (int) (((A*A)/2 ) / ((B*B)/2));
            System.out.println( result );
        }
    }
}
