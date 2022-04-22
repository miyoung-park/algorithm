package 백준_2562;

import java.util.Scanner;

public class Main {
    //3, 29, 38, 12, 57, 74, 40, 85, 61
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numArr = new int[9];
        int MAX = numArr[0];
        int NUM = 0;
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = sc.nextInt();
        }

       for( int j = 0; j < numArr.length; j++){
           if( MAX < numArr[j] ){
               MAX = numArr[j];
               NUM = j + 1;
           }
       }
        System.out.println(MAX + "\n" + NUM );
    }

}
