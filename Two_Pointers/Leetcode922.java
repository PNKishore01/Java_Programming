/**
 * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
Return any answer array that satisfies this condition.

Example 1:
Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.

Example 2:
Input: nums = [2,3]
Output: [2,3]
 */

import java.util.*;
class Leetcode922{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before: " + Arrays.toString(arr));
        int[] ar = sortArrayByParityII(arr);
        System.out.println("After: " + Arrays.toString(ar));
    }

    public static int[] sortArrayByParityII(int[] nums) {
        int n=nums.length, even=0, odd=1;
        int[] arr = new int[n];
        for(int a:nums){
            if(a%2==0){
                arr[even]=a;
                even+=2;
            }
            else{
                arr[odd]=a;
                odd+=2;
            }
        }
        return arr;
    }
}