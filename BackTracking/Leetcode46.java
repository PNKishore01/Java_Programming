/**
 * Given an array nums of distinct integers, return all the possible permutations. You can return the answer 
 * in any order.

Example 1:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

Example 2:
Input: nums = [0,1]
Output: [[0,1],[1,0]]

Example 3:
Input: nums = [1]
Output: [[1]]
 */

import java.util.*;
class Leetcode46{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> al = permute(arr);
        System.out.println(al);
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> al = new ArrayList<>();
        permutations(0, nums, al);
        return al;
    }

    static void permutations(int a, int[] arr, List<List<Integer>> al){
        if(a==arr.length){
            List<Integer> l = new ArrayList<>();
            for(int i:arr)
                l.add(i);
            al.add(l);
            return;
        }

        for(int i=a; i<arr.length; i++){
            arr[i]=arr[a]+arr[i]-(arr[a]=arr[i]);
            permutations(a+1, arr, al);
            arr[i]=arr[a]+arr[i]-(arr[a]=arr[i]);
        }
    }
}