import java.util.*;
class SuperNum{

    static int isCount(int n){
        int c=0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }

    static void isSuper(int n){
        int sum=0, c=isCount(n), m=n;
        while(m>0){
            int r = m%10;
            sum += (int) Math.pow(r,c);
            c-=1;
            m/=10;
        }
        if(n==sum)  
            System.out.println(n + " is a Super Number.");
        else
            System.out.println(n + " is not a Super Number.");
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isSuper(num);
    }
}

/**
 Input 1 :         89

Output 1 :      Super Number

Explanation : 8^1 + 9^2

8 + 81 = 89. Which is equal to Given Number. So it is a Super Number.

 

Input 2 :         16

Ouput 2 :        Not a Super Number

Explanation : 1^1 + 6^2

1 + 36 = 37.Which is not equal to Given Number. So it is Not a Super Number.
 */