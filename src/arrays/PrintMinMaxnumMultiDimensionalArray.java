package arrays;

public class PrintMinMaxnumMultiDimensionalArray {
//    Print Min number and Max number in Multi Dimensional Array

    public static void main(String[] args) {
        int [][] array={
                {4,-4,5},
                {3,7,0,99},
                {1,9,56,234,-7,2},
                {800,11}};

        int min=array[0][0];
        int max=array[0][0];
        System.out.println(array.length);
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]<min){
                    min=array[i][j];
                } else if(array[i][j]>max){
                    max=array[i][j];
                }
            }
        }
        System.out.println("max is: "+max);
        System.out.println("min is: "+min);
    }

}
