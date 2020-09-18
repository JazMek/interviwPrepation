package string;

import java.util.Arrays;

public class Palindrome_String {

    public static void main(String[] args) {
        String str="madam";
        System.out.println("The given string is palindrome : "+palindrome_String(str));
        System.out.println("The given string is palindrome : "+palindrome_sstring(null));
        System.out.println("The given string is palindrome : "+palindrom_half_loop(null));
        System.out.println("The given string is palindrome : "+isStringPalindrome(null));
        System.out.println("The given string is palindrome : "+isString_Palindrome(null));
    }

    public static boolean palindrome_String(String str){
        if(str==null ) {return true;}
        char []strArray=str.toCharArray();
        StringBuffer sb=new StringBuffer(str);
        String strsb=sb.reverse().toString();
        char [] strsbArray=strsb.toCharArray();
        return Arrays.equals(strArray, strsbArray);
    }
//    using StringBuffer
    public static boolean palindrome_string(String str){
        if(str==null ) {return true;}
        StringBuffer sb=new StringBuffer(str);
        String strsb=sb.reverse().toString();
        return str.equals(strsb);
    }
    //    using StringBuilder
    public static boolean palindrome_sstring(String str){
        if(str==null ) {return true;}
        StringBuilder sb=new StringBuilder(str);
        String strsb=sb.reverse().toString();
        return str.equals(strsb);
    }
//    using half loop
    public static boolean palindrom_half_loop(String str){
        if(str==null ) {return true;}
        for(int i=0, j=str.length()-1;i<(str.length()/2);i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static boolean isStringPalindrome(String str){

        if(str==null || str.equals("")) try { return true;
        } catch(Exception e) {
        }
//        finally {return true ;}
        StringBuffer sb = new StringBuffer(str);
        String reversstr = sb.reverse().toString();
        if(str.equals(reversstr)){
            return true;
        } else return false;
    }
    //   works perfectly
    public static boolean isString_Palindrome(String str){
        if(str==null ) {return true;}
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
}
