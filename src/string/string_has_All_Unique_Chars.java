package string;

import java.util.HashSet;

public class string_has_All_Unique_Chars {

    public static void main(String[] args) {
        String str="apple";
        String str1="alibeymorwsd";
        System.out.println("The string has unique chars is : " + hasAllUniqueChars (str1) );
        System.out.println("The string has unique chars is : " + areAllCharactersUnique (str1) );
    }
//using hashset
    public static boolean hasAllUniqueChars (String str){
        HashSet strhash= new HashSet();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!strhash.add(c)){ return false;}
        }return true;
    }
    /*
    Unique Chars in a String
    Write a method that takes in an input String and returns true if all
    the characters in the String are unique and false if there is even a single repeated character.
    The method should return true if the input is null or empty String.
    Examples:
    areAllCharactersUnique("abcde") -> true
    areAllCharactersUnique("aa") -> false
    areAllCharactersUnique("") -> true
    areAllCharactersUnique(null) -> true
     */
    public static boolean areAllCharactersUnique(String str){
        boolean flag=true;
        if(str==null){ return true ;}
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==(str.charAt(j))){ flag= false;}
            }
        }
        return flag;
    }
}
