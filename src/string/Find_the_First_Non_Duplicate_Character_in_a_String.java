package string;

public class Find_the_First_Non_Duplicate_Character_in_a_String {
    /*Find the First Non Duplicate Character in a String
    Find the first non-duplicate character in a string. Return null if no unique character is found.
    firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
    firstNonRepeatedCharacter( "cbcd" ) --> 'b'
    firstNonRepeatedCharacter( "cdcd" ) --> null
     */

    public static void main(String[] args) {
        String str="aabcdc";
        String str1="abcdcd";
        String str2="b";
        String str3="aaaa";
        String str4="aabbccaaddddddd";

        System.out.println(first_Non_Repeated_Character(str));
        System.out.println(first_Non_Repeated_Character(str1));
        System.out.println(first_Non_Repeated_Character(str2));
        System.out.println(first_Non_Repeated_Character(str3));
        System.out.println(first_Non_Repeated_Character(str4));
        System.out.println("------------------");
        System.out.println(firstNonRepeatedCharacter(str));
        System.out.println(firstNonRepeatedCharacter(str1));
        System.out.println(firstNonRepeatedCharacter(str2));
        System.out.println(firstNonRepeatedCharacter(str3));
        System.out.println(firstNonRepeatedCharacter(str4));
    }

    public static Character firstNonRepeatedcharacter(String str) {

        char [] strchar = str.toCharArray();
        char c=' ';
        int  []count= new int [str.length()];
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(strchar[i]==strchar[j]){count[i]++;}
            }
            if(count[i]==1){c=strchar[i];break;}
            else if(count[i]==str.length())return null;
        }
        return c;
    }
    public static Character firstNonrepeatedcharacter(String str) {
        char result=' ';
        int charcount[]=new int[str.length()];
        for(int i=0; i<str.length() ;i++){
            for(int j=0;j<str.length() ;j++){
                if(str.charAt(i)== str.charAt(j)){ charcount[i]++;}
            }
        }
        for(int i=0;i<str.length();i++){
            if(charcount[i]==1 ) {result=str.charAt(i);break;}
            else if (charcount[i]==str.length() || charcount[i]>2){return null;}
        }
        return result;
    }
//    this solution works
    public static Character first_Non_Repeated_Character(String str) {
        char result=' ';
        int charcount[]=new int[str.length()];
        for(int i=0; i<str.length() ;i++){
            for(int j=0;j<str.length() ;j++){
                if(str.charAt(i)== str.charAt(j)){ charcount[i]++;}
            }
            if(charcount[i]==1 ) {result=str.charAt(i);break;}
            else if (charcount[i]==str.length() || charcount[i]>2){return null;}
        }
        return result;
    }
    public static Character firstNonRepeatedCharacter(String str) {
        // Add your code below this line. Do not modify any other code.
        if(str==null || str.length()==0) return null;

        int[] charQuantity = new int[256];
        for(char currentCharacter : str.toCharArray()) {
            charQuantity[currentCharacter] += 1;
        }
        for(char currentCharacter : str.toCharArray()) {
            if(charQuantity[currentCharacter]==1) {
                return currentCharacter;
            }
        }
        return null;
        // Add your code above this line. Do not modify any other code.
    }
}
