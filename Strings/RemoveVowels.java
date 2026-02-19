/**
 * Given a string s. Your task is to remove the vowels from the string.

Examples:
Input: s = "welcome to geeksforgeeks"
Output: "wlcm t gksfrgks"
Explanation: Vowels were ignored only consonents were returned in the same order.

Input: s = "what is your name ?"
Output: wht s yr nm ?
 */
import java.util.*;
class RemoveVowels{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); //for two or more word in String then use nextLine()
        System.out.println("Before: " + s);
        s=s.toLowerCase();//all changed to lowercase
        for(char ch:s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                s = s.replace(ch+"","");//it will replace that characters with empty string
        }
        System.out.println("After: " + s);
        sc.close();
    }
}