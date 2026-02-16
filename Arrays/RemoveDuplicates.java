/**
 * Write a program to remove the duplicates in a given array .
Note : Order of the array elements should not change.

Constraints:
Input :              First line input consists of one integer value represents array size

                         Second line input consists of array elements which are separated by spaces.

Output :           print the array elements after removing the duplicate elements.

Example:
Input 1 :           6
                    5 6 5 3 3 2

Output 1 :        5 6 3 2

Input 2 :           10
                  1 3 1 4 5 4  2 1 9 3

Output 2 :         1 3 4 5 2 9

Explanation:
Input 1 :            6
                          5 6 5 3 3 2
Output 1 :        5 6 3 2
Explanation :   In the given array    {5 6 5 3 3 2} the elments 5 and 3 are duplicates after removing the duplicates out final output is 5 6 3 2.   

Input 2 :           10
                    1 3 1 4 5 4  2 1 9 3

Output 2 :         1 3 4 5 2 9
Explanation :   In the given array    {1 3 1 4 5 4  2 1 9 3} the elments 1, 4 and 3 are duplicates after removing the duplicates out final output is 1 3 4 5 2 9.  

 */

import java.util.*;
class RemoveDuplicates{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row values count: ");
        int n = sc.nextInt();//should be greater than 1
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        removeDups(arr);
        sc.close();
    }

    static void removeDups(int[]arr){
        int n = arr.length;

        //approach-1
        System.out.println("Approach - 1: ");
        for(int i=0; i<n; i++){
            int c=0;
            for(int j=i; j>=0; j--){
                if(arr[i]==arr[j])
                    c++;
            }
            if(c==1)
                System.out.print(arr[i]+" ");
        }
        System.out.println();

        //approach-2
        System.out.println("Approach - 2: ");
        Set<Integer> s = new LinkedHashSet<>();
        for(int a:arr){
            s.add(a);
        }
        System.out.println(s);
    }

}