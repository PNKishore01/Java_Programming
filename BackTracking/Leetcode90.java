/**
 * Given an integer array nums that may contain duplicates, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

Example 1:
Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]

Example 2:
Input: nums = [0]
Output: [[],[0]]
 */

import java.util.*;
class Leetcode90{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> al = subsetsWithDup(arr);
        System.out.println(al);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new LinkedHashSet<>();
        int n = nums.length, val=(int)Math.pow(2,n);
        for(int i=0; i<val; i++){
            List<Integer> al = new ArrayList<>();
            int m=i, c=0;

            while(m>0){
                int r = m%2;
                if(r==1)
                    al.add(nums[c]);
                c++;
                m/=2;
            }
            set.add(al);
        }
        List<List<Integer>> list = new ArrayList<>(set);
        return list;
    }
}