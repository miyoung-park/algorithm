package 백준_10000_20000.백준_14489;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int saveOne = sc.nextInt();
        int saveTwo = sc.nextInt();
        int chickenValue = sc.nextInt();
        int result = 0;
        result = (saveOne + saveTwo) - (chickenValue * 2) >= 0 ? (saveOne + saveTwo) - (chickenValue * 2) : saveOne + saveTwo ;

        System.out.println(result);
    }
}
