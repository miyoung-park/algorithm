package 백준_1000_10000.백준_4153;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numArr[] = new int[3];
        while(true) {
            for(int i = 0; i<3; i ++) {
                numArr[i] = sc.nextInt();
            }
            if(numArr[0]+numArr[1]+numArr[2] == 0) {
                break;
            }
            for(int i = 0 ; i < numArr.length-1; i++) {
                for(int j = 0; j<numArr.length-1; j++) {
                    if(numArr[j] > numArr[j+1]) {
                        int num = numArr[j];
                        numArr[j] = numArr[j+1];
                        numArr[j+1] = num;
                    }
                }
            }
            if((numArr[0]*numArr[0] + numArr[1]*numArr[1]) == numArr[2]*numArr[2]) {
                System.out.println("right");
                return;
            }
            System.out.println("wrong");
        }
    }
}
