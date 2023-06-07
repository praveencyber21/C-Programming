
import java.util.*;


public class Disarium {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int temp = N;
        int sum = 0;
        int length = String.valueOf(N).length();

        int result = 0;
        while (temp != 0) {
            
            sum = temp % 10;
            result = result + (int) Math.pow( sum, length);
            
            
            length--;
            temp = temp / 10;

           
        }
        
        if (result == N) {

            System.out.println("Disarium Number");
        }
        else {
            System.out.println("Not a Disarium Number");

        }

        
    }
}