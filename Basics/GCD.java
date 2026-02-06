import java.util.*;
class GCD{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int n1 = sc.nextInt();
        System.out.println("Enter num2:");
        int n2 = sc.nextInt();
        System.out.println("Enter num3:");
        int n3 = sc.nextInt();
        //when we calculating gcd, first we have to know the smallest number;
        //then that smallest number to 1 , atleast one digit should be divided by all of those numbers.

        int d = (n1<n2 && n1<n3)?n1:(n2<n1 && n2<n3)?n2:n3;//smallest number stored in d.

        for(int i=d; i>=1; i--){
            if(n1%i==0 && n2%i==0 && n3%i==0){
                System.out.println("The GCD of " + n1 + ", " + n2 + ", " + n3 + " is: " + i);
                break;
            }
        }

        sc.close();
    }
}