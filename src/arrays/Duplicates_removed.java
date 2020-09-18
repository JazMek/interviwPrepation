package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicates_removed {
    public static void main(String[] args) {
        int[] arr1={0,1,2,3,4,1,6,3};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(duplicates_removed(arr1)));
    }


    public static Object[] duplicates_removed(int []array){
        ArrayList<Integer> arrayLis =new ArrayList<Integer>();
int x=0;
       for (int i=0;i<array.length;i++){
           for (int j=1;j<array.length;j++){
               if(array[i]==array[j]) x++;
           }
           if(x==1)arrayLis.add(array[i]);
       }
        return arrayLis.toArray();
    }
}
