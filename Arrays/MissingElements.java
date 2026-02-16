/**
 * print least 4 missing numbers in the given array
 */

import java.util.*;
class MissingElements{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row values count: ");
        int n = sc.nextInt();//should be greater than 1
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        missingNums(arr);
        sc.close();
    }

    static void missingNums(int[] arr){
        int n=arr.length, c=0;
        Arrays.sort(arr);
        int i=0, num=0;
        while(i<n && c<4){
            num++;
            if(arr[i]==num){
                i++;
                continue;
            }
            c++;
            System.out.print(num + " ");
        }
        num = arr[n-1];
        while(c<4){
            c++;
            num++;
            System.out.print(num + " ");
        }
    }
}