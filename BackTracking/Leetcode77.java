/**
 * Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
You may return the answer in any order.

Example 1:
Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
Explanation: There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.

Example 2:
Input: n = 1, k = 1
Output: [[1]]
Explanation: There is 1 choose 1 = 1 total combination.
 */

import java.util.*;
class Leetcode77{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        System.out.println("Enter k value: ");
        int k = sc.nextInt();
        List<List<Integer>> al = combine(n,k);
        System.out.println(al);
    }
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        combinations(list, al, n, k, 1);
        return list;
    }
    static void combinations(List<List<Integer>> list, List<Integer> al, int n, int k, int st){
        if(al.size()==k){
            list.add(new ArrayList<>(al));
            return;
        }

        for(int i=st; i<=n; i++){
            al.add(i);
            combinations(list, al, n, k, i+1);
            al.remove(al.size()-1);
        }
    }
}