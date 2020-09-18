package string;

public class Replace_all_Spaces {
     /*
       Write a method to replace all spaces in a string with a given replacement string.
       replace("This is a test","/") --> "This/is/a/test"
       Note: Avoid using the in-built String.replaceAll() method.
       Input : This is a test
       Expected Result : ThisABCisABCaABCtest
       Input : Replace all spaces
       Expected Result : ReplaceABCallABCspaces
       Input : This
       Expected Result : This
       Input : [Empty]
       Expected Result : [Empty]
      */
       public static void main(String[] args) {

//           System.out.println(replaceCharacter("This is a test","/"));
//           System.out.println(replaceString("This is a test","/"));
           System.out.println(replacestring("This is a test","ABC"));
    }
    public static String replaceCharacter(String a, String b) {
           char[] bChar=b.toCharArray();
           char cx=bChar[0];
           String str=a.replace(' ',cx);
           return str;
    }
//    Using the in-built String.replaceAll() method.
    public static String replaceString(String a, String b) {
        String str=a.replaceAll("",b);
        return str;
    }
    //   With out Using the in-built String.replaceAll() method.
    public static String replacestring(String a, String b) {
        String [] strArray= a.split(" ");
        String str="";
        for(int i=0;i<strArray.length;i++){
            str=str+strArray[i]+b;
        }
        String str1=str.substring(0,str.length()-b.length());
        return str1;
    }
    public static String replace(String a, String b) {
// Add your code below this line. Do not modify any other code.

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            if(c == ' ') builder.append(b);
            else builder.append(c);
        }
        return builder.toString();

// Add your code above this line. Do not modify any other code.
    }
}
