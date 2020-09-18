package arrays;

public class FindtheNumberthatAppearsOnce {

    /*   Find the Number that Appears Once
     Write a method that returns a number that appears only once in an array.
     Assume the array will surely have a unique value. The array will never be empty.
     Examples:
     {1,2,3,4,1,2,4,3,5} ==> 5
     Input	Expected Result	  Your Result	Outcome
     Array: {1,2,3,4,1,2,4,3,5}
     Expected Result : 5
     Array: {1}
     Expected Result : 1
     Array: {1,1,1,4,5,6,7,7,6,4}
     Expected Result : 5
     Array: {1,-1,1}
     Expected Result : -1
     Array: {1,2,3,3,2,1,7,8,8}
     Expected Result : 7
     */
    public static void main(String[] args) {
        int []A={1,2,-1,4,1,2,4,5,5,-1,9,3,3,9,7};
        System.out.println(maximum_occurring_character(A));
    }
    public static int maximum_occurring_character(int []A){

        int result=0;
        int charcount[]=new int[A.length];
        for(int i=0; i<A.length ;i++){
            for(int j=0;j<A.length;j++){
                if(A[i]== A[j]){ charcount[i]++;}
            }
            if(charcount[i]==1){result=A[i];}
        }
        return result;
    }
//    int result=0;
//    int []numCount= new int [A.length];
//    for(int i=0;i<A.length;i++){
//        for(int j=0;j<A.length;j++){
//            if(A[j]==A[i]){
//                numCount[i]++;
//            }
//        }
//        if(numCount[i]==1){
//            result= A[i];
//        }
//        return result;
}

