/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the 
 * elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */

import java.util.*;
class Leetcode238{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int[] ar = productExceptSelf(arr);
        System.out.println(Arrays.toString(ar));
    }
    public static int[] productExceptSelf(int[] nums){
        int n=nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0]=1;
        right[n-1]=1;
        for(int i=0; i<n-1; i++){
            left[i+1]=left[i]*nums[i];
            right[n-i-2]=right[n-i-1]*nums[n-i-1];
        }
    
        for(int i=0; i<n; i++){
            nums[i]=left[i]*right[i];
        }
        return nums;
    }
}