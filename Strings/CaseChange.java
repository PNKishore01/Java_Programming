import java.util.*;
/**
 * normal string: - "Hello"
 * lower case:- hello
 * upper case:- HELLO
 */
class CaseChange{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("LowerCase: " + s.toLowerCase());
        System.out.println("UpperCase: " + s.toUpperCase());
        sc.close();
    }
}