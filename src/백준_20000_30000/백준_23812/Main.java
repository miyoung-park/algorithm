package 백준_20000_30000.백준_23812;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner( System.in );
        int num = sc.nextInt();
        int cycle = 5;

        for( int i = 0; i < cycle; i++ ){
            for( int k = 0; k < num; k++ ){
                if( i % 2 == 0 ){
                    for( int j = 0 ; j < cycle; j ++ ){
                        for( int z = 0; z < num; z ++ ){
                            String result = j == 0 || j == cycle - 1 ? "@" : " ";
                            System.out.print(result);
                        }
                    }
                    System.out.println();
                }
                if( i % 2 > 0 ){
                    for( int j = 0; j < cycle; j ++ ){
                        for( int z = 0; z < num; z ++ ){
                            System.out.print("@");
                        }
                    }
                    System.out.println();
                }
            }
        }
        sc.close();;
    }
}
