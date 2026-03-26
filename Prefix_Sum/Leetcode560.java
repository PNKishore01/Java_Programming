/**
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:
Input: nums = [1,1,1], k = 2
Output: 2

Example 2:
Input: nums = [1,2,3], k = 3
Output: 2
 */

import java.util.*;
class Leetcode560{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k value: ");
        int k = sc.nextInt();
        System.out.println(subarraySum(arr,k));
    }
    public static int subarraySum(int[] nums, int k) {
        int n=nums.length, sum=0, count=0;
        Map<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        for(int a:nums){
            sum+=a;
            if(hm.containsKey(sum-k))
                count+=hm.get(sum-k);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return count;
    }
}