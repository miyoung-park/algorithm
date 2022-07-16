package 백준_1000_10000.백준_2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
            }
            for (int j = num - i; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
