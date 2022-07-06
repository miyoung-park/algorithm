package 백준_10000_20000.백준_10430;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while( sc.hasNextInt() ){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            System.out.println( (X+Y)%Z );
            System.out.println( ((X%Z) + (Y%Z))%Z );
            System.out.println( (X*Y)%Z );
            System.out.println( ((X%Z) * (Y%Z))%Z );
        }
        sc.close();
    }
}
