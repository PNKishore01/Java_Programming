import java.util.*;
class Calculator{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value: ");
        int fv = sc.nextInt();
        System.out.println("Enter second value: ");
        int sv = sc.nextInt();
        System.out.println("Enter operator symbol to calculate(+, -, *, /, %): ");
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("Addition of "+ fv + " and "+ sv + " is: " + (fv+sv));
                break;
            case '-':
                System.out.println("Subtraction of "+ fv + " and "+ sv + " is: " + (fv-sv));
                break;
            case '*':
                System.out.println("Multiplication of "+ fv + " and "+ sv + " is: " + (fv*sv));
                break;
            case '/':
                if(sv==0 || fv==0)
                    System.out.println("0 doesn't exist");
                else{
                    System.out.println("Divison of "+ fv + " and "+ sv + " is: " + (fv/sv));
                }
                break;
            case '%':
                if(sv==0 || fv==0)
                    System.out.println("0 doesn't exist");
                else{
                    System.out.println("Modulus of "+ fv + " and "+ sv + " is: " + (fv%sv));
                }
                break;
            default:
                System.out.println("Operator doesn't exist");
        }

        sc.close();
    }
}