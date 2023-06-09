package Learnings;

import java.util.*;

public class Array_rotate {
    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    //Get Array length
    System.out.println("Enter array length: ");
    int length = sc.nextInt();

    //Declare array
    int arr[] = new int[length];
    //Get Array
    System.out.println("Enter the values: ");
    for(int i=0; i<length; i++){
        arr[i] = sc.nextInt();
    }

    //Get no of rotation
    System.out.println("Enter no.of rotation");
    int rotation = sc.nextInt();

    rotateElement(arr, length, rotation);

    System.out.println(Arrays.toString(arr));
    sc.close();


    }
    static void rotateElement( int[] arr,  int length,  int rotation){

        if ( rotation > 0){
            rotation = rotation % length;
        }
        else if (rotation < 0){
            rotation = rotation % length + length;
        }

        //First part 
        reverseElement(arr, 0, length-rotation-1); // 0, N - K - 1

        //second part
        reverseElement(arr, length-rotation, length-1); // N - K, N - 1

        //Whole part
        reverseElement(arr, 0, length-1);// 0, N - 1
        
    }

    static void  reverseElement(int[] arr, int start, int end){
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        }
        

    }

