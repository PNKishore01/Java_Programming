/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:
Input: n = 1
Output: ["()"]
 */

import java.util.*;
class Leetcode22{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");
        int n = sc.nextInt();
        List<String> al = generateParenthesis(n);
        System.out.println(al);
    }
    public static List<String> generateParenthesis(int n) {
        List<String> al = new ArrayList<>();
        generate(0, 0, n,"",al);
        return al;
    }

    static void generate(int open, int close, int n, String s, List<String> al){
        if(open==n && close==n){
            al.add(s);
            return;
        }

        if(open<n)
            generate(open+1, close, n, s+"(", al);
        if(close<open)
            generate(open, close+1, n, s+")", al);
    }
}