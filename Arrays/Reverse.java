/**
 * Write a Program to Print Given Array in Reverse Order?

Constraints:
Input :              First Line of Input Consists of One Integer Value (Array Size).
                    Second Line of Input Consists of few Integer Values Separated by Space (Array Elements).

Output :           Print all the Array Elements in Reverse Order.

Example:
Input 1 :         8
                46 18 11 73 93 21 34 19

Output 1 :     Given Array Elements - 46 18 11 73 93 21 34 19
                Reverse Array Elements - 19 34 21 93 73 11 18 46

Input 2 :        4
                  55 2 3 11

Output 2 :    Given Array Elements - 55 2 3 11
             Reverse Array Elements - 11 3 2 55
 */

import java.util.*;
class Reverse{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row values count: ");
        int n = sc.nextInt();//should be greater than 1
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Before: ");
        System.out.println(Arrays.toString(arr));
        reverseTheArr(arr);
        System.out.print("After: ");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    static void reverseTheArr(int[] arr){
        int n=arr.length, i=0, j=n-1;
        while(i<j){
            arr[i]=arr[j]+arr[i]-(arr[j]=arr[i]);
            i++;
            j--;
        }
    }
}