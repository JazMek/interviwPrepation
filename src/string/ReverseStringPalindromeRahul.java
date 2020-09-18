package string;

public class ReverseStringPalindromeRahul {
//     Reverse the String/Palindrome with out using Predefined Reverse methods
    public static void main(String[] args) {
        String str="madam";

        System.out.println(palindromeString(str));
    }
    public static String reverseString(String string){
      String ReverseString="";
        for(int i=string.length()-1;i>=0;i--){
            ReverseString=ReverseString +string.charAt(i) ;
        }
        return ReverseString;
    }
    public static boolean palindromeString(String string){
        String stringpalindrome="";
        for(int i=string.length()-1;i>=0;i--){
            stringpalindrome=stringpalindrome +string.charAt(i) ;
        }
        if(stringpalindrome.equalsIgnoreCase(string)) return true;
        else return false;
    }
}
