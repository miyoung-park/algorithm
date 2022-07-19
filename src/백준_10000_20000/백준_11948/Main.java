package 백준_10000_20000.백준_11948;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] AD = new int[4];
        int[] EF = new int[2];
        int temp = 0;
        int sum = 0;

        AD[0] = sc.nextInt();
        AD[1] = sc.nextInt();
        AD[2] = sc.nextInt();
        AD[3] = sc.nextInt();
        EF[0] = sc.nextInt();
        EF[1] = sc.nextInt();
        for( int i=0; i<4; i++ ){
            for( int j=i+1; j<4; j++ ){
                if( AD[i] > AD[j] ){
                    temp = AD[j];
                    AD[j] = AD[i];
                    AD[i] = temp;
                }
            }
        }
        sum = AD[1] + AD[2] + AD[3];
        System.out.println(  sum + EF[0] > sum + EF[1] ? sum + EF[0] : sum + EF[1] );
    }
}
