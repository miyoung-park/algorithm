package 백준_14920;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),c = 1;
        while(n!=1)  {
            n = n%2==0 ? n/2 : 3*n+1;
            c++;
        }
        System.out.println(c);
    }
}


