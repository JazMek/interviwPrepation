package string;

public class LogicToCountNomOfOccurenceOfCharacters {
//    Logic to Count no of occurence of characters in the String
    public static void main(String[] args) {

        System.out.println(occurenceOfCharacters("abbbbbrtfbbdfgbhnmbssbbrrt",'b'));
    }

    private static int occurenceOfCharacters(String string, char character) {
      int num=0;
        for(int i=0;i<string.length();i++){
            if(character==string.charAt(i)){
                num++;
            }
        }
       return num;
    }



}

