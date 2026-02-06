import java.util.*;
class LCM{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int n1 = sc.nextInt();
        System.out.println("Enter num2:");
        int n2 = sc.nextInt();
        
        //when we calculating lcm, first we have to know the biggest number;
        //then that biggest number onwards calculate , atleast one digit should be divison of all those numbers.

        int d = (n1<n2)?n1:n2;//biggest number stored in d.

        for(int i=d; ; i++){
            if(i%n1==0 && i%n2==0){
                System.out.println("The LCM of " + n1 + ", " + n2 + " is: " + i);
                break;
            }
        }

        sc.close();
    }
}