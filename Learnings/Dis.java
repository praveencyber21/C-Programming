package Learnings;

import java.util.Scanner;

public class Dis {

    
    static int Length(int num1) {

        int len = String.valueOf(num1).length();

        return len;
    }
    

    static int Disarium(int num1){
        int result = 0;
        int len = Length(num1);
        int temp = num1;
        int sum;
        while (temp != 0) {
            
            sum = temp % 10;
            result = result + (int) Math.pow( sum, len);  
            len--;
            temp = temp / 10;

           
        }
         
        return result;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int result = 0;
        // //System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        //System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // for ( int i=1; i<=num; i++) {

        //     result = Disarium(i);
        //     if(result == i) {
        //         System.out.println(i);
        //     }
        // }

        for ( int i=num1; i<=num2; i++) {

            result = Disarium(i);
            if(result == i) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}