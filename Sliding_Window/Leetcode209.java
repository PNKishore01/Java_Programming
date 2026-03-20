/**
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a 
 * subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

Example 1:
Input: target = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: The subarray [4,3] has the minimal length under the problem constraint.

Example 2:
Input: target = 4, nums = [1,4,4]
Output: 1

Example 3:
Input: target = 11, nums = [1,1,1,1,1,1,1,1]
Output: 0
 */

import java.util.*;
class Leetcode209{

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
        System.out.println("Min size subarray sum equals to target is: " + minSubArrayLen(k,arr));
    }
    public static int minSubArrayLen(int target, int[] nums){
        int n=nums.length, sum=0, min=Integer.MAX_VALUE, j=0;

        for(int i=0; i<n; i++){
            sum+=nums[i];

            while(sum>=target){
                min=Math.min(min,i-j+1);
                sum-=nums[j++];
            }
        }

        if(min<Integer.MAX_VALUE) return min;
        return 0;
    }
}