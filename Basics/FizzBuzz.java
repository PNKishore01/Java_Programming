//Leetcode No: 412

/**
 * Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
 */
import java.util.*;
class FizzBuzz{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0)
                arr[i-1]="FizzBuzz";
            else if(i%3==0)
                arr[i-1]="Fizz";
            else if(i%5==0)
                arr[i-1]="Buzz";
            else
                arr[i-1]=i+"";
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}