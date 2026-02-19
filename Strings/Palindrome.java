/**
 * Given string is palindrome or not
 * 
 * input1: madam
 *  ->input: madam, reverse:madam
 * so it is palindrome.
 * 
 * input2: hello
 * ->input: hello, reverse:olleh
 * so it is not palindrome.
 */

import java.util.*;
class Palindrome{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.next();
        s=s.toLowerCase();
        System.out.println("Given String is: " + palin(s));
        sc.close();
    }

    static String palin(String s){
        char[] ch = s.toCharArray(); //string convert into char array
        int i=0, j=ch.length-1;
        while(i<j){
            if(ch[i]!=ch[j])
                return "not Palindrome";
            i++;
            j--;
        }
        return "Palindrome";
    }
}