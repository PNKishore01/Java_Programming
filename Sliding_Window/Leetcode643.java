/**
 * You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this 
value. Any answer with a calculation error less than 10-5 will be accepted.

Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Example 2:
Input: nums = [5], k = 1
Output: 5.00000
 */

import java.util.*;
class Leetcode643{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target k value: ");
        int k = sc.nextInt();
        System.out.println("Max Avg subArray: " + findMaxAverage(arr,k));
    }

    public static double findMaxAverage(int[] nums, int k){
        int n=nums.length, sum=0;
        for(int i=0; i<k; i++){
            sum+=nums[i];
        }

        int max = sum;
        int i=0, j=k;
        while(j<n){
            sum-=nums[i++];
            sum+=nums[j++];
            max=Math.max(max,sum);
        }
        double d = (double)max/k;
        return d;
    }
}