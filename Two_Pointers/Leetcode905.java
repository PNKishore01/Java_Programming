
/**
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the 
 * odd integers.
Return any array that satisfies this condition.

Example 1:
Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Example 2:
Input: nums = [0]
Output: [0]
 */

import java.util.*;
class Leetcode905{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Before: " + Arrays.toString(arr));
        int[] ar = sortArrayByParity(arr);
        System.out.println("After: " + Arrays.toString(ar));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length, i=0, j=n-1;
        while(i<=j){
            if(nums[i]%2==1){
                nums[j]=nums[i]+nums[j]-(nums[i]=nums[j]);
                j--;
            }
            else
                i++;
        }
        return nums;
    }
}