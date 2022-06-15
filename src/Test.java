import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean answer = false;
        if( str.length() == 4 || str.length() == 6){
            answer = true;
        }
        for( int i=0; i<str.length(); i++){
            if( str.charAt(i) < 48 || str.charAt(i) > 58 ){
                answer = false;
                break;
            }
        }
    }
}
