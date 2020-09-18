package generale_algorthem;

public class Write_a_function_to_reverse_a_number_in_Java {
    /* Write a function to reverse a number in Java?

     */

    public static void main (String [] args){
        int num=923457689;
        System.out.println("The number is : "+num);
        System.out.println("The Reversed number using string method is : "+reverseNumber(num));
        System.out.println("The Reversed number using arthmetics method is : "+reversenumber(num));
    }
//    reverseNumber method to reverse a given number using the string class characteristics
       public static long reverseNumber(int x){
        String Xstring =Integer.toString(x);
        StringBuffer sb= new StringBuffer (Xstring);
        String reversedXstring=sb.reverse().toString();
        int reversedNumber =Integer.parseInt(reversedXstring);
        return reversedNumber;
    }
//    reversenumber method reverse the number using arithmetics operations
       public static long reversenumber(int x){
        int reversedNumber =0;
        while(x!=0){
            reversedNumber=(reversedNumber*10)+x%10 ;
            x=x/10;
        }
       return reversedNumber;
      }
}
