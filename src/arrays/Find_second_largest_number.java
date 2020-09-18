package arrays;

public class Find_second_largest_number {


    public static void main(String[] args) {
        int[] arr1={116,100,2,3,4,5,6,7,9,10,115,12,13,40,15,16,77,18,19,210};
        System.out.println(find_second_largest_number(arr1));
    }
    public static int find_second_largest_number(int []array){
        int max =array[0];
        int max2=array[0];
//        int max =Integer.MIN_VALUE;
//        int max2=Integer.MIN_VALUE;
        int i=0;
        for(i=0;i<array.length;i++){
           if(array[i]>=max){max=array[i];}
           else if(max>max2 && array[i]>=max2 ) {max2=array[i];}
        }
       return max2;
    }
}

