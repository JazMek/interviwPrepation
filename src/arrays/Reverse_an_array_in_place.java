package arrays;

import java.util.Arrays;

public class Reverse_an_array_in_place {


    public static void main(String[] args) {

           int [] array={-1,-3,5,77,0,1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,23,45,67,78};
        Object [] array1={-1,-3,5,77,0,1,2,3,4,5,6,7,8,9,10,12,13,14,15,16,17,18,19,20,21,23,45,67,78};
        System.out.println("The Array is : "+Arrays.toString(array));
//        deep works only withe objects
        System.out.println("The Array is : "+Arrays.deepToString(array1));
        for( int arr :array){
            System.out.print(arr+" ,");
        }

        System.out.println();
        System.out.println("The Reversed Array is : "+Arrays.toString(reverse_an_array(array)));
        System.out.println("The Reversed Array is : ");
           for( int arr :reverse_an_array(array)){
               System.out.print(arr+" ,");
           }

    }

    public static int [] reverse_an_array(int []array){
        int num=0;
        int i=0;
        int j=0;
        int[]Reversarray=new int[array.length];
        for(i=0,j=array.length-1; i<array.length; i++ ){
            num=array[i];
            Reversarray[i]=array[j-i];
            Reversarray[j-i]=num;
        }
        return Reversarray;
    }

}

