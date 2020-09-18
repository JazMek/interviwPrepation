package arrays;

public class SommeOfTheArrayElement {
//    create a method how is accepting an Array argument and retuning the some of the Array elements
    public static void main(String[] args) {
        int []array={4,6,13,23,17,43,98,56,21,34,3,44,21,17,50,-25};
        System.out.println(sommeOfTheArrayElement(array));
    }
     public static int sommeOfTheArrayElement(int []array){
        int sum=0;
         for (int arr:array) { sum=sum+arr;
         }
        return sum;
     }
}
