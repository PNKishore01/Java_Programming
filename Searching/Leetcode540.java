/**
 * You are given a sorted array consisting of only integers where every element appears exactly twice, 
 * except for one element which appears exactly once.

Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.

Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2

Example 2:
Input: nums = [3,3,7,7,10,11,11]
Output: 10
 */

import java.util.*;
class Leetcode540{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Single element is: " + singleVal(arr));
    }

    static int singleVal(int[] arr){
        int i=0, j=1, n=arr.length;

        while(i<n-1 && j<n){
            if(arr[i]!=arr[j])
                return arr[i];
            
            i+=2;
            j+=2;
        }
        return -1;
    }
}