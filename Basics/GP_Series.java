import java.util.*;
/**
 * Geometric Progression series are:
 * --> ar, a*r^2, a*r^3, a*r^4, a*r^5.................a*r^(n-1);
 * so we can take a, r and n values..
 */
class GP_Series{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = sc.nextInt();
        System.out.println("Enter r value:");
        int r = sc.nextInt();
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i==1)
                System.out.print(a*(int)Math.pow(r,i));
            else
                System.out.print(", " + (a*(int)Math.pow(r,i)));
        }
        sc.close();
    }
}