package arrays;

public class Smallest_and_largest_element_in_an_array {
    public static void main(String[] args) {
        int[] arr1={7,5,6,1,4,2,23,45,0,98,-4,109};
        smallest_and_largest_element(arr1);
        smallest_and_largest_elementNvens(arr1);
    }


// 1 method
   public static void smallest_and_largest_element(int []arry){
       int min=arry[0];
       int max=arry[0];
       for(int i=0;i<arry.length;i++){
          if (arry[i]<=min){ min=arry[i];}
          if (arry[i]>=max){ max=arry[i];}
       }
       System.out.println("The largest element is : "+max+" And the smallest element is : "+min);
   }

//2 method
public static void smallest_and_largest_elementNvens(int []arry){
    int min=arry[0];
    int max=arry[0];
    for(int i=1;i<arry.length;i++){
        if (min>arry[i]){ min=arry[i];}
        else if  (max<arry[i]){ max=arry[i];}
    }
    System.out.println("The largest element is : "+max+" And the smallest element is : "+min);
}

}
