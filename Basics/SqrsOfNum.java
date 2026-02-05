/**
 * Write a Program to Find the result of the following expression -  
 + ........... 16 + 9 + 4 + 1=?  

Example:
Input 1  :    9

Output 1:    81 + 64 + 49 + 36 + 25 + 16 + 9 + 4 + 1 = 285

Input 2  :   -11

Output 2:   121 + 100 + 81 + 64 + 49 + 36 + 25 + 16 + 9 + 4 + 1 = 506

Input 3  :    5

Output 3:    25 + 16 + 9 + 4 + 1 = 55.
 */


import java.util.*;
class SqrsOfNum{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int sum=0;
        for(int i=num; i>=1; i--){
            if(i==num)
                System.out.print(i*i);
            else{
                System.out.print(" + " + (i*i));
            }
            sum += (i*i);
        }
        System.out.println(" = " + sum);
        sc.close();
    }
}