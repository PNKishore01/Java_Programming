import java.util.*;
/**
 * Arthmetic Progression series are:
 * --> a+d, a+1d, a+2d, a+3d, a+4d+.................a+(n-1)d;
 * so we can take a, d and n values..
 */
class AP_Series{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int a = sc.nextInt();
        System.out.println("Enter d value:");
        int d = sc.nextInt();
        System.out.println("Enter n value:");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i==1)
                System.out.print(a+(i*d));
            else
                System.out.print(", " + (a+(i*d)));
        }
        sc.close();
    }
}