package 백준_1000_10000.백준_5354;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int[] numArr = new int[c];
        for( int z=0; z<c; z++ ){
            numArr[z] = sc.nextInt();
        }
        for( int x=0; x<c; x++ ){
            int num = numArr[x];
            for( int i=0; i<num; i++ ){
                if( !(0 < i  && i < num-1) ){
                    for( int j=0; j<num; j++){
                        System.out.print("#");
                    }
                } else {
                    for( int k=0; k<num; k++){
                        System.out.print( 0 < k && k < num-1 ? "J" : "#");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
