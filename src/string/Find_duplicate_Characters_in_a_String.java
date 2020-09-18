package string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_duplicate_Characters_in_a_String {


    public static void main(String[] args) {
        String  str="Charataracterspp";
//        find_duplicate_Characters(str);

        System.out.println(remove_duplicate(str));
        System.out.println(remove_Duplicate(str));
    }
//    using  loop
    public static void find_duplicate_Characters(String  str){
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.toLowerCase().charAt(i)==str.toLowerCase().charAt(j)){
                    System.out.println("Duplicate character is : "+str.charAt(i) +" at index i= "+i +" and "+j);
//                    break;
                }
            }
        }
    }

    public static String remove_duplicate(String str){
        char[]strchar= str.toLowerCase().toCharArray();
        Set<Character> duplicates = new HashSet<>();
        for(int i=0;i<strchar.length;i++){
            duplicates.add(strchar[i]);
        }
        return duplicates.toString();
    }
    public static String remove_Duplicate(String str){
        char [] strchar = str.toLowerCase().toCharArray();
        String strDup="";
        int index=0;
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
