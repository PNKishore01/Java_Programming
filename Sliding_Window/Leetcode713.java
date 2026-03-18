/**
 * Given an array of integers nums and an integer k, return the number of contiguous subarrays where the
 *  product of all the elements in the subarray is strictly less than k.

Example 1:
Input: nums = [10,5,2,6], k = 100
Output: 8
Explanation: The 8 subarrays that have product less than 100 are:
[10], [5], [2], [6], [10, 5], [5, 2], [2, 6], [5, 2, 6]
Note that [10, 5, 2] is not included as the product of 100 is not strictly less than k.

Example 2:
Input: nums = [1,2,3], k = 0
Output: 0
 */

import java.util.*;
class Leetcode713{

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
        System.out.println("Total subarray product less than k is: " + numSubarrayProductLessThanK(arr,k));
    }
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;

         int n=nums.length, l=0, p=1, c=0;
         for(int r=0; r<n; r++){
            p*=nums[r];

            while(p>=k){
                p/=nums[l++];
            } 

            c+=(r-l+1);
         }       
         return c;
    }
}