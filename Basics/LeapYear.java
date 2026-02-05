import java.util.*;
class LeapYear{

    static void isLeap(int year){
        if((year%4==0 && year%100!=0) || year%400==0)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check Leap or not:");
        int year = sc.nextInt();
        isLeap(year);
        sc.close();
    }
}