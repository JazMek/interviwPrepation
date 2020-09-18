package arrays;

public class Find_missing_number_in_the_array {
    public static void main(String[] args) {
        int[] arr1={-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,26,27};
        int[] arr2={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,26,27};
//        System.out.println(find_missing_number(arr2));
        System.out.println(find_missing_number_in_desorderd_array(arr2));
        System.out.println(missing_Number_in_the_Array(arr2));
    }

    public static int find_missing_number(int []array){
        int i=0;
   for (i=0;i<array.length;i++){
       if(array[i]!=i)
//           return i;
       break;
   }
     return i;
    }
    public static int find_missing_number_in_desorderd_array(int []array){

        int sum=0;
        int sum1=0;
        int n=array.length+1;
        int [] array1 = new int[n];
        int x=array[0];
        for(int j=x;j<n+x;j++){
            array1[j-x]=j;
            sum=sum+array1[j-x];}
//        System.out.println(sum);
        for(int i=0;i<array.length;i++){
            sum1=sum1+array[i];
        }
//        System.out.println(sum1);
        return sum-sum1;

    }

//    works only whith positive numbers
    public static int missing_Number_in_the_Array(int [] array){

        int sum=0;
        int sum1=0;
        for(int i=0;i<=array.length+1;i++){
            sum=sum+i;
        }
        for(int i=0;i<array.length;i++){
            sum1=sum1+array[i];
        }
        return sum-sum1;
    }

}
