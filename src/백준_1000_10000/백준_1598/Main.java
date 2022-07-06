package 백준_1000_10000.백준_1598;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        int[][] numberArr = {{from % 4, from / 4 + 1}, {to % 4, to / 4 + 1}};
        for (int i = 0; i < numberArr.length; i++) {
            if ( numberArr[i][0] % 4 == 0)  {
                numberArr[i][0] = 4;
                numberArr[i][1] -= 1;
            }
        }
        System.out.println( Math.abs(numberArr[0][0] - numberArr[1][0]) + Math.abs(numberArr[0][1] - numberArr[1][1]) );
    }
}
