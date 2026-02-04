import java.util.*;
/**
 * Explanation:
Input 1 :  12
Output 1 : Adam Number

Explanation : Square of 12  is 12*12 = 144

reverse of 12 is 21 and its square value is 21*21 = 441 

reverse of 441 is 144 which is equal to sqaure of given number.So it is an Adam Number.

Intput 2 : 14

Output 2 : Not an Adam Number

Explanation : Square of 14 is 14*14=196

Reverse of 14 is 41 and its square value is 41*41 = 1681

Here reverse of 1681 is not equal to square of given number.So it Not an Adam Number
 */

class AdamNumber{

    public static int isReverse(int n){
        int rev = 0;
        while(n>0){
            int r = n%10;
            rev = (rev*10)+r;
            n/=10;
        }
        return rev;
    }

    public static void isAdamNum(int n){
        int a = n*n;
        int val = isReverse(n);
        int b = val*val;
        b = isReverse(b);
        if(a==b)
            System.out.println(n + " is a Adam Number");
        else
            System.out.println(n + " is not a Adam Number");
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        isAdamNum(num);
        sc.close();
    }
}