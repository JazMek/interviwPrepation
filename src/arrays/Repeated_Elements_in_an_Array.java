package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Repeated_Elements_in_an_Array {
    /* Repeated Elements in an Array
     Write a method duplicate to find the repeated or duplicate elements in an array.
     This method should return a list of repeated integers in a string with the
     elements sorted in ascending order (as illustrated below).
     duplicate({1,3,4,2,1}) --> "[1]"
     duplicate({1,3,4,2,1,2,4}) --> "[1, 2, 4]"
     Note: You may use toString() method to return the
     standard string representation of most data structures, and
     Arrays.sort() to sort your result.

     Input : [1,5,23,2,6,3,1,8,12,3]
     Expected Result : [1, 3]
     Input : [1,3,3,4]
     Expected Result : [3]
     Input : [4]
     Expected Result : [Empty]
     Input : [4,3,1]
     Expected Result : [Empty]

     */
    public static void main(String[] args) {
        int [] arr ={1,3,4,2,1,2,4,4,0,0,9};
        int [] arr1={1,5,23,2,6,3,1,8,12,3};
        System.out.println(duplicate(arr));
        System.out.println(duplicate(arr1));
        System.out.println("----------------------------------------------");
        System.out.println(duplicate_Number(arr));
        System.out.println(duplicate_Number(arr1));


    }
    public static String duplicate(int[] numbers){
        int result=0;
        int charcount[]=new int[numbers.length];
        for(int i=0; i<numbers.length ;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[i]== numbers[j]){ charcount[i]++;}
            }
            if(charcount[i]==1){result=numbers[i];}
        }
        // Used as index in the modified string
        int index = 0;
        // Traverse through all characters
        for (int i = 0; i < numbers.length; i++)
        {
            // Check if str[i] is present before it
            int j;
            for (j = 0; j < i; j++)
            {
                if (numbers[i] == numbers[j]) { break; }
            }
            // If not present, then add it to
                if (j == i & charcount[i]!=1) { numbers[index++] = numbers[i]; }
        }
        int[] str2 = new int[index];
        for (int k=0;k<index;k++){
            str2[k]=numbers[k];
        }
        Arrays.sort(str2);
        return Arrays.toString(str2);
    }
    public static String duplicate_Number(int[] numbers){
        int index = 0;
        int count=0;
        int charcount[]=new int[numbers.length];
        for(int i=0; i<numbers.length ;i++){
            for(int j=0;j<numbers.length;j++){
                if(numbers[i]== numbers[j]){ charcount[i]++;count++;}
            }
        }
        index=numbers.length-count;
        int[] str2 = new int[index];
        for (int i = 0; i < numbers.length; i++)
        {

            int j;
            for (j = 0; j < i; j++)
            {
                if (numbers[i] == numbers[j]) { break; }
            }
            if (j == i & charcount[i]!=1) { numbers[index++] = numbers[i];

            str2[i]=numbers[i]; }
        }

        Arrays.sort(str2);
        return Arrays.toString(str2);
    }
}
