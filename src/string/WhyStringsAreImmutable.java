package string;

public class WhyStringsAreImmutable {
    /*
    Why Strings are Immutable in Java
    The deference between .equals and == int java Strings
    equals() method for content comparison.
    In simple words, == checks if both objects point to the same memory location whereas .
     equals() evaluates to the comparison of values in the objects. ...
      When we use == operator for s1 and s2 comparison then the result is false
      as both have different addresses in memory.
     */
    public static void main(String[] args) {
        String a="ali baba";
        a="karim";
        String b="ali baba";
        String c =new String("ali baba");
        String d =new String("ali baba");
        StringBuffer sb=new StringBuffer(a);

        //the string is immutable it means it cant be change exmeples below
        a.concat("the gret");
        //if print the value of a it will not going to change
        System.out.println(a);
     //  The defrence between .eqauls and ==
     //   .equals is used to compare the content of the string
     //     == is used to compare the reference of the string (the memories place where it is stocked )

        System.out.println("The value of a is : "+a);
        System.out.println("The value of b is : "+b);
        System.out.println("The value of c is : "+c);
        System.out.println(a.equals(b)); // a.equals(b) returns true because the value of a = the value of b
        System.out.println(a.equals(c));// a.equals(c) returns true because the value of a = the value of c
        System.out.println(a==b);// a==b returns true because the reference  of a is the same reference  of b because both are created using the string lateral expression
        System.out.println(a==c);// a==c returns false because the reference  of a is not the same reference  of c(c was created in a different memories location )
        System.out.println(b==c);
        System.out.println(c==d);
        System.out.println(c.equals(d));
    }



}
