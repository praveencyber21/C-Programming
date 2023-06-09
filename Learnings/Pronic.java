package Learnings;

import java.util.Scanner;

public class Pronic {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         
        int mul = 0;
        for ( int i = 1; i<num; i++) {
            mul = i * (i+1);
            if( mul == num){
                
                System.out.println("pronic number");
                break;
            }
            
        }
        sc.close();
        
       
    }
}


