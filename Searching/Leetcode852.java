/**
 * 
 * You are given an integer mountain array arr of length n where the values increase to a peak element and 
 * then decrease.

Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1
 */

import java.util.*;
class Leetcode852{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Peak element index is: " + peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;

        for(int i=1; i<n-1; i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
                return i;
        }
        return 0;
    }
}