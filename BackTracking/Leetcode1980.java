/**
 * Given an array of strings nums containing n unique binary strings each of length n, return a binary string 
 * of length n that does not appear in nums. If there are multiple answers, you may return any of them.

Example 1:
Input: nums = ["01","10"]
Output: "11"
Explanation: "11" does not appear in nums. "00" would also be correct.

Example 2:
Input: nums = ["00","01"]
Output: "11"
Explanation: "11" does not appear in nums. "10" would also be correct.

Example 3:
Input: nums = ["111","011","001"]
Output: "101"
Explanation: "101" does not appear in nums. "000", "010", "100", and "110" would also be correct.
 */

import java.util.*;
class Leetcode1980{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row count value: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.next();
        }
        System.out.println(findDifferentBinaryString(arr));
    }
    static List<String> al;
    public static String findDifferentBinaryString(String[] nums) {
        al=new ArrayList<>();
        recursion(nums[0].length(),"");
        for(String s:nums){
            al.remove(s);
        }
        return al.get(0);
    }
    static void recursion(int n, String s){
        if(s.length()==n){
            al.add(s);
            return;
        }

        recursion(n, s+"0");
        recursion(n, s+"1");
    }
}