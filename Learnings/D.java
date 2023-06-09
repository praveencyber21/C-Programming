package Learnings;

import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        int sum = 0;
        int length = String.valueOf(N).length();
        int temp = N; // Store the original value of N
        
        int result = 0;
        while (temp != 0) {
            sum = temp % 10;
            result += (int) Math.pow(sum, length);
            length--;
            temp = temp / 10;
        }
        
        if (result == N) {
            System.out.println("Disarium Number");
        } else {
            System.out.println("Not a Disarium Number");
        }
        sc.close();
    }
}