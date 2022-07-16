package 백준_1000_10000.백준_1065;
import java.util.Scanner;

public class Main {
    static int hansoo(int N) {
        int hansoo = 0;
        for (int i = 1; i <= N; i++) {

            if (i < 100){
                hansoo++;
            } else if (i <= 1000) {
                String input = String.valueOf(i);
                int num1 = input.charAt(1) - input.charAt(0);
                int num2 = input.charAt(2) - input.charAt(1);
                if (num1 == num2)
                    hansoo++;
            }
        }
        return hansoo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(hansoo(N));
    }
}