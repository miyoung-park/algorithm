package 백준_16430;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int stealCheese = sc.nextInt();
        int cheese = sc.nextInt();

        System.out.println( (cheese - stealCheese) + " " + cheese );

    }
}
