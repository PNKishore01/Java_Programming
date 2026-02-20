/**
 * You are given an array of integers, your task is to divide the array into two sub-arrays (left and right) 
 * containing half of the array elements. Find the sum of the subarrays and then return the multiply of both 
 * the subarrays.

Note: If the length of the array is odd then the right half will contain one element more than the left half.

Examples :

Input : arr = [1, 2, 3, 4]
Output : 21
Explanation: Sum up an array from index 0 to 1 = 3, Sum up an array from index 2 to 3 = 7. 
Their multiplication is 21.

Input : arr = [1, 2] 
Output :  2 
Explanation: Their multiplication is 1*2 is equal to 2.
 */


import java.util.*;
class Left_Right{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row values count: ");
        int n = sc.nextInt();//should be greater than 1
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        multiply(arr);
    }
    static void multiply(int[] arr){
        int n=arr.length, m=n/2, lSum=0, rSum=0;
        for(int i=0; i<m; i++){
            lSum+=arr[i];
        }
        for(int j=m; j<n; j++){
            rSum+=arr[j];
        }
        System.out.println("Left Sum: " + lSum + ", Right Sum: " + rSum + " = " + (lSum*rSum));
    }
}