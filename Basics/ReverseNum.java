import java.util.*;
class ReverseNum{

    static long isReverse(long n){
        long rev = 0;
        while(n>0){
            long r = n%10;
            rev = (rev*10)+r;
            n/=10;
        }
        return rev;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        long n = sc.nextLong();
        long rev = isReverse(n); //reverse the given number
        System.out.println(n + " is reversed : " + rev);
        sc.close();
    }
}