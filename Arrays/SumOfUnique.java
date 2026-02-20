/**
 * You are given an array arr. Find the sum of distinct elements in an array.

Examples:
Input: arr[] = [1, 2, 3, 4, 5]
Output: 15
Explanation: Distinct elements are 1, 2, 3, 4, 5. So sum is 15.
Input: arr[] = [5, 5, 5, 5, 5]
Output: 5
Explanation: Only Distinct element is 5. So sum is 5.
 */

import java.util.*;
class SumOfUnique{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row values count: ");
        int n = sc.nextInt();//should be greater than 1
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Approach - 1");
        System.out.println("Sum of Unique elements in the given array: "+findSum(arr));
        
    }

    static int findSum(int arr[]) {
        Set<Integer> s = new HashSet<>();
        for(int a:arr){
            s.add(a);
        }
        int sum=0;
        for(Integer a:s){
            sum += a;
        }
        return sum;
    }
}