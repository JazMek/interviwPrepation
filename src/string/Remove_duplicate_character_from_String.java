package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_duplicate_character_from_String {

    /*  Java program to remove duplicates characters :
       Write a method to remove all duplicates characters in a given string.
       Note: Avoid using the in-built method.
       Input : This is a test
       Expected Result : this ae
       Input : Replace all spaces
       Expected Result : replac s
       Input : This
       Expected Result : This
       Input : [Empty]
       Expected Result : null
       Input : null
       Expected Result : null
     */

    public static void main(String[] args) {

String str="";
//        System.out.println(remove_Duplicate_from_String(str));
//        System.out.println(remove_Duplicate_char_from_String(str));
//        System.out.println(remove_duplicate_caracters(str));
        System.out.println(remove_Duplicate(str));


    }
    public static String remove_duplicate(String str){
        if(str==null ||str.length()==0){ return null;}
        char[]strchar= str.toLowerCase().toCharArray();
        Set<Character> duplicates = new HashSet<>();
        for(int i=0;i<strchar.length;i++){
            duplicates.add(strchar[i]);
        }

        return duplicates.toString();
    }
    static String removeDuplicate(char str[], int n) {
        // Used as index in the modified string
        int index = 0;

        // Traverse through all characters
        for (int i = 0; i < n; i++)
        {

            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }

            // If not present, then add it to
            // result.
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
//    **************************************
    static String remove_Duplicate_from_String(String str) {
        if(str==null ||str.length()==0){ return null;}
        char strChar [] = str.toCharArray();
        // Used as index in the modified string
        int index = 0;
        // Traverse through all characters
        for (int i = 0; i < str.length(); i++)
        {
            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (strChar[i] == strChar[j])
                {
                    break;
                }
            }

            // If not present, then add it to
            // result.
            if (j == i)
            {
                strChar[index++] = strChar[i];
            }
        }

        return String.valueOf(Arrays.copyOf(strChar, index));

    }
    static String remove_Duplicate_char_from_String(String str) {
        if(str==null ||str.length()==0){ return null;}
        char strChar [] = str.toCharArray();
        // Used as index in the modified string
        int index = 0;
        // Traverse through all characters
        for (int i = 0; i < str.length(); i++)
        {
            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (strChar[i] == strChar[j])
                {
                    break;
                }
            }

            // If not present, then add it to
            // result.
            if (j == i)
            {
                strChar[index++] = strChar[i];
            }
        }
        char[] str2 = new char[index];
        for (int k=0;k<index;k++){
            str2[k]=strChar[k];
        }
        return Arrays.toString(str2);
    }


            public static String remove_duplicate_caracters(String str) {
                if(str==null ||str.length()==0){ return null;}
                int i;
                int j;
                int count=0;
                char [] strchar = str.toCharArray();

                for ( i = 0; i < str.length(); i++) {
                    for ( j=0;j<i ;j++){
                        if (strchar[j]==strchar[i]){ break;}
                    }
                    if(i==j){ strchar[count++]=strchar[i];}
                }

                char [] strNoDup= new char[count];
                for(i=0;i<count;i++){
                    strNoDup[i]=strchar[i];

                }
                 return Arrays.toString(strNoDup);
            }
    public static String remove_Duplicate(String str){
        if(str==null ||str.length()==0){ return null;}
        char [] strchar = str.toLowerCase().toCharArray();
//        Arrays.sort(strchar);
        String strDup="";
        int i;
        int j;
        for(i=0;i<strchar.length;i++){
            for(j=0;j<i;j++){
                if(strchar[j]==strchar[i]){ break;}
            }
                if(j==i){strDup=strDup+strchar[i];}
        }

        return strDup;
    }


}









