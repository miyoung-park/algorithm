package 백준_10000_20000.백준_19698;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();
        int L = sc.nextInt();
        int cow = Math.min((W / L) * (H / L), N);
        System.out.println(cow);
    }
}
