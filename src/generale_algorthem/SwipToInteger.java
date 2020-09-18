package generale_algorthem;

public class SwipToInteger {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        //        using arithmetic  operator
        System.out.println("a= "+a+" , "+" b= "+b);
        a=a+b;
        System.out.println("a= "+a+" , "+" b= "+b);
        b=a-b;
        System.out.println("a= "+a+" , "+" b= "+b);
        a=a-b;
        System.out.println("a= "+a+" , "+" b= "+b);
        int x=5;
        int y=7;
        //        using arithmetic  operator
//        using multiplication
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("x= "+x+" , "+" y= "+y);
//        using logical operator
      /*       using XOR operator : ^
                 A  | B     | XOR
             false  | false | false
               true | false | true
             false  | true  | true
              true  | true  | false

       */
        x= x^y;
        y= x^y;
        x= x^y;

        System.out.println("x= "+x+" , "+" y= "+y);

    }
}
