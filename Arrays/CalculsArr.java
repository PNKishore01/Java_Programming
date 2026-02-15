/**
 * Write a Program to Find the sum of all odd numbers,
 * sum of all even numbers,
 * sum of all numbers,
 * Avg of all numbers
 * from a Given Array?
 */

import java.util.*;
class CalculsArr{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row values count: ");
        int n = sc.nextInt();//should be greater than 1
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Array: ");
        System.out.println(Arrays.toString(arr));
        allCalculs(arr);
        sc.close();
    }
    static void allCalculs(int[] arr){
        int n=arr.length, sum=0, oddSum=0, evenSum=0;
        for(int i=0; i<n; i++){
            if(arr[i]%2==1)
                oddSum+=arr[i];
            else 
                evenSum+=arr[i];
            
            sum+=arr[i];
        }
        System.out.println("Sum of Odd Nums: " + oddSum);
        System.out.println("Sum of even Nums: " + evenSum);
        System.out.println("Sum of all Nums: " + sum);
        System.out.println("Average of all Nums: " + (sum/n));   
    }
}