package 백준_9012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for( int i = 0; i < num; i++ ){
            String str = sc.next();
            String reStr = "";
            while( true ){
                reStr = str;
                str = str.replaceAll("\\(\\)", "");
                if( reStr.equals(str) ){
                    break;
                }
            }
            String result = str.equals("") ? "YES" : "NO";
            System.out.println(result);
        }
    }
}
