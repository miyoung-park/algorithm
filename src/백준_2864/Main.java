package 백준_2864;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String numOne = sc.next();
        String numTwo = sc.next();
        int min = 0;
        int max = 0;
        // 최소값
        min = Integer.parseInt(numOne.replaceAll("[6]", "5")) + Integer.parseInt(numTwo.replaceAll("[6]", "5"));
        max = Integer.parseInt(numOne.replaceAll("[5]", "6")) + Integer.parseInt(numTwo.replaceAll("[5]", "6"));

        System.out.println(min + " " + max);
    }
}
