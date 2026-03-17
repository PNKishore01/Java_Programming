/**
 * 
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the 
 * same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]

Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]
 */

import java.util.*;
class Leetcode75{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before: " + Arrays.toString(arr));
        sortColors(arr);
        System.out.println("After: " + Arrays.toString(arr));
    }
    public static void sortColors(int[] nums) {
        int n=nums.length, l=0, r=n-1, a=0;

        while(a<=r){
            if(nums[a]==0){
                nums[a]=nums[l]+nums[a]-(nums[l]=nums[a]);
                a++;
                l++;
            }
            else if(nums[a]==2){
                nums[a]=nums[r]+nums[a]-(nums[r]=nums[a]);
                r--;
            }
            else
                a++;
        }
    }
}