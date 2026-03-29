/**
 * Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

Example 1:
Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]

Example 2:
Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */

import java.util.*;
class Leetcode47{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> al = permuteUnique(arr);
        System.out.println(al);
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> s = new LinkedHashSet<>();
        permutate(s, nums, nums.length, 0);
        List<List<Integer>> al = new ArrayList<>(s);
        return al;
    }

    static void permutate(Set<List<Integer>> s, int[] arr, int n, int st){
        if(st==n-1){
            List<Integer> l = new ArrayList<>();
            for(int i:arr)
                l.add(i);
            s.add(l);
            return;
        }

        for(int i=st; i<n; i++){
            arr[i]=arr[st]+arr[i]-(arr[st]=arr[i]);
            permutate(s,arr,n,st+1);
            arr[i]=arr[st]+arr[i]-(arr[st]=arr[i]);
        }
    }
}