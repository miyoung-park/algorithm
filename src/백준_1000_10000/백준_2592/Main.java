package 백준_1000_10000.백준_2592;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int avr = 0;
        int md = 0;
        for( int i=0; i<10; i++ ){
            int n = sc.nextInt();
            avr += n;
            arr[n/10]++;
        }
        for( int i=0 ; i<arr.length; i++ ){
            md = md < arr[i] ? i : md;
        }
        System.out.println((avr/10) + "\n" + (md*10));
    }
}
