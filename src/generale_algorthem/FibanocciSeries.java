package generale_algorthem;

public class FibanocciSeries{
//    Print Fibanocci Series by swapping variables
//    Fibanocci  ==> 1,2,(1+2),(2+3),(3+5),(5+8),(8+13),...
    public static void main(String[] args) {
        fibanocciSeries(8);
        System.out.println(fibanocciSeries(8) );
        System.out.println(fib(8) );

    }
    public static int fibanocciSeries(int n){
        int a=0;
        int b=1;
        int fibanocciNum=0;
        int i=1;
        while(i<n){
            fibanocciNum=a+b;
//            System.out.println(fibanocciNum);
            a=b;
            b=fibanocciNum;
            i++;
        }
        return fibanocciNum ;
    }
    /*
     Fibonacci Number
     The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ... The next number
     is found by adding up the two numbers before it.
     Write a recursive method fib(n) that returns the nth Fibonacci number. n is 0 indexed,
     which means that in the sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., n == 0 should return 0
     and n == 3 should return 2. Assume n is less than 15.
     Even though this problem asks you to use recursion, more efficient ways to solve it
     include using an Array, or better still using 3 volatile variables to keep a track
     of all required values. Check out this blog post to examine better solutions for this problem.
     Examples:
     fib(0) ==> 0
     fib(1) ==> 1
     fib(3) ==> 2
     */
    public static int fib(int n) {
        int  Fibonacci=1;
        if(n==0){return 0;}
        else {
            int i=n;
            while(i>1){
                Fibonacci= Fibonacci +fib(n-i);
                i--;}
        }
        return Fibonacci;
    }
}
