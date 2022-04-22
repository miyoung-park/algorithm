package 백준_2525;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while( sc.hasNextInt() ){
           int hour = sc.nextInt();
           int minute = sc.nextInt();
           int time = sc.nextInt();

           int endTime = minute + time;
           minute = endTime % 60;

        }
        sc.close();
    }
}
