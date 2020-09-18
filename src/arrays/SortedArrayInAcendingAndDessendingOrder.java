package arrays;

import java.util.Arrays;

public class SortedArrayInAcendingAndDessendingOrder {


    public static void main(String[] args) {
        int[] arr1={116,100,2,3,4,5,6,7,9,10,115,12,13,40,15,16,77,18,19,210};
        int[] arr2={2,3,4,5,6,7,9,10};

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(sortedArrayAssending(arr1)));
        System.out.println(Arrays.toString(sortedArrayDessending(arr1)));
    }
    public static int [] sortedArrayDessending(int [] array){
        int temp=0;
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]<array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
    public static int [] sortedArrayAssending(int [] array){
        int temp=0;
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length-1;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

}
