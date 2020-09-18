package string;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class StringAnagrams {
//    For example: Angel and Angle are anagrams


    public static void main(String[] args) {
        String str = "vAngelics";
        String str1 = "cisnagvle";
//        isAnagram(str,str1);
        System.out.println("The tow Strings are Anagrams : "+isAnagram(str,str1));
//        if (stringAnagram(str, str1)) {
//            System.out.println("The tow String are Anagrams");
//        } else System.out.println("The tow String are not Anagrams ");




    }

    public static boolean stringAnagram(String str, String str1) {

        if (str.length() != str1.length()) {
            return false;
        }
        String[] arrayStr = str.split("");
        String[] arrayStr1 = str1.split("");
        sort(arrayStr);
        sort(arrayStr1);
        for (int i = 0; i < str.length(); i++) {
            if (!arrayStr[i].equals(arrayStr1[i])) {
                return false;
            }
        }return true;
    }

//    public static boolean isAnagramUsingArraySort(String word, String anagram) {
//
//        String sortedWord = sortChars(word);
//        String sortedAnagram = sortChars(anagram);
//
//        return sortedWord.equals(sortedAnagram);
//    }
//
//    public static String sortChars(String word) {
//        char[] wordArr = word.toLowerCase().toCharArray();
//        Arrays.sort(wordArr);
//        return String.valueOf(wordArr);
//    }


    public static boolean isAnagram(String string1, String string2){
        String []string1array=string1.split("");
        String []string2array=string2.split("");
        sort(string1array);
        String str1=string1array.toString();
        sort(string2array);
        String str2=string2array.toString();
        return str1.equalsIgnoreCase(str2);
    }
}


