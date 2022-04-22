package 백준_10871;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int [] numArr = new int[N];

        for(int i = 0; i < numArr.length; i++) {
            int n = sc.nextInt();
            numArr[i] = n;
        }


        for(int i = 0; i < numArr.length; i++) {
            if(numArr[i] < X) {
                System.out.print(numArr[i] + " ");
            }
        }
    }
}