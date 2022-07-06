package 백준_10000_20000.백준_10818;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cycle = sc.nextInt();
        List<Integer> numberList = new ArrayList<>();
        for( int i = 0; i < cycle; i++ ){
            numberList.add(sc.nextInt());
        }
        int max = numberList.get(0);
        int min = numberList.get(0);
        for( int i = 0;i < numberList.size(); i++ ){
            max = max < numberList.get(i) ? numberList.get(i) : max;
            min = min > numberList.get(i) ? numberList.get(i) : min;
        }
        System.out.println(min + " " + max);
    }
}