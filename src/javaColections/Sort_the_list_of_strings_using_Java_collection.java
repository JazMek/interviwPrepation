package javaColections;

import java.util.Arrays;

public class Sort_the_list_of_strings_using_Java_collection {
     /*Write code to sort the list of strings using Java collection?

      */

             public static void main (String []args){
                 String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                         "aug", "Sep", "Oct", "nov", "Dec" };
                 System.out.println(Arrays.toString(inputList));
                 System.out.println(Arrays.toString(sortList(inputList)));
             }
             //    sortList method will sort the given array in alphabetic ascending order
             public static String[] sortList(String []array){
                 Arrays.sort(array,String.CASE_INSENSITIVE_ORDER);
                 return array;
             }


}
