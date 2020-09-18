package generale_algorthem;

import java.util.Arrays;

public class BubbleSort {
       /*
      The task is to complete bubble() function which is used to implement Bubble Sort!
      Write a method that takes in an array of ints and uses the Bubble Sort algorithm
      to sort the array 'in place' in ascending order. The method should return the same,
      in-place sorted array.

      Note:
      Bubble sort is one of the most inefficient ways to sort a large array of integers.
      Nevertheless, it is an interview favorite. Bubble sort has a time complexity of O(n2).
      However, if the sample size is small, bubble sort provides a simple implementation of
      a classic sorting algorithm.

      Examples:
      bubbleSortArray({5,4,3}) -> {3,4,5}
      bubbleSortArray({3}) -> {3}
      bubbleSortArray({}) -> {}
      {} -> [Empty] Array
      Example 1:
      Input:arr[] = { 4, 1, 3, 9, 7}
      Output: 1 3 4 7 9
      Example 2:
      Input: arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
      Output: 1 2 3 4 5 6 7 8 9 10
      Input	Expected Result	Your Result	Outcome
      Input : {4,12,4,78,7,-1}
      Expected Result : {-1,4,4,7,12,78}
      Input : {4}
      Expected Result : {4}
      Input : [Empty]
      Expected Result : [Empty]
      Input : {52,3,2}
      Expected Result : {2,3,52}
      Your Task: This is a function problem. You only need to complete the function bubble() that sorts the array.

       */

    public static void main(String[] args) {
        int arr[] = { 4, 1, 3, 9, 7};
        int arr1[] =  {52,3,2};
        int arr2[] ={};
        System.out.println(Arrays.toString(bubbleSortArray(arr)));
        System.out.println(Arrays.toString(bubbleSortArray(arr1)));
        System.out.println(Arrays.toString(bubbleSortArray(arr2)));

      }

         public static int[] bubbleSortArray(int[] arr){
                if(arr.length==0){ return arr;}
                int temp=arr[0];
                for(int i=0;i<arr.length;i++){
                    for(int j=0;j<arr.length-1;j++)
                   if(arr[j+1]<arr[j]) {
                      temp=arr[j] ;arr[j]=arr[j+1];arr[j+1]=temp;
                   }
                }
        return arr;
       }


}
