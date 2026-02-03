import java.util.Scanner;
class PowerOfNum{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int n = sc.nextInt();
        System.out.println("Enter power value: ");
        int pow = sc.nextInt();
        long val = 1;
        for(int i=1; i<=pow; i++){
            val *= n;
        }
        System.out.println(n + " power " + pow + " = " + val);
        System.out.println("Another method: " + Math.pow(n,pow));
    }
}