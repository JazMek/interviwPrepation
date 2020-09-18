package string;

public class StringReverse {


    public static void main(String[] args) {
        String blogName = "tidia";
        String blogName1 = "java2blogibrahim";
        stringReverse(blogName);
//        stringBufferReverse(blogName1);
        System.out.println(stringReversekarim(blogName1));
        System.out.println(stringBuldeurReverse(blogName1));
    }
//karim method to reverse the giver String
    public static String stringReversekarim(String string){
        StringBuffer sb=new StringBuffer(string);
        return sb.reverse().toString();
    }

    public static void stringReverse(String str){
         String reversString="";
        for (int i=str.length()-1;i>=0;i--){
           reversString=reversString+str.charAt(i);
      }
        System.out.println(reversString);

    }
    //    using StringBuffer
    public static void stringBufferReverse(String str1) {
        StringBuffer sb = new StringBuffer(str1);
        System.out.println("Reverse of java2blog is:" + sb.reverse());
    }
//    using StringBuilder
    public static String  stringBuldeurReverse(String str){
        StringBuilder strB=new StringBuilder(str);
        return strB.reverse().toString();
    }
/*
Write a method that takes in a String and returns the reversed version of the String.
Examples:
reverseString("abcde") -> "edcba"
reverseString("1") -> "1"
reverseString("") -> ""
reverse("madam") -> "madam"
reverse(null) -> null
 */
     public static String reverseString(String str){
           String inputString = str;
           String outputString = null;
        if(inputString!=null){
            StringBuffer sb= new StringBuffer(inputString);
            outputString= sb.reverse().toString();
       }
       return outputString;
}

}
