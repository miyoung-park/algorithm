package 백준_2525;

import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       int hour = sc.nextInt();
       int minute = sc.nextInt();
       int time = sc.nextInt();
       hour = hour + (minute + time)/60;
       minute = (minute + time)% 60;
       hour = hour >= 24 ? hour - 24 : hour;
        System.out.println( hour + " " + minute );
    }
}
