import java.util.*;
class ArmstrongNum{

    public static int isCount(int n){
        int c=0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }

    public static void isArmstrong(int n){
        int c = isCount(n);
        int sum = 0, m=n;
        while(m>0){
            int r = m%10;
            sum += (int) Math.pow(r,c);
            m/=10;
        }
        if(n==sum)
            System.out.println(n + " is Armstrong Number.");
        else
            System.out.println(n + " is not a Armstrong Number.");
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check armstrong or not: ");
        int num = sc.nextInt();
        isArmstrong(num);
    }
}