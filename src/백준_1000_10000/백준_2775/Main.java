package 백준_1000_10000.백준_2775;

import java.util.Scanner;

public class Main {
    public static void checkPeople(int floor, int num) {
        int numArr [][] = new int [15][15];

        for(int i = 0; i < 15; i++) {
            numArr[0][i] = i+1;
        }

        for(int i = 1; i< 15; i++) {
            numArr[i][0] = 1;
        }

        for(int i = 1; i< 15; i++) {
            for(int j = 1; j < 15; j++){
                numArr[i][j] = numArr[i][j-1] + numArr[i-1][j];
            }
        }
        System.out.println(numArr[floor][num-1]);
    }

    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //반복횟수

        for(int i = 0 ; i < T; i++) {
            int floor = sc.nextInt();
            int num= sc.nextInt();
            checkPeople(floor, num);
        }
    }
}
