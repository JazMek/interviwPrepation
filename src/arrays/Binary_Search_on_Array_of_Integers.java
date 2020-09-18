package arrays;

public class Binary_Search_on_Array_of_Integers {
    /* Binary Search on Array of Integers
       Write a method that searches an Array of integers for a given integer using the
       Binary Search Algorithm. If the input integer is found in the array, return true. Otherwise, return false.
       You can assume that the given array of integers is already sorted in ascending order.
       Examples:
       binarySearch({2,5,7,8,9},9) -> true
       binarySearch({2,8,9,12},6) -> false
       binarySearch({2},4) -> false
       binarySearch({},9) -> false
       {} -> [Empty] Array
       Array: {2,5,7,8,9,12}
       Element to be searched: 8
       Expected Result : true
       Array: {2}
       Element to be searched: 4
       Expected Result : false
       Array: {2}
       Element to be searched: 2
       Expected Result : true
       Array: {2,5,7,9,12}
       Element to be searched: 8
       Expected Result : false
       Array: {2,5,7,9,12}
       Element to be searched: 12
       Expected Result : true
       Array: {2,5,7,9,12}
       Element to be searched: 2
       Expected Result : true
       Array: [Empty]
       Element to be searched: 4
       Expected Result : false
     */

           public static void main(String[] args) {
              int arr[]= {2,5,7,8,9,12};
              int n= 8;
              System.out.println("The Integer "+n+" is in the Array ? : "+binarySearch(arr,n));

    }
    public static Boolean binarySearch(int[] arr, int n){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){ flag=true; break;}
            else flag= false;
        }
        return flag;
    }
}
