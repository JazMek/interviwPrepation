package arrays;

import java.util.Arrays;

public class Remouve_Duplicate_Numbers_From_Array {
    /*
     Write a method to find and remove the repeated or duplicate elements in an array.
     This method should return a list of non repeated integers in a string with the
     elements sorted in ascending order (as illustrated below).
     duplicate({1,3,4,2,1}) --> "[1,2,3,4]"
     duplicate({1,3,4,2,1,2,4}) --> "[1,2,3,4]"
     Note: You may use toString() method to return the
     standard string representation of most data structures, and
     Arrays.sort() to sort your result.
     Input : [1,5,23,2,6,3,1,8,12,3]
     Expected Result : [1, 2, 3, 5, 6, 8, 12, 23]
     Input : [1,3,3,4]
     Expected Result : [1, 3, 4]
     Input : [4]
     Expected Result : [4]
     Input : [4,3,1]
     Expected Result : [1, 3, 4]
     */


    public static void main(String[] args) {

        int [] arr1={4,3,1};
        int [] arr2={1, 2, 3, 5, 6, 8, 12, 23,2,4,5,5,8};
        System.out.println(remouve_Duplicate_Numbers_From_Array(arr1));
        System.out.println(remouve_Duplicate_Numbers_From_Array(arr2));

    }
    public static String remouve_Duplicate_Numbers_From_Array(int[] numbers){
    // Used as index in the modified string
    int index = 0;
        // Traverse through all characters
        for (int i = 0; i < numbers.length; i++)
    {
        // Check if str[i] is present before it
        int j;
        for (j = 0; j < i; j++) {
            if (numbers[i] == numbers[j]) { break; }
        }
        // If not present, then add it to
        if (j == i) { numbers[index++] = numbers[i]; }
         }
        int[] str2 = new int[index];
        for (int k=0;k<index;k++){
        str2[k]=numbers[k];
        }
        Arrays.sort(str2);
        return Arrays.toString(str2);
    }
}
