import java.util.*;

/**
 * Example:
Input 1  :    9

Output 1:    Given Number is Perfect Square.

Input 2  :  11

Output 2:   Given Number is Not a Perfect Square.

Input 3  :    5

Output 3:    Given Number is Not a Perfect Square.
 */

class PerfectSquare{

    static void isCheck(int n){
        for(int i=1; ;i++){
            if(i*i==n){
                System.out.println(n + " is a Perfect Square");
                break;
            }
            else if(i*i>n){
                System.out.println(n + " is not a Perfect Square");
                break;
            }
        }
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  num: ");
        int n = sc.nextInt();
        isCheck(n);
        sc.close();
    }
}