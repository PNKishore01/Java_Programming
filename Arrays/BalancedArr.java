/**Given an array arr of even size, the task is to find a minimum value that can be added to an element 
 * so that the array becomes balanced. An array is balanced if the sum of the left half of the array 
 * elements is equal to the sum of the right half.

Examples :

Input: arr = [1, 5, 3, 2]
Output: 1
Explanation: Sum of first 2 elements is 1 + 5  = 6, Sum of last 2 elements is 3 + 2  = 5, 
To make the array balanced you can add 1.

Input: arr = [1, 2, 1, 2, 1, 3]
Output: 2
Explanation: Sum of first 3 elements is 1 + 2 + 1 = 4, Sum of last three elements is 2 + 1 + 3 = 6, 
To make the array balanced you can add 2.*/

import java.util.*;
class BalancedArr{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row values count: ");
        int n = sc.nextInt();//should be greater than 1 and even
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        minValueToBalance(arr);
    }

    static void minValueToBalance(int[] arr){
        int n=arr.length, m=n/2, c=0, lSum=0, rSum=0;
        for(int a:arr){
            if(c<m)
                lSum+=a;
            else 
                rSum+=a;
            c++;
        }
        System.out.println("Minimum value to balance the array is: " + Math.abs(lSum-rSum));
    }
}