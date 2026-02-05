/**
 * Input 1  :    9

Output 1:    729, 512, 343, 216, 125, 64, 27, 8, 1.

Input 2  :   -11

Output 2:    1331, 1000, 729, 512, 343, 216, 125, 64, 27, 8, 1.

Input 3  :    5

Output 3:    125, 64, 27, 8, 1.
 */

import java.util.*;
class CubesOfNum{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        num = Math.abs(num);
        int sum=0;
        for(int i=num; i>=1; i--){
            if(i==num)
                System.out.print((int)Math.pow(i,3));
            else{
                System.out.print(" + " + ((int)Math.pow(i,3)));
            }
            sum += (i*i);
        }
        System.out.println(" = " + sum);
        sc.close();
    }
}