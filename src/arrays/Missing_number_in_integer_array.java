package arrays;

public class Missing_number_in_integer_array {

    /* How do you find the missing number in a given integer array of 1 to 100?
    Given an Array containing 9 numbers ranging from 1 to 10, write a method to
    find the missing number. Assume you have 9 numbers between 1 to 10 and only
    one number is missing.
    findMissingNumber({1,2,4,5,6,7,8,9,10}) --> 3
    Input : 1,2,3,4,5,6,7,8,10
    Expected Result : 9
    Input : 1,2,4,5,6,7,8,9,10
    Expected Result : 3
    Input : 6,7,8,9,10,1,2,4,5
    Expected Result : 3
    Input : 4,5,6,7,8,10,1,2,3
    Expected Result : 9
     */

    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
                21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
                41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,
                61,62,63,64,65,66,67,68,70,71,72,73,74,75,76,77,78,79,80,
                81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};
        System.out.println("The mising number is : "+missing_number_in_integer_array(array));
        System.out.println(findMissingNumber(array));

    }
    public static int missing_number_in_integer_array(int [] arry){
        int sum1=0;
        int sum2=0;
        for(int i=1;i<arry.length+2;i++){
            sum1=sum1+i;
        }
        for(int i=0;i<arry.length;i++){
            sum2=sum2+arry[i];
        }
        return sum1-sum2;
    }
    public static int findMissingNumber(int[] arr) {
        int sum1=arr.length+arr.length+1;
        System.out.println("sum1 beffor : "+sum1);
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            sum1=sum1+i;
        }
        System.out.println("sum  : "+sum);
        System.out.println( "sum1 aftter : "+sum1);
        return sum1-sum;
    }
}
