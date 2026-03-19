/**
 * 
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.

Example 1:
Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.

Example 2:
Input: nums = [0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1], k = 3
Output: 10
Explanation: [0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
 */

import java.util.*;
class Leetcode1004{

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
        System.out.println("Maximum consecutive ones is: " + longestOnes(arr,k));
    }

    public static int longestOnes(int[] nums, int k) {
        int n=nums.length, c=0, l=0, max=0;

        for(int r=0; r<n; r++){

            if(nums[r]!=1){
                if(c<k){
                    c++;
                }
                else{
                    while(c>=k){
                        if(nums[l]==0)
                            c--;
                        l++;
                    }
                    c++;
                }
            }
            max=Math.max(max, r-l+1);
        }
        return max;
    }
}