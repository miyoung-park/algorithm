package 백준_1000_10000.백준_2884;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        if(M < 45) {
            H --;
            M = 60-(45-M);
            if(H < 0) H =23;
            System.out.println(H + " " + M);
        } else {
            M = M-45;
            System.out.println(H + " " + M);
        }
    }
}
