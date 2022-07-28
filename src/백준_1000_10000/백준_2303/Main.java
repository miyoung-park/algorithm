package 백준_1000_10000.백준_2303;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        sc.nextLine();
        for( int i=0; i<c; i++ ){
            int max = 0;
            String[] numArr = sc.nextLine().split(" ");
            for( int j=0; j<numArr.length; j++ ){
                for( int k=j+1; k<numArr.length; k++ ){
                    for( int z=k+1; z<numArr.length; z++ ){
                        if( Integer.parseInt(numArr[j]) + Integer.parseInt(numArr[k]) + Integer.parseInt(numArr[z]) > max ){
                            max = Integer.parseInt(numArr[j]) + Integer.parseInt(numArr[k]) + Integer.parseInt(numArr[z]);
                        }
                    }
                }
            }
        }
    }
}