package arrays;

import java.util.Arrays;

public class Sorted_integer_array {

    public static void main(String[] args) {
        int [] array={35,22,13,4,52,6,102,45,67,3,5,-45,509};
////        System.out.println("The sorted Array is : " + Arrays.toString(sorted_integer_array(array)));
//        for(int arr:sorted_integer_array(array)){
//            System.out.print(arr+" ,");
//
//        }
        System.out.println(Arrays.toString(array));
        sorted_UsingAraayMethod(array);
        System.out.println(Arrays.toString(array));
//        System.out.println(Arrays.toString(sorted_UsingAraayMethod(array)));
    }
    public static int[] sorted_integer_array(int []array){
        int [] sortedArray = new int[array.length];
        int num;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if (array[i]>array[j]) {
                    num=array[i];
                    array[i]=array[j];
                    array[j]=num;
                    sortedArray[i]=array[i];
                }else sortedArray[i]=array[i];
              }
            }
       return sortedArray;
    }
//    method num2
    public static int[] sorted_UsingAraayMethod(int []array) {
        Arrays.sort(array);
        return array;

    }
}
