package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Duplicate_number {
//    How do you find the duplicate number on a given integer array

    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,3,9,10,11,9,12,13,7,14,15,3};
        duplicate_number(array);
        System.out.println("--------------------------------------------------");
//        duplicatenumber(array);
        System.out.println("--------------------------------------------------");
//        duplicatenumberMap(array);

    }
//   1 method time complextie is O(n*n)worst solution
    public static void duplicate_number(int []array){
        int x=0;
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if (array[i]==array[j]){
                    x++;
                    System.out.println("The duplicate numeber is: "+array[i]+" at index i = "+i+ " and "+j);

                }
            }
        }
        System.out.println(x);
    }
//    2 method using hashSet
   public static void duplicatenumber(int []array){
       Set<Integer> duplicates=new HashSet<>();
       for (Integer arr : array){
           if(duplicates.add(arr)==false){
               System.out.println("The duplicate numeber using the HashSet Method is: "+arr);
           }
       }
   }
//    3 method using hash map
public static void duplicatenumberMap(int []array){
    Map<Integer,Integer> mapArray=new HashMap<Integer, Integer>();
    for(Integer num :array){
        Integer count= mapArray.get(num);
        if(count==null){
            mapArray.put(num,1);
        }else {mapArray.put(num,count++);
            System.out.println("The duplicate num using the HashMap method is : "+num+" duplicate times is : "+ count);}
      }
//     Set<Map.Entry<Integer,Integer>> entryset =   mapArray.entrySet();
//    for(Map.Entry<Integer,Integer> entry :entryset){
//        if(entry.getValue()>1){
//            System.out.println("The duplicate num using the HashMap method is : "+ entry.getKey());
//        }
//    }
    }
}
