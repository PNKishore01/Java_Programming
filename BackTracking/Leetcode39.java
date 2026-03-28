/**
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique 
 * combinations of candidates where the chosen numbers sum to target. You may return the combinations in any 
 * order.
The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency of at least one of the chosen numbers is different.
The test cases are generated such that the number of unique combinations that sum up to target is less than 
150 combinations for the given input.

Example 1:
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.

Example 2:
Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]

Example 3:
Input: candidates = [2], target = 1
Output: []
 */
import java.util.*;
class Leetcode39{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter target value: ");
        int target = sc.nextInt();
        combinationSum(arr, target);
        System.out.println(al);
    }
    static List<List<Integer>> al;
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        al = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        combination(0, l, target, 0, candidates);
        return al;
    }
    static void combination(int index, List<Integer> l, int target, int sum, int[] arr){
        if(sum==target){
            al.add(new ArrayList<>(l));
            return;
        }

        if(sum>target)
            return;
        
        for(int i=index; i<arr.length; i++){
            l.add(arr[i]);
            combination(i, l, target, sum+arr[i], arr);
            l.remove(l.size()-1);
        }
    }
}