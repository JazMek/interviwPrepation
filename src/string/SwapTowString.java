package string;

public class SwapTowString {
    public static void main(String[] args) {

        String a="karim";
        String b="mekdoud";

//        swap the tow string using the substring method
        a=a+b;
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("string a is : "+a +" string b is : "+b);

    }
}
