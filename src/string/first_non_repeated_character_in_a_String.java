package string;

public class first_non_repeated_character_in_a_String {
    public static void main(String[] args) {
        /*
        Find the first non-duplicate character in a string.
        Return null if no unique character is found.
         firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
         firstNonRepeatedCharacter( "cbcd" ) --> 'b'
         firstNonRepeatedCharacter( "cdcd" ) --> null
       Input : abcdcd
       Expected Result : a
       Input : aabcdc
       Expected Result : b
       Input : aaaa
       Expected Result : null
       Input : b
       Expected Result : b

         */

        String str1="easiest";
        String str2="analogy";
        String str3="aaaa";
        String str4="b";
        System.out.println("Result Outcome : "+First_non_repeated_character_in_a_String(str3));
        System.out.println("Result Outcome : "+firstNonRepeatedCharacter(str3));
    }

    public static Character First_non_repeated_character_in_a_String(String str){
        char []strArry=str.toCharArray();
        for (int i=0;i<str.length();i++){
            if(str.lastIndexOf(strArry[i])==str.indexOf(strArry[i])){
                return strArry[i];
            }
        }
        return null;
    }
    public static Character firstNonRepeatedCharacter(String str) {

        char [] strchar = str.toCharArray();
        char firstCahr=' ';
        int [] charCount = new int[strchar.length];
        for(int i=0;i<strchar.length ;i++){
            for(int j=0;j<strchar.length ;j++){
                if(strchar[j]==strchar[i]){charCount[i]++;}
            }
            if(charCount[i]==1){ firstCahr=strchar[i]; break;}
            else if(charCount[0]==strchar.length)return null;
        }

        return firstCahr;
    }
}

