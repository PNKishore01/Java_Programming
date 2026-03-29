/**
 * Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Example 2:
Input: nums = [0]
Output: [[],[0]]
 */

import java.util.*;
class Leetcode78{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> al = subsets(arr);
        System.out.println(al);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        int n=nums.length, val=(int)Math.pow(2,n);

        for(int i=0; i<val; i++){
            List<Integer> l = new ArrayList<>();
            int m=i, c=0;

            while(m>0){
                int r = m%2;
                if(r==1)
                    l.add(nums[c]);
                c++;
                m/=2;
            }
            al.add(l);
        }
        return al;
    }
}